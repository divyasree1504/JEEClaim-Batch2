package com.insurance.claim.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insurance.claim.dto.UserRole;

/**
 * Servlet implementation class UserLogin
 */
@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//insured 
		UserRole user = new UserRole();
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String rolecode = request.getParameter("rolecode");
		if(username.equals(user.getUsername()) && password.equals(user.getPassword()) && rolecode.equals("insured")){
			RequestDispatcher rd = request.getRequestDispatcher("insured.jsp");
			rd.forward(request, response);
		}
		else if(username.equals(user.getUsername()) && password.equals(user.getPassword()) && rolecode.equals("handler")){
			RequestDispatcher rd = request.getRequestDispatcher("handler.jsp");
			rd.forward(request, response);
		}
		else if(username.equals(user.getUsername()) && password.equals(user.getPassword()) && rolecode.equals("admin")){
			RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
			rd.forward(request, response);
		}
		else{
			out.println("Sorry! UserName or Password is incorrect");
			RequestDispatcher rd1 = request.getRequestDispatcher("UserLogin.jsp");
			rd1.include(request, response);
		}
	}

}


