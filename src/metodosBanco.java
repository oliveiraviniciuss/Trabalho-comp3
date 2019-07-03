import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class metodosBanco {
	
	
	
	
	public void findMuseu(String description) {
		DatabaseConnector conPoll = DatabaseConnector.GetInstance();

		String query = "SELECT nome, dataCriacao, cidade, estado,cpfGestor,senhaGestor FROM SolicitacaoMuseu";
		Connection con;
		try {
			con = conPoll.getAConnection();
			PreparedStatement s = con.prepareStatement(query);
			ResultSet rs = s.executeQuery();
			
			while (rs.next()) {
				String nome = rs.getString(1);
				String dataCriacao = rs.getString(2);
				String cidade = rs.getString(3);
				String estado = rs.getString(4);
				String cpfGestor = rs.getString(5);
				String senhaGestor = rs.getString(6);
				System.out.println(nome + dataCriacao + cidade + estado + cpfGestor + senhaGestor);
				
				//return new Product(description,productCost,productMargin);
			}
				con.close();
				//return null;
						
		} catch (SQLException e) {
			System.out.println(e);
			//return null;
		}
		
		
	}
	
	public void findMuseuById(int id) {
		DatabaseConnector conPoll = DatabaseConnector.GetInstance();

		String query = "SELECT nome, dataCriacao, cidade, estado,cpfGestor,senhaGestor FROM SolicitacaoMuseu where id = ?";
		Connection con;
		try {
			con = conPoll.getAConnection();
			PreparedStatement s = con.prepareStatement(query);
			s.setInt(1, id);
			ResultSet rs = s.executeQuery();
			
			while (rs.next()) {
				String nome = rs.getString(1);
				String dataCriacao = rs.getString(2);
				String cidade = rs.getString(3);
				String estado = rs.getString(4);
				String cpfGestor = rs.getString(5);
				String senhaGestor = rs.getString(6);
				System.out.println(nome + dataCriacao + cidade + estado + cpfGestor + senhaGestor);
				
				//return new Product(description,productCost,productMargin);
			}
				con.close();
				//return null;
						
		} catch (SQLException e) {
			System.out.println(e);
			//return null;
		}
		
		
	}
	
	
	
	public boolean storeNewSoliticacaoMuseu(String nomeSolicitacao,String dataSolicitacao,String cidadeSolicitacao,String estadoSolicitacao,String nomeGestor,String cpfGestor,String senhaGestor) {
		
		DatabaseConnector conPoll = DatabaseConnector.GetInstance();
		Connection con;
		
		try {
			System.out.println("dentro do try");
			con = conPoll.getAConnection();
			System.out.println(con);
			PreparedStatement s = con.prepareStatement("INSERT INTO SolicitacaoMuseu (nome, dataCriacao, cidade, estado,cpfGestor,senhaGestor) values (?,?,?,?,?,?)");
	
			System.out.println(s);
			s.setString(1, nomeSolicitacao);
			s.setString(2, dataSolicitacao);
			s.setString(3, cidadeSolicitacao);
			s.setString(4, estadoSolicitacao);
			s.setString(5, cpfGestor);
			s.setString(6, senhaGestor);
			s.executeUpdate();
			
			System.out.println("Solicitacao salva no banco");
			return true;
			
		} catch (SQLException e) {
			return false;
		}		
		
	}

}
