package com.examples;

import java.sql.Statement;
import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/productServlet")
public class ReadProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Connection connection;
	
	@Override
	public void init() throws ServletException{
		System.out.println("AddUserSevlet.init() method. DB connection created");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "1234");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try(Statement statement = connection.createStatement();){
			response.setContentType("text/html");
			String productID = request.getParameter("productID");
			
			ResultSet results = statement.executeQuery("select * from products where ProductID = '" + productID + "'");
			PrintWriter out = response.getWriter();
			
			ArrayList<Integer> list = new ArrayList<>();
			while(results.next()) {
				int products = results.getInt(1);
				list.add(products);
			}
			
			if(list.contains(productID)) {
				out.println("<table>");
				out.println("<tr>");
				out.println("<th>ProdcutID</th>");
				out.println("<th>ProductName</th>");
				out.println("<th>ProductPrice</th>");
				out.println("</tr>");
				while(results.next()) {
					out.println("<tr>");
					out.println("<td>" + results.getInt(1) + "</td>");
					out.println("<td>" + results.getString(2) + "</td>");
					out.println("<td>" + results.getLong(3) + "</td>");
					out.println("</tr>");
				}
				out.println("</table>");
			}else {
				out.println("<h2>Error....No details found.Please enter the correct product ID.</h2>");
			}
			
			
			out.println("<p><a href=\"product.html\">Home</a></p>");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	@Override
	public void destroy() {
		try {
			System.out.println("AddUserSevlet.destroy() method. DB connection closed");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
