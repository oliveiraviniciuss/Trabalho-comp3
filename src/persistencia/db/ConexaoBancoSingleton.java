package persistencia.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoSingleton {
	
	private static ConexaoBancoSingleton instancia;
	
	private String dbString;
	private String dbUsuario;
	private String dbSenha;
	
	public static ConexaoBancoSingleton GetInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		if (instancia == null)
			instancia = new ConexaoBancoSingleton();
		return instancia;
	}
	
	public Connection getAConnection() throws SQLException {
		return DriverManager.getConnection(dbString, dbUsuario, dbSenha);
	}
	
	
	protected ConexaoBancoSingleton() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
		  dbString = "jdbc:derby:C:\\Users\\Igor\\MyDB;create=true;";
		  dbSenha = "banco";
		  dbUsuario = "banco";
	}
	
	
}
