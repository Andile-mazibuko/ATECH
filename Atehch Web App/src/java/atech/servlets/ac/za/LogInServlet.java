/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atech.servlets.ac.za;

import atech.entities.ac.za.Customer;
import atech.sessions.ac.za.CustomerFacadeLocal;
import java.io.IOException;
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
        String pssword = request.getParameter("password");
       
            if(comparePassword(pssword, email))
            {
                updateSession(session,searchAccount(email));
                response.sendRedirect("DashBaordServlet");
            }else
            {
                request.getRequestDispatcher("index.html").forward(request, response);
            }
        
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
            }
        }
    
        return customer;
    }
    private boolean comparePassword(String password,String email)
    {
        Customer customer = searchAccount(email);
        
        if(customer.getPassword().equals(password))
        {
            return true;
        }else
        {
            return false;
        }
    }
    private void updateSession(HttpSession session,Customer customer)
    {
        session.setAttribute("customer", customer);
        
    }

}
