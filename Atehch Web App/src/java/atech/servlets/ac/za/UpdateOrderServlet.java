/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atech.servlets.ac.za;

import atech.entities.ac.za.CustomerOrder;
import atech.sessions.ac.za.CustomerOrderFacadeLocal;
import java.io.IOException;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author andil
 */
public class UpdateOrderServlet extends HttpServlet {

    @EJB
    private CustomerOrderFacadeLocal customerOrderFacade;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        Long orderId = Long.parseLong(request.getParameter("order_no"));
        String status = request.getParameter("status");
        
        updateOrderStatus(findOrder(orderId), status);
        
        request.getRequestDispatcher("adminHome.jsp").forward(request, response);
    }
    private CustomerOrder findOrder(Long id)
    {
        return customerOrderFacade.find(id);
    }
    private void updateOrderStatus(CustomerOrder order, String status)
    {
        Date date = new Date();
        
        if(status.equalsIgnoreCase("ready"))
        {
            order.setReadyDate(date);
        }else
        {
            order.setCollectionDate(date);
        }
        order.setOrderStatus(status);        
        customerOrderFacade.edit(order);
    }

}
