package collagev1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet ("/logout")
public class logout extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException
	        {
		HttpSession sess=request.getSession(false);
		sess.removeAttribute("password");
		sess.invalidate();
		response.sendRedirect("login.jsp");
		
		
		
		
	        }

}
