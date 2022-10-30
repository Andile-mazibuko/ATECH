<%@page import="atech.entities.ac.za.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@page import="atech.entities.ac.za.GraphicsCard"%>
<%@page import="atech.entities.ac.za.Computer"%>
<%@page import="java.util.List"%>
<%@page import="atech.entities.ac.za.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <link rel="icon" href="img/logo.png" >
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&family=IBM+Plex+Mono&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&family=IBM+Plex+Mono&family=Roboto&display=swap" rel="stylesheet">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css" integrity="sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="style.css">
        <title>dashboard</title>
</head>
<body class="body" id="body">
   <div class="navigation-bar" id="nav-bar">
	<button class="arrow-container" align="center" onclick="closeSideBar()">
            <div class="arrow-button" id="arrow-btn">
            </div>
	</button>
            <a href="index.html" >
                <div class="logo-container">
                    <img src="img/logo.png" >
		</div>
            </a>
            <% List<Product> tobuy = (List<Product> )session.getAttribute("tobuy");%>
            <ul class="navigation-list">
                <%Customer customer = (Customer)session.getAttribute("customer");%>
                <li><a href="account.jsp">Hi(<%=customer.getFirstName()+" "+customer.getLastname() %>)</a></li>
                <li><a href="index.html"><i class="fa fa-home" aria-hidden="true"></i></a></li>
                <li><button class="basket-btn" onclick="proceedToCheckout()"><i class="fa fa-shopping-basket" aria-hidden="true"><span id="items" ><%=tobuy.size()%> </span></i></button></li>
		<li><a href="account.jsp"><i class="fa fa-user-circle" aria-hidden="true"></i></a></li>
                
		<li><a href=""><i class="fa fa-phone" aria-hidden="true"></i></a></li>
            				
            </ul>
        <form class="search-form">
                <div class="search-area">
                    <label for="search"><i class="fa fa-search" aria-hidden="true"></i></label>
                        <input type="search" id="search" name="search" class="search-field" placeholder="Search for a product">
		</div>
        </form>
	</div>
            <div class="side-bar" id="side-bar">
                <div class="side-bar-content">
                    <a href="oders.jsp">
			<div >
                            <span>
                            	<i class="fa fa-address-book" aria-hidden="true"></i>
				<span class="side-contentent" id="order-his">Order history</span>
                            </span>	
                        </div>
                    </a>
                    <a href="">
			<div>								
                            <span>
                                <i class="fa fa-cart-arrow-down" aria-hidden="true"></i>
				<span class="side-contentent" id="sale">Sale</span>
                            </span>	
			</div>
                    </a>
                    <a href="wishlist.jsp">
			<div>								
                            <span >
				<i class="fa fa-heart" aria-hidden="true"></i>
				<span class="side-contentent" id="wish">My wishlist</span>
                            </span>	
			</div>
                    </a>
                    <a href="account.jsp">
			<div>
                            <span >
				<i class="fa fa-user-circle" aria-hidden="true"></i>
				<span class="side-contentent" id="account">Account info</span>
                            </span>	
			</div>
                    </a>
		</div>
                <a href="ChangeMode.do">
			<button class="dark-mode-container">
        			<div class="icon-container">
                			<img src="img/moon.png" >
				</div>
			</button>
                </a>
            </div>
            <div class="products-area" id="product-area">
                
            <%
              List<Product>products =(List<Product>)session.getAttribute("products");
              for(int i=0; i < products.size(); i++){%>
		<div class="product" id="<%=i%>">
                    <% 
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
                        
      
                    %>
                    
                    <h3><%=name%></h3>
		<div class="item-img-container">
                    
                    <%
                        if(product instanceof Computer){
                    %>
                        <img src="img/Computer.png">
                    <%}else{%>
                    <img src="img/Gpu.png">
		<%}%>
                
                </div>
                    <p lign="center">R<%=product.getPrice()%></p>
                    <form action="GetProductServelt.do" method="POST">
                        <input type="submit" name="btn-value" value="<%=i%>. More info" class="add-item" id="<%=i%>" >
                    </form>
		</div>
            <%}%>
            </div>
            <div class="checkout-box" id="checkout-box">
                <div class="items">
                <ul>
                <%
                    Double total = 0.0;
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
                
                %>
                <li><%=name%></li><span><%=toBpro.getPrice()%></span><br> 
                    <hr>
               
                <%
                    total+=toBpro.getPrice();
                    }
                    session.setAttribute("orderCost", total);
                %>
                </ul>
               </div>
                <div class="sub-items">
                    <a href="checkout.jsp">
                         <button>Proceed to checkout  <i class="fa fa-shopping-basket" aria-hidden="true"></i>  (<%=total%>.0)</button>
                    </a>
        	</div>
            </div>
		
            <script type="text/javascript">
                
                let productArea = document.getElementById("product-area");
		let product = document.getElementById("product");
		let body = document.getElementById("body");
		let sidebar = document.getElementById("side-bar");
		let navbar = document.getElementById("nav-bar"); 
	
                <%
                    if(session.getAttribute("theme").equals("dark"))
                    {
                %>
    
    
                sidebar.classList.toggle("dark-mode-sidebar");
                productArea.classList.toggle("product-dark");
                navbar.classList.toggle("dark-navbar");
		product.classList.toggle("dark-product");
		body.classList.toggle("dark-mode");
		<%}%>
    
    function closeSideBar()
	{
		let sidebar = document.getElementById("side-bar");
		let arrbtn = document.getElementById("arrow-btn");
		let navbar = document.getElementById("nav-bar"); 		
		let productArea = document.getElementById("product-area");
		let order = document.getElementById("order-his");
		let sale = document.getElementById("sale");
		let account = document.getElementById("account");
		let wish = document.getElementById("wish");
		navbar.classList.toggle("close-navbar");
		sidebar.classList.toggle("close-side-bar");
		arrbtn.classList.toggle("close-side-bar-btn");
		productArea.classList.toggle("close-productArea");
		order.classList.toggle("invisible-sidecontent");
		sale.classList.toggle("invisible-sidecontent");
		wish.classList.toggle("invisible-sidecontent");
		account.classList.toggle("invisible-sidecontent");
		
            }
            
		
	

        function showLogInForm(){
		let login = document.getElementById("login");
		
		login.classList.toggle("login-visible");
	}
        function proceedToCheckout()
        {
            let basket = document.getElementById("checkout-box");
            basket.classList.toggle("show-checkout");
        }
        
        
            </script>
</body>
</html>

