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
            <%for(int i = 0; i < 10; i++){%>
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
            <%}%>
            </div>
            <div class="checkout-box" id="checkout-box">
                <ul>
                <% for(int i =0; i < 10;i++){%>
                <li>Nvidia rtx3090ti</li><span>(R40000.00)</span><br> 
                    <hr>
                
                <%}%>
                </ul>
                <form method="POST">
                    <div class="proceed"> <input type="submit" value="Proceed to checkout"><i class="fa fa-shopping-basket" aria-hidden="true"><span>R 40000.00</span></i></div>
                </form>
            </div>
		
            <script type="text/javascript">
                
                
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
	function enableDarkMode()
	{
		let productArea = document.getElementById("product-area");
		let product = document.getElementById("product");
		let body = document.getElementById("body");
		let sidebar = document.getElementById("side-bar");
		let  arrbtn = document.getElementById("arrow-btn");
		let navbar = document.getElementById("nav-bar"); 
		productArea.classList.toggle("product-dark");
		product.classList.toggle("dark-product");
		body.classList.toggle("dark-mode");
		navbar.classList.toggle("dark-navbar");
		sidebar.classList.toggle("dark-mode-sidebar");
		
	}
	function addItemOnCart(){
            <%int number =12;%>
		document.getElementById("items").innerHTML = ""+<%=number++%>;
                //update session
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

