package com.srccodes.example;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final Logger logger = 
			LoggerFactory.getLogger(HelloWorld.class); 
	private static final long serialVersionUID = 1L;

	String connectionURL = "jdbc:mysql://localhost:3306/world";// userdb is the
																// database
	Connection connection;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloWorld() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
//		PrintWriter printWriter = response.getWriter();
//		printWriter.println("<h1>Hello World!</h1>");
//		response.sendRedirect("getdetails.jsp");
//		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("name");
		String age = request.getParameter("age");
		String exp = request.getParameter("exp");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(connectionURL, "root", "root");
			PreparedStatement pst = connection
					.prepareStatement("insert into hrdetails(name,age,exp) values(?,?,?)");

			pst.setString(1, username);
			pst.setString(2, age);
			pst.setString(3, exp);
			int i = pst.executeUpdate();
			if (i > 0) {
				logger.debug("success");
			} else {
				logger.debug("stuck somewhere");

			}
//			System.out.println(pst);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		logger.debug("entered post servlet" + username + age + exp);
	}

}
