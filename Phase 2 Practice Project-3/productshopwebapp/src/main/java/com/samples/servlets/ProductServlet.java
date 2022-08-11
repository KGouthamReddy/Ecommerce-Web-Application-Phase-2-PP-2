package com.samples.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samples.domain.Product;
import com.samples.service.ProductstoreService;


@WebServlet("/products")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    ProductstoreService productstoreService;
    
    public void init() throws ServletException{
    	super.init();
    	this.productstoreService = new ProductstoreService();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<Product> products = this.productstoreService.getProducts();
		request.setAttribute("products", products);
		
		RequestDispatcher rd = request.getRequestDispatcher("/viewproducts.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String pricestr = request.getParameter("price");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if (name == "" ||pricestr == "") {
			out.println("<html>");
			out.println("<body>");
			out.println("<h3> Please enter the valid details </h3>");
			out.println("</body>");
			out.println("</html>");
		}
		
		int priceint = Integer.parseInt(pricestr);
		
		Product product = new Product(name, priceint);
		this.productstoreService.addProduct(product);
		
		List<Product> products = this.productstoreService.getProducts();
		request.setAttribute("products", products);
		
		RequestDispatcher rd = request.getRequestDispatcher("/declaration.jsp");
		rd.forward(request, response);
	
	}

}
