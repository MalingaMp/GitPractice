package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyLogin
 */
@WebServlet("/mylogin")
public class MyLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 

			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String uid = request.getParameter("uid");

		String pwd = request.getParameter("pwd");

		if( uid.equals("abc") && pwd.equals("123")) {

			  RequestDispatcher rd = request.getRequestDispatcher("welcome");

			  request.setAttribute("msg", "Welcome to JEE World : \n");

			  rd.forward(request, response);

		}

		else {

			out.println("<h1>Sorry... Try again</h1>");

			RequestDispatcher rd = request.getRequestDispatcher("Login.html");

			rd.include(request, response);

		}

	}


}
