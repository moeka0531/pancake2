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

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.ac.tsuda.LinkData;
import jp.ac.tsuda.PMF;

public class CartServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws IOException, ServletException{
		
		PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        request.setCharacterEncoding("utf-8");
        String param1 = request.getParameter("id");
        PrintWriter out = response.getWriter();
        
        String[] select = request.getParameterValues("q1");//チェックボックスのデータ取得
        
        int numChecks = 0;
        if (select != null) {
            numChecks = select.length;
        } else {
            numChecks = 0;
        }
        
        request.setAttribute("count", numChecks);
        request.setAttribute("data", select);
        request.setAttribute("total", numChecks*250+600);
        

        
		 RequestDispatcher Dispatcher =    
			     request.getRequestDispatcher("/CartCheckBox.jsp");
			    Dispatcher.forward(request, response);

		  }
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		    throws IOException, ServletException{

		PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        request.setCharacterEncoding("utf-8");
        String param1 = request.getParameter("id");
        PrintWriter out = response.getWriter();
        
        String[] select = request.getParameterValues("q1");//チェックボックスのデータ取得
        
        int numChecks = 0;
        if (select != null) {
            numChecks = select.length;
        } else {
            numChecks = 0;
        }
        
        request.setAttribute("count", numChecks);
        request.setAttribute("data", select);
        request.setAttribute("total", numChecks*250+600);
        
		 RequestDispatcher Dispatcher =    
			     request.getRequestDispatcher("/CartCheckBox.jsp");
			    Dispatcher.forward(request, response);
		
		  }
}
