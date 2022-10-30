<%-- 
    Document   : account
    Created on : 09 Oct 2022, 10:36:13 PM
    Author     : andil
--%>

<%@page import="atech.entities.ac.za.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="account.css">
    <title>Document</title>
</head>
<body id="body">
    
    <div class="nav-bar" id="nav-bar">

    </div>
    <div class="container" id="container">
        <%
            Customer customer = (Customer)session.getAttribute("customer");
            String hiddenPass = "";
            for(int i = 0; i < customer.getPassword().length(); i++){
                hiddenPass = hiddenPass.concat("*");
            }
        %>
        <div class="links">
            <h3 align="center">My Account</h3>
            <a href="wishlist.jsp">
                <div>
                    <i class="fa fa-heart" aria-hidden="true"></i> wishlist
                </div>
            </a>
            <a href="">
                <div>
                   <i class="fa fa-key" aria-hidden="true"></i> Change password
                </div>
            </a>
            <a href="oders.jsp">
                <div>
                   <i class="fa fa-history" aria-hidden="true"></i> order history
                </div>
            </a>
        </div>
        <div class="account-details">
            <div class="log-in-details"><i class="fa fa-user" aria-hidden="true"></i>  User Profile</div>
            <table>
                <tr>
                    <td>Customer Id</td>
                    <td><%=customer.getId()%></td>
                </tr>
                <tr>
                    <td>name</td>
                    <td><%=customer.getFirstName()%></td>

                </tr>
                <tr>
                    <td>lastname</td>
                    <td><%=customer.getLastname()%></td>
                </tr>
            </table>
            <div class="log-in-details"><i class="fa fa-unlock" aria-hidden="true"></i>  Log In Details</div>
            <table>
                <tr>
                    <td>Email</td>
                    <td><%=customer.getEmail()%></td>
                </tr>
                <tr>
                    <td>password</td>
                    <td><%=hiddenPass%></td>
                </tr>
            </table>
        </div>
    </div>
                <script type="text/javascript">
                    let body = document.getElementById("body");
                    let nav = document.getElementById("nav-bar");
                    <%
                        if(session.getAttribute("theme").toString().equals("dark")){
                    %>
                            body.classList.toggle("dark_body");
                            nav.classList.toggle("dark_nav");
                    <%}%>
                </script>        
        
</body>
</html>
