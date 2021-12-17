package controller;

import model.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletController
 */
@SuppressWarnings("unused")
@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletController() {
        super();
        
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int age =Integer.parseInt(request.getParameter("ageRegister"));
		String city = request.getParameter("cityRegister");
		String username = request.getParameter("userRegister");
		String password = request.getParameter("passRegister");
		
		RegisterBean rBean = new RegisterBean();
		rBean.setAge(age);
		rBean.setCity(city);
		rBean.setPassword(password);
		rBean.setUsername(username);

		request.setAttribute("RegisterBean", rBean);
		
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(600);
		session.setAttribute("mySession","Session : Pepega");
		
		Cookie ck = new Cookie("KEKW", "Madge");
		ck.setMaxAge(3600);
		response.addCookie(ck);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("loggedinMVC.jsp");
		rd.forward(request, response);
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		doPost(request, response);
	}
}
