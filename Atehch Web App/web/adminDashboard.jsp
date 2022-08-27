<%-- 
    Document   : adminDashboard
    Created on : 27 Aug 2022, 12:48:27 PM
    Author     : andil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      
        <title>JSP Page</title>
    </head>
    <body>
        <div class="navigation-bar" id="nav-bar">
        <a href="" >
            <div class="logo-container">
                <img src="img/logo.png" >
            </div>
	</a>
        <ul class="navigation-list">
            <li><a href="index.html"><i class="fa fa-home" aria-hidden="true"></i></a></li>
                <li><a href=""><i class="fa fa-shopping-basket" aria-hidden="true"><span id="items" > </span></i></a></li>
		<li><a href=""><i class="fa fa-user-circle" aria-hidden="true"></i></a></li>
		<li><a href=""><i class="fa fa-phone" aria-hidden="true"></i></a></li>
		<li>
                    <form>
                        <div class="search-area">
                            <label for="search"><i class="fa fa-search" aria-hidden="true"></i></label>
                            <input type="search" id="search" name="search" class="search-field" placeholder="Search for a product">
			</div>
                    </form>				
		</li>
				
	</ul>
    </div>
    <div class="side-bar" id="side-bar">
        <div class="container">
            <button class="arrow-container" align="center" onclick="closeSideBar()">
                <div class="arrow-button" id="arrow-btn">
		</div>
            </button>	
        </div>
	<div class="side-bar-content">
            <a href="">
                <div>
                    <span >
                        <i class="fa fa-address-book" aria-hidden="true"></i>
                            Order history
                    </span>	
		</div>
            </a>
            <a href="">
		<div>								
                    <span >
                        <i class="fa fa-cart-arrow-down" aria-hidden="true"></i>
                            Sale
                    </span>	
		</div>
            </a>
            <a href="">
                <div>								
                    <span>
			<i class="fa fa-heart" aria-hidden="true"></i>
                            My wishlist
                    </span>	
		</div>
            </a>
            <a href="">
		<div>
                    <span >
                        <i class="fa fa-user-circle" aria-hidden="true"></i>
                            Account info
                    </span>	
		</div>
            </a>
	</div>
    	<button class="dark-mode-container" onclick="enableDarkMode()">
		<div class="icon-container">
                        <img src="img/moon.png" >
		</div>
	</button>
    </div>
        <div class="products-area" id="product-area">
          
		<div class="product" id="product">
		    <h3>Nvidia RTX3090 ti</h3>
			<div class="item-img-container">
                            <img src="img/logo.png">
			</div>
			<p lign="center">$100.12</p>
			<button class="add-item" onclick="addItemOnCart()">
                            Add To Cart 
                            <i class="fa fa-shopping-basket" aria-hidden="true"></i>
			</button>
			<br><a href="product.jsp">veiw details</a>
                </div>
            
	</div>
   
    </body>
</html>
