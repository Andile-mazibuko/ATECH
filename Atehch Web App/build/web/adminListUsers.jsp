<%-- 
    Document   : adminListUsers
    Created on : 20 Mar 2023, 2:47:22 PM
    Author     : Andile
--%>

<%@page import="java.util.List"%>
<%@page import="atech.entities.ac.za.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="adminListStyle.css">
    </head>
    <body>
        <%
            List<Customer>customers = (List<Customer>)session.getAttribute("customers");
            
         %>  
           
            <header>

    </header>
    <main>
            <div class="tbl_container">
                <table >                        
                    <th>#No     </th>
                    <th>Customer ID# </v>
                    <th>First Name  </th>
                    <th>Last Name</th>
                    <th>Email addr/th>
                    <th>Pasword</th>
                    <th>Action</th>
                    <%
                     for(int i = 0; i < customers.size(); i++)
                     {
                    %>
                        <tr>
                            <td><%=i%></td>
                            <td><%=customers.get(i).getId()%></td>
                            <td><%=customers.get(i).getFirstName()%></td>
                            <td><%=customers.get(i).getLastname()%></td>
                            <td><%=customers.get(i).getEmail()%></td>
                            <td><%=customers.get(i).getPassword()%></td>
                            <td><button name="remove">Remove<span><%=customers.get(i).getId()%></span></button></td>
                        </tr>
                    <%}%>
                        
                </table>

            </div>
    </main>
    <footer>

    </footer>
    </body>
</html>
