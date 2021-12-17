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
 * Servlet implementation class ServletControllerOld
 */
@SuppressWarnings("unused")
@WebServlet("/ServletControllerOld")
public class ServletControllerOld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletControllerOld() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String checkPassword = request.getParameter("password");
		String checkUsername = request.getParameter("username");
		
		OldUserBean oldBean = new OldUserBean(checkUsername, checkPassword);
		
		if(ListHandler.getUsernameList().contains(oldBean.getUsername()) && ListHandler.getPasswordList().contains(oldBean.getPassword())) {
			
			request.setAttribute("oldBean", oldBean);
			
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(600);
			session.setAttribute("mySession","Pepega2");
			
			Cookie ck = new Cookie("KEKW", "Madge2");
			ck.setMaxAge(3600);
			response.addCookie(ck);
			
			RequestDispatcher rd = request.getRequestDispatcher("loggedinMVC.jsp");
			rd.forward(request, response);
		} else {
			
			response.sendRedirect("Register.jsp");
		}
			
	}

}
