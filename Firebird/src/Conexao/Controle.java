package Conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.firebirdsql.jdbc.FirebirdConnection;

public class Controle {

	public Controle(){

	}

	public Boolean logar(FirebirdConnection conexao, int cpf, int senha) throws SQLException{

		boolean existePassageiro = false;


		conexao.setAutoCommit(false);

		PreparedStatement  statement = conexao.prepareStatement("SELECT p.cpf FROM PASSAGEIRO p WHERE p.cpf = ? AND p.senha = ?");
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

	public void cadastrarPassageiro(FirebirdConnection conexao, int cpf, String nome, String endereco, int senha){

		

	}

	public void lerDestinos(){


	}

	public void lerPoltronas(){


	}

	public void selecionarPoltrona(){

	}

	public void reservarPoltrona(){


	}

}
