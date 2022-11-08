package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class trackOrder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    \n");
      out.write("    ");

        Integer num = 0;
    
      out.write(" \n");
      out.write("    <style>\n");
      out.write("        .nav-bar{\n");
      out.write("            background: #43655A;\n");
      out.write("            position: fixed;\n");
      out.write("            top:0;\n");
      out.write("            left: 0;\n");
      out.write("            height: 10%;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("        .prod-area{\n");
      out.write("            background-color: aliceblue;\n");
      out.write("            position: fixed;\n");
      out.write("            height: 90%;\n");
      out.write("            width: 100%;\n");
      out.write("            top: 10%;\n");
      out.write("            left: 0;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("        }\n");
      out.write("        .container{\n");
      out.write("            position: relative;\n");
      out.write("            width: 60%;\n");
      out.write("            height: 90%;\n");
      out.write("            border: 2px solid;\n");
      out.write("            border-color: #43655A;\n");
      out.write("            top: 5%;\n");
      out.write("            border-radius: 50px;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .status-container{\n");
      out.write("            position: relative;\n");
      out.write("            width: 60%;\n");
      out.write("            height: 80%;\n");
      out.write("            left: 20%;\n");
      out.write("            top: 5%;\n");
      out.write("       \n");
      out.write("        }\n");
      out.write("        .status-indicator{\n");
      out.write("            position: relative;\n");
      out.write("            width: 1%;\n");
      out.write("            height: 100%;\n");
      out.write("            left: 49.5%;\n");
      out.write("            top: 0;;\n");
      out.write("            border: 2px solid;\n");
      out.write("            border-color: #43655A;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .green-bar{\n");
      out.write("            position: relative;\n");
      out.write("            width: 100%;\n");
      out.write("            height: ");
      out.print(num);
      out.write("%;\n");
      out.write("            left: 0;\n");
      out.write("            top: 0;\n");
      out.write("            background-color: aqua;\n");
      out.write("            border-bottom: 10px solid red;\n");
      out.write("            animation: move 3s;\n");
      out.write("        }\n");
      out.write("        .payment{\n");
      out.write("            position: absolute;\n");
      out.write("            width: 47%;\n");
      out.write("            right: 0;\n");
      out.write("            top:0;\n");
      out.write("        }\n");
      out.write("        .ready{\n");
      out.write("            position: absolute;\n");
      out.write("            width: 47%;\n");
      out.write("            right: 0;\n");
      out.write("            top:49%;\n");
      out.write("        }\n");
      out.write("        .collected{\n");
      out.write("            position: absolute;\n");
      out.write("            width: 47%;\n");
      out.write("              \n");
      out.write("            right: 0;\n");
      out.write("            top:97%;\n");
      out.write("        }\n");
      out.write("        .pay-date{\n");
      out.write("            position: absolute;\n");
      out.write("            width: 48%;\n");
      out.write("            right: 0;\n");
      out.write("            top:0;\n");
      out.write("            left: 0;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: end;\n");
      out.write("            color: grey;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .re-date{\n");
      out.write("            position: absolute;\n");
      out.write("            width: 48%;\n");
      out.write("            right: 0;\n");
      out.write("            top:49%;\n");
      out.write("            left: 0;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: end;\n");
      out.write("            color: grey;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .col-date{\n");
      out.write("            position: absolute;\n");
      out.write("            width: 48%;\n");
      out.write("            right: 0;\n");
      out.write("            top:97%;\n");
      out.write("            left: 0;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: end;\n");
      out.write("            color: grey;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        @keyframes move{\n");
      out.write("            from  {height: 0}\n");
      out.write("            to {height: ");
      out.print(num);
      out.write("%}\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"nav-bar\"></div>\n");
      out.write("    <div class=\"prod-area\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("                <h4 align=\"center\">Order </h4>\n");
      out.write("                <div class=\"status-container\">\n");
      out.write("                    <div class=\"status-indicator\">\n");
      out.write("                        <div class=\"green-bar\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"payment\">payment recieved</div>\n");
      out.write("                    <div class=\"ready\">Ready for collection</div>\n");
      out.write("                    <div class=\"collected\">Order collected</div>\n");
      out.write("\n");
      out.write("                    <div class=\"pay-date\">12/04/22</div>\n");
      out.write("                    <div class=\"re-date\">12/04/22</div>\n");
      out.write("                    <div class=\"col-date\">12/04/22</div>\n");
      out.write("                </div>\n");
      out.write("          </div>  \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
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
