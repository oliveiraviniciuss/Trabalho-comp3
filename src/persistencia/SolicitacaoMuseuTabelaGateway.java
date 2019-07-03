package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import persistencia.mt.SolicitacaoMuseuMT;

public interface SolicitacaoMuseuTabelaGateway {
	
	SolicitacaoMuseuMT getSolicitacaoMuseuById(int id) throws SQLException;
	
	List<SolicitacaoMuseuMT> findAll() throws SQLException;

	void insert(SolicitacaoMuseuMT mt) throws SQLException;
}
