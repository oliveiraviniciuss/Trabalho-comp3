import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */

public class MainServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
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
		response.sendRedirect("jsp/printout.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
