package locator;
import persistencia.MuseuTabelaGateway;
import persistencia.SolicitacaoMuseuTabelaGateway;

public class ServiceLocator {
    private static ServiceLocator instance = new ServiceLocator();

    private MuseuTabelaGateway museuTableGateway;
    private SolicitacaoMuseuTabelaGateway solicitacaoMuseuTabelaGateway;
  

    public static ServiceLocator getInstance() {
        return instance;
    }

    public void provide(MuseuTabelaGateway museuTableGateway) {
        this.museuTableGateway = museuTableGateway;
    }
    
    public MuseuTabelaGateway getMuseuTableGateway() {
        return museuTableGateway;
    }
    

    public void provide(SolicitacaoMuseuTabelaGateway solicitacaoMuseuTableGateway) {
        this.solicitacaoMuseuTabelaGateway = solicitacaoMuseuTableGateway;
    }

    public SolicitacaoMuseuTabelaGateway getSolicitacaoMuseuTableGateway() {
        return solicitacaoMuseuTabelaGateway;
    }

}