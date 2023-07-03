package etu1756.framework.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Utile  {

    
    public String getMethodePath(HttpServletRequest request) throws ServletException {
    
            String url = request.getRequestURI();
            String[] methode = url.split("/");
            String method = methode[methode.length - 1];
            
            return method;
        }
}
