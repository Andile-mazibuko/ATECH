
	function closeSideBar()
	{
		let sidebar = document.getElementById("side-bar");
		let arrbtn = document.getElementById("arrow-btn");
		let navbar = document.getElementById("nav-bar"); 		
		let productArea = document.getElementById("product-area");
		let span = document.getElementById("a");//testing purposes
		navbar.classList.toggle("close-navbar");
		sidebar.classList.toggle("close-side-bar");
		arrbtn.classList.toggle("close-side-bar-btn");
		productArea.classList.toggle("close-productArea");
		span.classList.toggle("invisible-sidecontent");
		
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
		let number = 0;
		number++;
		
		let span = document.getElementById("items").innerHTML = ""+number;
		return number;
	}
	function showLogInForm(){
		let login = document.getElementById("login");
		
		login.classList.toggle("login-visible");
	}