package testebd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class DatabaseConnector {

	private String jdbcConString;
		private String jdbcUsername;
		private String jdbcPassword;
		
		
		public Connection getAConnection() throws SQLException {
			System.out.println(this.jdbcConString);
			return DriverManager.getConnection(this.jdbcConString);
		}
		
		
	public DatabaseConnector() {
		
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
			
			jdbcConString = "jdbc:derby:/home/igor/MyDB;create=true;user=ADMIN;password=12345";
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		
	}
		

		public void createDataset() throws SQLException {
			String[] db = {
							
					
				
					"CREATE TABLE Usuario(\r\n"+
	    			"id INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),\r\n" +
	    			"nome VARCHAR(100) NOT NULL,\r\n"+
	    			"cpf VARCHAR(11) NOT NULL,\r\n"+
	    			"senha VARCHAR(100) NOT NULL,\r\n"+
	    			"tipo VARCHAR(13) NOT NULL\r\n"+
	    			")"
	    			/*
	    			
					"CREATE TABLE Museu(\r\n"+
	    			"id INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),\r\n" +
	    	    	"nome VARCHAR(100) NOT NULL,\r\n"+
	    			"dataCriacao VARCHAR(100) NOT NULL,\r\n"+
	    	    	"cidade VARCHAR(100) NOT NULL,\r\n"+
	    			"estado VARCHAR(100) NOT NULL,\r\n"+
	    	    	"idGestor INTEGER NOT NULL,\r\n"+
	    			"CONSTRAINT fk_gestor FOREIGN KEY (idGestor) REFERENCES Usuario(id)\r\n"+
	    			")"
	    			
					
					,
	    			
	    			"CREATE TABLE SolicitacaoMuseu(\r\n"+
					"id INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),\r\n" +
	    	    	"nome VARCHAR(100) NOT NULL,\r\n"+
	    			"dataCriacao VARCHAR(100) NOT NULL,\r\n"+
	    	    	"cidade VARCHAR(100) NOT NULL,\r\n"+
	    			"estado VARCHAR(100) NOT NULL,\r\n"+
	    	    	"cpfGestor VARCHAR(11) NOT NULL,\r\n"+
	    	    	"senhaGestor VARCHAR(100) NOT NULL\r\n"+
	    			")"
	    			*/
	    			
			   };
			    	
		    

	    	Connection con = null;
		    for (String sql : db) {
		    	con = getAConnection();
		    	System.out.println(sql);
		    	PreparedStatement s = con.prepareStatement(sql);
				s.executeUpdate();
		    }
		    if (con != null)
		    	con.close();
		}
		
		public void dropDataset() {
			String[] db = {
					"ALTER TABLE saleitem DROP FOREIGN KEY fk_sale",
					"ALTER TABLE saleitem DROP FOREIGN KEY fk_product",
		    		"DROP TABLE SaleItem",
		    		"DROP TABLE Sale",
		    		"DROP TABLE Product",
		    };
		    
	    	Connection con = null;
			for (String sql : db) {
				try {
					con = getAConnection();
					System.out.println(sql);
					long time = Calendar.getInstance().getTimeInMillis();
			    	PreparedStatement s = con.prepareStatement(sql);
					s.executeUpdate();
					time = Calendar.getInstance().getTimeInMillis() - time;
					System.out.println("in "+ time+ " ms");
				} catch (SQLException e) {
					e.printStackTrace();
				}
		    }
			
		    if (con != null)
				try {
					con.close();
				} catch (SQLException e) {}
		}
		 public static void main(String[] args)
		    {
				DatabaseConnector pool = new DatabaseConnector();
				
				try 
				{
					pool.createDataset();
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
			}
}


