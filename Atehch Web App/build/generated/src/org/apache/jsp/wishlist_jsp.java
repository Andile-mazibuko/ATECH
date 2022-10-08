package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class wishlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\" integrity=\"sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"wishlist.css\">\n");
      out.write("    <title>Document</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"nav-bar\">\n");
      out.write("        <div class=\"logo-container\">\n");
      out.write("            <img src=\"D:\\Git-Projects\\ATECH online shop\\ATECH\\dashboard\\logo.png\" alt=\"\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <div class=\"content\">\n");
      out.write("        \n");
      out.write("        <div class=\"product\">\n");
      out.write("        \n");
      out.write("            <div class=\"img-continer\">\n");
      out.write("                <img src=\"D:\\Git-Projects\\ATECH online shop\\ATECH\\dashboard\\logo.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            <div class=\"prod-content\">\n");
      out.write("                <h3>Palit GTX 1660 SUPER</h3>\n");
      out.write("                \n");
      out.write("                <div class=\"price\">R19990</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cart-btn\">\n");
      out.write("                <button>\n");
      out.write("                    +  <i class=\"fa fa-cart-plus\" aria-hidden=\"true\"></i>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <div class=\"product\">\n");
      out.write("        \n");
      out.write("            <div class=\"img-continer\">\n");
      out.write("                <img src=\"D:\\Git-Projects\\ATECH online shop\\ATECH\\dashboard\\logo.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            <div class=\"prod-content\">\n");
      out.write("                <h3>Palit GTX 1660 SUPER</h3>\n");
      out.write("                <div class=\"price\">R19990</div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <div class=\"product\">\n");
      out.write("        \n");
      out.write("            <div class=\"img-continer\">\n");
      out.write("                <img src=\"D:\\Git-Projects\\ATECH online shop\\ATECH\\dashboard\\logo.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            <div class=\"prod-content\">\n");
      out.write("                <h3>Palit GTX 1660 SUPER</h3>\n");
      out.write("                <div class=\"price\">R19990</div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <div class=\"product\">\n");
      out.write("        \n");
      out.write("            <div class=\"img-continer\">\n");
      out.write("                <img src=\"D:\\Git-Projects\\ATECH online shop\\ATECH\\dashboard\\logo.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            <div class=\"prod-content\">\n");
      out.write("                <h3>Palit GTX 1660 SUPER</h3>\n");
      out.write("                <div class=\"price\">R19990</div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <div class=\"product\">\n");
      out.write("        \n");
      out.write("            <div class=\"img-continer\">\n");
      out.write("                <img src=\"D:\\Git-Projects\\ATECH online shop\\ATECH\\dashboard\\logo.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            <div class=\"prod-content\">\n");
      out.write("                <h3>Palit GTX 1660 SUPER</h3>\n");
      out.write("                <div class=\"price\">R19990</div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <div class=\"product\">\n");
      out.write("        \n");
      out.write("            <div class=\"img-continer\">\n");
      out.write("                <img src=\"D:\\Git-Projects\\ATECH online shop\\ATECH\\dashboard\\logo.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            <div class=\"prod-content\">\n");
      out.write("                <h3>Palit GTX 1660 SUPER</h3>\n");
      out.write("                <div class=\"price\">R19990</div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <div class=\"product\">\n");
      out.write("        \n");
      out.write("            <div class=\"img-continer\">\n");
      out.write("                <img src=\"D:\\Git-Projects\\ATECH online shop\\ATECH\\dashboard\\logo.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            <div class=\"prod-content\">\n");
      out.write("                <h3>Palit GTX 1660 SUPER</h3>\n");
      out.write("                <div class=\"price\">R19990</div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <div class=\"product\">\n");
      out.write("        \n");
      out.write("            <div class=\"img-continer\">\n");
      out.write("                <img src=\"D:\\Git-Projects\\ATECH online shop\\ATECH\\dashboard\\logo.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            <div class=\"prod-content\">\n");
      out.write("                <h3>Palit GTX 1660 SUPER</h3>\n");
      out.write("                <div class=\"price\">R19990</div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <div class=\"product\">\n");
      out.write("        \n");
      out.write("            <div class=\"img-continer\">\n");
      out.write("                <img src=\"D:\\Git-Projects\\ATECH online shop\\ATECH\\dashboard\\logo.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            <div class=\"prod-content\">\n");
      out.write("                <h3>Palit GTX 1660 SUPER</h3>\n");
      out.write("                <div class=\"price\">R19990</div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <div class=\"product\">\n");
      out.write("        \n");
      out.write("            <div class=\"img-continer\">\n");
      out.write("                <img src=\"D:\\Git-Projects\\ATECH online shop\\ATECH\\dashboard\\logo.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            <div class=\"prod-content\">\n");
      out.write("                <h3>Palit GTX 1660 SUPER</h3>\n");
      out.write("                <div class=\"price\">R19990</div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <div class=\"next-btn\"><button>Back</button></div>\n");
      out.write("    </div> \n");
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
