<%-- 
    Document   : checkout
    Created on : 24 Oct 2022, 2:21:42 PM
    Author     : andil
--%>

<%@page import="java.util.List"%>
<%@page import="atech.entities.ac.za.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="wishlist.css">
    <title>Document</title>
</head>
<body>
    <div class="nav-bar">
        <div class="logo-container">
            <img src="D:\Git-Projects\ATECH online shop\ATECH\dashboard\logo.png" alt="">
        </div>
        
    </div>
    <div class="content">
        <%
            List<Product>toBuy =(List<Product>)session.getAttribute("tobuy");
        
        for(int i = 0; i < toBuy.size(); i++){
        %>
        
        <div class="product">
        
            <div class="img-continer">
                <img src="D:\Git-Projects\ATECH online shop\ATECH\dashboard\logo.png" alt="">
            </div>
        
            <div class="prod-content">
                <h3>Palit GTX 1660 SUPER</h3>
                
                <div class="price">R19990</div>
            </div>
            <div class="cart-btn">
                <button>
                    +  <i class="fa fa-cart-plus" aria-hidden="true"></i>
                </button>
            </div>
        
        </div>
        <%}%>
        <div class="next-btn"><a href="OrderProcessorServlet.do"><button id="payment">Make payment</button></a></div>
    </div>
        <script type="text/javascript">
            let makepayment = document.getElementById("payment");
            <%
                if(toBuy.size() == 0)
                {
            %>
                          
                alert('Your cart is empty.Please go back to fill the cart');
                makepayment.classList.toggle("unclickable-btn");
            <%
                }
            %>
        </script>
</body>
</html>
