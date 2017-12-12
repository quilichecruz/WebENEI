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
  
    String hostname=(String)session.getAttribute("hostname");
    String ip=(String)session.getAttribute("ip");
    String dnipro= request.getParameter("dnipro");
    String nombrepro= request.getParameter("nombrepro");
    String id=request.getParameter("id");

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Admin</title>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/custom/admin-home.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/custom/admin-popup.css\">\n");
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
      out.write("                    <li class=\"tab\"><a href=\"#\"><i class=\"material-icons\">border_color</i></a></li>\n");
      out.write("                    <li class=\"tab\"><a href=\"#test4\"><i class=\"material-icons\">equalizer</i></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\t\n");
      out.write("\t</div>\n");
      out.write("        <div id=\"test1\" class=\"col s12 m12 l12\">\n");
      out.write("            <!--\n");
      out.write("            <div class=\"col s2 m2 l2 paddingh\">\n");
      out.write("                <div class=\"card-panel \">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                    <i class=\"material-icons\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col s10 m10 l10 paddingh\">\n");
      out.write("                <div class=\"card-panel\">\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                    <i class=\"material-icons\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col s2 m2 l2\">\n");
      out.write("                <ul class=\"collapsible\" data-collapsible=\"accordion\">\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"collapsible-header\">\n");
      out.write("                            <i class=\"material-icons\">school</i>\n");
      out.write("                            Docentes\n");
      out.write("                        </div>\n");
      out.write("                            <div class=\"collapsible-body\"><p>Nuevo Registro</p>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"collapsible-header\">\n");
      out.write("                            <i class=\"material-icons\">local_library</i>\n");
      out.write("                            Cursos\n");
      out.write("                        </div>\n");
      out.write("                            <div class=\"collapsible-body\"><p>Listar</p>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"collapsible-header\">\n");
      out.write("                            <i class=\"material-icons\">access_time</i>\n");
      out.write("                            Asistencia\n");
      out.write("                        </div>\n");
      out.write("                            <div class=\"collapsible-body\"><p>Reportes</p>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"collapsible-header\">\n");
      out.write("                            <i class=\"material-icons\">border_color</i>\n");
      out.write("                            Notas\n");
      out.write("                        </div>\n");
      out.write("                            <div class=\"collapsible-body\"><p>Nuevo Registro</p>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"collapsible-header\">\n");
      out.write("                            <i class=\"material-icons\">equalizer</i>\n");
      out.write("                            Reportes\n");
      out.write("                        </div>\n");
      out.write("                            <div class=\"collapsible-body\"><p>Reportes</p>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"collapsible-header\">\n");
      out.write("                            <i class=\"material-icons\">settings</i>\n");
      out.write("                            Settings\n");
      out.write("                        </div>\n");
      out.write("                            <div class=\"collapsible-body\"><p>Configuración.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            -->\n");
      out.write("            \n");
      out.write("            <div class=\"col s3 m3 l3\" style=\"margin-top: 3%;\">\n");
      out.write("                <label>Buscar docente</label>\n");
      out.write("                <form action=\"buscarpro_adm\" method=\"post\">\n");
      out.write("                    <select class=\"browser-default\">\n");
      out.write("                        <option value=\"\" disabled selected>Escoge tu opción</option>\n");
      out.write("                        \n");

    Connection cnx=null;
    Statement sta=null;
    ResultSet rs=null;

    try {   
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select dni_pro,nombre_pro,apellidos_pro,sede_pro from profesores order by apellidos_pro");
    while (rs.next()){

      out.write("\n");
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(rs.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs.getString(3));
      out.write(',');
      out.write(' ');
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("\n");

    }
sta.close();
rs.close();
cnx.close();
}catch (Exception e) {
}

      out.write(" \n");
      out.write("                    \n");
      out.write("                    </select>\n");
      out.write("                    <button>Buscar</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"col s12 m12 l12\" style=\"margin-top: 5%\">\n");
      out.write("                <div class=\"table-responsive size\">\n");
      out.write("                    <table class=\"highlight tableh responsive-table\">\n");
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

    try {
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select * from profesores order by apellidos_pro");
    while (rs.next()){

      out.write("\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>  \n");
      out.write("                                <td class=\"center\"><a href=\"#\"><i class=\"material-icons\">portrait</i></a>\n");
      out.write("                                <td class=\"\"><a style=\"text-decoration: none;color: #000;\" href=\"home.jsp?dnipro=");
      out.print(rs.getString(1));
      out.write("#popup2\" onclick = \"document.getElementById('light2').style.display='block';\">");
      out.print(rs.getString(3));
      out.write(',');
      out.write(' ');
      out.print(rs.getString(2));
      out.write("</a></td>\n");
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
      out.write("                                    <a href=\"home.jsp?dnipro=");
      out.print(rs.getString(1));
      out.write("#popup2\" onclick = \"document.getElementById('light2').style.display='block';\"><i class=\"material-icons\">web</i></a>\n");
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
      out.write("                <div class=\"col s12 m12 l12\">\n");
      out.write("                    <div class=\"table-responsive\">\n");
      out.write("                        <table class=\"highlight tableh\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Curso</th>\n");
      out.write("                                    <th>Inscritos</th>\n");
      out.write("                                    <th>Vacantes</th>\n");
      out.write("                                    <th>Disponibles</th>\n");
      out.write("                                    <th>Frecuencia</th>\n");
      out.write("                                    <th>Fecha Inicio</th>\n");
      out.write("                                    <th>Fecha Término</th>\n");
      out.write("                                    <th>Estado</th>\n");
      out.write("                                    <th>Lab</th>\n");
      out.write("                                    <th>Acción</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");

    try {
        Class.forName("com.mysql.jdbc.Driver");
        cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
        sta=cnx.createStatement();
        rs=sta.executeQuery("SELECT T1.id_registro,T1.cod_cur,T3.nombre_cur,T1.paga,T1.dni_pro,T2.nombre_pro,T2.apellidos_pro,T1.fechatini,T1.fechatfin,T1.esta,T1.labo,T3.vaca_cur,-sum(paga-vaca_cur),T1.frec FROM registro T1 INNER JOIN profesores T2 INNER JOIN cursos T3  ON T1.dni_pro = T2.dni_pro AND T1.cod_cur = T3.cod_cur where T1.dni_pro="+dnipro+" group by T1.id_registro");
        while (rs.next()){

      out.write("\n");
      out.write("                            <tbody>            \n");
      out.write("                                <tr>  \n");
      out.write("                                    <th class=\"\">");
      out.print(rs.getString(3));
      out.write("</th>\n");
      out.write("                                    <th class=\"\">");
      out.print(rs.getInt(4));
      out.write("</th>\n");
      out.write("                                    <th class=\"\">");
      out.print(rs.getInt(12));
      out.write("</th>\n");
      out.write("                                    <th class=\"\">");
      out.print(rs.getInt(13));
      out.write("</th>\n");
      out.write("                                    <th class=\"\">");
      out.print(rs.getString(14));
      out.write("</th>\n");
      out.write("                                    <th class=\"\">");
      out.print(rs.getString(8));
      out.write("</th>\n");
      out.write("                                    <th class=\"\">");
      out.print(rs.getString(9));
      out.write("</th>\n");
      out.write("                                    <th class=\"\">");
      out.print(rs.getString(10));
      out.write("</th>\n");
      out.write("                                    <th class=\"\">");
      out.print(rs.getString(11));
      out.write("</th>\n");
      out.write("                                    <th class=\"\">\n");
      out.write("                                        <a href=\"editarrela.jsp?id=");
      out.print(rs.getString(1));
      out.write("\">\n");
      out.write("                                        <img src=\"Iconos/editar.png\" width=\"15\" height=\"15\"></a>   \n");
      out.write("                                        <a href=\"sesion.jsp?id=");
      out.print(rs.getString(1));
      out.write("&dnipro=");
      out.print(rs.getString(5));
      out.write("\">\n");
      out.write("                                        <img src=\"Iconos/l2.png\" width=\"15\" height=\"15\"></a>\n");
      out.write("                                        <a href=\"eliminarrela.jsp?id=");
      out.print(rs.getString(1));
      out.write("\" onclick=\"return eliminar()\">\n");
      out.write("                                        <img src=\"Iconos/eliminar1.png\" width=\"15\" height=\"15\"></a>\n");
      out.write("                                    </th>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
 
    }
sta.close();
rs.close();
cnx.close();
} catch (Exception e) {
    }

      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
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
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("    <div class=\"modal-wrapper\" id=\"popup2\">\n");
      out.write("        <div class=\"popup-contenedor2\"> \n");
      out.write("            <div class=\"row\" id=\"light2\" style=\"display: block;\">\n");
      out.write("                <div class=\"col s12 m12 l12\">\n");
      out.write("                    <div class=\"table-responsive\">\n");
      out.write("                        <table class=\"highlight tableh\">    \n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th class=\"center\">DNI</th>\n");
      out.write("                                    <th class=\"center\">Apellidos y Nombres</th>\n");
      out.write("                                    <th class=\"center\">Profesión</th>\n");
      out.write("                                    <th class=\"center\">Grado</th>\n");
      out.write("                                    <th></th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");

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
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td class=\"center\">");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                                    <td class=\"center\">");
      out.print(rs.getString(3));
      out.write(' ');
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                    <td class=\"center\">");
      out.print(rs.getString(9));
      out.write("</td>\n");
      out.write("                                    <td class=\"center\">");
      out.print(rs.getString(8));
      out.write("</td>\n");
      out.write("                                    <td class=\"center\">\n");
      out.write("                                        <a href=\"#\"><i class=\"material-icons\">colorize</i></a>\n");
      out.write("                                        <a href=\"#\"><i class=\"material-icons\">highlight_off</i></a>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr class=\"\">\n");
      out.write("                                    <td class=\"\" title=\"Cursos de referencia\"><i class=\"material-icons\">import_contacts</i>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td colspan=\"4\" class=\"\" title=\"Cursos de referencia\">\n");
      out.write("                                        <ul style=\"list-style-type: none; padding: 0px 0px;color: #0069B4\">\n");
      out.write("                                           <li>");
      out.print(rs.getString(16));
      out.write("</li>\n");
      out.write("                                           <li>");
      out.print(rs.getString(17));
      out.write("</li>\n");
      out.write("                                           <li>");
      out.print(rs.getString(18));
      out.write("</li>\n");
      out.write("                                           <li>");
      out.print(rs.getString(19));
      out.write("</li>\n");
      out.write("                                           <li>");
      out.print(rs.getString(20));
      out.write("</li>\n");
      out.write("                                           <li>");
      out.print(rs.getString(21));
      out.write("</li>\n");
      out.write("                                           <li>");
      out.print(rs.getString(22));
      out.write("</li>\n");
      out.write("                                           <li>");
      out.print(rs.getString(23));
      out.write("</li>\n");
      out.write("                                           <li>");
      out.print(rs.getString(24));
      out.write("</li>\n");
      out.write("                                           <li>");
      out.print(rs.getString(25));
      out.write("</li>\n");
      out.write("                                           <li>");
      out.print(rs.getString(26));
      out.write("</li>\n");
      out.write("                                           <li>");
      out.print(rs.getString(27));
      out.write("</li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td class=\"\" title=\"Especialidad\"><i class=\"material-icons\">school</i></td>\n");
      out.write("                                    <td colspan=\"4\" class=\"\" title=\"Especialidad\">");
      out.print(rs.getString(12));
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr class=\"\">\n");
      out.write("                                    <td class=\"\" title=\"Experiencia\"><i class=\"material-icons\">school</i></td>\n");
      out.write("                                    <td colspan=\"4\" class=\"\" title=\"Experiencia\">");
      out.print(rs.getString(14));
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr class=\"\">\n");
      out.write("                                    <td class=\"\"><i class=\"material-icons\">phone</i></td>\n");
      out.write("                                    <td colspan=\"4\" class=\"\">");
      out.print(rs.getString(4));
      out.write(" - ");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr class=\"\">\n");
      out.write("                                    <td class=\"\"><i class=\"material-icons\">location_on</i></td>\n");
      out.write("                                    <td colspan=\"4\" class=\"\">");
      out.print(rs.getString(5));
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
 
    }
sta.close();
rs.close();
cnx.close();
    } catch (Exception e) {
           }

      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                            <a class=\"popup-cerrar2\" href=\"#\" title=\"Cerrar\" onclick = \"document.getElementById('light2').style.display='none';\">x</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
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
