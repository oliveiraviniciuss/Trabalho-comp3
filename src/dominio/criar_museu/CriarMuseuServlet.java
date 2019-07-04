package dominio.criar_museu;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dominio.solicitacao_museu.CriarSolicitacaoMuseuMT;
import persistencia.mt.SolicitacaoMuseuMT;

@WebServlet("/criar-museu")
public class CriarMuseuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//else {
            List<SolicitacaoMuseuMT> solicitacoes;
            
            try {
            	System.out.println("_---------------------------------------------");
				solicitacoes = new ListarSolicitacoesMuseuMT().listar();
				System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			    request.setAttribute("solicitacoes", solicitacoes);
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
            
            request.getRequestDispatcher("/listarSolicitacoes.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
