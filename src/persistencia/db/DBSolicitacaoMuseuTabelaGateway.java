package persistencia.db;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import persistencia.SolicitacaoMuseuTabelaGateway;
import persistencia.mt.SolicitacaoMuseuMT;

public class DBSolicitacaoMuseuTabelaGateway implements SolicitacaoMuseuTabelaGateway{
	 // private static final Logger logger = LoggerFactory.getLogger(DBSolicitacaoMuseuTabelaGateway.class);
	 
	  	private Connection dbConn;
	    private PreparedStatement findByIdStatement;
	    private PreparedStatement findAllStatement;
	    private PreparedStatement insertStatement;

	public DBSolicitacaoMuseuTabelaGateway() {
		this.dbConn = (Connection) ConexaoBancoSingleton.GetInstance();
	}
	
	@Override
	public SolicitacaoMuseuMT getSolicitacaoMuseuById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SolicitacaoMuseuMT> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert( SolicitacaoMuseuMT mt) throws SQLException {
		
		System.out.println("na inserção ahuhauhauahuah");
		insertStatement.clearParameters();

        insertStatement.setString(1, mt.getNome());
        insertStatement.setString(2, mt.getDataCriacao());
        insertStatement.setString(3,mt.getCidade());
        insertStatement.setString(4, mt.getEstado());
        insertStatement.setString(5, mt.getCpfGestor());
        insertStatement.setString(6, mt.getNomeGestor());
        insertStatement.setString(7, mt.getSenhaGestor());
        insertStatement.executeUpdate();
	}

}
