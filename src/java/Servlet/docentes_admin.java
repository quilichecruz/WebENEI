/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import MySQL.Consultas;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author prac-enei5
 */
public class docentes_admin extends HttpServlet {

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
        
        String dnipro = request.getParameter("dnipro");
        String nombrepro = request.getParameter("nombrepro");
        String apellidospro = request.getParameter("apellidospro");
        String tele = request.getParameter("tele");          
        String dire = request.getParameter("dire");          
        String corr = request.getParameter("corr");          
        String cpre = request.getParameter("cpre");          
        String grad = request.getParameter("grad");          
        String prof = request.getParameter("prof");          
        String tipo = request.getParameter("tipo");          
        String cpos = request.getParameter("cpos");          
        String espe = request.getParameter("espe");
        String dipl = request.getParameter("dipl");          
        String expe = request.getParameter("expe");
        String sede = request.getParameter("sede");  
        String c1 = request.getParameter("c1"); 
        String c2 = request.getParameter("c2"); 
        String c3 = request.getParameter("c3"); 
        String c4 = request.getParameter("c4"); 
        String c5 = request.getParameter("c5"); 
        String c6 = request.getParameter("c6"); 
        String c7 = request.getParameter("c7"); 
        String c8 = request.getParameter("c8"); 
        String c9 = request.getParameter("c9"); 
        String c10 = request.getParameter("c10"); 
        String c11 = request.getParameter("c11"); 
        String c12 = request.getParameter("c12");        
                       
        Consultas co = new Consultas();
        if(co.registro_docente(dnipro,nombrepro,apellidospro,tele,dire,corr,cpre,grad,prof,tipo,cpos,espe,dipl,expe,sede,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12)){
        request.setAttribute("dnipro", dnipro);
        request.setAttribute("nombrepro", nombrepro);
        request.setAttribute("apellidospro", apellidospro);
        request.setAttribute("tele", tele);
        request.setAttribute("dire", dire);
        request.setAttribute("corr", corr); 
        request.setAttribute("cpre", cpre);
        request.setAttribute("grad", grad);
        request.setAttribute("prof", prof); 
        request.setAttribute("tipo", tipo);
        request.setAttribute("cpos", cpos);
        request.setAttribute("espe", espe);
        request.setAttribute("dipl", dipl);
        request.setAttribute("expe", expe);
        request.setAttribute("sede", sede);
        request.setAttribute("c1", c1);
        request.setAttribute("c2", c2);
        request.setAttribute("c3", c3);
        request.setAttribute("c4", c4);
        request.setAttribute("c5", c5);
        request.setAttribute("c6", c6);
        request.setAttribute("c7", c7);
        request.setAttribute("c8", c8);
        request.setAttribute("c9", c9);
        request.setAttribute("c10", c10);
        request.setAttribute("c11", c11);
        request.setAttribute("c12", c12);
        
        response.sendRedirect("inicio.jsp?dnipro="+dnipro+"#popup2");
        }else{
        response.sendRedirect("inicio.jsp");
        }
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
