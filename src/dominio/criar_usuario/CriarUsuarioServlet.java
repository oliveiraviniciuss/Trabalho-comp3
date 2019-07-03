package dominio.criar_usuario;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CriarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("<!DOCTYPE html><html><head></head><body><h1>N�o Estou pronto :'(</h1><br><p>Quem sabe um dia estarei</p></body></html>");
		response.sendRedirect("jsp/criarUsuario.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
		String comando = request.getParameter("comando");
		
		switch(comando) {
			case "Insere":
				 request.getRequestDispatcher("/SistemaMuseuComp3/jsp/criarUsuairo.jsp").forward(request, response);
                 break;

		}
	}

}
