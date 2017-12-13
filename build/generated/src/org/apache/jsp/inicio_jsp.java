package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
  
    String hostname=(String)session.getAttribute("hostname");
    String ip=(String)session.getAttribute("ip");
    String dnipro= request.getParameter("dnipro");
    String nombrepro= request.getParameter("nombrepro");
    String id=request.getParameter("id");

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Inicio</title>\n");
      out.write("        <script type=\"text/javascript\"  src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("        <script type=\"text/javascript\"  src=\"https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/custom/inicio-admin.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/custom/admin-popup.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"nav nav-tabs\" id=\"myTab\">\n");
      out.write("            <a class=\"nav-item nav-link\" id=\"nav-home-tab\" data-toggle=\"tab\" href=\"#nav-report\" role=\"tab\" aria-controls=\"nav-report\" aria-selected=\"false\" style=\"color: #000;font-size: 13px;\"><img src=\"media/logo.png\" alt=\"\" style=\"width: 45px;height: auto;text-align: center;\"></a>\n");
      out.write("            <a class=\"nav-item nav-link\" id=\"nav-home-tab\" data-toggle=\"tab\" href=\"#nav-home\" role=\"tab\" aria-controls=\"nav-home\" aria-selected=\"true\" style=\"color: #000;font-size: 13px;font-weight: 600;\"><i class=\"material-icons\" style=\"font-size: 18px\">school</i> Docentes</a>\n");
      out.write("            <a class=\"nav-item nav-link\" id=\"nav-profile-tab\" data-toggle=\"tab\" href=\"#nav-profile\" role=\"tab\" aria-controls=\"nav-profile\" aria-selected=\"false\" style=\"color: #000;font-size: 13px;font-weight: 600;\"><i class=\"material-icons\" style=\"font-size: 18px\">local_library</i> Cursos</a>\n");
      out.write("            <a class=\"nav-item nav-link\" id=\"nav-contact-tab\" data-toggle=\"tab\" href=\"#nav-contact\" role=\"tab\" aria-controls=\"nav-contact\" aria-selected=\"false\" style=\"color: #000;font-size: 13px;font-weight: 600;\"><i class=\"material-icons\" style=\"font-size: 18px\">dashboard</i> Reportes</a>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"tab-content\" id=\"nav-tabContent\">\n");
      out.write("            <div class=\"tab-pane fade show active\" id=\"nav-home\" role=\"tabpanel\" aria-labelledby=\"nav-home-tab\">\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!--Menu-->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <form>\n");
      out.write("                            <select style=\"font-size: 12px;width: 70%\">\n");
      out.write("                                <option>Docentes con cursos</option>\n");

    Connection cnx=null;
    Statement sta=null;
    ResultSet rs=null;
