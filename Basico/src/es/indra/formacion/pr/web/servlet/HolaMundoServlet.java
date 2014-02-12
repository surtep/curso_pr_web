package es.indra.formacion.pr.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HolaMundoServlet
 */
@WebServlet(
		urlPatterns = { 
				"/HolaMundo", 
				"/inicio"
		}, 
		initParams = { 
				@WebInitParam(name = "nombre", value = "Rodolfo", description = "Este es el nombre de la persona")
		})
public class HolaMundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HolaMundoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombres[] = new String[] { "uno", "dos", "tres", "cuatro" };
		
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Hola mundo!!</title>");
		pw.println("</head>");
		pw.println("<body>");
		
		// Mensaje estático
		pw.println("Hola mundo!!");		
		pw.println("<br>");		
		pw.println("<br>");		

		// Tabla dinámica
		pw.println("<table border='1'>");		
		for (String n : nombres) {
			pw.println("<tr><td>" + n + "</td></tr>");		
		}		
		pw.println("</table>");		
		pw.println("<br>");		
		pw.println("<br>");		
		
		// Formulario
		pw.println("<form action='Procesar' method='POST'>");		
		pw.println("Nombre: <input type='text' name='nombre'><br>");
		pw.println("Apellido: <input type='text' name='apellido'><br>");
		pw.println("<input type='submit' value='enviar'><br>");
		pw.println("</form>");		

		// Cierre
		pw.println("</body>");
		pw.println("</html>");
		pw.flush();
	}

}
