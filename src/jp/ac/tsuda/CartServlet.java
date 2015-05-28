package jp.ac.tsuda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CartServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws IOException, ServletException{

		 RequestDispatcher Dispatcher =    
			     request.getRequestDispatcher("/CartCheckBox.jsp");
			    Dispatcher.forward(request, response);

		  }
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		    throws IOException, ServletException{

		 RequestDispatcher Dispatcher =    
			     request.getRequestDispatcher("/CartCheckBox.jsp");
			    Dispatcher.forward(request, response);

		  }
}
