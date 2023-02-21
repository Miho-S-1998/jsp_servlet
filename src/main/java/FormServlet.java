import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FormServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		
		request.setCharacterEncoding("UTF-8");
		HttpSession session=request.getSession();
		String message=request.getParameter("message");
		request.setAttribute("message", message);
		session.setAttribute("message", message);
		
		String view="/WEB-INF/lib/form.jsp";
		RequestDispatcher dispatcher=request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
		
		
	}
}