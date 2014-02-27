package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../../assets/ico/favicon.ico\">\n");
      out.write("        <title>MyVibe</title>\n");
      out.write("        <link href=\"CSS/bootstrap/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"CSS/cover.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"site-wrapper\">\n");
      out.write("            <div class=\"site-wrapper-inner\">\n");
      out.write("                \n");
      out.write("                <div class=\"cover-container\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"inner cover\">\n");
      out.write("                        <img class=\"img\" src=\"afbeeldingen/myvibe-logo.png\" height=\"300px\">\n");
      out.write("                        <h1 class=\"cover-heading\">Welkom bij MyVibe!</h1>\n");
      out.write("                        <p class=\"lead\">Log in, of creer een account om ten volle van MyVibe te genieten.</p>\n");
      out.write("                        <p class=\"lead\">\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"forms\">\n");
      out.write("                        <div class=\"login\">\n");
      out.write("                            \n");
      out.write("                            <a href=\"login.jsp\"> <h1>Login </h1></a>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"registreer\">\n");
      out.write("                           \n");
      out.write("                                <a href=\"registreer.jsp\"> <h1>Registreer </h1></a>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                </div>\n");
      out.write("                                </div>   \n");
      out.write("                                <div class=\"mastfoot\">\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                \n");
      out.write("        \n");
      out.write("                <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\n");
      out.write("                <script src=\"js/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("                <script src=\"js/bootstrap/docs.min.js\"></script>\n");
      out.write("                </body>\n");
      out.write("                </html>\n");
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
