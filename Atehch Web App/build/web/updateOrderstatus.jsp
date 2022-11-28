<%-- 
    Document   : updateOrderstatus
    Created on : 28 Nov 2022, 10:11:08 PM
    Author     : andil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="update.css">
    <title>Update order</title>
</head>
<body>
    <div class="nav-bar"></div>
    <div class="body">
        <div class="container">
            <form action="UpdateOrderServlet.do" method="POST">
                <input type="number" name="order_no" id="" placeholder="Please enter order number" required="">
                <br>
                <input type="radio" name="status" id="ready" value="ready" >
                <label for="ready">Ready for collection</label><br>
                <input type="radio" name="status" id="collected" value="collected">
                <label for="collected">Order collected </label><br><br>
                <input type="submit" value="update">

            </form>
        </div>
    </div>
</body>
</html>