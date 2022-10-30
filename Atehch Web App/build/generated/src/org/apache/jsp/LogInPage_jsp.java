package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LogInPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"icon\" href=\"img/logo.png\" >\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css\" integrity=\"sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"index.css\">\n");
      out.write("        <title>Main Page</title>\n");
      out.write("</head>\n");
      out.write("<body class=\"body\" id=\"body\">\n");
      out.write("\t<div class=\"left\">\n");
      out.write("\t\t<div class=\"text \"><h1 align=\"center\">ATECH</h1></div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"right\">\n");
      out.write("\t\t<div class=\"login-box\" id=\"login\">\n");
      out.write("\t\t\t<form action=\"LogInServlet.do\" method=\"post\">\n");
      out.write("\t\t\t\t<div class=\"text-field\">\n");
      out.write("\t\t\t\t\t<label for=\"username\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i></label>\n");
      out.write("                                        <input type=\"email\" name=\"email\" placeholder=\"Enter your email\" id=\"username\" required=\"\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<br>\n");
      out.write("\t\t\t\t<div class=\"text-field\">\n");
      out.write("\t\t\t\t\t<label for=\"password\"><i class=\"fa fa-lock\" aria-hidden=\"true\"></i></label>\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"password\" placeholder=\"Enter password\" id=\"password\" required=\"\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("                                <a href=\"\" class=\"forgot-pass\">fogort password</a><br><br>\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"LOGIN\" class=\"submit-btn\" id=\"login-btn\">\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t\t<span class=\"signup\">Don't have an account?\n");
      out.write("\t\t\t\t<a href=\"createAccount.html\">Sign up</a>\n");
      out.write("\t\t\t</span>\t\n");
      out.write("\t\t</div>\n");
      out.write("            \n");
      out.write("\t</div>\n");
      out.write("    <div class=\"error-msg\" id=\"error-msg\">\n");
      out.write("        incorrect password\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        let error = document.getElementById(\"error-msg\");\n");
      out.write("        ");
if(session.getAttribute("password").toString().equals("incorrect")){
      out.write("\n");
      out.write("            error.classList.toggle(\"error-msg-visible\");\n");
      out.write("        \n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </script>\n");
      out.write("</body>\n");
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
