package persistencia.mt;

import java.sql.ResultSet;

import dominio.ModuloTabela;

public final class MuseuMT implements ModuloTabela{
    
	private int id;
    private String nome;
    private String dataCriacao;
    private String cidade;
    private String estado;
    private int idGestor;

   
    private MuseuMT(String nome, String dataCriacao, String cidade, String estado, int idGestor) {
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.cidade = cidade;
        this.estado = estado;
        this.idGestor = idGestor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public int getIdGestor() {
        return idGestor;
    }

	@Override
	public void cria(ResultSet resultSet) {
		// TODO Auto-generated method stub
		
	}

}
