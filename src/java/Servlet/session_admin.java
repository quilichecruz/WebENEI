/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import MySQL.Consultas;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.net.InetAddress;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author prac-enei5
 */
public class session_admin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        /*variables de incio de sesion*/
        String user_admin=request.getParameter("user_admin");  
        String pass_admin=request.getParameter("pass_admin");
                
        /*variables de sesion*/
        InetAddress addr = InetAddress.getLocalHost();
        String hostname = addr.getHostName();
        String ip = addr.getHostAddress();
        request.getParameter("hostname");
        request.getParameter("ip");
        
        Consultas co = new Consultas(); 
        
        if(co.autentication_user(user_admin, pass_admin)){
           HttpSession session=request.getSession(); 
           session.setAttribute("user_admin",user_admin);  
           session.setAttribute("pass_admin",pass_admin);  
           session.setAttribute("hostname",hostname);
           session.setAttribute("ip",ip); 
           response.sendRedirect("principal.jsp");
        }
        else{  
            response.sendRedirect("login.jsp");
        }
        out.close();
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
