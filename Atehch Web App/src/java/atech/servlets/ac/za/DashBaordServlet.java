/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atech.servlets.ac.za;

import atech.entities.ac.za.Customer;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author andil
 */
public class DashBaordServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        HttpSession session = request.getSession(true);
        Customer customer = (Customer)session.getAttribute("customer");
        String path ="";
        if(customer.getType().equals("ADMIN"))
        {
            path = "adminDashboard.jsp";
        }else
        {
            path = "dashboard.jsp";
        }
        
        request.getRequestDispatcher(path).forward(request, response);
        
        
        
    }

}
