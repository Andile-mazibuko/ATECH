/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atech.servlets.ac.za;

import atech.entities.ac.za.Customer;
import atech.entities.ac.za.CustomerOrder;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author andil
 */
public class TrackOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        
    
    
    }
    private CustomerOrder findOrder(Long ordernumber, List<CustomerOrder>orders)
    {
        CustomerOrder custOder = new CustomerOrder();
        for(CustomerOrder order : orders)
        {
            if(order.getId().equals(ordernumber))
            {
                custOder = order;
                Date d = new Date();
                int n = d.getDate()+7;
            }
        }
        return custOder;
    }
    private void updateSession(HttpSession session, CustomerOrder customerOrder)
    {
        session.setAttribute("trackedOrder", customerOrder);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        HttpSession session = request.getSession();
        long ordernumber = Long.parseLong(request.getParameter("ordernumber"));
        System.out.println(ordernumber);
        Customer customer = (Customer)session.getAttribute("customer");
        List<CustomerOrder>orders = customer.getOrders();
        
        CustomerOrder customerOrder = findOrder(ordernumber, orders);
        updateSession(session, customerOrder);
        
        request.getRequestDispatcher("trackOrder.jsp").forward(request, response);

    }

   
}
