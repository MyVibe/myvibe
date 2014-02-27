package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"shortcut icon\" href=\"../../assets/ico/favicon.ico\">\n");
      out.write("    <title>Carousel Template for Bootstrap</title>\n");
      out.write("   <link href=\"CSS/bootstrap/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <link href=\"CSS/carousel.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("<!-- NAVBAR\n");
      out.write("================================================== -->\n");
      out.write("  <body>\n");
      out.write("    <div class=\"navbar-wrapper\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"navbar navbar-inverse navbar-static-top\" role=\"navigation\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("              <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("              </button>\n");
      out.write("              <a class=\"navbar-brand\" href=\"#\">MyVibe</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navbar-collapse collapse\">\n");
      out.write("              <ul class=\"nav navbar-nav\">\n");
      out.write("                <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("                <li><a href=\"muziek.jsp\">Zoek muziek</a></li>\n");
      out.write("                <li><a href=\"account.jsp\">Mijn account</a></li>\n");
      out.write("                \n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                  <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown <b class=\"caret\"></b></a>\n");
      out.write("                  <ul class=\"dropdown-menu\">\n");
      out.write("                    <li><a href=\"#\">Action</a></li>\n");
      out.write("                    <li><a href=\"#\">Another action</a></li>\n");
      out.write("                    <li><a href=\"#\">Something else here</a></li>\n");
      out.write("                    <li class=\"divider\"></li>\n");
      out.write("                    <li class=\"dropdown-header\">Nav header</li>\n");
      out.write("                    <li><a href=\"#\">Separated link</a></li>\n");
      out.write("                    <li><a href=\"#\">One more separated link</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Carousel\n");
      out.write("    ================================================== -->\n");
      out.write("    <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("      <!-- Indicators -->\n");
      out.write("      <ol class=\"carousel-indicators\">\n");
      out.write("        <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("        <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("        <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("      </ol>\n");
      out.write("      <div class=\"carousel-inner\">\n");
      out.write("        <div class=\"item active\">\n");
      out.write("         \n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("              <h1>Welkom op MyVibe!</h1>\n");
      out.write("              <img src=\"afbeeldingen/myvibe-logo.png\" height=\"250px\"/>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item\">\n");
      out.write("          \n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("              <h1>Ontdek exclusieve muziek.</h1>\n");
      out.write("              <p> Luister als eerste naar de nieuwe hits van uw favoriete artiest! </p>\n");
      out.write("              <img src=\"afbeeldingen/exclusive.png\" height=\"150px\"/>\n");
      out.write("              <p><a class=\"btn btn-lg btn-primary\" href=\"muziek.jsp\" role=\"button\">Ontdek nu!</a></p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item\">\n");
      out.write("          \n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"carousel-caption\">\n");
      out.write("              <h1>Dé nummer 1 voor het allernieuwste!</h1>\n");
      out.write("              <p> Onze uitgebreide collectie aan nieuwe en exclusieve muziek maakt van MyVibe dé muziekspecialist.</p>\n");
      out.write("              <img src=\"afbeeldingen/website-van-het-jaar.png\" height=\"150px\"/>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\"><span class=\"glyphicon glyphicon-chevron-left\"></span></a>\n");
      out.write("      <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\"><span class=\"glyphicon glyphicon-chevron-right\"></span></a>\n");
      out.write("    </div><!-- /.carousel -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Marketing messaging and featurettes\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Wrap the rest of the page in another container to center all the content. -->\n");
      out.write("\n");
      out.write("    <div class=\"container marketing\">\n");
      out.write("\n");
      out.write("      <!-- Three columns of text below the carousel -->\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-4\">\n");
      out.write("          <img class=\"img-circle\" src=\"afbeeldingen/daft-punk.png\" height=\"140px\" alt=\"Generic placeholder image\">\n");
      out.write("          <h2>Daft punk</h2>\n");
      out.write("          <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna.</p>\n");
      out.write("          <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">View details &raquo;</a></p>\n");
      out.write("        </div><!-- /.col-lg-4 -->\n");
      out.write("        <div class=\"col-lg-4\">\n");
      out.write("          <img class=\"img-circle\" data-src=\"js/holder.js/140x140\" alt=\"Generic placeholder image\">\n");
      out.write("          <h2>Heading</h2>\n");
      out.write("          <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh.</p>\n");
      out.write("          <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">View details &raquo;</a></p>\n");
      out.write("        </div><!-- /.col-lg-4 -->\n");
      out.write("        <div class=\"col-lg-4\">\n");
      out.write("          <img class=\"img-circle\" data-src=\"js/holder.js/140x140\" alt=\"Generic placeholder image\">\n");
      out.write("          <h2>Heading</h2>\n");
      out.write("          <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>\n");
      out.write("          <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">View details &raquo;</a></p>\n");
      out.write("        </div><!-- /.col-lg-4 -->\n");
      out.write("      </div><!-- /.row -->\n");
      out.write("\n");
      out.write("\n");
      out.write("      <!-- START THE FEATURETTES -->\n");
      out.write("\n");
      out.write("      <hr class=\"featurette-divider\">\n");
      out.write("\n");
      out.write("      <div class=\"row featurette\">\n");
      out.write("        <div class=\"col-md-7\">\n");
      out.write("          <h2 class=\"featurette-heading\">First featurette heading. <span class=\"text-muted\">It'll blow your mind.</span></h2>\n");
      out.write("          <p class=\"lead\">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-5\">\n");
      out.write("          <img class=\"featurette-image img-responsive\" src=\"afbeeldingen/nirvana.jpg\" height=\"500px\" width=\"500px\" alt=\"Generic placeholder image\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <hr class=\"featurette-divider\">\n");
      out.write("\n");
      out.write("      <div class=\"row featurette\">\n");
      out.write("        <div class=\"col-md-5\">\n");
      out.write("          <img class=\"featurette-image img-responsive\" data-src=\"js/holder.js/500x500/auto\" alt=\"Generic placeholder image\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-7\">\n");
      out.write("          <h2 class=\"featurette-heading\">Oh yeah, it's that good. <span class=\"text-muted\">See for yourself.</span></h2>\n");
      out.write("          <p class=\"lead\">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <hr class=\"featurette-divider\">\n");
      out.write("\n");
      out.write("      <div class=\"row featurette\">\n");
      out.write("        <div class=\"col-md-7\">\n");
      out.write("          <h2 class=\"featurette-heading\">And lastly, this one. <span class=\"text-muted\">Checkmate.</span></h2>\n");
      out.write("          <p class=\"lead\">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-5\">\n");
      out.write("          <img class=\"featurette-image img-responsive\" data-src=\"js/holder.js/500x500/auto\" alt=\"Generic placeholder image\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <hr class=\"featurette-divider\">\n");
      out.write("\n");
      out.write("      <!-- /END THE FEATURETTES -->\n");
      out.write("\n");
      out.write("\n");
      out.write("      <!-- FOOTER -->\n");
      out.write("      <footer>\n");
      out.write("        <p class=\"pull-right\"><a href=\"#\">Back to top</a></p>\n");
      out.write("        <p>&copy; 2014 Company, Inc. &middot; <a href=\"#\">Privacy</a> &middot; <a href=\"#\">Terms</a></p>\n");
      out.write("      </footer>\n");
      out.write("\n");
      out.write("    </div><!-- /.container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap/docs.min.js\"></script>\n");
      out.write("  </body>\n");
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
