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

		
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        request.setCharacterEncoding("utf-8");
    
        PrintWriter out = response.getWriter();
        String q1[] = request.getParameterValues("q1");
        int total = 600+q1.length*250;
        
        out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>pancake Cart</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<Div Align="+"center"+">");
		out.println("<br>");
		out.println("<br>");
		out.println("<h2>カート内の商品は以下の通りです＊</h2>");
		out.println("<h4>品名　　　金額</h4>");
		out.println("<hr size="+"10"+">");
		if(q1 != null){
			for(int i=0; i<q1.length; i++){
				out.println(q1[i] + "　　　" + "250");
			}
		}
		out.println("<hr size="+"10"+">");
		out.println("<br>");
		out.println("<br>");
		out.println("続いて配送設定を行います、以下のボタンを押して進んでください！");
		out.println("<br>");
		out.println("<br>");
		out.println("<form action="+"delivery.jsp"+" method="+"get"+" class="+"Cart"+">");
		out.println("input type="+"submit"+" value="+"配送設定へ");
		out.println("</form>");
		out.println("<br>");
		out.println("<a href="+"/logout"+"Logout</a>");
		out.println("</BODY>");
	    out.println("</HTML>");
	    out.close();
		     
	}
	
}
