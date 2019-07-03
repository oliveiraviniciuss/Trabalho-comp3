package dominio.criar_museu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CriarMuseuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tabelaSolicitacoes[][] =
		{
		        {"Gabriel", "30/06/2019", "Duque de Caxias", "123.456.789-10" }
		}; 
		
		int totalSolicitacoes = 1;
		
		request.getSession().setAttribute("tabelaSolicitacoes", tabelaSolicitacoes);
		request.getSession().setAttribute("totalSolicitacoes", totalSolicitacoes);
		
		response.sendRedirect("/SistemaMuseuComp3/jsp/criarMuseu.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
