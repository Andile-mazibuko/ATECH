
	function closeSideBar()
	{
		let sidebar = document.getElementById("side-bar");
		let  arrbtn = document.getElementById("arrow-btn");
		let paragraph = document.getElementById("content");
		let navbar = document.getElementById("nav-bar");
		sidebar.classList.toggle("close-side-bar");
		arrbtn.classList.toggle("close-side-bar-btn");
		paragraph.classList.toggle("hide-paragraph");
		navbar.classList.toggle("close-navbar");
	}
	function enableDarkMode()
	{
		let body = document.getElementById("body");
		let sidebar = document.getElementById("side-bar");
		let  arrbtn = document.getElementById("arrow-btn");
		//let navbar = document.getElementById("nav-bar"); 
		body.classList.toggle("dark-mode");
		//navbar.classList.toggle("dark-navbar");
		sidebar.classList.toggle("dark-mode-sidebar");
		
	}
	function numberOfItems(){
		let number = 0;
		number++;
		
		let span = document.getElementById("items");
		span.innerHTML = ""+number;
		return number;
	}