/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import MySQL.Consultas;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author prac-enei5
 */
public class relacion_admin extends HttpServlet {

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
        String dnipro = request.getParameter("dnipro");
        int codcur = Integer.parseInt(request.getParameter("codcur"));
        String fechatini = request.getParameter("fechatini");
        String fechatfin = request.getParameter("fechatfin");
        String esta = request.getParameter("esta");
        String labo = request.getParameter("labo");
        int paga = Integer.parseInt(request.getParameter("paga"));
        String frec = request.getParameter("frec");      
                
        Consultas co = new Consultas();
        if(co.relation(dnipro,codcur,fechatini,fechatfin,esta,labo,paga,frec)){
        
        request.setAttribute("dnipro", dnipro);
        request.setAttribute("codcur", codcur);  
        request.setAttribute("fechatini", fechatini);   
        request.setAttribute("fechatfin", fechatfin); 
        request.setAttribute("esta", esta); 
        request.setAttribute("labo", labo); 
        request.setAttribute("paga", paga); 
        request.setAttribute("frec", frec);
        
        response.sendRedirect("inicio.jsp?dnipro="+dnipro);

        }else{
        response.sendRedirect("assign.jsp");
        }       
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
