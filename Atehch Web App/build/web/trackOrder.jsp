<%-- 
    Document   : trackOrder
    Created on : 08 Nov 2022, 1:18:31 PM
    Author     : andil
--%>

<%@page import="atech.entities.ac.za.CustomerOrder"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    
    <%
        Integer num = 0;
        CustomerOrder order = (CustomerOrder)session.getAttribute("trackedOrder");
        if(order.getOrderStatus() != null)
        {
            if(order.getOrderStatus().equalsIgnoreCase("ready"))
            {
                num = 50;
            }else if(order.getOrderStatus().equalsIgnoreCase("collected"))
            {
                num = 100;
            }else
            {
                num = 0;
            }
        }
    %> 
    <style>
        .nav-bar{
            background: #43655A;
            position: fixed;
            top:0;
            left: 0;
            height: 10%;
            width: 100%;
        }
        .prod-area{
            background-color: aliceblue;
            position: fixed;
            height: 90%;
            width: 100%;
            top: 10%;
            left: 0;
            display: flex;
            justify-content: center;
        }
        .container{
            position: relative;
            width: 60%;
            height: 90%;
            border: 2px solid;
            border-color: #43655A;
            top: 5%;
            border-radius: 50px;
            
        }
        .status-container{
            position: relative;
            width: 60%;
            height: 80%;
            left: 20%;
            top: 5%;
       
        }
        .status-indicator{
            position: relative;
            width: 1%;
            height: 100%;
            left: 49.5%;
            top: 0;;
            border: 2px solid;
            border-color: #43655A;

        }
        .green-bar{
            position: relative;
            width: 100%;
            height: <%=num%>%;
            left: 0;
            top: 0;
            background-color: aqua;
            border-bottom: 10px solid red;
            animation: move 3s;
        }
        .payment{
            position: absolute;
            width: 47%;
            right: 0;
            top:0;
        }
        .ready{
            position: absolute;
            width: 47%;
            right: 0;
            top:49%;
        }
        .collected{
            position: absolute;
            width: 47%;
              
            right: 0;
            top:97%;
        }
        .pay-date{
            position: absolute;
            width: 48%;
            right: 0;
            top:0;
            left: 0;
            display: flex;
            justify-content: end;
            color: grey;

        }
        .re-date{
            position: absolute;
            width: 48%;
            right: 0;
            top:49%;
            left: 0;
            display: flex;
            justify-content: end;
            color: grey;

        }
        .col-date{
            position: absolute;
            width: 48%;
            right: 0;
            top:97%;
            left: 0;
            display: flex;
            justify-content: end;
            color: grey;

        }
        @keyframes move{
            from  {height: 0}
            to {height: <%=num%>%}
        }
    </style>
</head>
<body>
    <div class="nav-bar"></div>
    <div class="prod-area">
          <div class="container">
                <h4 align="center">Order </h4>
                <div class="status-container">
                    <div class="status-indicator">
                        <div class="green-bar">

                        </div>
                    </div>
                    <div class="payment">payment recieved</div>
                    <div class="ready">Ready for collection</div>
                    <div class="collected">Order collected</div>

                    <div class="pay-date"><%=order.getOrderDate().getDate() +" / "+order.getOrderDate().getMonth()+" / "+order.getOrderDate().getYear()%></div>
                    <div class="re-date"><%=" / "+order.getOrderDate().getMonth()+" / "+order.getOrderDate().getYear()%></div>
                    <div class="col-date"><%=order.getOrderDate().getDate() +" / "+order.getOrderDate().getMonth()+" / "+order.getOrderDate().getYear()%></div>
                </div>
          </div>  

    </div>


</body>
</html>