<%-- 
    Document   : product
    Created on : 22 Aug 2022, 11:45:32 AM
    Author     : andil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="productSytle.css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css" integrity="sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==" crossorigin="anonymous" referrerpolicy="no-referrer" />

</head>
<body class="body" id="body">
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
    <div class="products-area" id="product-area">
        <div class="product-image-container">
		<img src="img/logo.png" class = "product-image">
	</div>
        <div class="product-specifications">
            <h3>Nvidia RTX 3090 ti</h3>
                    <p>
                	Asus RTX 3090 ti<br>
			GDDR6<br>
			VRAM 24gb<br>
			Graphics card category<br>
			10752 Cuda cores<br>
			Triple Fan<br>
			3x DisplayPort
                    </p>
                    <button class="add-to-wishlist" onclick="changeHeart()">
                        <i class="fa fa-heart" aria-hidden="true" id="heart"></i>
                    </button>
                    <button class="add-item" onclick="addItemOnCart()">
			Add To Cart 
			<i class="fa fa-shopping-basket" aria-hidden="true" ></i>
                    </button>
        </div>
        
    </div>
		
		<script>
			function changeHeart(){
				let heart = document.getElementById("heart");
				heart.classList.toggle("red-heart");
			}
		</script>
	</body>
</html>

