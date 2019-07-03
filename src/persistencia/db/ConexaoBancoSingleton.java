package persistencia.db;


public class ConexaoBancoSingleton {
	
	private static ConexaoBancoSingleton instancia;
	
	private String dbString;
	
	public static ConexaoBancoSingleton GetInstance() {
		if (instancia == null)
			instancia = new ConexaoBancoSingleton();
		return instancia;
	}
	
	protected ConexaoBancoSingleton() {
		  dbString = "jdbc:derby:C:\\Users\\Igor\\MyDB;create=true;user=banco;password=banco";
	}
	
	
}
