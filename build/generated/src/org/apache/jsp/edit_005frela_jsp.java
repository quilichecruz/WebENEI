package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class edit_005frela_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    String nombrecur= request.getParameter("nombrecur");

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Editar</title>\n");
      out.write("        <link href=\"calendario_dw/calendario_dw-estilos.css\" type=\"text/css\" rel=\"STYLESHEET\"> \n");
      out.write("        <script type=\"text/javascript\" src=\"calendario_dw/jquery-1.4.4.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"calendario_dw/calendario_dw.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Dosis\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function(){\n");
      out.write("               $(\".campomyfecha\").calendarioDW();\n");
      out.write("            });\n");
      out.write("            $(document).ready(function(){\n");
      out.write("               $(\".campomyfecha2\").calendarioDW();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("        \n");
      out.write("    <body style=\"font-family: 'Dosis', sans-serif;\">\n");
      out.write("        <nav class=\"nav nav-tabs\" id=\"myTab\">\n");
      out.write("            <a class=\"nav-item nav-link\" id=\"nav-home-tab\" data-toggle=\"tab\" href=\"#nav-report\" role=\"tab\" aria-controls=\"nav-report\" aria-selected=\"false\" style=\"color: #000;font-size: 13px;\"><img src=\"media/logocolor.png\" alt=\"\" style=\"width: 45px;height: auto;text-align: center;\"></a>\n");
      out.write("       </nav>\n");
      out.write("        \n");
      out.write("        <div class=\"tab-content\" id=\"nav-tabContent\">\n");
      out.write("            <div class=\"tab-pane fade show active\" id=\"nav-home\" role=\"tabpanel\" aria-labelledby=\"nav-home-tab\">\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!--Menu-->\n");
      out.write("            <div class=\"row\"> \n");
      out.write("            </div>\n");
      out.write("            <!--Contenido-->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
 
    Connection cnx=null;
    Statement sta=null;
    ResultSet rs=null;
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
      out.write("\n");
      out.write("    <form class=\"form-horizontal\">\n");
      out.write("        <fieldset>\n");
      out.write("            <legend style=\"font-weight: 600\">EDITAR</legend>\n");
      out.write("            <div class=\"form-row\">\n");
      out.write("                <div class=\"form-group col-md-10\" style=\"text-align: right\">\n");
      out.write("                    <button name=\"btneditar\" class=\"btn btn-primary\" type=\"submit\">Grabar</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-1\" style=\"text-align: right\">\n");
      out.write("                    <button class=\"btn btn-danger\" type=\"submit\" onclick=\"history.go(0)\">Actualizar</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-1\" style=\"text-align: right\">\n");
      out.write("                    <a href=\"inicio.jsp?dnipro=");
      out.print(dnipro);
      out.write("#popup2\" style=\"color: #000;text-decoration: none;\"><i class=\"material-icons\" style=\";font-size: 30px;\" title=\"Volver al inicio\">reply_all</i></a>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"form-row\">\n");
      out.write("                <div class=\"form-group col-md-6\">\n");
      out.write("                    <label for=\"dni\">DNI</label>\n");
      out.write("                    <input name=\"dnipro\" type=\"text\" class=\"form-control\" id=\"dni\" value=\"");
      out.print(rs.getString(1));
      out.write("\" readonly=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-6\">\n");
      out.write("                    <label for=\"sede\">SEDE</label>\n");
      out.write("                    <input name=\"sede\" type=\"text\" class=\"form-control\" id=\"sede\" value=\"");
      out.print(rs.getString(15));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-row\">\n");
      out.write("                <div class=\"form-group col-md-6\">\n");
      out.write("                    <label for=\"nombrepro\">NOMBRES</label>\n");
      out.write("                    <input name=\"nombrepro\" type=\"text\" class=\"form-control\" id=\"nombrepro\" value=\"");
      out.print(rs.getString(2));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-6\">\n");
      out.write("                    <label for=\"apellidospro\">APELLIDOS</label>\n");
      out.write("                    <input name=\"apellidospro\" type=\"text\" class=\"form-control\" id=\"apellidospro\" value=\"");
      out.print(rs.getString(3));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-row\">\n");
      out.write("                <div class=\"form-group col-md-6\">\n");
      out.write("                    <label for=\"tele\">TELÉFONO</label>\n");
      out.write("                    <input name=\"tele\" type=\"text\" class=\"form-control\" id=\"tele\" value=\"");
      out.print(rs.getString(4));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-6\">\n");
      out.write("                    <label for=\"corr\">CORREO</label>\n");
      out.write("                    <input name=\"corr\" type=\"text\" class=\"form-control\" id=\"corr\" value=\"");
      out.print(rs.getString(6));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-row\">\n");
      out.write("                <div class=\"form-group col-md-12\">\n");
      out.write("                    <label for=\"dire\">DIRECCIÓN</label>\n");
      out.write("                    <input name=\"dire\" type=\"text\" class=\"form-control\" id=\"dire\" value=\"");
      out.print(rs.getString(5));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-row\">\n");
      out.write("                <div class=\"form-group col-md-6\">\n");
      out.write("                    <label for=\"prof\">PROFESIÓN</label>\n");
      out.write("                    <input name=\"prof\" type=\"text\" class=\"form-control\" id=\"prof\" value=\"");
      out.print(rs.getString(9));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-6\">\n");
      out.write("                    <label for=\"grad\">GRADO</label>\n");
      out.write("                    <input name=\"grad\" type=\"text\" class=\"form-control\" id=\"grad\" value=\"");
      out.print(rs.getString(8));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-row\">\n");
      out.write("                <div class=\"form-group col-md-12\">\n");
      out.write("                    <label for=\"espe\">ESPECIALIDAD</label>\n");
      out.write("                    <textarea name=\"espe\" class=\"form-control\" id=\"espe\">");
      out.print(rs.getString(12));
      out.write("</textarea>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-12\">\n");
      out.write("                    <label for=\"expe\">EXPERIENCIA</label>\n");
      out.write("                    <textarea name=\"expe\" class=\"form-control\" id=\"expe\">");
      out.print(rs.getString(14));
      out.write("</textarea>\n");
      out.write("                </div>\n");
      out.write("            </div>  \n");
      out.write("            <div class=\"form-row\">\n");
      out.write("                <div class=\"form-group col-md-12\">\n");
      out.write("                    <label>CURSOS DE REFERENCIA</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-4\">\n");
      out.write("                    <label for=\"r1\">CURSO 1</label>\n");
      out.write("                    <select name=\"c1\" class=\"form-control\" id=\"r1\">\n");
      out.write("                    <option value=\"");
      out.print(rs.getString(16));
      out.write('"');
      out.write('>');
      out.print(rs.getString(16));
      out.write("</option>\n");
      out.write("                    ");

                        try {
                            Connection cnx1=null;
                            Statement sta1=null;
                            ResultSet rs1=null;
                            Class.forName("com.mysql.jdbc.Driver");
                            cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                            sta1=cnx1.createStatement();
                            rs1=sta1.executeQuery("select * from cursos");
                            while (rs1.next()){
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(rs1.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs1.getString(2));
      out.write("</option>\n");
      out.write("                    ");
 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    
      out.write("  \n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-4\">\n");
      out.write("                    <label for=\"r2\">CURSO 2</label>\n");
      out.write("                    <select name=\"c2\" class=\"form-control\" id=\"r2\">\n");
      out.write("                    <option value=\"");
      out.print(rs.getString(17));
      out.write('"');
      out.write('>');
      out.print(rs.getString(17));
      out.write("</option>\n");
      out.write("                    ");

                    try {
                        Connection cnx1=null;
                        Statement sta1=null;
                        ResultSet rs1=null;
                        Class.forName("com.mysql.jdbc.Driver");
                        cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                        sta1=cnx1.createStatement();
                        rs1=sta1.executeQuery("select * from cursos");
                        while (rs1.next()){
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(rs1.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs1.getString(2));
      out.write("</option>\n");
      out.write("                    ");
 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    
      out.write("  \n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-4\">\n");
      out.write("                    <label for=\"r3\">CURSO 3</label>\n");
      out.write("                    <select name=\"c3\" class=\"form-control\" id=\"r3\">\n");
      out.write("                    <option value=\"");
      out.print(rs.getString(18));
      out.write('"');
      out.write('>');
      out.print(rs.getString(18));
      out.write("</option>\n");
      out.write("                    ");

                        try {
                            Connection cnx1=null;
                            Statement sta1=null;
                            ResultSet rs1=null;
                            Class.forName("com.mysql.jdbc.Driver");
                            cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                            sta1=cnx1.createStatement();
                            rs1=sta1.executeQuery("select * from cursos");
                            while (rs1.next()){
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(rs1.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs1.getString(2));
      out.write("</option>\n");
      out.write("                    ");
 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    
      out.write("  \n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-4\">\n");
      out.write("                    <label for=\"r4\">CURSO 4</label>\n");
      out.write("                    <select name=\"c4\" class=\"form-control\" id=\"r4\">\n");
      out.write("                    <option value=\"");
      out.print(rs.getString(19));
      out.write('"');
      out.write('>');
      out.print(rs.getString(19));
      out.write("</option>\n");
      out.write("                    ");

                        try {
                            Connection cnx1=null;
                            Statement sta1=null;
                            ResultSet rs1=null;
                            Class.forName("com.mysql.jdbc.Driver");
                            cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                            sta1=cnx1.createStatement();
                            rs1=sta1.executeQuery("select * from cursos");
                            while (rs1.next()){
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(rs1.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs1.getString(2));
      out.write("</option>\n");
      out.write("                    ");
 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    
      out.write("  \n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-4\">\n");
      out.write("                    <label for=\"r5\">CURSO 5</label>\n");
      out.write("                    <select name=\"c5\" class=\"form-control\" id=\"r5\">\n");
      out.write("                    <option value=\"");
      out.print(rs.getString(20));
      out.write('"');
      out.write('>');
      out.print(rs.getString(20));
      out.write("</option>\n");
      out.write("                    ");

                    try {
                        Connection cnx1=null;
                        Statement sta1=null;
                        ResultSet rs1=null;
                        Class.forName("com.mysql.jdbc.Driver");
                        cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                        sta1=cnx1.createStatement();
                        rs1=sta1.executeQuery("select * from cursos");
                        while (rs1.next()){
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(rs1.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs1.getString(2));
      out.write("</option>\n");
      out.write("                    ");
 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    
      out.write("  \n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-4\">\n");
      out.write("                    <label for=\"r6\">CURSO 6</label>\n");
      out.write("                    <select name=\"c6\" class=\"form-control\" id=\"r6\">\n");
      out.write("                    <option value=\"");
      out.print(rs.getString(21));
      out.write('"');
      out.write('>');
      out.print(rs.getString(21));
      out.write("</option>\n");
      out.write("                    ");

                        try {
                            Connection cnx1=null;
                            Statement sta1=null;
                            ResultSet rs1=null;
                            Class.forName("com.mysql.jdbc.Driver");
                            cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                            sta1=cnx1.createStatement();
                            rs1=sta1.executeQuery("select * from cursos");
                            while (rs1.next()){
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(rs1.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs1.getString(2));
      out.write("</option>\n");
      out.write("                    ");
 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    
      out.write("  \n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-4\">\n");
      out.write("                    <label for=\"r7\">CURSO 7</label>\n");
      out.write("                    <select name=\"c7\" class=\"form-control\" id=\"r7\">\n");
      out.write("                    <option value=\"");
      out.print(rs.getString(22));
      out.write('"');
      out.write('>');
      out.print(rs.getString(22));
      out.write("</option>\n");
      out.write("                    ");

                        try {
                            Connection cnx1=null;
                            Statement sta1=null;
                            ResultSet rs1=null;
                            Class.forName("com.mysql.jdbc.Driver");
                            cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                            sta1=cnx1.createStatement();
                            rs1=sta1.executeQuery("select * from cursos");
                            while (rs1.next()){
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(rs1.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs1.getString(2));
      out.write("</option>\n");
      out.write("                    ");
 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    
      out.write("  \n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-4\">\n");
      out.write("                    <label for=\"r8\">CURSO 8</label>\n");
      out.write("                    <select name=\"c8\" class=\"form-control\" id=\"r8\">\n");
      out.write("                    <option value=\"");
      out.print(rs.getString(23));
      out.write('"');
      out.write('>');
      out.print(rs.getString(23));
      out.write("</option>\n");
      out.write("                    ");

                    try {
                        Connection cnx1=null;
                        Statement sta1=null;
                        ResultSet rs1=null;
                        Class.forName("com.mysql.jdbc.Driver");
                        cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                        sta1=cnx1.createStatement();
                        rs1=sta1.executeQuery("select * from cursos");
                        while (rs1.next()){
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(rs1.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs1.getString(2));
      out.write("</option>\n");
      out.write("                    ");
 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    
      out.write("  \n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-4\">\n");
      out.write("                    <label for=\"r9\">CURSO 9</label>\n");
      out.write("                    <select name=\"c9\" class=\"form-control\" id=\"r9\">\n");
      out.write("                    <option value=\"");
      out.print(rs.getString(24));
      out.write('"');
      out.write('>');
      out.print(rs.getString(24));
      out.write("</option>\n");
      out.write("                    ");

                        try {
                            Connection cnx1=null;
                            Statement sta1=null;
                            ResultSet rs1=null;
                            Class.forName("com.mysql.jdbc.Driver");
                            cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                            sta1=cnx1.createStatement();
                            rs1=sta1.executeQuery("select * from cursos");
                            while (rs1.next()){
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(rs1.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs1.getString(2));
      out.write("</option>\n");
      out.write("                    ");
 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    
      out.write("  \n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-4\">\n");
      out.write("                    <label for=\"r10\">CURSO 10</label>\n");
      out.write("                    <select name=\"c10\" class=\"form-control\" id=\"r10\">\n");
      out.write("                    <option value=\"");
      out.print(rs.getString(25));
      out.write('"');
      out.write('>');
      out.print(rs.getString(25));
      out.write("</option>\n");
      out.write("                    ");

                        try {
                            Connection cnx1=null;
                            Statement sta1=null;
                            ResultSet rs1=null;
                            Class.forName("com.mysql.jdbc.Driver");
                            cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                            sta1=cnx1.createStatement();
                            rs1=sta1.executeQuery("select * from cursos");
                            while (rs1.next()){
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(rs1.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs1.getString(2));
      out.write("</option>\n");
      out.write("                    ");
 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    
      out.write("  \n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-4\">\n");
      out.write("                    <label for=\"r11\">CURSO 11</label>\n");
      out.write("                    <select name=\"c11\" class=\"form-control\" id=\"r11\">\n");
      out.write("                    <option value=\"");
      out.print(rs.getString(26));
      out.write('"');
      out.write('>');
      out.print(rs.getString(26));
      out.write("</option>\n");
      out.write("                    ");

                    try {
                        Connection cnx1=null;
                        Statement sta1=null;
                        ResultSet rs1=null;
                        Class.forName("com.mysql.jdbc.Driver");
                        cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                        sta1=cnx1.createStatement();
                        rs1=sta1.executeQuery("select * from cursos");
                        while (rs1.next()){
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(rs1.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs1.getString(2));
      out.write("</option>\n");
      out.write("                    ");
 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    
      out.write("  \n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-4\">\n");
      out.write("                    <label for=\"r12\">CURSO 12</label>\n");
      out.write("                    <select name=\"c12\" class=\"form-control\" id=\"r12\">\n");
      out.write("                    <option value=\"");
      out.print(rs.getString(27));
      out.write('"');
      out.write('>');
      out.print(rs.getString(27));
      out.write("</option>\n");
      out.write("                    ");

                        try {
                            Connection cnx1=null;
                            Statement sta1=null;
                            ResultSet rs1=null;
                            Class.forName("com.mysql.jdbc.Driver");
                            cnx1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                            sta1=cnx1.createStatement();
                            rs1=sta1.executeQuery("select * from cursos");
                            while (rs1.next()){
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(rs1.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs1.getString(2));
      out.write("</option>\n");
      out.write("                    ");
 
                    }
                    sta1.close();
                    rs1.close();
                    cnx1.close();
                    } catch (Exception e) {
                           }
                    
      out.write("  \n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>   \n");
      out.write("\n");
      out.write("               ");
      out.write("\n");
      out.write("        \n");
      out.write("  </fieldset>\n");
      out.write("                    ");
 
    }
    } catch (Exception e) {
    }
    if(request.getParameter("btneditar")!=null){
    String apellidospro = request.getParameter("apellidospro");
    String tele = request.getParameter("tele");          
    String dire = request.getParameter("dire");   
    String corr = request.getParameter("corr");
    String cpre = request.getParameter("cpre");
    String grad = request.getParameter("grad");   
    String expe = request.getParameter("expe");
    String dipl = request.getParameter("dipl");
    String prof = request.getParameter("prof");
    String sede = request.getParameter("sede");
    String espe = request.getParameter("espe");
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

    sta.executeUpdate("update profesores set dni_pro='"+dnipro+"',nombre_pro='"+nombrepro+"',apellidos_pro='"+apellidospro+
    "',tele_pro='"+tele+"',dire_pro='"+dire+"',corr_pro='"+corr+"',cpre_pro='"+cpre+"',grad_pro='"+grad+"',expe_pro='"+expe+"',prof_pro='"+prof+"',sede_pro='"+sede+"',espe_pro='"+espe+"',"
    + "c1='"+c1+"',c2='"+c2+"',c3='"+c3+"',c4='"+c4+"',c5='"+c5+"',c6='"+c6+"'"
    + ",c7='"+c7+"',c8='"+c8+"',c9='"+c9+"',c10='"+c10+"',c11='"+c11+"',c12='"+c12+"' where dni_pro='"+dnipro+"'");

    response.sendRedirect("inicio.jsp?dnipro="+dnipro);
    sta.close();
    rs.close();
    cnx.close();
    }
    
      out.write("\n");
      out.write("                \n");
      out.write("  </form>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            </div>    \n");
      out.write("                            \n");
      out.write("      \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
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
