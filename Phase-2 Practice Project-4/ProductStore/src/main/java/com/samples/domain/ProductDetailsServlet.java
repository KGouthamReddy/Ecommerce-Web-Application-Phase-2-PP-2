package com.samples.domain;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addproductServlet")
public class ProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productID = Integer.parseInt(request.getParameter("productID"));
		String productName = request.getParameter("productName");
		String productPrice = request.getParameter("productPrice");
		
		ArrayList<Product> products = new ArrayList<>();
		
		
		products.add(new Product(productID, productName, productPrice));
		
		request.setAttribute("data", products);
		RequestDispatcher rd = request.getRequestDispatcher("/product.jsp");
		rd.forward(request, response);
		
	}

}
