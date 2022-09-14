<%@page import="java.util.List"%>
<%@page import="atech.entities.ac.za.Product"%>
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
            <ul class="navigation-list">
                <li><a href="index.html"><i class="fa fa-home" aria-hidden="true"></i></a></li>
                <li><button class="basket-btn" onclick="proceedToCheckout()"><i class="fa fa-shopping-basket" aria-hidden="true"><span id="items" > </span></i></button></li>
		<li><a href=""><i class="fa fa-user-circle" aria-hidden="true"></i></a></li>
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
                    <a href="">
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
                    <a href="">
			<div>								
                            <span >
				<i class="fa fa-heart" aria-hidden="true"></i>
				<span class="side-contentent" id="wish">My wishlist</span>
                            </span>	
			</div>
                    </a>
                    <a href="">
			<div>
                            <span >
				<i class="fa fa-user-circle" aria-hidden="true"></i>
				<span class="side-contentent" id="account">Account info</span>
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
                
                <div class="summary-boxes">
                    <div>
                        
                    </div>
                    
                </div>
	
            </div>
</body>
</html>

