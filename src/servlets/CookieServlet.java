package servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		boolean encontrada = false;
		for(Cookie cookie: cookies){
			cookie.getValue();
			System.out.println(cookie.getValue());
			if(cookie.getName().equals("fechaPrimeraConexion")){
				encontrada = true;
				request.setAttribute("fechaPrimeraConexion", cookie.getValue());
			}
		}
		//New date crea una fecha con la hora del sistema.
		//las cookies siguen la estructura hash, es decir, clave-valor.
		if(!encontrada){
			Cookie cookie = new Cookie("fechaPrimeraConexion", "20/01/2017");
			response.addCookie(cookie);
		}
		
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
