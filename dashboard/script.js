
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
		let number = parseInt(document.getElementById("text").value);
		number++;
		number.value = number;
		let span = document.getElementById("items").innerHTML = ""+number;
		
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