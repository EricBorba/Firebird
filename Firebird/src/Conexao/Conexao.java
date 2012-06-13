package Conexao;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.firebirdsql.gds.TransactionParameterBuffer;
import org.firebirdsql.jdbc.FBConnection;
import org.firebirdsql.jdbc.FirebirdConnection;

public class Conexao {

	static String url;
	static String drive;
	static String login; 
	static String pass;
	

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args)  {

		url = "jdbc:firebirdsql:localhost/3050:/Library/Frameworks/Firebird.framework/Flycin.fdb" ;                                                                                                                 
		drive = "org.firebirdsql.jdbc.FBDriver";
		login = "SYSDBA";
		pass = "masterkey";
		
	}
	
	public Conexao(){

		try {
			Class.forName(drive);
			System.out.println("Drive Carregado");
		} catch (ClassNotFoundException e1) {
			System.out.println("n conseguiu carregar drive");
		}


}

	public FirebirdConnection leituraInicial(){
		
		FirebirdConnection connection = null;

		try {
			
			
			connection = (FBConnection) DriverManager.getConnection( url, login, pass);
			
			connection.setAutoCommit(false);

			System.out.println("Ok");

			System.out.print("Passando os parametros de conexao...");
			
			TransactionParameterBuffer tp = connection.createTransactionParameterBuffer();
			tp.addArgument(FirebirdConnection.TPB_READ_COMMITTED);
			tp.addArgument(FirebirdConnection.TPB_READ);
			tp.addArgument(FirebirdConnection.TPB_REC_VERSION);
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
			
			connection.setAutoCommit(false);

			System.out.println("Ok");

			System.out.print("Passando os parametros de conexao...");
			
			TransactionParameterBuffer tp = connection.createTransactionParameterBuffer();
			tp.addArgument(FirebirdConnection.TPB_READ_COMMITTED);
			tp.addArgument(FirebirdConnection.TPB_WRITE);
			tp.addArgument(FirebirdConnection.TPB_NO_REC_VERSION);
			tp.addArgument(FirebirdConnection.TPB_NOWAIT);
			connection.setTransactionParameters(tp);
			
			System.out.println("Ok");


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

		return connection;


	}
	
	


}


