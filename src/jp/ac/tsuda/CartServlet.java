package jp.ac.tsuda;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
