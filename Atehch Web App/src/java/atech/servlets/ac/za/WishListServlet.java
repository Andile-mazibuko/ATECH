/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atech.servlets.ac.za;

import atech.entities.ac.za.Customer;
import atech.sessions.ac.za.CustomerFacadeLocal;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author andil
 */
public class WishListServlet extends HttpServlet 
{

    @EJB
    private CustomerFacadeLocal customerFacade;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        HttpSession session = request.getSession();
        Customer customer = (Customer)session.getAttribute("customer");
       // List<Product>wish =customer.getWishList();
         try{      
            customerFacade.edit(customer);
         }catch(Exception ex)
         {
             // for testing purposes
            System.out.println("This item already exist on your wishlist "); 
         }
            
            
            request.getRequestDispatcher("dashboard.jsp").forward(request, response);
     
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
     
    }

}
