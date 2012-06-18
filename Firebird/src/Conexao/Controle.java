package Conexao;

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

	public Boolean logar(FirebirdConnection conexao, int cpf, int senha) throws SQLException{

		boolean existePassageiro = false;


		//conexao.setAutoCommit(false);

		// Esse lock eh justificado apenas pra garantir uma unica instancia do sistema logada ( nao ter 2 sistemas logados com o mesmo usuario )
		PreparedStatement  statement = conexao.prepareStatement("SELECT p.cpf FROM PASSAGEIRO p WHERE p.cpf = ? AND p.senha = ? WITH LOCK");
		statement.setInt(1, cpf);
		statement.setInt(2, senha);

		ResultSet resultado = statement.executeQuery();

		if(resultado.first()){

			existePassageiro = true;

		}



		return existePassageiro;	

	}

	public void sairDoSistema(FirebirdConnection conexao) throws SQLException{

		conexao.close();

	}

	public void cadastrarPassageiro(FirebirdConnection conexao, int cpf, String nome, String endereco, int senha) throws SQLException{

		//conexao.setAutoCommit(false);

		PreparedStatement  statement = conexao.prepareStatement("INSERT INTO PASSAGEIRO (CPF, NOME, ENDERECO, SENHA) VALUES (?,?, ?,?)");
		statement.setInt(1, cpf);
		statement.setString(2, nome);
		statement.setString(3, endereco);
		statement.setInt(4, senha);

		statement.executeUpdate();
		statement.close();
		conexao.commit();

	}

	public Vector<String> lerDestinos(FirebirdConnection conexao) throws SQLException{

		Vector<String> listaDestinos = new Vector<String>();

		conexao.setAutoCommit(true);
		// A necessidade deste lock eh para nao permitir atualizacao do registro que esta lendo ( leitura suja )
		PreparedStatement  statement = conexao.prepareStatement("SELECT d.nome FROM DESTINOS d WITH LOCK");

		ResultSet resultado = statement.executeQuery();

		while(resultado.next()){

			listaDestinos.add(resultado.getString(1));

		}

		return listaDestinos;

	}

	//por enquanto nao esta sendo usado
	public ArrayList<String> lerAssentosReservados(FirebirdConnection conexao, String destino) throws SQLException{

		ArrayList<String> listaAssentosReservados = new ArrayList<String>();

		conexao.setAutoCommit(true);
		// A necessidade deste lock eh para nao permitir atualizacao do registro que esta lendo ( leitura suja )
		PreparedStatement  statement = conexao.prepareStatement("SELECT a.fk_numero FROM RESERVA a WHERE a.destino = ? WITH LOCK");
		statement.setString(1, destino);
		ResultSet resultado = statement.executeQuery();

		while(resultado.next()){

			listaAssentosReservados.add(resultado.getString(1));

		}

		return listaAssentosReservados;

	}

	public Boolean poltronaReservada(Conexao conexao, String destino, String numeroPoltrona) throws SQLException{

		FirebirdConnection firebirdConexao = conexao.leituraInicial();
		Boolean existeReserva = true;
		firebirdConexao.setAutoCommit(true);

		PreparedStatement  statementReserva = firebirdConexao.prepareStatement("SELECT a.fk_cpf FROM RESERVA a WHERE a.fk_numero = ? AND a.destino = ? WITH LOCK");		
		statementReserva.setString(1, numeroPoltrona);
		statementReserva.setString(2, destino);
		ResultSet resultado = statementReserva.executeQuery();


		if(resultado.getInt(1) == 3){
			existeReserva = false;
		}

		statementReserva.close();

		return existeReserva;			

	}

	public Boolean selecionarPoltrona(FirebirdConnection conexao, String numeroPoltrona,int cpf, String destino) throws SQLException{

		conexao.setAutoCommit(false);
		Boolean podeReservar = false;
		//FirebirdSavepoint pontodeRecuperacao =  conexao.setFirebirdSavepoint();


		PreparedStatement  statementReserva = conexao.prepareStatement("SELECT a.fk_cpf FROM RESERVA a WHERE a.fk_numero = ? AND a.destino = ? WITH LOCK");		
		statementReserva.setString(1, numeroPoltrona);
		statementReserva.setString(2, destino);
		ResultSet resultado = statementReserva.executeQuery();

		//colocar aqui a condicao para executar o passo abaixo apenas se o cpf retornado na query acima for igual ao que representa disponibilidade.

		if(resultado.getInt(1) == 3){

			podeReservar = true;

			PreparedStatement statementUpdate = conexao.prepareStatement("UPDATE RESERVA a SET a.fk_cpf = ? WHERE a.fk_numero = ? AND a.destino = ?");
			statementUpdate.setInt(1, cpf);
			statementUpdate.setString(2, numeroPoltrona);
			statementUpdate.setString(3, destino);
			statementUpdate.executeUpdate();
			//Verificar se Ž poss’vel realmente executar esse close(), afinal ele pode acabar liberando a cadeira para outro sistema.
			statementUpdate.close();
			//statementReserva.close();	

		}else{
			//se n funcionar somente com isso realizar rollback na conexao toda.
			statementReserva.close();
		}



		return podeReservar;

	}

	public void desfazerSelecao(FirebirdConnection firebirdConexao) throws SQLException{

		firebirdConexao.rollback();

	}

	public void reservarPoltrona(FirebirdConnection firebirdConexao) throws SQLException{

		firebirdConexao.commit();

	}

}
