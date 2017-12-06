package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class principal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    String user_admin= request.getParameter("user_admin");
    String nombre_pro= request.getParameter("nombre_admin");
    String id=request.getParameter("id");

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"text/javascript\"  src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css\">\n");
      out.write("        <script type=\"text/javascript\"  src=\"https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <!--Import Google Icon Font-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <!--Import materialize.css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"nav-extended blue darken-4\">\n");
      out.write("            <div class=\"nav-wrapper\">\n");
      out.write("                <a href=\"#\" class=\"brand-logo\" style=\"padding-left: 10px;\">ENEI</a>\n");
      out.write("                <a href=\"#\" data-activates=\"mobile-demo\" class=\"button-collapse\"><i class=\"material-icons\">menu</i></a>\n");
      out.write("                <ul id=\"nav-mobile\" class=\"right hide-on-med-and-down\">\n");
      out.write("                    <li><a href=\"#\"><i class=\"material-icons\" style=\"display: inline\">desktop_mac </i>");
      out.print(hostname);
      out.write("</a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"material-icons\" style=\"display: inline\">adjust </i>");
      out.print(ip);
      out.write("</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"side-nav\" id=\"mobile-demo\">\n");
      out.write("                    <li><a href=\"#\"><i class=\"material-icons\" style=\"display: inline\">desktop_mac </i>");
      out.print(hostname);
      out.write("</a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"material-icons\" style=\"display: inline\">adjust </i>");
      out.print(ip);
      out.write("</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"nav-content\">\n");
      out.write("                <ul class=\"tabs tabs-transparent\">\n");
      out.write("                    <li class=\"tab\"><a class=\"active\" href=\"#test1\">Docentes</a></li>\n");
      out.write("                    <li class=\"tab\"><a href=\"#test2\">Cursos</a></li>\n");
      out.write("                    <li class=\"tab\"><a href=\"#test3\">Reportes</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        <div id=\"test1\" style=\"font-size: 12px;font-weight: normal;color: #000;\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col l6\">\n");
      out.write("                    <table id=\"example\" class=\"display\" cellspacing=\"0\" width=\"100%\" style=\"height: 10%;\">\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>DNI</th>\n");
      out.write("                <th>DOCENTE</th>\n");
      out.write("                <th>SEDE</th>\n");
      out.write("                <th>PROFESIÓN</th>\n");
      out.write("                <th>GRADO</th>\n");
      out.write("                <th>ACCIÓN</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tfoot>\n");
      out.write("            <tr>\n");
      out.write("                <th>DNI</th>\n");
      out.write("                <th>DOCENTE</th>\n");
      out.write("                <th>SEDE</th>\n");
      out.write("                <th>PROFESIÓN</th>\n");
      out.write("                <th>GRADO</th>\n");
      out.write("                <th>ACCIÓN</th>\n");
      out.write("            </tr>\n");
      out.write("        </tfoot>\n");
      out.write("        <tbody>\n");
      out.write("            ");

                
    Connection cnx=null;
    Statement sta=null;
    ResultSet rs=null;
    try {
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select * from profesores order by apellidos_pro");
    while (rs.next()){

      out.write("\n");
      out.write("            <tr>  \n");
      out.write("                                    <th class=\"danger mytr mycolor\" title=\"Crear una relación\"><a href=\"relacion.jsp?dnipro=");
      out.print(rs.getString(1));
      out.write("&nombrepro=");
      out.print(rs.getString(2));
      out.write("&apellidospro=");
      out.print(rs.getString(3));
      out.write('"');
      out.write('>');
      out.print(rs.getString(1));
      out.write("</a></th>\n");
      out.write("                                    <th class=\"info mycolor\" title=\"Ver detalle\"><a href=\"home_admin.jsp?dnipro=");
      out.print(rs.getString(1));
      out.write("#popup2\" onclick = \"document.getElementById('light2').style.display='block';\">");
      out.print(rs.getString(3));
      out.write(',');
      out.write(' ');
      out.print(rs.getString(2));
      out.write("</a></th>\n");
      out.write("                                   \n");
      out.write("                                    <th class=\"success mytr mycolor\">");
      out.print(rs.getString(15));
      out.write("</th>\n");
      out.write("                                    <th class=\"info mycolor\">");
      out.print(rs.getString(9));
      out.write("</th>\n");
      out.write("                                    <th class=\"success mytr mycolor\">");
      out.print(rs.getString(8));
      out.write("</th>\n");
      out.write("                                    <th class=\"active mytr\">\n");
      out.write("                                        <a href=\"editpro.jsp?dnipro=");
      out.print(rs.getString(1));
      out.write("\">\n");
      out.write("                                            <img src=\"Iconos/editar.png\" alt=\"Editar\"></a>\n");
      out.write("                                        <a href=\"eliminarpro.jsp?dnipro=");
      out.print(rs.getString(1));
      out.write("\" onclick=\"return eliminar()\">\n");
      out.write("                                            <img src=\"Iconos/eliminar1.png\" alt=\"Eliminar\"></a>\n");
      out.write("                                    </th>\n");
      out.write("            </tr>  \n");
      out.write("            \n");
      out.write("            ");
 
}
sta.close();
rs.close();
cnx.close();
} catch (Exception e) {
       }

      out.write("  \n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("        </div>\n");
      out.write("            </div></div>\n");
      out.write("        <div id=\"test2\" class=\"col s12\">Test 2</div>\n");
      out.write("        <div id=\"test3\" class=\"col s12\">Test 3</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $('#example').DataTable();\n");
      out.write("            } );\n");
      out.write("        </script>\n");
      out.write("        <!--Import jQuery before materialize.js-->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js\"></script>\n");
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
