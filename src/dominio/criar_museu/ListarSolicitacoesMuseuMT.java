package dominio.criar_museu;

import java.sql.SQLException;

import com.sun.tools.javac.util.List;

import persistencia.SolicitacaoMuseuTabelaGateway;
import persistencia.db.DBSolicitacaoMuseuTabelaGateway;
import persistencia.mt.SolicitacaoMuseuMT;

public class ListarSolicitacoesMuseuMT {
	private SolicitacaoMuseuTabelaGateway tabelaGateway;
	
	public ListarSolicitacoesMuseuMT() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		this.tabelaGateway = new DBSolicitacaoMuseuTabelaGateway();
	}
	
	public List<SolicitacaoMuseuMT> listar() throws SQLException {
		return (List<SolicitacaoMuseuMT>) this.tabelaGateway.findAll();
	}
	
}
