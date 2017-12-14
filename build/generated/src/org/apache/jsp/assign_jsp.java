package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class assign_jsp extends org.apache.jasper.runtime.HttpJspBase
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
   
    String dniadm=(String)session.getAttribute("dniadm");
    String hostname=(String)session.getAttribute("hostname");
    String ip=(String)session.getAttribute("ip");
    String dnipro= request.getParameter("dnipro");
    String nombrepro= request.getParameter("nombrepro");
    String apellidospro= request.getParameter("apellidospro");
    String codcur= request.getParameter("codcur");
    String nombrecur= request.getParameter("nombrecur");
    String id=request.getParameter("id");

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Assign</title>\n");
      out.write("        <link href=\"calendario_dw/calendario_dw-estilos.css\" type=\"text/css\" rel=\"STYLESHEET\"> \n");
      out.write("        <script type=\"text/javascript\" src=\"calendario_dw/jquery-1.4.4.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"calendario_dw/calendario_dw.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function(){\n");
      out.write("               $(\".campomyfecha\").calendarioDW();\n");
      out.write("            });\n");
      out.write("            $(document).ready(function(){\n");
      out.write("               $(\".campomyfecha2\").calendarioDW();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"font-size: 11px;\">\n");
      out.write("        <nav class=\"nav nav-tabs\" id=\"myTab\">\n");
      out.write("            <a class=\"nav-item nav-link\" id=\"nav-home-tab\" data-toggle=\"tab\" href=\"#nav-report\" role=\"tab\" aria-controls=\"nav-report\" aria-selected=\"false\" style=\"color: #000;font-size: 13px;\"><img src=\"media/logo.png\" alt=\"\" style=\"width: 45px;height: auto;text-align: center;\"></a>\n");
      out.write("            <a class=\"nav-item nav-link\" id=\"nav-home-tab\" data-toggle=\"tab\" href=\"#nav-home\" role=\"tab\" aria-controls=\"nav-home\" aria-selected=\"true\" style=\"color: #000;font-size: 13px;font-weight: 600;\"><i class=\"material-icons\" style=\"font-size: 18px\">school</i> Docentes</a>\n");
      out.write("            <a class=\"nav-item nav-link\" id=\"nav-profile-tab\" data-toggle=\"tab\" href=\"#nav-profile\" role=\"tab\" aria-controls=\"nav-profile\" aria-selected=\"false\" style=\"color: #000;font-size: 13px;font-weight: 600;\"><i class=\"material-icons\" style=\"font-size: 18px\">local_library</i> Cursos</a>\n");
      out.write("            <a class=\"nav-item nav-link\" id=\"nav-contact-tab\" data-toggle=\"tab\" href=\"#nav-contact\" role=\"tab\" aria-controls=\"nav-contact\" aria-selected=\"false\" style=\"color: #000;font-size: 13px;font-weight: 600;\"><i class=\"material-icons\" style=\"font-size: 18px\">dashboard</i> Reportes</a>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"tab-content\" id=\"nav-tabContent\">\n");
      out.write("            <div class=\"tab-pane fade show active\" id=\"nav-home\" role=\"tabpanel\" aria-labelledby=\"nav-home-tab\">\n");
      out.write("        <br>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <form class=\"form-horizontal\">\n");
      out.write("                            <fieldset>\n");
      out.write("                                <legend></legend>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-md-4 control-label\" for=\"selectbasic\">Docente</label>\n");
      out.write("                                        <div class=\"col-md-8\">\n");
      out.write("                                            <select id=\"selectbasic\" name=\"selectbasic\" class=\"form-control\" style=\"font-size: 12px;\" required>\n");
      out.write("                                                <option value=\"");
      out.print(dnipro);
      out.write('"');
      out.write('>');
      out.print(apellidospro);
      out.write(' ');
      out.print(nombrepro);
      out.write("</option>  \n");
      out.write("            ");

                    Connection cnx=null;
                    Statement sta=null;
                    ResultSet rs=null;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                    sta=cnx.createStatement();
                    rs=sta.executeQuery("select dni_pro,nombre_pro,apellidos_pro,prof_pro,grad_pro,sede_pro from profesores order by apellidos_pro");
                    while (rs.next()){
            
      out.write("\n");
      out.write("                                                <option value=\"");
      out.print(rs.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs.getString(3));
      out.write(' ');
      out.print(rs.getString(2));
      out.write("</option>    \n");
      out.write("            ");
 
            }
            sta.close();
            rs.close();
            cnx.close();
                } catch (Exception e) {
                       }
            
      out.write("  \n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-md-4 control-label\" for=\"selectbasic\">Curso</label>\n");
      out.write("                                        <div class=\"col-md-8\">\n");
      out.write("                                            <select id=\"selectbasic\" name=\"selectbasic\" class=\"form-control\" style=\"font-size: 12px;\" required>\n");
      out.write("                                                ");
      out.write("\n");
      out.write("            ");

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                    sta=cnx.createStatement();
                    rs=sta.executeQuery("select * from cursos order by cod_cur");
                    while (rs.next()){
            
      out.write("\n");
      out.write("                                                <option value=\"");
      out.print(rs.getInt(1));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("            ");
 
            }
            sta.close();
            rs.close();
            cnx.close();
                } catch (Exception e) {
                       }
            
      out.write("  \n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-md-4 control-label\" for=\"textinput\">Frecuencia</label>  \n");
      out.write("                                        <div class=\"col-md-8\">\n");
      out.write("                                            <input id=\"textinput\" name=\"textinput\" type=\"text\" class=\"form-control input-md\" style=\"font-size: 12px;\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-md-4 control-label\" for=\"textinput\">Fecha de inicio</label>  \n");
      out.write("                                        <div class=\"col-md-4\">\n");
      out.write("                                            <input id=\"textinput\" name=\"textinput\" type=\"text\" class=\"form-control input-md campomyfecha\" style=\"font-size: 12px;\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-md-4 control-label\" for=\"textinput\">Fecha término</label>  \n");
      out.write("                                        <div class=\"col-md-4\">\n");
      out.write("                                            <input id=\"textinput\" name=\"textinput\" type=\"text\" class=\"form-control input-md campomyfecha\" style=\"font-size: 12px;\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-md-4 control-label\" for=\"selectbasic\">Estado</label>\n");
      out.write("                                        <div class=\"col-md-4\">\n");
      out.write("                                            <select id=\"selectbasic\" name=\"selectbasic\" class=\"form-control\" style=\"font-size: 12px;\">\n");
      out.write("                                                <option value=\"Por Iniciar\">Por Iniciar</option>\n");
      out.write("                                                <option value=\"En Ejecucion\">En Ejecución</option>\n");
      out.write("                                                <option value=\"Finalizo\">Finalizó</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-md-4 control-label\" for=\"selectbasic\">Laboratorio</label>\n");
      out.write("                                        <div class=\"col-md-4\">\n");
      out.write("                                            <select id=\"selectbasic\" name=\"selectbasic\" class=\"form-control\" style=\"font-size: 12px;\">\n");
      out.write("                                                <option value=\"Sin Asignar\">Sin Asignar</option>\n");
      out.write("                                                <option value=\"Lab 01\">LAB 01</option>\n");
      out.write("                                                <option value=\"Lab 02\">LAB 02</option>\n");
      out.write("                                                <option value=\"Lab 03\">LAB 03</option>\n");
      out.write("                                                <option value=\"Lab 04\">LAB 04</option>\n");
      out.write("                                                <option value=\"Lab 05\">LAB 05</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-md-4 control-label\" for=\"textinput\">Inscritos</label>  \n");
      out.write("                                        <div class=\"col-md-4\">\n");
      out.write("                                            <input id=\"textinput\" name=\"textinput\" type=\"number\" class=\"form-control input-md\" value=\"0\" style=\"font-size: 12px;\">\n");
      out.write("                                      </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-md-2 control-label\" for=\"textinput\"></label>  \n");
      out.write("                                        <div class=\"col-md-4\">\n");
      out.write("                                            <button id=\"singlebutton\" name=\"singlebutton\" class=\"btn btn-primary\" style=\"padding: 10px 10px 10px 10px;font-size: 10px;\">GRABAR</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                            </fieldset>\n");
      out.write("                        </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <a href=\"inicio.jsp?dnipro=");
      out.print(dnipro);
      out.write("\" style=\"color: #000;text-decoration: none;\"><i class=\"material-icons\" style=\"margin-left: 90%;font-size: 30px;\">arrow_back</i>inicio</a>\n");
      out.write("                </div>\n");
      out.write("            </div>                           \n");
      out.write("        </div>\n");
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
