import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FinishServlet extends HttpServlet{
	
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException {
		
    	doPost(request,response);
    }
    
	 public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException {
		
		request.setCharacterEncoding("UTF-8");
		HttpSession session=request.getSession();
		String article=(String) session.getAttribute("article");
		request.setAttribute("article", article);
		
		String view="/WEB-INF/lib/finish.jsp";
		RequestDispatcher dispatcher=request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}
	

}
