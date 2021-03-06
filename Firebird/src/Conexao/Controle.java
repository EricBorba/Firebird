package Conexao;

import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import org.firebirdsql.jdbc.FirebirdConnection;
import org.firebirdsql.jdbc.FirebirdSavepoint;


public class Controle {

	public Controle(){

	}

	/*Como o nome do metodo ja diz, eh utilizado para realizar uma busca no BD para verificar se o usuario existe*/
	public Boolean logar(FirebirdConnection conexao, int cpf, int senha) throws SQLException{

		boolean existePassageiro = false;
		String senhaString = String.valueOf(senha);



		// Esse lock eh justificado apenas pra garantir uma unica instancia do sistema logada ( nao ter 2 sistemas logados com o mesmo usuario )


		PreparedStatement  statement = conexao.prepareStatement("SELECT P.CPF FROM PASSAGEIRO P WHERE P.CPF = ? AND P.SENHA = ? WITH LOCK");

		statement.setInt(1, cpf);
		statement.setString(2, senhaString);



		ResultSet resultado = statement.executeQuery();

		//next utilizado para direcionar o vetor para a primeira linha que no caso eh o retorno da consulta acima.
		resultado.next();

		if(resultado.getInt(1) == cpf){

			existePassageiro = true;

		}



		return existePassageiro;	

	}

	/*recebe como parametro uma FirebirdConnectio para que a mesma seja encerrada*/
	public void sairDoSistema(FirebirdConnection conexao) throws SQLException{

		conexao.close();

	}

	/*Cadastro de passageiro*/
	public void cadastrarPassageiro(FirebirdConnection conexao, int cpf, String nome, String endereco, String senha) throws SQLException{

		//conexao.setAutoCommit(false);

		PreparedStatement  statement = conexao.prepareStatement("INSERT INTO PASSAGEIRO (CPF, NOME, ENDERECO, SENHA) VALUES (?,?, ?,?)");
		statement.setInt(1, cpf);
		statement.setString(2, nome);
		statement.setString(3, endereco);
		statement.setString(4, senha);

		statement.executeUpdate();
		statement.close();
		conexao.commit();
		conexao.close();

	}

	/*Faz-se um select apenas de leitura sem lock , dos destinos para serem mostrados ao usuario*/
	public Vector<String> lerDestinos(FirebirdConnection conexao) throws SQLException{

		Vector<String> listaDestinos = new Vector<String>();

		// Nao ha necessidade de uso do with lock neste caso pois no sistema proposto nao faz sentido bloquear leitura de destinos
		// o que importa neste caso sao os parametros para definir seu comportamento no caso de alguma atualizacao no registro do destino.
		PreparedStatement  statement = conexao.prepareStatement("SELECT L.nome_destino FROM LOCAL L");

		ResultSet resultado = statement.executeQuery();

		while(resultado.next()){

			listaDestinos.add(resultado.getString(1));

		}

		return listaDestinos;

	}	

	/*Leitura inicial das poltronas para verificar a situacao das mesmas, se estao reservadas, tb n usa lock.*/
	public Boolean poltronaReservada(Conexao conexao, String destino, String numeroPoltrona) throws SQLException{

		FirebirdConnection firebirdConexao = conexao.lendoAssentosInicialmente();
		Boolean existeReserva = true;

		firebirdConexao.setAutoCommit(false);

		PreparedStatement  statementReserva = firebirdConexao.prepareStatement("SELECT a.fk_cpf FROM RESERVA a WHERE a.fk_numero = ? AND a.fk_destino = ?");		
		statementReserva.setString(1, numeroPoltrona);
		statementReserva.setString(2, destino);
		ResultSet resultado = statementReserva.executeQuery();

		while(resultado.next()){

			if(resultado.getInt(1) == 3){
				existeReserva = false;
			}
		}

		statementReserva.close();

		firebirdConexao.close();


		return existeReserva;			

	}

	/*Aqui eh verificado se o cpf cadastrado na tabela Reserva pra o destino e cadeira selecionados pelo usuario possui valor igual a 3.....
	 * pois essa valor foi usado como default.....na verdade representa que a cadeira esta disponivel, se estiver realiza o update.*/
	public Boolean selecionarPoltrona(FirebirdConnection firebirdConexao, String numeroPoltrona,int cpf, String destino) throws SQLException{



		firebirdConexao.setAutoCommit(false);
		Boolean podeReservar = false;
		//FirebirdSavepoint pontodeRecuperacao =  conexao.setFirebirdSavepoint();


		PreparedStatement  statementReserva = firebirdConexao.prepareStatement("SELECT a.fk_cpf FROM RESERVA a WHERE a.fk_numero = ? AND a.fk_destino = ? WITH LOCK");		
		statementReserva.setString(1, numeroPoltrona);
		statementReserva.setString(2, destino);
		ResultSet resultado = statementReserva.executeQuery();



		while(resultado.next()){

			//executar o passo abaixo apenas se o cpf retornado na query acima for igual ao que representa disponibilidade.
			if(resultado.getInt(1) == 3){

				podeReservar = true;

				PreparedStatement statementUpdate = firebirdConexao.prepareStatement("UPDATE RESERVA a SET a.fk_cpf = ? WHERE a.fk_numero = ? AND a.fk_destino = ?");
				statementUpdate.setInt(1, cpf);
				statementUpdate.setString(2, numeroPoltrona);
				statementUpdate.setString(3, destino);
				statementUpdate.executeUpdate();

				statementUpdate.close();


			}
			/*else{
				//se n funcionar somente com isso realizar rollback na conexao toda.
				statementReserva.close();
			}*/

		}


		return podeReservar;

	}

	/*Metodo utilizado quando se quer retirar a selecao q foi selecionado pelo mesmo usuario ainda dentro da mesma sessao*/
	public void desfazerSelecao(FirebirdConnection firebirdConexao) throws SQLException{

		// apenas desfazer o update e o select, n eh necessario fechar a conexao por completa, e se fechar n vai ser possivel fazer uso da mesma pra selecionar
		//outras cadeiras, enfim, ira dar erro pois iria se perder a conexao.
		firebirdConexao.rollback();

	}

	/*Faz o commit nas cadeiras selecionados pelo usuario em questao, recebe como parametro a conexao de cada um*/
	public void reservarPoltrona(ArrayList<FirebirdConnection> listaFirebirdConnection) throws SQLException{



		for(int i =0; i < listaFirebirdConnection.size(); i++){

			listaFirebirdConnection.get(i).commit();

		}



	}
	
	/*No caso do usuario desistir da reserva e nao tirou a selecao das cadeiras, simplesmente fechou o programa, ou voltou pra selecionar um novo destino*/
	public void fecharVariasFirebirdConnection(ArrayList<FirebirdConnection> listaFirebirdConnection) throws SQLException{

		for(int i =0; i < listaFirebirdConnection.size(); i++){

			listaFirebirdConnection.get(i).close();

		}

	}

}
