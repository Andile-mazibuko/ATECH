/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atech.servlets.ac.za;

import atech.entities.ac.za.Customer;
import atech.entities.ac.za.Product;
import atech.sessions.ac.za.CustomerFacadeLocal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
public class LogInServlet extends HttpServlet {
    
    @EJB
    private CustomerFacadeLocal customerFacade;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        HttpSession session = request.getSession(true);
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Customer customer = searchAccount(email);
       
        if(customer != null)
         {
            if( customer.getPassword().equals(password))
            {
                updateSession(session,searchAccount(email));
                response.sendRedirect("DashBaordServlet.do");
                
            }
            else{System.out.println("null");}
         }else
         {
              request.getRequestDispatcher("index.html").forward(request, response);
         }
         
         
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
         HttpSession session = request.getSession();
         updateSession(session,(Customer)session.getAttribute("customer"));
         
         response.sendRedirect("DashBaordServlet.do");
       
    }
    private Customer searchAccount(String email)
    {
        
        Customer customer = new Customer();
        List<Customer> users = customerFacade.findAll();
        
        //Begin the search
        for(Customer customerAtIndex : users)
        {
            if(customerAtIndex.getEmail().equals(email))
            {
                //Terminate the loop
                customer = customerAtIndex;
                break;
            }else
            {
                customer = null;
            }
        }
    
        return customer;
    }
    private void updateSession(HttpSession session,Customer customer)
    {
        session.setAttribute("customer", customer);
        session.setAttribute("tobuy",new ArrayList<>());
        
    }

}
