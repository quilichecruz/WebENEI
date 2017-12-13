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
      out.write("        <link rel=\"stylesheet\" href=\"css/crear-relacion.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/modal.css\">\n");
      out.write("        <link href=\"calendario_dw/calendario_dw-estilos.css\" type=\"text/css\" rel=\"STYLESHEET\"> \n");
      out.write("        <script type=\"text/javascript\" src=\"calendario_dw/jquery-1.4.4.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"calendario_dw/calendario_dw.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function(){\n");
      out.write("               $(\".campomyfecha\").calendarioDW();\n");
      out.write("            });\n");
      out.write("            $(document).ready(function(){\n");
      out.write("               $(\".campomyfecha2\").calendarioDW();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"mybodyrelacion\" style=\"background: #fafafa;\">\n");
      out.write("      \n");
      out.write("<script>\n");
      out.write("function registrar()\n");
      out.write("{\n");
      out.write("\tif(confirm('¿Estas seguro?'))\n");
      out.write("\t\treturn true;\n");
      out.write("\telse\n");
      out.write("\t\treturn false;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("function editar()\n");
      out.write("{\n");
      out.write("\tif(confirm('¿Estas seguro?'))\n");
      out.write("\t\treturn true;\n");
      out.write("\telse\n");
      out.write("\t\treturn false;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("        <section class=\"container\">\n");
      out.write("            <form action=\"registrorela\" method=\"post\" class=\"formrelacion\">\n");
      out.write("            \n");
      out.write("            <h2 class=\"myh2\">Relación</h2>\n");
      out.write("            <div class=\"contenedors-input\">\n");
      out.write("             \n");
      out.write("                <select name=\"dnipro\" required=\"required\" class=\"myselectrelacion\">\n");
      out.write("            <option value=\"");
      out.print(dnipro);
      out.write("\">Docente * ");
      out.print(apellidospro);
      out.write(',');
      out.write(' ');
      out.print(nombrepro);
      out.write("</option>  \n");
      out.write("            \n");
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
      out.write("             \n");
      out.write("            <option value=\"");
      out.print(rs.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs.getString(3));
      out.write(',');
      out.write(' ');
      out.print(rs.getString(2));
      out.write(" - '");
      out.print(rs.getString(6));
      out.write("' - '");
      out.print(rs.getString(4));
      out.write("'</option>\n");
      out.write("            \n");
      out.write("                      ");
 
            }
            sta.close();
            rs.close();
            cnx.close();
                } catch (Exception e) {
                       }
            
      out.write("  \n");
      out.write("            \n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("            <select name=\"codcur\" required=\"required\" class=\"myselectrelacion\">\n");
      out.write("            \n");
      out.write("            <option value=\"");
      out.print(codcur);
      out.write("\">Curso y/o Asignatura * ");
      out.print(nombrecur);
      out.write("</option>  \n");
      out.write("            \n");
      out.write("            ");

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
                    sta=cnx.createStatement();
                    rs=sta.executeQuery("select * from cursos order by cod_cur");
                    while (rs.next()){
            
      out.write("\n");
      out.write("            \n");
      out.write("            <option value=\"");
      out.print(rs.getInt(1));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("\n");
      out.write("            ");
 
            }
            sta.close();
            rs.close();
            cnx.close();
                } catch (Exception e) {
                       }
            
      out.write("  \n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("            <select name=\"esta\" required=\"required\">\n");
      out.write("            <option value=\"\">Estado *</option>  \n");
      out.write("            <option value=\"Por Iniciar\">Por Iniciar</option>\n");
      out.write("            <option value=\"En Ejecucion\">En Ejecución</option>\n");
      out.write("            <option value=\"Finalizo\">Finalizó</option>\n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("            <select name=\"labo\">    \n");
      out.write("            <option value=\"Sin Asignar\">Lab</option>\n");
      out.write("            <option value=\"Lab 01\">LAB 01</option>\n");
      out.write("            <option value=\"Lab 02\">LAB 02</option>\n");
      out.write("            <option value=\"Lab 03\">LAB 03</option>\n");
      out.write("            <option value=\"Lab 04\">LAB 04</option>\n");
      out.write("            <option value=\"Lab 05\">LAB 05</option>\n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("            <input type=\"text\" name=\"frec\" placeholder=\"Frecuencia\" class=\"myinputrelacion\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("            ");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <label style=\"font-weight: normal;\">Inscritos: </label>\n");
      out.write("            <!--<label>Media Beca:</label>\n");
      out.write("            <input type=\"text\" name=\"medb\" style=\"width: 10%;margin-bottom: 10px;padding: 7px;font-size: 16px;border-radius: 0px;border: 2px solid darkgray;\" value=\"0\">\n");
      out.write("            <label>Pagantes:</label>\n");
      out.write("            <input type=\"text\" name=\"beca\" style=\"width: 10%;margin-bottom: 10px;padding: 7px;font-size: 16px;border-radius: 0px;border: 2px solid darkgray;\" value=\"0\">!-->\n");
      out.write("            <input type=\"text\" name=\"paga\" value=\"0\" class=\"myinputrelacion2\">\n");
      out.write("            <input type=\"text\" name=\"fechatini\" placeholder=\"Fecha Inicio *\" required=\"required\" class=\"campomyfecha\">\n");
      out.write("            <input type=\"text\" name=\"fechatfin\" placeholder=\"Fecha Termino *\" required=\"required\" class=\"campomyfecha\">          \n");
      out.write("            <button onclick=\"return registrar()\" style=\"color: #fff;\">Registrar</button> \n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("            \n");
      out.write("       ");
      out.write("\n");
      out.write("        \n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-md-12\">\n");
      out.write("          <div class=\"panel panel-default\">\n");
      out.write("              <div class=\"panel-body\">\n");
      out.write("                  <div class=\"table-responsive mysize\">\n");
      out.write("                  <table class=\"table table-hover\">  \n");
      out.write("                      <tr class=\"mytrrelacion\">\n");
      out.write("                        <th>DNI</th>\n");
      out.write("                        <th>DOCENTE</th>\n");
      out.write("                        <th>CURSO</th>\n");
      out.write("                        <th>FRECUENCIA</th>\n");
      out.write("                        <th>INICIO - TÉRMINO</th>\n");
      out.write("                        <th>ESTADO</th>\n");
      out.write("                        <th>ACCIÓN</th>\n");
      out.write("                      </tr>\n");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
            sta=cnx.createStatement();
            rs=sta.executeQuery("SELECT T1.id_registro,T1.cod_cur,T3.nombre_cur,T1.paga,T1.dni_pro,T2.nombre_pro,T2.apellidos_pro,T1.fechatini,T1.fechatfin,T1.esta,T1.labo,T3.vaca_cur,-sum(paga-vaca_cur),T1.frec FROM registro T1 INNER JOIN profesores T2 INNER JOIN cursos T3  ON T1.dni_pro = T2.dni_pro AND T1.cod_cur = T3.cod_cur where T1.dni_pro="+dnipro+" group by T1.id_registro");
            while (rs.next()){
    
      out.write("\n");
      out.write("                    <tr>  \n");
      out.write("                        <th class=\"info mycolor2\">");
      out.print(rs.getString(5));
      out.write("</th>\n");
      out.write("                        <th class=\"info mycolor2\">");
      out.print(rs.getString(7));
      out.write(',');
      out.write(' ');
      out.print(rs.getString(6));
      out.write("</th>\n");
      out.write("                        <th class=\"info mycolor2\">");
      out.print(rs.getString(3));
      out.write("</th>\n");
      out.write("                        <th class=\"info mycolor2\">");
      out.print(rs.getString(14));
      out.write("</th>\n");
      out.write("                        <th class=\"danger mycolor2\">");
      out.print(rs.getString(8));
      out.write(" - ");
      out.print(rs.getString(9));
      out.write("</th>\n");
      out.write("                        <th class=\"success mycolor2\">");
      out.print(rs.getString(10));
      out.write("</th>\n");
      out.write("                        <th class=\"active\">\n");
      out.write("                    <a href=\"editarrela.jsp?id=");
      out.print(rs.getString(1));
      out.write("&dnipro=");
      out.print(rs.getString(5));
      out.write("\">\n");
      out.write("                    <img src=\"Iconos/editar.png\" width=\"15\" height=\"15\"></a>   \n");
      out.write("                    <a href=\"relacion.jsp?id=");
      out.print(rs.getString(1));
      out.write("&dnipro=");
      out.print(rs.getString(5));
      out.write("#popup\">\n");
      out.write("                    <img src=\"Iconos/l2.png\" width=\"15\" height=\"15\"></a>\n");
      out.write("                    <a href=\"eliminarrela.jsp?id=");
      out.print(rs.getString(1));
      out.write("\" onclick=\"return eliminar()\">\n");
      out.write("                    <img src=\"Iconos/eliminar1.png\" width=\"15\" height=\"15\"></a>\n");
      out.write("                        </th>\n");
      out.write("            </tr>\n");
      out.write("                    ");
 
    }
    sta.close();
    rs.close();
    cnx.close();
        } catch (Exception e) {
               }
    
      out.write("\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("              </div>\n");
      out.write("          </div> \n");
      out.write("      </div>\n");
      out.write("    </div>    \n");
      out.write(" \n");
      out.write("                 ");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
            sta=cnx.createStatement();
            rs=sta.executeQuery("select if(id_registro!=null,id_registro,'') from registro where id_registro="+id);
            while (rs.next()){
    
      out.write("  \n");
      out.write("       \n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-md-6\">\n");
      out.write("        \n");
      out.write("    <form action=\"registrosesion\" method=\"post\" class=\"form-horizontal\">\n");
      out.write("    <fieldset>\n");
      out.write("    <legend>Agregar Sesión</legend>\n");
      out.write("\n");
      out.write("    <input name=\"id\" type=\"text\" value=\"");
      out.print(id);
      out.write("\" style=\"display: none\">\n");
      out.write("    <input name=\"dnipro\" type=\"text\" value=\"");
      out.print(dnipro);
      out.write("\" style=\"display: none\">\n");
      out.write("    <div style=\"text-align: left;margin-left: 40px;margin-bottom: 15px;\">\n");
      out.write("    <label class=\"mylabel2\">Fecha Sesión</label>\n");
      out.write("    <input name=\"fechas\" class=\"campomyfecha2\" type=\"text\" required=\"\">\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"form-group\" >\n");
      out.write("    <label class=\"col-md-3 control-label\">Hora Inicio</label>  \n");
      out.write("    <div class=\"col-md-4\">\n");
      out.write("        <input name=\"horasini\" class=\"horaestilo\" id=\"myTime\" type=\"time\" required=\"\">\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\" >\n");
      out.write("    <label class=\"col-md-3 control-label\">Hora Término</label>  \n");
      out.write("    <div class=\"col-md-4\">\n");
      out.write("        <input name=\"horasfin\" class=\"horaestilo\" id=\"mytime\" type=\"time\" required=\"\">\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <button class=\"btn2\">Grabar</button> \n");
      out.write("\n");
      out.write("    </fieldset>\n");
      out.write("    </form>\n");
      out.write("                            ");
 
    }
    sta.close();
    rs.close();
    cnx.close();
        } catch (Exception e) {
               }
    
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("                 ");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
            sta=cnx.createStatement();
            rs=sta.executeQuery("select T1.fechatini,T1.fechatfin,T1.frec,T2.nombre_cur,T1.dni_pro,T3.apellidos_pro,T3.nombre_pro from registro T1 INNER JOIN cursos T2 INNER JOIN profesores T3 ON T1.cod_cur = T2.cod_cur AND T1.dni_pro=T3.dni_pro where id_registro="+id);
            while (rs.next()){
    
      out.write("  \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("    <div class=\"col-md-6\"> \n");
      out.write("        <div class=\"panel panel-default\">\n");
      out.write("               <div class=\"panel-heading\">\n");
      out.write("                   <h3 class=\"panel-title mypanel\">Curso : ");
      out.print(rs.getString(4));
      out.write("</h3>\n");
      out.write("                   <h3 class=\"panel-title mypanel\">Inicio : ");
      out.print(rs.getString(1));
      out.write(" Término : ");
      out.print(rs.getString(2));
      out.write("</h3>\n");
      out.write("                   <h3 class=\"panel-title mypanel\">Frecuencia : ");
      out.print(rs.getString(3));
      out.write("</h3>\n");
      out.write("\n");
      out.write("               </div>\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("                  <div class=\"table-responsive size3\">\n");
      out.write("                      <table class=\"table table-hover\">\n");
      out.write("       \n");
      out.write("  \n");
      out.write("                        \n");
      out.write("    \n");
      out.write("    \n");
      out.write("                        <tr class=\"active mytrrelacion\">\n");
      out.write("                            <th>FECHA</th>\n");
      out.write("                            <th>HORA</th>\n");
      out.write("                            <th>ACCIÓN</th>\n");
      out.write("                        </tr>\n");
      out.write("                           ");
 
    }
    sta.close();
    rs.close();
    cnx.close();
        } catch (Exception e) {
               }
    
      out.write("                         \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");

    try {
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select id_sesion,fecha,horasini,horasfin from sesion where id_registro="+id);
    while (rs.next()){

      out.write("\n");
      out.write("                        <tr>  \n");
      out.write("                            <th>");
      out.print(rs.getString(2));
      out.write("</th>\n");
      out.write("                            <th>");
      out.print(rs.getString(3));
      out.write(" - ");
      out.print(rs.getString(4));
      out.write("</th>\n");
      out.write("                            <th>\n");
      out.write("                                <a href=\"editarpro.jsp?dnipro=");
      out.print(rs.getString(1));
      out.write("\">\n");
      out.write("                                <img src=\"Iconos/editar.png\" width=\"20\" height=\"20\"></a>\n");
      out.write("                                <a href=\"eliminarsesi.jsp?id_sesion=");
      out.print(rs.getString(1));
      out.write("&id=");
      out.print(id);
      out.write("\" onclick=\"return eliminar()\">\n");
      out.write("                                <img src=\"Iconos/eliminar1.png\" width=\"20\" height=\"20\"></a>\n");
      out.write("                            </th>\n");
      out.write("                        </tr>                      \n");
      out.write("                                ");
 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
    }

      out.write("\n");
      out.write("</table>\n");
      out.write("        \n");
      out.write("\n");
      out.write(" </div>\n");
      out.write(" </div>\n");
      out.write(" </div>\n");
      out.write(" </div>\n");
      out.write(" </div> \n");
      out.write(" </div>        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <hr class=\"featurette-divider\">\n");
      out.write("      <footer>\n");
      out.write("          <p class=\"pull-right\"><a href=\"home_admin.jsp?dnipro=");
      out.print(dnipro);
      out.write("\">Inicio</a></p>\n");
      out.write("      </footer>\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("\n");
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
