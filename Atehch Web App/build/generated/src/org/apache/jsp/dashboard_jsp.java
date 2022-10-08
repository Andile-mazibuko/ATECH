package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import atech.entities.ac.za.GraphicsCard;
import atech.entities.ac.za.Computer;
import java.util.List;
import atech.entities.ac.za.Product;

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
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <title>dashboard</title>\n");
      out.write("</head>\n");
      out.write("<body class=\"body\" id=\"body\">\n");
      out.write("   <div class=\"navigation-bar\" id=\"nav-bar\">\n");
      out.write("\t<button class=\"arrow-container\" align=\"center\" onclick=\"closeSideBar()\">\n");
      out.write("            <div class=\"arrow-button\" id=\"arrow-btn\">\n");
      out.write("            </div>\n");
      out.write("\t</button>\n");
      out.write("            <a href=\"index.html\" >\n");
      out.write("                <div class=\"logo-container\">\n");
      out.write("                    <img src=\"img/logo.png\" >\n");
      out.write("\t\t</div>\n");
      out.write("            </a>\n");
      out.write("            ");
 List<Product> tobuy = (List<Product> )session.getAttribute("tobuy");
      out.write("\n");
      out.write("            <ul class=\"navigation-list\">\n");
      out.write("                <li><a href=\"index.html\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                <li><button class=\"basket-btn\" onclick=\"proceedToCheckout()\"><i class=\"fa fa-shopping-basket\" aria-hidden=\"true\"><span id=\"items\" >");
      out.print(tobuy.size());
      out.write(" </span></i></button></li>\n");
      out.write("\t\t<li><a href=\"\"><i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t<li><a href=\"\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("            \t\t\t\t\n");
      out.write("            </ul>\n");
      out.write("        <form class=\"search-form\">\n");
      out.write("                <div class=\"search-area\">\n");
      out.write("                    <label for=\"search\"><i class=\"fa fa-search\" aria-hidden=\"true\"></i></label>\n");
      out.write("                        <input type=\"search\" id=\"search\" name=\"search\" class=\"search-field\" placeholder=\"Search for a product\">\n");
      out.write("\t\t</div>\n");
      out.write("        </form>\n");
      out.write("\t</div>\n");
      out.write("            <div class=\"side-bar\" id=\"side-bar\">\n");
      out.write("                <div class=\"side-bar-content\">\n");
      out.write("                    <a href=\"\">\n");
      out.write("\t\t\t<div >\n");
      out.write("                            <span>\n");
      out.write("                            \t<i class=\"fa fa-address-book\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t<span class=\"side-contentent\" id=\"order-his\">Order history</span>\n");
      out.write("                            </span>\t\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"\">\n");
      out.write("\t\t\t<div>\t\t\t\t\t\t\t\t\n");
      out.write("                            <span>\n");
      out.write("                                <i class=\"fa fa-cart-arrow-down\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t<span class=\"side-contentent\" id=\"sale\">Sale</span>\n");
      out.write("                            </span>\t\n");
      out.write("\t\t\t</div>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"wishlist.jsp\">\n");
      out.write("\t\t\t<div>\t\t\t\t\t\t\t\t\n");
      out.write("                            <span >\n");
      out.write("\t\t\t\t<i class=\"fa fa-heart\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t<span class=\"side-contentent\" id=\"wish\">My wishlist</span>\n");
      out.write("                            </span>\t\n");
      out.write("\t\t\t</div>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"\">\n");
      out.write("\t\t\t<div>\n");
      out.write("                            <span >\n");
      out.write("\t\t\t\t<i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t<span class=\"side-contentent\" id=\"account\">Account info</span>\n");
      out.write("                            </span>\t\n");
      out.write("\t\t\t</div>\n");
      out.write("                    </a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t<button class=\"dark-mode-container\" onclick=\"enableDarkMode()\">\n");
      out.write("        \t\t\t<div class=\"icon-container\">\n");
      out.write("                \t\t\t<img src=\"img/moon.png\" >\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"products-area\" id=\"product-area\">\n");
      out.write("                \n");
      out.write("            ");

              List<Product>products =(List<Product>)session.getAttribute("products");
              for(int i=0; i < products.size(); i++){
      out.write("\n");
      out.write("\t\t<div class=\"product\" id=\"");
      out.print(i);
      out.write("\">\n");
      out.write("                    ");
 
                        Product product = products.get(i);
                        String name="";
                        if(product instanceof Computer)
                        {
                            Computer comp = (Computer)product;
                            name = comp.getBrand()+" "+ comp.getProcessor()+" Desktop";
                        }else
                        {
                            GraphicsCard gpu =(GraphicsCard)product;
                            name = gpu.getBrand()+" "+gpu.getModel();
                        }
                        
      
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    <h3>");
      out.print(name);
      out.write("</h3>\n");
      out.write("\t\t<div class=\"item-img-container\">\n");
      out.write("                    <img src=\"img/logo.png\">\n");
      out.write("\t\t</div>\n");
      out.write("                    <p lign=\"center\">R");
      out.print(product.getPrice());
      out.write("</p>\n");
      out.write("                    <form action=\"GetProductServelt.do\" method=\"POST\">\n");
      out.write("                        <input type=\"submit\" name=\"btn-value\" value=\"");
      out.print(i);
      out.write(". More info\" class=\"add-item\" id=\"");
      out.print(i);
      out.write("\" >\n");
      out.write("                    </form>\n");
      out.write("\t\t</div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"checkout-box\" id=\"checkout-box\">\n");
      out.write("                <ul>\n");
      out.write("                ");
 for(int i =0; i < tobuy.size();i++){
                
                        Product toBpro = tobuy.get(i);
                        String name="";
                        if(toBpro instanceof Computer)
                        {
                            Computer comp = (Computer)toBpro;
                            name = comp.getBrand()+" "+ comp.getProcessor()+" Desktop";
                        }else
                        {
                            GraphicsCard gpu =(GraphicsCard)toBpro;
                            name = gpu.getBrand()+" "+gpu.getModel();
                        }
                
                
      out.write("\n");
      out.write("                <li>");
      out.print(name);
      out.write("</li><span>");
      out.print(toBpro.getPrice());
      out.write("</span><br> \n");
      out.write("                    <hr>\n");
      out.write("                \n");
      out.write("                ");
}
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <form action=\"checkout.jsp\" method=\"POST\">\n");
      out.write("                    <div class=\"proceed\"> <input type=\"submit\" value=\"Proceed to checkout\"><i class=\"fa fa-shopping-basket\" aria-hidden=\"true\"><span>R 40000.00</span></i></div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\t\t\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("\tfunction closeSideBar()\n");
      out.write("\t{\n");
      out.write("\t\tlet sidebar = document.getElementById(\"side-bar\");\n");
      out.write("\t\tlet arrbtn = document.getElementById(\"arrow-btn\");\n");
      out.write("\t\tlet navbar = document.getElementById(\"nav-bar\"); \t\t\n");
      out.write("\t\tlet productArea = document.getElementById(\"product-area\");\n");
      out.write("\t\tlet order = document.getElementById(\"order-his\");\n");
      out.write("\t\tlet sale = document.getElementById(\"sale\");\n");
      out.write("\t\tlet account = document.getElementById(\"account\");\n");
      out.write("\t\tlet wish = document.getElementById(\"wish\");\n");
      out.write("\t\tnavbar.classList.toggle(\"close-navbar\");\n");
      out.write("\t\tsidebar.classList.toggle(\"close-side-bar\");\n");
      out.write("\t\tarrbtn.classList.toggle(\"close-side-bar-btn\");\n");
      out.write("\t\tproductArea.classList.toggle(\"close-productArea\");\n");
      out.write("\t\torder.classList.toggle(\"invisible-sidecontent\");\n");
      out.write("\t\tsale.classList.toggle(\"invisible-sidecontent\");\n");
      out.write("\t\twish.classList.toggle(\"invisible-sidecontent\");\n");
      out.write("\t\taccount.classList.toggle(\"invisible-sidecontent\");\n");
      out.write("\t\t\n");
      out.write("            }\n");
      out.write("\tfunction enableDarkMode()\n");
      out.write("\t{\n");
      out.write("\t\tlet productArea = document.getElementById(\"product-area\");\n");
      out.write("\t\tlet product = document.getElementById(\"product\");\n");
      out.write("\t\tlet body = document.getElementById(\"body\");\n");
      out.write("\t\tlet sidebar = document.getElementById(\"side-bar\");\n");
      out.write("\t\tlet navbar = document.getElementById(\"nav-bar\"); \n");
      out.write("\t\tsidebar.classList.toggle(\"dark-mode-sidebar\");\n");
      out.write("                productArea.classList.toggle(\"product-dark\");\n");
      out.write("                navbar.classList.toggle(\"dark-navbar\");\n");
      out.write("\t\tproduct.classList.toggle(\"dark-product\");\n");
      out.write("\t\tbody.classList.toggle(\"dark-mode\");\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("        function showLogInForm(){\n");
      out.write("\t\tlet login = document.getElementById(\"login\");\n");
      out.write("\t\t\n");
      out.write("\t\tlogin.classList.toggle(\"login-visible\");\n");
      out.write("\t}\n");
      out.write("        function proceedToCheckout()\n");
      out.write("        {\n");
      out.write("            let basket = document.getElementById(\"checkout-box\");\n");
      out.write("            basket.classList.toggle(\"show-checkout\");\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            </script>\n");
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
