package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"robots\" content=\"noindex, nofollow\"> \n");
      out.write("\n");
      out.write("    <title>SiDHOSTiNG Login - Bootsnipp.com</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"toolbar\">\n");
      out.write("        Theme: \n");
      out.write("        <select class=\"form-control\" name=\"bootstrap-theme\" id=\"theme_chooser\">\n");
      out.write("          <option value=\"\">Plain Bootstrap</option><option value=\"//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/amelia/bootstrap.min.css\">Amelia</option><option value=\"//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/cerulean/bootstrap.min.css\">Cerulean</option><option value=\"//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/cosmo/bootstrap.min.css\">Cosmo</option><option value=\"//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/cyborg/bootstrap.min.css\">Cyborg</option><option value=\"//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/flatly/bootstrap.min.css\">Flatly</option><option value=\"//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/journal/bootstrap.min.css\">Journal</option><option value=\"//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/lumen/bootstrap.min.css\">Lumen</option><option value=\"//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/readable/bootstrap.min.css\">Readable</option><option value=\"//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/simplex/bootstrap.min.css\">Simplex</option><option value=\"//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/slate/bootstrap.min.css\">Slate</option><option value=\"//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/spacelab/bootstrap.min.css\">Spacelab</option><option value=\"//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/superhero/bootstrap.min.css\">Superhero</option><option value=\"//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/united/bootstrap.min.css\">United</option><option value=\"//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/yeti/bootstrap.min.css\">Yeti</option><option value=\"//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/darkly/bootstrap.min.css\">Darkly</option>\n");
      out.write("        </select>\n");
      out.write("                <a href=\"https://bootsnipp.com/snippets/nr277\" class=\"btn btn-default\">View on Bootsnipp.com</a>\n");
      out.write("                <a class=\"btn btn-default\" href=\"close\" onclick=\"window.close();return false;\">&times;</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <iframe id=\"snippet-preview\" src=\"//s.bootsnipp.com/iframe/nr277\" frameborder='no'></iframe>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    var _gaq = _gaq || [];\n");
      out.write("    _gaq.push(['_setAccount', 'UA-34731274-1']);\n");
      out.write("    _gaq.push(['_trackPageview']);\n");
      out.write("    _gaq.push(['_trackEvent', 'sharing', 'viewed full-screen', 'snippet nr277',0,true]);\n");
      out.write("    (function() {\n");
      out.write("      var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\n");
      out.write("      ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n");
      out.write("      var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\n");
      out.write("    })();\n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    (function($) { \n");
      out.write("        $('#theme_chooser').change(function(){\n");
      out.write("            whichCSS = $(this).val();\n");
      out.write("            document.getElementById('snippet-preview').contentWindow.changeCSS(whichCSS);\n");
      out.write("        });\n");
      out.write("    })(jQuery);\n");
      out.write("    </script>\n");
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
