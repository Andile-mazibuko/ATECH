package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css\" integrity=\"sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"body\" id=\"body\">\n");
      out.write("    <div class=\"navigation-bar\" id=\"nav-bar\">\n");
      out.write("        <a href=\"\" >\n");
      out.write("            <div class=\"logo-container\">\n");
      out.write("                <img src=\"img/logo.png\" >\n");
      out.write("            </div>\n");
      out.write("\t</a>\n");
      out.write("        <ul class=\"navigation-list\">\n");
      out.write("            <li><a href=\"index.html\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                <li><a href=\"\"><i class=\"fa fa-shopping-basket\" aria-hidden=\"true\"><span id=\"items\" > </span></i></a></li>\n");
      out.write("\t\t<li><a href=\"\"><i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t<li><a href=\"\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t<li>\n");
      out.write("                    <form>\n");
      out.write("                        <div class=\"search-area\">\n");
      out.write("                            <label for=\"search\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></label>\n");
      out.write("                            <input type=\"search\" id=\"search\" name=\"search\" class=\"search-field\" placeholder=\"Search for a product\">\n");
      out.write("\t\t\t</div>\n");
      out.write("                    </form>\t\t\t\t\n");
      out.write("\t\t</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t</ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"side-bar\" id=\"side-bar\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <button class=\"arrow-container\" align=\"center\" onclick=\"closeSideBar()\">\n");
      out.write("                <div class=\"arrow-button\" id=\"arrow-btn\">\n");
      out.write("\t\t</div>\n");
      out.write("            </button>\t\n");
      out.write("        </div>\n");
      out.write("\t<div class=\"side-bar-content\">\n");
      out.write("            <a href=\"\">\n");
      out.write("                <div>\n");
      out.write("                    <span >\n");
      out.write("                        <i class=\"fa fa-address-book\" aria-hidden=\"true\"></i>\n");
      out.write("                            Order history\n");
      out.write("                    </span>\t\n");
      out.write("\t\t</div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"\">\n");
      out.write("\t\t<div>\t\t\t\t\t\t\t\t\n");
      out.write("                    <span >\n");
      out.write("                        <i class=\"fa fa-cart-arrow-down\" aria-hidden=\"true\"></i>\n");
      out.write("                            Sale\n");
      out.write("                    </span>\t\n");
      out.write("\t\t</div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"\">\n");
      out.write("                <div>\t\t\t\t\t\t\t\t\n");
      out.write("                    <span>\n");
      out.write("\t\t\t<i class=\"fa fa-heart\" aria-hidden=\"true\"></i>\n");
      out.write("                            My wishlist\n");
      out.write("                    </span>\t\n");
      out.write("\t\t</div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"\">\n");
      out.write("\t\t<div>\n");
      out.write("                    <span >\n");
      out.write("                        <i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i>\n");
      out.write("                            Account info\n");
      out.write("                    </span>\t\n");
      out.write("\t\t</div>\n");
      out.write("            </a>\n");
      out.write("\t</div>\n");
      out.write("    \t<button class=\"dark-mode-container\" onclick=\"enableDarkMode()\">\n");
      out.write("\t\t<div class=\"icon-container\">\n");
      out.write("                        <img src=\"img/moon.png\" >\n");
      out.write("\t\t</div>\n");
      out.write("\t</button>\n");
      out.write("    </div>\n");
      out.write("        <div class=\"products-area\" id=\"product-area\">\n");
      out.write("            ");
for(int i = 0; i < 10; i++){
      out.write("\n");
      out.write("\t\t<div class=\"product\" id=\"product\">\n");
      out.write("\t\t    <h3>Nvidia RTX3090 ti</h3>\n");
      out.write("\t\t\t<div class=\"item-img-container\">\n");
      out.write("                            <img src=\"img/logo.png\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<p lign=\"center\">$100.12</p>\n");
      out.write("\t\t\t<button class=\"add-item\" onclick=\"addItemOnCart()\">\n");
      out.write("                            Add To Cart \n");
      out.write("                            <i class=\"fa fa-shopping-basket\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t\t<br><a href=\"product.jsp\">veiw details</a>\n");
      out.write("                </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("\t</div>\n");
      out.write("    <script src=\"script.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
