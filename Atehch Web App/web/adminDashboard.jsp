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
        <link rel="stylesheet" href="adminstyle.css">
        <title>dashboard</title>
</head>
<body class="body" id="body">
    <div class="navigation-bar" id="nav-bar">
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
    </div>
    <div class="side-bar" >
	<div class="add-item">
            <button><i class="fa fa-cart-plus" aria-hidden="true"></i> Add item</button>
        </div>
        <div class="add-item">
            <button><i class="fa fa-list-alt" aria-hidden="true"></i> List Items</button>
        </div>
	<div class="add-item">
            <button><i class="fa fa-table" aria-hidden="true"></i> List Users</button>
        </div>
		<div class="add-item">
            <button><i class="fa fa-cart-plus" aria-hidden="true"></i> Add item</button>
        </div>
    </div>
    <div class="content-box">
        <div class="content">kd</div>
        <div class="content">kd</div>
    </div>
</body>
</html>

