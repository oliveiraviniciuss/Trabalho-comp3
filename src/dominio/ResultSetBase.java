package dominio;

public class ResultSetBase {

    private String nome;
    private String dataCriacao;
    private String cidade;
    private String estado;
    private String cpfGestor;
    private String nomeGestor;
    private String senhaGestor;
    
    public ResultSetBase() {
		// TODO Auto-generated constructor stub
	}
	
	public ResultSetBase(
			String nome,
            String dataCriacao,
            String cidade,
            String estado,
            String cpfGestor,
            String nomeGestor,
            String senhaGestor) {
		 
         this.nome = nome;
         this.dataCriacao = dataCriacao;
         this.cidade = cidade;
         this.estado = estado;
         this.cpfGestor = cpfGestor;
         this.nomeGestor = nomeGestor;
         this.senhaGestor = senhaGestor;
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

	    public String getCpfGestor() {
	        return cpfGestor;
	    }

	    public String getNomeGestor() {
	        return nomeGestor;
	    }

	    public String getSenhaGestor() {
	        return senhaGestor;
	    }
}
