package dominio.criar_museu;

import persistencia.MuseuTabelaGateway;
import persistencia.mt.MuseuMT;

public class CriarMuseuMT {
	
	private MuseuTabelaGateway tabelaGateway;
	private MuseuMT insercao;
	
	public CriarMuseuMT( 
		String nome,
        String dataCriacao,
        String cidade,
        String cpfGestor
     ) 
	{
		//this.insercao = new MuseuMT (nome, dataCriacao, cidade, cpfGestor);
	}
	
}
