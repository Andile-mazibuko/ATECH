<%-- 
    Document   : wishlist
    Created on : 07 Oct 2022, 8:43:00 AM
    Author     : andil
--%>

<%@page import="atech.entities.ac.za.GraphicsCard"%>
<%@page import="atech.entities.ac.za.Product"%>
<%@page import="atech.entities.ac.za.Computer"%>
<%@page import="atech.entities.ac.za.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="wishlist.css">
    <title>Document</title>
</head>
<body>
    <div class="nav-bar" id="nav-bar">
        <div class="logo-container">
            <img src="img/logo.png" alt="">
        </div>
        
    </div>
    <div class="content" id="content">
        <% Customer customer = (Customer)session.getAttribute("customer");%>
        <%for(int i = 0; i < customer.getWishList().size(); i++){
        
        String name = "";
        Product product = customer.getWishList().get(i);
        if(product instanceof Computer){
            Computer comp = (Computer)product;
            name = comp.getBrand()+" "+comp.getProcessor()+" Desktop";
        }else
        {
            GraphicsCard gpu = (GraphicsCard)product;
            name = gpu.getBrand()+" "+gpu.getType()+" "+gpu.getModel();
        }
        %>
        
       
        <div class="product">
        
            <div class="img-continer">
                <img src="img/logo.png" alt="">
            </div>
        
            <div class="prod-content">
                <h3><%=name%></h3>
                
                <div class="price">R <%=product.getPrice()%></div>
            </div>
            <div class="cart-btn">
                <button>
                    +  <i class="fa fa-cart-plus" aria-hidden="true"></i>
                </button>
            </div>
        
        </div>
       <%}%>
        <a href="dashboard.jsp"><div class="next-btn"><button>Back</button></div></a>
    </div> 
        <script type="text/javascript">
            let nav = document.getElementById("nav-bar");
            let content = document.getElementById("content");
            <%
                if(session.getAttribute("theme").toString().equals("dark"))
                {
            %>
                nav.classList.toggle("dark_nav");
                content.classList.toggle("dark_content");
            <%}%>
        </script>
        
    </body>
</html>
