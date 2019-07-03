package dominio.solicitacao_museu;

import java.sql.ResultSet;
import java.sql.SQLException;

import dominio.ModuloTabela;
import locator.ServiceLocator;
import persistencia.SolicitacaoMuseuTabelaGateway;
import persistencia.mt.SolicitacaoMuseuMT;


public class CriarSolicitacaoMuseuMT{

	private SolicitacaoMuseuTabelaGateway tabelaGateway = ServiceLocator.getInstance().getSolicitacaoMuseuTableGateway();
	private SolicitacaoMuseuMT insercao;
	
	public CriarSolicitacaoMuseuMT( 
			String nome,
            String dataCriacao,
            String cidade,
            String estado,
            String cpfGestor,
            String nomeGestor,
            String senhaGestor
           )  {
		
		this.insercao = new SolicitacaoMuseuMT(
				 nome,
	             dataCriacao,
	             cidade,
	             estado,
	             cpfGestor,
	             nomeGestor,
	             senhaGestor);
	}
	
	public void inserir() {
		System.out.println("_________________________________________________________");
		try {
			tabelaGateway.insert(this.insercao);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
