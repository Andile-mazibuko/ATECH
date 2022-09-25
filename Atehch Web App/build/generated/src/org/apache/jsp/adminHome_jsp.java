package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import atech.entities.ac.za.Customer;
import java.util.List;
import atech.entities.ac.za.Product;

public final class adminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("        <link rel=\"icon\" href=\"img/logo.png\" >\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Bebas+Neue&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Bebas+Neue&family=IBM+Plex+Mono&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Bebas+Neue&family=IBM+Plex+Mono&family=Roboto&display=swap\" rel=\"stylesheet\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css\" integrity=\"sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"adminstyle.css\">\n");
      out.write("        <title>dashboard</title>\n");
      out.write("</head>\n");
      out.write("<body class=\"body\" id=\"body\">\n");
      out.write("    <div class=\"navigation-bar\" id=\"nav-bar\">\n");
      out.write("            <a href=\"index.html\" >\n");
      out.write("                <div class=\"logo-container\">\n");
      out.write("                    <img src=\"img/logo.png\" >\n");
      out.write("\t\t</div>\n");
      out.write("            </a>\n");
      out.write("            <ul class=\"navigation-list\">\n");
      out.write("                <li><a href=\"index.html\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                <li><button class=\"basket-btn\" onclick=\"proceedToCheckout()\"><i class=\"fa fa-shopping-basket\" aria-hidden=\"true\"><span id=\"items\" > </span></i></button></li>\n");
      out.write("\t\t<li><a href=\"\"><i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t<li><a href=\"\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"side-bar\" >\n");
      out.write("\t<div class=\"add-item\">\n");
      out.write("            <a href=\"addItem.html\"><button><i class=\"fa fa-cart-plus\" aria-hidden=\"true\"></i> Add item</button></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"add-item\">\n");
      out.write("           <a href=\"\"> <button><i class=\"fa fa-list-alt\" aria-hidden=\"true\"></i> List Items</button></a>\n");
      out.write("        </div>\n");
      out.write("\t<div class=\"add-item\">\n");
      out.write("            <a href=\"\"><button><i class=\"fa fa-table\" aria-hidden=\"true\"></i> List Users</button></a>\n");
      out.write("        </div>\n");
      out.write("\t<div class=\"add-item\">\n");
      out.write("            <a href=\"\"><button><i class=\"fa fa-cart-plus\" aria-hidden=\"true\"></i> Add item</button></a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"content-box\">\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <h3>No Of users</h3>\n");
      out.write("            <div>\n");
      out.write("                <span>");
      out.print(((List<Customer>)session.getAttribute("customers")).size());
      out.write("</span>\n");
      out.write("            </div>\n");
      out.write("\t</div>\n");
      out.write("        \n");
      out.write("        <div class=\"content\">\n");
      out.write("            <h3>No Of Products</h3>\n");
      out.write("            <div>\n");
      out.write("                <span>");
      out.print(((List<Customer>)session.getAttribute("products")).size());
      out.write("</span>\n");
      out.write("            </div>\n");
      out.write("\t</div>\n");
      out.write("        \n");
      out.write("        <div class=\"content\">\n");
      out.write("            <h3>No Of users</h3>\n");
      out.write("            <div>\n");
      out.write("                <span>143</span>\n");
      out.write("            </div>\n");
      out.write("\t</div>\n");
      out.write("\t\t\n");
      out.write("        \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
