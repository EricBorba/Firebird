package Conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.firebirdsql.jdbc.FirebirdConnection;

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

	public ArrayList<String> lerDestinos(FirebirdConnection conexao) throws SQLException{

		ArrayList<String> listaDestinos = new ArrayList<String>();

		conexao.setAutoCommit(true);
		// A necessidade deste lock eh para nao permitir atualizacao do registro que esta lendo ( leitura suja )
		PreparedStatement  statement = conexao.prepareStatement("SELECT d.nome FROM DESTINOS d WITH LOCK");

		ResultSet resultado = statement.executeQuery();

		while(resultado.next()){

			listaDestinos.add(resultado.getString(1));

		}

		return listaDestinos;

	}

	public ArrayList<String> lerAssentosReservados(FirebirdConnection conexao) throws SQLException{

		ArrayList<String> listaAssentosReservados = new ArrayList<String>();
		
		conexao.setAutoCommit(true);
		// A necessidade deste lock eh para nao permitir atualizacao do registro que esta lendo ( leitura suja )
		PreparedStatement  statement = conexao.prepareStatement("SELECT a.fk_numero FROM RESERVA a WITH LOCK");

		ResultSet resultado = statement.executeQuery();

		while(resultado.next()){

			listaAssentosReservados.add(resultado.getString(1));

		}

		return listaAssentosReservados;

	}

	public void selecionarPoltrona(FirebirdConnection conexao, String numeroPoltrona,int cpf, String destino) throws SQLException{

		conexao.setAutoCommit(false);
		
		PreparedStatement  statement = conexao.prepareStatement("SELECT a.numero FROM ASSENTOS a WITH LOCK");		
		
	}

	public void reservarPoltrona(){


	}

}
