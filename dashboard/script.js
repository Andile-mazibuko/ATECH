
	function closeSideBar()
	{
		let sidebar = document.getElementById("side-bar");
		let  arrbtn = document.getElementById("arrow-btn");
		let navbar = document.getElementById("nav-bar"); 
		navbar.classList.toggle("close-navbar");
		sidebar.classList.toggle("close-side-bar");
		arrbtn.classList.toggle("close-side-bar-btn");
		
		
	}
	function enableDarkMode()
	{
		let productArea = document.getElementById("product");
		let body = document.getElementById("body");
		let sidebar = document.getElementById("side-bar");
		let  arrbtn = document.getElementById("arrow-btn");
		let navbar = document.getElementById("nav-bar"); 
		productArea.classList.toggle("product-dark");
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