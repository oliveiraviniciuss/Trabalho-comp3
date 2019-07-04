package persistencia.db;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import persistencia.SolicitacaoMuseuTabelaGateway;
import persistencia.mt.SolicitacaoMuseuMT;

public class DBSolicitacaoMuseuTabelaGateway implements SolicitacaoMuseuTabelaGateway{
		
		private Connection conexaoBD;
	    private PreparedStatement findByIdStatement;
	    private PreparedStatement findAllStatement;
	    private PreparedStatement insertStatement;

	public DBSolicitacaoMuseuTabelaGateway() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
	
			this.conexaoBD = ConexaoBancoSingleton.GetInstance().getAConnection();
			
			insertStatement = conexaoBD.prepareStatement(
	                "INSERT INTO SolicitacaoMuseu (nome, dataCriacao, cidade, estado, cpfGestor, senhaGestor) VALUES (?, ?, ?, ?, ?, ?)"
	        );
			
			
			findAllStatement = conexaoBD.prepareStatement(
				"SELECT nome, dataCriacao, cidade, estado,cpfGestor,senhaGestor FROM SolicitacaoMuseu"
			);
	}
	
	@Override
	public SolicitacaoMuseuMT getSolicitacaoMuseuById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SolicitacaoMuseuMT> findAll() throws SQLException {
		System.out.println("ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
		 ArrayList<SolicitacaoMuseuMT> listagem = new ArrayList<>();
	     ResultSet rs = findAllStatement.executeQuery();

	        while (rs.next()) {
	        	
	            SolicitacaoMuseuMT mt = new SolicitacaoMuseuMT(
	            		rs.getString(2),
	            		rs.getString(3),
	            		rs.getString(4),
	            		rs.getString(5),
	            		rs.getString(6),
	            		rs.getString(7),
	            		rs.getString(8)
	            );
	                 
	            listagem.add(mt);
	        }
	
	        return listagem;
	}

	@Override
	public void insert( SolicitacaoMuseuMT mt) throws SQLException {
		
//		System.out.println("dentro do try");
//		con = conPoll.getAConnection();
//		System.out.println(con);
//		PreparedStatement s = con.prepareStatement("INSERT INTO SolicitacaoMuseu (nome, dataCriacao, cidade, estado,cpfGestor,senhaGestor) values (?,?,?,?,?,?)");
//
//		System.out.println(s);
//		s.setString(1, nomeSolicitacao);
//		s.setString(2, dataSolicitacao);
//		s.setString(3, cidadeSolicitacao);
//		s.setString(4, estadoSolicitacao);
//		s.setString(5, cpfGestor);
//		s.setString(6, senhaGestor);
//		s.executeUpdate();
//		
		
		insertStatement.clearParameters();

        insertStatement.setString(1, mt.getNome());
        insertStatement.setString(2, mt.getDataCriacao());
        insertStatement.setString(3,mt.getCidade());
        insertStatement.setString(4, mt.getEstado());
        insertStatement.setString(5, mt.getCpfGestor());
       // insertStatement.setString(6, mt.getNomeGestor());
        insertStatement.setString(6, mt.getSenhaGestor());
        insertStatement.executeUpdate();
        
        
    	System.out.println("Solicitacao salva no banco");
	}

}
