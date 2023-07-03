package etu1756.framework.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import etu1756.framework.*;

/**
 * FrontServlet
 */
public class FrontServlet extends HttpServlet{

    HashMap<String,Mapping> MappingUrls;

    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            Utile ut = new Utile();
            out.println(ut.getMethodePath(request));
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
       
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        processRequest(request, response);
    }
   
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
    }

 } 