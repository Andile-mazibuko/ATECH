<%-- 
    Document   : LogInPage
    Created on : 11 Oct 2022, 7:20:52 PM
    Author     : andil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="img/logo.png" >
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css" integrity="sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="index.css">
        <title>Main Page</title>
</head>
<body class="body" id="body">
	<div class="left">
            <div class="text "><h1 align="center">ATECH</h1>
                <img src="img/water.svg" width="500px" class="ocean"/>
			<img src="img/shopping-bags.svg" width="260px"/>
			<p align="center">Best pc parts you can find</p>
            </div>
               
	</div>
	<div class="right">
		<div class="login-box" id="login">
			<form action="LogInServlet.do" method="post">
				<div class="text-field">
					<label for="username"><i class="fa fa-user" aria-hidden="true"></i></label>
                                        <input type="email" name="email" placeholder="Enter your email" id="username" required="">
				</div>
				
				<br>
				<div class="text-field">
					<label for="password"><i class="fa fa-lock" aria-hidden="true"></i></label>
					<input type="password" name="password" placeholder="Enter password" id="password" required="">
				</div>
				
                                <a href="changePass.jsp" class="forgot-pass">fogort password</a><br><br>
				<input type="submit" value="LOGIN" class="submit-btn" id="login-btn">
			</form>
		<br>
			<span class="signup">Don't have an account?
				<a href="createAccount.html">Sign up</a>
			</span>	
		</div>
            
	</div>
    <div class="error-msg" id="error-msg">
        incorrect password
    </div>

    <script type="text/javascript">
        let error = document.getElementById("error-msg");
        <%if(session.getAttribute("password").toString().equals("incorrect")){%>
            error.classList.toggle("error-msg-visible");
        
        <%}%>
    </script>
</body>
</html>
