<%-- 
    Document   : product
    Created on : 22 Aug 2022, 11:45:32 AM
    Author     : andil
--%>

<%@page import="atech.entities.ac.za.GraphicsCard"%>
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
        Product selectedProd = (Product)session.getAttribute("selectedProd");
        Computer selectedComp = null;
        GraphicsCard selectedGpu = null;
        List<Product>tobuy = (List<Product>)session.getAttribute("tobuy");
        
        if(selectedProd instanceof Computer)
        {
            selectedComp = (Computer)selectedProd;
        }else
        {
            selectedGpu = (GraphicsCard)selectedProd;
        }
        
        
        Customer customer = (Customer)session.getAttribute("customer");
        String path = "";
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
                    String name,type,ram,category,gpu;
                    if(selectedComp != null )
                    {
                        name = selectedComp.getBrand()+" "+selectedComp.getProcessor()+" Desktop";
                        type = selectedComp.getMotherboard();
                        ram = selectedComp.getRam();
                        gpu = selectedComp.getGpu();
                        category = "Desktop";
                    }else
                    {
                        name = selectedGpu.getBrand()+" "+selectedGpu.getModel();
                        type = selectedGpu.getType();
                        ram = selectedGpu.getVram();
                        gpu = selectedGpu.getCores()+" cores";
                        category = "GPU";
                    }    
                %>
            
            </h3>
                    
                    <p>
                	<%=name%><br>
			<%=type%><br>
			<%=ram%><br>
			<%=gpu%><br>
			Category:<%= category%><br>
                        R<%=selectedProd.getPrice()%>
                    </p>
                    <a href="WishListServlet.do">
                        <button class="add-to-wishlist">
                            <i class="fa fa-heart" aria-hidden="true" id="heart"></i>
                        </button>
                    </a>
                   <a href="AddOnCartServlet.do">
                        <button class="add-item" >
                            Add To Cart 
                            <i class="fa fa-shopping-basket" aria-hidden="true" ></i>
                        </button>
                    </a>
                   
        </div>
        
    </div>
		
    <script>
	function changeHeart()
        {
            let heart = document.getElementById("heart");
            heart.classList.toggle("red-heart");
        }

        function confirmDecision()
        {
            let conf = document.getElementById("conf-dec");
            conf.classList.toggle("confirm-visible");
        }
    </script>
</body>
</html>

