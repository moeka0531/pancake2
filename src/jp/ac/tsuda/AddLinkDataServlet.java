package jp.ac.tsuda;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import javax.jdo.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import jp.ac.tsuda.LinkData;
import jp.ac.tsuda.PMF;
 

public class AddLinkDataServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    @Override
    protected void doGet(HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("no url...");
    }
 
    @Override
    protected void doPost(HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String price = req.getParameter("price");

        LinkData data = new LinkData(name,price);
        PersistenceManagerFactory factory = PMF.get();
        PersistenceManager manager = factory.getPersistenceManager();
        try {
            manager.makePersistent(data);
        } finally {
            manager.close();
        }
        resp.sendRedirect("/index.html");
    }
}