import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ResultServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException {
		
		request.setCharacterEncoding("UTF-8");
		String article=request.getParameter("article");
		HttpSession session=request.getSession();
		session.setAttribute("article",article);
		request.setAttribute("article", article);
		
		String view="/WEB-INF/lib/result.jsp";
		RequestDispatcher dispatcher=request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}
}