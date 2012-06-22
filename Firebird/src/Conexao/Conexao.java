package Conexao;
import java.io.File;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.firebirdsql.gds.TransactionParameterBuffer;
import org.firebirdsql.jdbc.FBConnection;
import org.firebirdsql.jdbc.FirebirdConnection;

public class Conexao {

	String url;
	String drive;
	String login; 
	String pass;


	public Conexao(){

		url = "jdbc:firebirdsql:localhost:" + new File("src/Flycin.fdb").getAbsolutePath();                                                                                                                 
		drive = "org.firebirdsql.jdbc.FBDriver";
		login = "SYSDBA";
		pass = "masterkey";

		try {
			Class.forName(drive);
			System.out.println("Drive Carregado");
		} catch (ClassNotFoundException e1) {
			System.out.println("n conseguiu carregar drive");
		}


	}

	public FirebirdConnection conexaoLogar(){

		FirebirdConnection connection = null;

		try {


			connection = (FBConnection) DriverManager.getConnection( this.url, this.login, this.pass);

			connection.setAutoCommit(false);
			
			System.out.print("Passando os parametros de conexao...");

			TransactionParameterBuffer tp = connection.createTransactionParameterBuffer();
			tp.addArgument(FirebirdConnection.TPB_READ_COMMITTED);// n permitir leitura suja.
			tp.addArgument(FirebirdConnection.TPB_NO_REC_VERSION);// esperar caso tenha alguma atualizacao na linha desejada que ainda n foi commitada(atualizacao do usuario).
			tp.addArgument(FirebirdConnection.TPB_WAIT); //supondo o caso de tentativa do mesmo login, o que tentou depois aguarda a liberacao
			
			
			// sera tpb_write  q ja eh usado como default pois eh necessario pra executar o with lock e garantir que em outro sistem n sera
			//possivel logar com o mesmo usuario.
			
			
			connection.setTransactionParameters(tp);

			System.out.println("Ok");



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;


	}
	
	public FirebirdConnection cadastrarPassageiro(){

		FirebirdConnection connection = null;

		try {


			connection = (FBConnection) DriverManager.getConnection( this.url, this.login, this.pass);

			connection.setAutoCommit(false);
			
			System.out.print("Passando os parametros de conexao...");

			
			
			/*O caso de cadastrar passageiro n‹o se viu muita necessidade de alterar os parametros que ja sao como default, ou seja, concurrency write*/
			
			
			
			
			//TransactionParameterBuffer tp = connection.createTransactionParameterBuffer();
			//tp.addArgument(FirebirdConnection.TPB_READ_COMMITTED);// n permitir leitura suja.
			//tp.addArgument(FirebirdConnection.TPB_NO_REC_VERSION);// esperar caso tenha alguma atualizacao na linha desejada que ainda n foi commitada(atualizacao do usuario).
			//tp.addArgument(FirebirdConnection.TPB_WAIT); //supondo o caso de tentativa do mesmo login, o que tentou depois aguarda a liberacao
			
			
			// sera tpb_write  q ja eh usado como default pois eh necessario pra executar o with lock e garantir que em outro sistem n sera
			//possivel logar com o mesmo usuario.
			
			
			//connection.setTransactionParameters(tp);

			System.out.println("Ok");



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;


	}
	
	public FirebirdConnection lendoDestinos(){

		FirebirdConnection connection = null;

		try {


			connection = (FBConnection) DriverManager.getConnection( this.url, this.login, this.pass);

			//Por default Ž connection.setAutoCommit(true)
			
			System.out.print("Passando os parametros de conexao...");

			TransactionParameterBuffer tp = connection.createTransactionParameterBuffer();
			tp.addArgument(FirebirdConnection.TPB_READ_COMMITTED);// n permitir leitura suja.
			tp.addArgument(FirebirdConnection.TPB_NO_REC_VERSION);// esperar caso tenha alguma atualizacao na linha desejada que ainda n foi commitada.
			tp.addArgument(FirebirdConnection.TPB_WAIT); //supondo o caso de update sem commit, aguardar a liberacao.
			tp.addArgument(FirebirdConnection.TPB_READ);//transacao apenas para leitura dos destinos, n ha necessidade de write
		
			connection.setTransactionParameters(tp);

			System.out.println("Ok");



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;


	}

	public FirebirdConnection lendoAssentosInicialmente(){


		FirebirdConnection connection = null;

		try {


			connection = (FBConnection) DriverManager.getConnection( url, login, pass);

			System.out.println("Ok");

			System.out.print("Passando os parametros de conexao...");

			TransactionParameterBuffer tp = connection.createTransactionParameterBuffer();
			
			
			
			//Como se trata de apenas leitura e  a necessidade do uso desse metodo sera pra analisar ultima versao commitada.
			tp.addArgument(FirebirdConnection.TPB_CONCURRENCY);
			//tp.addArgument(FirebirdConnection.TPB_REC_VERSION);//analisar a ultima versao commitada
			
			//um usuario apos selecionar o destino e quiser ver os assentos, e algum desses assentos tiver com algum update sem commit,
			//o desejavel eh q se va para a proxima tela independente disso.
			tp.addArgument(FirebirdConnection.TPB_NOWAIT);
			
			
			tp.addArgument(FirebirdConnection.TPB_READ);//transacao apenas para leitura dos assentos, n ha necessidade de write
			
			
															
			connection.setTransactionParameters(tp);

			System.out.println("Ok");


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return connection;


	}
	
	
	public FirebirdConnection selecionandoAssento(){


		FirebirdConnection connection = null;

		try {


			connection = (FBConnection) DriverManager.getConnection( url, login, pass);

			//	connection.setAutoCommit(false);

			System.out.println("Ok");

			System.out.print("Passando os parametros de conexao...");

			TransactionParameterBuffer tp = connection.createTransactionParameterBuffer();
			tp.addArgument(FirebirdConnection.TPB_READ_COMMITTED);
			tp.addArgument(FirebirdConnection.TPB_WRITE);// para ser possivel executar o lock e o update
			
			//verificar se existe registro modificado mas n commitado, gerando caso positivo um conflito. Ou seja alguem selecionou a cadeira.
			tp.addArgument(FirebirdConnection.TPB_NO_REC_VERSION);
			tp.addArgument(FirebirdConnection.TPB_NOWAIT);//resolucao no caso de conflito. Nao aguardar.
			connection.setTransactionParameters(tp);

			System.out.println("Ok");


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return connection;


	}




}


