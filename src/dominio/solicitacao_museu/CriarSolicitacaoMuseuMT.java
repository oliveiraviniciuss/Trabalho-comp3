package dominio.solicitacao_museu;

import java.sql.ResultSet;
import java.sql.SQLException;

import dominio.ModuloTabela;
import locator.ServiceLocator;
import persistencia.SolicitacaoMuseuTabelaGateway;
import persistencia.db.DBSolicitacaoMuseuTabelaGateway;
import persistencia.mt.SolicitacaoMuseuMT;


public class CriarSolicitacaoMuseuMT{

	private SolicitacaoMuseuTabelaGateway tabelaGateway;
	private SolicitacaoMuseuMT insercao;
	
	public CriarSolicitacaoMuseuMT( 
			String nome,
            String dataCriacao,
            String cidade,
            String estado,
            String cpfGestor,
            String nomeGestor,
            String senhaGestor
           ) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException  {
		
		this.insercao = new SolicitacaoMuseuMT(
				 nome,
	             dataCriacao,
	             cidade,
	             estado,
	             cpfGestor,
	             nomeGestor,
	             senhaGestor);
		
		this.tabelaGateway = new DBSolicitacaoMuseuTabelaGateway();
	}
	
	public void inserir() {
		
		try {
			tabelaGateway.insert(this.insercao);
			
		} catch (SQLException e) {		
			e.printStackTrace();
		}
	
	}

	
}
