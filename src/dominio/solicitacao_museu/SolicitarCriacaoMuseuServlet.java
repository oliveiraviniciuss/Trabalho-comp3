package dominio.solicitacao_museu;
import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.solicitacao_museu.CriarSolicitacaoMuseuMT;

@WebServlet("/solicitar-criacao")

public class SolicitarCriacaoMuseuServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("))))))))))))))))))))))))))))))))))))))))))))");
		String nomeSolicitacao = request.getParameter("nomeSolicitacao");
		String dataSolicitacao = request.getParameter("dataSolicitacao");
		String cidadeSolicitacao = request.getParameter("cidadeSolicitacao");
		String estadoSolicitacao = request.getParameter("estadoSolicitacao");
		String nomeGestor = request.getParameter("nomeGestor");
		String cpfGestor = request.getParameter("cpfGestor");
		String senhaGestor = request.getParameter("senhaGestor");
		
		
		request.getSession().setAttribute("nomeSolicitacao", nomeSolicitacao);
		request.getSession().setAttribute("dataSolicitacao", dataSolicitacao);
		request.getSession().setAttribute("cidadeSolicitacao", cidadeSolicitacao);
		request.getSession().setAttribute("estadoSolicitacao", estadoSolicitacao);
		request.getSession().setAttribute("nomeGestor", nomeGestor);
		request.getSession().setAttribute("cpfGestor", cpfGestor);
		request.getSession().setAttribute("senhaGestor", senhaGestor);
		response.sendRedirect("http://localhost:8081/SistemaMuseuComp3/");
		
//		request.getSession().invalidate();
//		request.getRequestDispatcher("printout.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("------------------------------------------------------------");
		CriarSolicitacaoMuseuMT solicitacao;
		
		solicitacao = new CriarSolicitacaoMuseuMT(
				request.getParameter("nomeSolicitacao"), 
				request.getParameter("dataSolicitacao"),
				request.getParameter("cidadeSolicitacao"),
				request.getParameter("estadoSolicitacao"),
				request.getParameter("nomeGestor"),
				request.getParameter("cpfGestor"),
				request.getParameter("senhaGestor"));
	
		solicitacao.inserir();
		
		doGet(request, response);
		
		
		
	}

}
