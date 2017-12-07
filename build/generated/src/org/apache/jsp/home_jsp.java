package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Admin</title>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/custom/admin-home.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\n");
      out.write("\t<!--Import Google Icon Font-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("\t<!-- Compiled and minified CSS -->\n");
      out.write("  \t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css\">\n");
      out.write("  \t<!-- Compiled and minified JavaScript -->\n");
      out.write("  \t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js\"></script>  \t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col s12 m12 l12\">\n");
      out.write("            <nav class=\"nav-extended blue\">\n");
      out.write("                <ul class=\"tabs tabs-transparent\">\n");
      out.write("                    <li class=\"tab\"><a href=\"#\"><i class=\"material-icons\">home</i></a></li>\n");
      out.write("                    <li class=\"tab\"><a class=\"active\" href=\"#test1\"><i class=\"material-icons\">group</i></a></li>\n");
      out.write("                    <li class=\"tab\"><a href=\"#test2\"><i class=\"material-icons\">local_library</i></a></li>\n");
      out.write("                    <li class=\"tab\"><a href=\"#test3\"><i class=\"material-icons\">access_time</i></a></li>\n");
      out.write("                    <li class=\"tab\"><a href=\"#test4\"><i class=\"material-icons\">equalizer</i></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\t\n");
      out.write("\t</div>\n");
      out.write("        <div id=\"test1\" class=\"col s12 m12 l12\">\n");
      out.write("            \n");
      out.write("            <div class=\"col s3 m3 l3 paddingh\">\n");
      out.write("                <div class=\"card-panel \">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                    <i class=\"material-icons\">person_pin</i></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col s3 m3 l3 paddingh\">\n");
      out.write("                <div class=\"card-panel\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                    <i class=\"material-icons\">person_pin</i></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col s3 m3 l3 paddingh\">\n");
      out.write("                <div class=\"card-panel\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                    <i class=\"material-icons\">person_pin</i></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col s3 m3 l3 paddingh\">\n");
      out.write("                <div class=\"card-panel\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                    <i class=\"material-icons\">person_pin</i></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col s3 m3 l3\">\n");
      out.write("                <ul class=\"collapsible\" data-collapsible=\"accordion\">\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"collapsible-header\">\n");
      out.write("                            <i class=\"material-icons\">school</i>\n");
      out.write("                            Docentes\n");
      out.write("                            <span class=\"new badge red\">1</span></div>\n");
      out.write("                            <div class=\"collapsible-body\"><p>Lorem ipsum dolor sit amet.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"collapsible-header\">\n");
      out.write("                            <i class=\"material-icons\">local_library</i>\n");
      out.write("                            Cursos\n");
      out.write("                            <span class=\"new badge blue\">1</span></div>\n");
      out.write("                            <div class=\"collapsible-body\"><p>Lorem ipsum dolor sit amet.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"collapsible-header\">\n");
      out.write("                            <i class=\"material-icons\">access_time</i>\n");
      out.write("                            Asistencia\n");
      out.write("                            <span class=\"new badge\">1</span></div>\n");
      out.write("                            <div class=\"collapsible-body\"><p>Lorem ipsum dolor sit amet.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"collapsible-header\">\n");
      out.write("                            <i class=\"material-icons\">border_color</i>\n");
      out.write("                            Notas\n");
      out.write("                            <span class=\"new badge\">1</span></div>\n");
      out.write("                            <div class=\"collapsible-body\"><p>Lorem ipsum dolor sit amet.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"collapsible-header\">\n");
      out.write("                            <i class=\"material-icons\">settings</i>\n");
      out.write("                            Settings\n");
      out.write("                            <span class=\"new badge\">1</span></div>\n");
      out.write("                            <div class=\"collapsible-body\"><p>Lorem ipsum dolor sit amet.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col s9 m9 l9\">\n");
      out.write("                <div class=\"table-responsive size\">\n");
      out.write("                    <table class=\"highlight tableh\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th></th>\n");
      out.write("                                <th>Docente</th>\n");
      out.write("                                <th>Profesión</th>\n");
      out.write("                                <th>Sede</th>\n");
      out.write("                                <th>Grado</th>\n");
      out.write("                                <th class=\"center\">Acción</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");

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
      out.write("                        <tbody>\n");
      out.write("                            <tr>  \n");
      out.write("                                <td class=\"\"><a href=\"#\"><i class=\"material-icons\">portrait</i></a>\n");
      out.write("                                <td class=\"\">");
      out.print(rs.getString(3));
      out.write(',');
      out.write(' ');
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                <td class=\"\">");
      out.print(rs.getString(9));
      out.write("</td>\n");
      out.write("                                <td class=\"\">");
      out.print(rs.getString(15));
      out.write("</td>\n");
      out.write("                                <td class=\"\">");
      out.print(rs.getString(8));
      out.write("</td>\n");
      out.write("                                <td class=\"center\">\n");
      out.write("                                    <a href=\"#\"><i class=\"material-icons\">web</i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"material-icons\">colorize</i></a>\n");
      out.write("                                    <a href=\"#\"><i class=\"material-icons\">highlight_off</i></a>\n");
      out.write("                                </td>\n");
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
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"test2\" class=\"col s12\">\n");
      out.write("            <blockquote>Cursos</blockquote>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"test3\" class=\"col s12\">\n");
      out.write("            <blockquote>Asistencia</blockquote>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"test4\" class=\"col s12\">\n");
      out.write("            <blockquote>Reportes</blockquote>\n");
      out.write("        </div>           \n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("\n");
      out.write("    <!--Import jQuery before materialize.js-->\n");
      out.write("    <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