try {
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select * from cursos");
    while (rs.next()){

      out.write("\n");
      out.write("                                <option value=\"");
      out.print(rs.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\n");
 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
           }

      out.write(" \n");
      out.write("                            </select>\n");
      out.write("                            <button style=\"background: transparent;border: 0px;\"><i class=\"material-icons\" style=\"font-size: 18px;\">search</i></button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                            \n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <form>\n");
      out.write("                            <select style=\"font-size: 12px;width: 70%\">\n");
      out.write("                                <option>Lista de cursos</option>\n");

try {
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select * from cursos");
    while (rs.next()){

      out.write("\n");
      out.write("                                <option value=\"");
      out.print(rs.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\n");
 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
           }

      out.write(" \n");
      out.write("                            </select>\n");
      out.write("                            <button style=\"background: transparent;border: 0px;\"><i class=\"material-icons\" style=\"font-size: 18px;\">search</i></button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                            \n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <a style=\"text-decoration: none;color: #000;font-size: 13px;\" href=\"#popup\" class=\"popup-link\" onclick = \"document.getElementById('light').style.display='block';\">\n");
      out.write("                            <i class=\"material-icons\" style=\"text-decoration: none;color: #000;\">accessibility</i> Agregar docente</a>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("            <!--Contenido-->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");
      out.write("  \n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"col-md-12\" style=\"margin-top: 3%;\">\n");
      out.write("                        <div class=\"table-responsive\" style=\"max-height: 350px;font-size: 12px;\">\n");
      out.write("                        <!--<table class=\"table table-hover\">-->\n");
      out.write("                        <table id=\"example\" class=\"display\" cellspacing=\"0\" width=\"100%\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th></th>                                        \n");
      out.write("                                    <th style=\"text-align: center\">Docente</th>\n");
      out.write("                                    <th style=\"text-align: center\">Sede</th>\n");
      out.write("                                    <th style=\"text-align: center\">Profesión</th>\n");
      out.write("                                    <th style=\"text-align: center\">Grado</th>\n");
      out.write("                                    <th style=\"text-align: center\">Opción</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");

    try {
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select * from profesores order by apellidos_pro");
    while (rs.next()){

      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td style=\"text-align: center;padding: 0px 0px 0px 0px;margin: 0px 0px 0px 0px;\"><a><i class=\"material-icons\" style=\"font-size: 18px\">account_circle</i></a></td>\n");
      out.write("                                    <td style=\"padding: 0px 0px 0px 0px;margin: 0px 0px 0px 0px;\"><a style=\"text-decoration: none;color: #000;\" href=\"inicio.jsp?dnipro=");
      out.print(rs.getString(1));
      out.write("#popup2\" onclick = \"document.getElementById('light2').style.display='block';\">");
      out.print(rs.getString(3));
      out.write(',');
      out.write(' ');
      out.print(rs.getString(2));
      out.write("</a></td>\n");
      out.write("                                    <td style=\"padding: 0px 0px 0px 0px;margin: 0px 0px 0px 0px;\">");
      out.print(rs.getString(15));
      out.write("</td>\n");
      out.write("                                    <td style=\"padding: 0px 0px 0px 0px;margin: 0px 0px 0px 0px;\">");
      out.print(rs.getString(9));
      out.write("</td>\n");
      out.write("                                    <td style=\"padding: 0px 0px 0px 0px;margin: 0px 0px 0px 0px;\">");
      out.print(rs.getString(8));
      out.write("</td>\n");
      out.write("                                    <td style=\"padding: 0px 0px 0px 0px;margin: 0px 0px 0px 0px;text-align: center;\">\n");
      out.write("                                        <a style=\"text-decoration: none;color: #000;\" href=\"inicio.jsp?dnipro=");
      out.print(rs.getString(1));
      out.write("#popup2\" onclick = \"document.getElementById('light2').style.display='block';\">\n");
      out.write("                                            <i class=\"material-icons\" style=\"font-size: 18px\">toc</i></a>\n");
      out.write("                                        <a style=\"text-decoration: none;color: #000;\" href=\"editpro.jsp?dnipro=");
      out.print(rs.getString(1));
      out.write("\">\n");
      out.write("                                            <i class=\"material-icons\" style=\"font-size: 18px;\">edit</i></a>\n");
      out.write("                                        <a style=\"text-decoration: none;color: #000;\" href=\"eliminarpro.jsp?dnipro=");
      out.print(rs.getString(1));
      out.write("\" onclick=\"return eliminar()\">\n");
      out.write("                                            <i class=\"material-icons\" style=\"font-size: 18px\">highlight_off</i></a>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>                      \n");
 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
    }

      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>            \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <!--Footer-->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("  <div class=\"tab-pane fade\" id=\"nav-profile\" role=\"tabpanel\" aria-labelledby=\"nav-profile-tab\">...</div>\n");
      out.write("  <div class=\"tab-pane fade\" id=\"nav-contact\" role=\"tabpanel\" aria-labelledby=\"nav-contact-tab\">...</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"modal-wrapper\" id=\"popup\">\n");
      out.write("    <div style=\"position: relative;margin:10% auto;padding:30px 30px;background-color: #fafafa;color:#333;border-radius: 3px;width:80%;\">\n");
      out.write("        <div class=\"row\" id=\"light\" style=\"display: none;\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <form action=\"docentes_admin\" name=\"holapro\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-2 mb-2\">\n");
      out.write("                            <input type=\"text\" name=\"dnipro\" placeholder=\"DNI\" required maxlength=\"12\" style=\"width: 100%;padding-left: 3px;font-size: 13px;outline-color: #2196F3\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 mb-2\">\n");
      out.write("                            <input type=\"text\" name=\"nombrepro\" placeholder=\"Nombre\" required style=\"width: 100%;padding-left: 3px;font-size: 13px;outline-color: #2196F3\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 mb-2\">\n");
      out.write("                            <input type=\"text\" name=\"apellidospro\" placeholder=\"Apellidos\" required style=\"width: 100%;padding-left: 3px;font-size: 13px;outline-color: #2196F3\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-2 mb-2\">\n");
      out.write("                            <input type=\"text\" name=\"sede\" placeholder=\"Sede\"  style=\"width: 100%;padding-left: 3px;font-size: 13px;outline-color: #2196F3\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-10 mb-2\">\n");
      out.write("                            <input type=\"text\" name=\"dire\" placeholder=\"Dirección\"  style=\"width: 100%;padding-left: 3px;font-size: 13px;outline-color: #2196F3\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 mb-2\">\n");
      out.write("                            <input type=\"text\" name=\"tele\" placeholder=\"Teléfono\"  style=\"width: 100%;padding-left: 3px;font-size: 13px;outline-color: #2196F3\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 mb-2\">\n");
      out.write("                            <input type=\"text\" name=\"corr\" placeholder=\"Email\"  style=\"width: 100%;padding-left: 3px;font-size: 13px;outline-color: #2196F3\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-8 mb-2\">\n");
      out.write("                            <input type=\"text\" name=\"prof\" placeholder=\"Profesión\"  style=\"width: 100%;padding-left: 3px;font-size: 13px;outline-color: #2196F3\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 mb-2\">\n");
      out.write("                            <input type=\"text\" name=\"grad\" placeholder=\"Grado\"  style=\"width: 100%;padding-left: 3px;font-size: 13px;outline-color: #2196F3\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-12 mb-2\">\n");
      out.write("                            <textarea name=\"espe\" style=\"width: 100%;padding-left: 3px;font-size: 13px;outline-color: #2196F3\" placeholder=\"Especialidad\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-12 mb-2\">\n");
      out.write("                            <textarea name=\"expe\" style=\"width: 100%;padding-left: 3px;font-size: 13px;outline-color: #2196F3\" placeholder=\"Experiencia\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("        \n");
      out.write("                        <label style=\"width: 100%;font-size: 10px;margin-left: 15px;\">Agregar cursos de referencia + \n");
      out.write("                        <input type=\"checkbox\" name=\"c33\" onclick=\"showMe('j1', this),showMe('j2', 'none'),showMe('s2', this),showMe('s3', this),showMe('s4', this),showMe('s5', 'none'),showMe('s6', 'none'),showMe('s7', 'none'),showMe('s8', 'none'),showMe('s9', 'none'),showMe('s10', 'none'),showMe('s11', 'none'),showMe('s12', 'none')\">\n");
      out.write("                        </label>\n");
      out.write("\n");
      out.write("                        <select name=\"c1\" id=\"s1\" style=\"display: block;font-size: 13px;margin-left: 15px;width: 40%\">\n");
      out.write("                        <option value=\"null\">Curso 1</option>\n");
      out.write("                ");

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                        sta=cnx.createStatement();
                        rs=sta.executeQuery("select * from cursos");
                        while (rs.next()){
                
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(rs.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("                ");
 
                }
                sta.close();
                rs.close();
                cnx.close();
                    } catch (Exception e) {
                           }
                
      out.write("  \n");
      out.write("                        </select>\n");
      out.write("                        <select name=\"c2\" id=\"s2\" style=\"display: none;font-size: 13px;margin-left: 15px;width: 40%\">\n");
      out.write("                        <option value=\"null\">Curso 2</option>\n");
      out.write("                ");

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                        sta=cnx.createStatement();
                        rs=sta.executeQuery("select * from cursos");
                        while (rs.next()){
                
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(rs.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("                ");
 
                }
                sta.close();
                rs.close();
                cnx.close();
                    } catch (Exception e) {
                           }
                
      out.write("  \n");
      out.write("                    </select>\n");
      out.write("                        <select name=\"c3\" id=\"s3\" style=\"display: none;font-size: 13px;margin-left: 15px;width: 40%\">\n");
      out.write("                        <option value=\"null\">Curso 3</option>\n");
      out.write("                    ");

                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                            sta=cnx.createStatement();
                            rs=sta.executeQuery("select * from cursos");
                            while (rs.next()){
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(rs.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("                                          ");
 
                    }
                    sta.close();
                    rs.close();
                    cnx.close();
                        } catch (Exception e) {
                               }
                    
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                        <select name=\"c4\" id=\"s4\" style=\"display: none;font-size: 13px;margin-left: 15px;width: 40%\">\n");
      out.write("                        <option value=\"null\">Curso 4</option>\n");
      out.write("                    ");

                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                            sta=cnx.createStatement();
                            rs=sta.executeQuery("select * from cursos");
                            while (rs.next()){
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(rs.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("                    ");
 
                    }
                    sta.close();
                    rs.close();
                    cnx.close();
                        } catch (Exception e) {
                               }
                    
      out.write("  \n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                        <label style=\"margin-top: 10px;display: none;width: 100%;font-size: 10px;margin-left: 15px;\" id=\"j1\">Agregar cursos de referencia + <input type=\"checkbox\" name=\"c4\"  onclick=\"showMe('j2', this),showMe('s5', this),showMe('s6', this),showMe('s7', this),showMe('s8', this)\"><br></label>\n");
      out.write("\n");
      out.write("                        <select name=\"c5\" id=\"s5\" style=\"display: none;font-size: 13px;margin-left: 15px;width: 40%\">\n");
      out.write("                            <option value=\"null\">Curso 5</option>\n");
      out.write("                        ");

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                                sta=cnx.createStatement();
                                rs=sta.executeQuery("select * from cursos");
                                while (rs.next()){
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(rs.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("                                              ");
 
                        }
                        sta.close();
                        rs.close();
                        cnx.close();
                            } catch (Exception e) {
                                   }
                        
      out.write("  \n");
      out.write("                        </select>\n");
      out.write("                        <select name=\"c6\" id=\"s6\" style=\"display: none;font-size: 13px;margin-left: 15px;width: 40%\">\n");
      out.write("                            <option value=\"null\">Curso 6</option>\n");
      out.write("                        ");

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                                sta=cnx.createStatement();
                                rs=sta.executeQuery("select * from cursos");
                                while (rs.next()){
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(rs.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("                                              ");
 
                        }
                        sta.close();
                        rs.close();
                        cnx.close();
                            } catch (Exception e) {
                                   }
                        
      out.write("  \n");
      out.write("                        </select>\n");
      out.write("                        <select name=\"c7\" id=\"s7\" style=\"display: none;font-size: 13px;margin-left: 15px;width: 40%\">\n");
      out.write("                            <option value=\"null\">Curso 7</option>\n");
      out.write("                        ");

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                                sta=cnx.createStatement();
                                rs=sta.executeQuery("select * from cursos");
                                while (rs.next()){
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(rs.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("                                              ");
 
                        }
                        sta.close();
                        rs.close();
                        cnx.close();
                            } catch (Exception e) {
                                   }
                        
      out.write("  \n");
      out.write("                        </select>\n");
      out.write("                        <select name=\"c8\" id=\"s8\" style=\"display: none;font-size: 13px;margin-left: 15px;width: 40%\">\n");
      out.write("                            <option value=\"null\">Curso 8</option>\n");
      out.write("                        ");

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                                sta=cnx.createStatement();
                                rs=sta.executeQuery("select * from cursos");
                                while (rs.next()){
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(rs.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("                                              ");
 
                        }
                        sta.close();
                        rs.close();
                        cnx.close();
                            } catch (Exception e) {
                                   }
                        
      out.write("  \n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                        <label style=\"margin-top: 10px;display: none;width: 100%;font-size: 10px;margin-left: 15px;\" id=\"j2\">Agregar cursos de referencia + <input type=\"checkbox\" name=\"c4\"  onclick=\"showMe('s9', this),showMe('s10', this),showMe('s11', this),showMe('s12', this)\"><br></label>\n");
      out.write("\n");
      out.write("                        <select name=\"c9\" id=\"s9\" style=\"display: none;font-size: 13px;margin-left: 15px;width: 40%\">\n");
      out.write("                            <option value=\"null\">Curso 9</option>\n");
      out.write("                        ");

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                                sta=cnx.createStatement();
                                rs=sta.executeQuery("select * from cursos");
                                while (rs.next()){
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(rs.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("                                              ");
 
                        }
                        sta.close();
                        rs.close();
                        cnx.close();
                            } catch (Exception e) {
                                   }
                        
      out.write("  \n");
      out.write("                        </select>\n");
      out.write("                        <select name=\"c10\" id=\"s10\" style=\"display: none;font-size: 13px;margin-left: 15px;width: 40%\">\n");
      out.write("                            <option value=\"null\">Curso 10</option>\n");
      out.write("                        ");

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                                sta=cnx.createStatement();
                                rs=sta.executeQuery("select * from cursos");
                                while (rs.next()){
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(rs.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("                                              ");
 
                        }
                        sta.close();
                        rs.close();
                        cnx.close();
                            } catch (Exception e) {
                                   }
                        
      out.write("  \n");
      out.write("                        </select>\n");
      out.write("                        <select name=\"c11\" id=\"s11\" style=\"display: none;font-size: 13px;margin-left: 15px;width: 40%\">\n");
      out.write("                            <option value=\"null\">Curso 11</option>\n");
      out.write("                        ");

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                                sta=cnx.createStatement();
                                rs=sta.executeQuery("select * from cursos");
                                while (rs.next()){
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(rs.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("                                              ");
 
                        }
                        sta.close();
                        rs.close();
                        cnx.close();
                            } catch (Exception e) {
                                   }
                        
      out.write("  \n");
      out.write("                        </select>\n");
      out.write("                        <select name=\"c12\" id=\"s12\" style=\"display: none;font-size: 13px;margin-left: 15px;width: 40%\">\n");
      out.write("                            <option value=\"null\">Curso 12</option>\n");
      out.write("                        ");

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                                sta=cnx.createStatement();
                                rs=sta.executeQuery("select * from cursos");
                                while (rs.next()){
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(rs.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("                                              ");
 
                        }
                        sta.close();
                        rs.close();
                        cnx.close();
                            } catch (Exception e) {
                                   }
                        
      out.write("  \n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                        <button onclick=\"return registrar()\" style=\"margin-top: 10px;margin-left: 90%;color: #fafafa;background: #0069B4;border: 0px;padding: 10px 10px 10px 10px;font-size: 10px;\">Registrar</button>\n");
      out.write("                    </div>  \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                        <a class=\"popup-cerrar\" href=\"#\" title=\"Cerrar\" onclick = \"document.getElementById('light').style.display='none';\">x</a>\n");
      out.write("    </div>\n");
      out.write("</div>                             \n");
      out.write("                                                  \n");
      out.write("<div class=\"modal-wrapper\" id=\"popup2\">\n");
      out.write("    <div class=\"popup-contenedor2\"> \n");
      out.write("        <div class=\"row\" id=\"light2\" style=\"display: block;\">\n");
      out.write("            <div class=\"col-m12\">\n");
      out.write("                <div class=\"table-responsive\">\n");
      out.write("                    <table class=\"table table-hover\" style=\"font-size: 12px;\">    \n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th style=\"text-align: center;\">DNI</th>\n");
      out.write("                                <th style=\"text-align: center;\">Apellidos y Nombres</th>\n");
      out.write("                                <th style=\"text-align: center;\">Profesión</th>\n");
      out.write("                                <th style=\"text-align: center;\">Grado</th>\n");
      out.write("                                <th style=\"text-align: center;\">Opción</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");

try {
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("SELECT dni_pro,nombre_pro,apellidos_pro,tele_pro,dire_pro,corr_pro,"
            + "cpre_pro,grad_pro,prof_pro,tipo_pro,cpos_pro,espe_pro,dipl_pro,expe_pro,sede_pro,"
            + "if(c1 !='null',c1,''), if(c2 !='null',c2,''),"
            + "if(c3 !='null',c3,''), if(c4 !='null',c4,''),"
            + "if(c5 !='null',c5,''), if(c6 !='null',c6,''),"
            + "if(c7 !='null',c7,''), if(c8 !='null',c8,''),"
            + "if(c9 !='null',c9,''), if(c10 !='null',c10,''),"
            + "if(c11 !='null',c11,''), if(c12 !='null',c12,'')"
            + "FROM profesores "
            + "WHERE dni_pro="+dnipro);
    while (rs.next()){

      out.write("\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td style=\"text-align: center;padding: 10px 5px 5px 5px;margin: 10px 5px 5px 5px;\">");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                                <td style=\"text-align: center;padding: 10px 5px 5px 5px;margin: 10px 5px 5px 5px;\">");
      out.print(rs.getString(3));
      out.write(' ');
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                <td style=\"text-align: center;padding: 10px 5px 5px 5px;margin: 10px 5px 5px 5px;\">");
      out.print(rs.getString(9));
      out.write("</td>\n");
      out.write("                                <td style=\"text-align: center;padding: 10px 5px 5px 5px;margin: 10px 5px 5px 5px;\">");
      out.print(rs.getString(8));
      out.write("</td>\n");
      out.write("                                <td style=\"text-align: center;padding: 10px 5px 5px 5px;margin: 10px 5px 5px 5px;\">\n");
      out.write("                                    <a href=\"#\" style=\"text-decoration: none; color: #000;\"><i class=\"material-icons\">edit</i></a>\n");
      out.write("                                    <a href=\"#\" style=\"text-decoration: none; color: #000;\"><i class=\"material-icons\">highlight_off</i></a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr class=\"\">\n");
      out.write("                                <td style=\"text-align: center;padding: 10px 5px 5px 5px;margin: 10px 5px 5px 5px;\" class=\"\" title=\"Cursos de referencia\"><i class=\"material-icons\">import_contacts</i>\n");
      out.write("                                </td>\n");
      out.write("                                <td colspan=\"4\" class=\"\" title=\"Cursos de referencia\" style=\"padding: 10px 5px 5px 5px;margin: 10px 5px 5px 5px;\">\n");
      out.write("                                    <ul style=\"list-style-type: none; padding: 0px 0px;color: #0069B4\">\n");
      out.write("                                       <li>");
      out.print(rs.getString(16));
      out.write("</li>\n");
      out.write("                                       <li>");
      out.print(rs.getString(17));
      out.write("</li>\n");
      out.write("                                       <li>");
      out.print(rs.getString(18));
      out.write("</li>\n");
      out.write("                                       <li>");
      out.print(rs.getString(19));
      out.write("</li>\n");
      out.write("                                       <li>");
      out.print(rs.getString(20));
      out.write("</li>\n");
      out.write("                                       <li>");
      out.print(rs.getString(21));
      out.write("</li>\n");
      out.write("                                       <li>");
      out.print(rs.getString(22));
      out.write("</li>\n");
      out.write("                                       <li>");
      out.print(rs.getString(23));
      out.write("</li>\n");
      out.write("                                       <li>");
      out.print(rs.getString(24));
      out.write("</li>\n");
      out.write("                                       <li>");
      out.print(rs.getString(25));
      out.write("</li>\n");
      out.write("                                       <li>");
      out.print(rs.getString(26));
      out.write("</li>\n");
      out.write("                                       <li>");
      out.print(rs.getString(27));
      out.write("</li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td style=\"text-align: center;padding: 10px 5px 5px 5px;margin: 10px 5px 5px 5px;\" class=\"\" title=\"Especialidad\"><i class=\"material-icons\">school</i></td>\n");
      out.write("                                <td style=\"padding: 10px 5px 5px 5px;margin: 10px 5px 5px 5px;\" colspan=\"4\" class=\"\" title=\"Especialidad\">");
      out.print(rs.getString(12));
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr class=\"\">\n");
      out.write("                                <td style=\"text-align: center;padding: 10px 5px 5px 5px;margin: 10px 5px 5px 5px;\" class=\"\" title=\"Experiencia\"><i class=\"material-icons\">school</i></td>\n");
      out.write("                                <td style=\"padding: 10px 5px 5px 5px;margin: 10px 5px 5px 5px;\" colspan=\"4\" class=\"\" title=\"Experiencia\">");
      out.print(rs.getString(14));
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr class=\"\">\n");
      out.write("                                <td style=\"text-align: center;padding: 10px 5px 5px 5px;margin: 10px 5px 5px 5px;\" class=\"\"><i class=\"material-icons\">phone</i></td>\n");
      out.write("                                <td style=\"padding: 10px 5px 5px 5px;margin: 10px 5px 5px 5px;\" colspan=\"4\" class=\"\">");
      out.print(rs.getString(4));
      out.write(" - ");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr class=\"\">\n");
      out.write("                                <td style=\"text-align: center;padding: 10px 5px 5px 5px;margin: 10px 5px 5px 5px;\" class=\"\"><i class=\"material-icons\">location_on</i></td>\n");
      out.write("                                <td style=\"padding: 10px 5px 5px 5px;margin: 10px 5px 5px 5px;\" colspan=\"4\" class=\"\">");
      out.print(rs.getString(5));
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
 
}
sta.close();
rs.close();
cnx.close();
} catch (Exception e) {
       }

      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                        <a class=\"popup-cerrar2\" href=\"#\" title=\"Cerrar\" onclick = \"document.getElementById('light2').style.display='none';\">x</a>\n");
      out.write("    </div>\n");
      out.write("</div>                            \n");
      out.write("    \n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function() {\n");
      out.write("    $('#example').DataTable({\n");
      out.write("        \"language\": {\n");
      out.write("    \"sProcessing\":     \"Procesando...\",\n");
      out.write("    \"sLengthMenu\":     \"Mostrar _MENU_ registros\",\n");
      out.write("    \"sZeroRecords\":    \"No se encontraron resultados\",\n");
      out.write("    \"sEmptyTable\":     \"Ningún dato disponible en esta tabla\",\n");
      out.write("    \"sInfo\":           \"Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros\",\n");
      out.write("    \"sInfoEmpty\":      \"Mostrando registros del 0 al 0 de un total de 0 registros\",\n");
      out.write("    \"sInfoFiltered\":   \"(filtrado de un total de _MAX_ registros)\",\n");
      out.write("    \"sInfoPostFix\":    \"\",\n");
      out.write("    \"sSearch\":         \"Buscar:\",\n");
      out.write("    \"sUrl\":            \"\",\n");
      out.write("    \"sInfoThousands\":  \",\",\n");
      out.write("    \"sLoadingRecords\": \"Cargando...\",\n");
      out.write("    \"oPaginate\": {\n");
      out.write("        \"sFirst\":    \"Primero\",\n");
      out.write("        \"sLast\":     \"Último\",\n");
      out.write("        \"sNext\":     \"Siguiente\",\n");
      out.write("        \"sPrevious\": \"Anterior\"\n");
      out.write("    },\n");
      out.write("    \"oAria\": {\n");
      out.write("        \"sSortAscending\":  \": Activar para ordenar la columna de manera ascendente\",\n");
      out.write("        \"sSortDescending\": \": Activar para ordenar la columna de manera descendente\"\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("    } );\n");
      out.write("} );\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    function showMe (it, box) {\n");
      out.write("    var vis = (box.checked) ? \"block\" : \"none\";\n");
      out.write("    document.getElementById(it).style.display = vis;\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("               \n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
