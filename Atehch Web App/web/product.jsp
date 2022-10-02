<%-- 
    Document   : product
    Created on : 22 Aug 2022, 11:45:32 AM
    Author     : andil
--%>

<%@page import="java.util.List"%>
<%@page import="atech.entities.ac.za.Customer"%>
<%@page import="atech.entities.ac.za.Computer"%>
<%@page import="atech.entities.ac.za.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="productSytle.css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css" integrity="sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==" crossorigin="anonymous" referrerpolicy="no-referrer" />

</head>
<body class="body" id="body">
    <%
        Product selectedProd = (Computer)session.getAttribute("selectedProd");
        Customer customer = (Customer)session.getAttribute("customer");
    
    %>
    <div class="navigation-bar" id="nav-bar">
	<a href="" >
        	<div class="logo-container">
                    <img src="img/logo.png" >
		</div>
	</a>
	<ul class="navigation-list">
            <li><a href=""><i class="fa fa-home" aria-hidden="true"></i></a></li>
            <li><a href=""><i class="fa fa-shopping-basket" aria-hidden="true"><span id="items" > </span></i></a></li>
            <li><a href=""><i class="fa fa-user-circle" aria-hidden="true"></i></a></li>
            <li><a href=""><i class="fa fa-phone" aria-hidden="true"></i></a></li>
	</ul>
    </div>
    <div class="products-area" id="product-area">
        <div class="product-image-container">
		<img src="img/logo.png" class = "product-image">
	</div>
        <div class="product-specifications">
            <h3><%
                    if(selectedProd instanceof Computer)
                    {
                       Computer selectedComp = (Computer)selectedProd;
                    
                    %><%=selectedComp.getBrand() +" "+ selectedComp.getProcessor()+" " %>
                <%}%>
            
            </h3>
                    
                    <p>
                	Asus RTX 3090 ti<br>
			GDDR6<br>
			VRAM 24gb<br>
			Graphics card category<br>
			10752 Cuda cores<br>
			Triple Fan<br>
			3x DisplayPort
                    </p>
                    <button class="add-to-wishlist" onclick="changeHeart(),setConfirmVisible()">
                        <i class="fa fa-heart" aria-hidden="true" id="heart"></i>
                    </button>
                    <button class="add-item" onclick="addItemOnCart()">
			Add To Cart 
			<i class="fa fa-shopping-basket" aria-hidden="true" ></i>
                    </button>
                    <a href="GetProductServelt.do">hi</a>
        </div>
        
    </div>
		
    <script>
	function changeHeart()
        {
            let heart = document.getElementById("heart");
            heart.classList.toggle("red-heart");
        }
        function setConfirmVisible()
        {
           <% 
                // testing for now
                List<Product>wishList = customer.getWishList();
               for(int i = 0; i < wishList.size(); i++)
               {
                   if(wishList.get(i).getId() != selectedProd.getId())
                   {
                       wishList.add(selectedProd);
                       session.setAttribute("exist", "no");
                       
                   }else
                   {
                      session.setAttribute("exist", "yes");
                   }
               
               }
                
                
                    
                        
                    
                
                session.setAttribute("customer", customer);

           %>
        }
    </script>
</body>
</html>

