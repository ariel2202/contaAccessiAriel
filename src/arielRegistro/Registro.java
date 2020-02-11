package arielRegistro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registro
 */
@WebServlet("/Registro")
public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	int accessi;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
doGet(request, response);
		
		response.setContentType("text/html");
		
		PrintWriter uscita = response.getWriter();
		
	
		
		
			if(accessi == 0) {
				accessi++;
				uscita.println("<html><body>");
				uscita.println("benvenuto " + request.getParameter("nome"));
				uscita.println("<br>");
				uscita.println("è la " + accessi + " volta che visiti questa pagina");
				uscita.println("<br><br>");
				uscita.println("</body></html>");
				
			}
			else {
				accessi++;
				uscita.println("<html><body>");
				uscita.println("bentornato " + request.getParameter("nome"));
				uscita.println("<br>");
				uscita.println("è la " + accessi + " volta che visiti questa pagina");
				uscita.println("</body></html>");
				
			}
			
		
		
	}

}
