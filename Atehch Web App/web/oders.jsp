<%-- 
    Document   : oders
    Created on : 30 Oct 2022, 11:52:06 PM
    Author     : andil
--%>

<%@page import="atech.entities.ac.za.GraphicsCard"%>
<%@page import="atech.entities.ac.za.Computer"%>
<%@page import="atech.entities.ac.za.Product"%>
<%@page import="atech.entities.ac.za.CustomerOrder"%>
<%@page import="java.util.List"%>
<%@page import="atech.entities.ac.za.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link rel="stylesheet" href="orders.css">
</head>
<body>
    <%
        Customer customer = (Customer)session.getAttribute("customer");
        List<CustomerOrder> orders = customer.getOrders();
    %>
    <div class="nav"></div>
    <div class="prod-area">
        <%
        for(int i = 0; i < orders.size(); i++)
        {
        
        %>
        <div class="card">
            <div class="prod-header">
                <h6>Orde date:<br><br><%=orders.get(i).getOrderDate()%></h6>
                <h3>order id : AT_<%=orders.get(i).getId()%></h3>
                <h4>R <%=orders.get(i).getOrderCost()%></h4>
            </div>
            <div >
                <ol>
                    <%
                        List<Product>orderProducts = orders.get(i).getProducts();
                        Computer computer = new Computer();
                        GraphicsCard gpu = new GraphicsCard();
                        String name = "";
                        for(int j = 0; j < orderProducts.size(); j++)
                        {
                            if(orderProducts.get(j) instanceof Computer)
                            {   
                                 computer =  (Computer)orderProducts.get(j);
                                  name = computer.getBrand()+" "+ computer.getProcessor()+" Desktop";
                            }else
                            {
                                gpu = (GraphicsCard)orderProducts.get(j);
                                 name = gpu.getBrand()+" "+gpu.getModel();
                            }
                            
                        
                    %>
                    <li><%=name%></li>
                    <%}%>
                </ol>
            </div>
        </div>
        <%}%>
    </div>
</body>
</html>
