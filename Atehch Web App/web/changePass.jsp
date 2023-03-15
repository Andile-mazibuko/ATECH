<%-- 
    Document   : changePass
    Created on : 12 Dec 2022, 10:38:30 PM
    Author     : andil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="changePass.css">
    <title>Document</title>
</head>
<body>
    <div class="nav-bar">

    </div>
    <div class="body">
        <div class="container">
            <form action="ChangePassword.do">
                <input type="text" name="email" placeholder="Please enter your email" required>
                <input type="text" name="id" placeholder="Please enter your id" minlength="13" maxlength="13" required >
                <input type="password" name="newPass" id="" placeholder="Enter new password" minlength="6" required>
                <input type="password" name="confirmNewPass" id="" placeholder="confirm password" required>
                <input type="submit" value="change password" id="sub-btn">
            </form>
        </div>
    </div>
</body>
</html>
