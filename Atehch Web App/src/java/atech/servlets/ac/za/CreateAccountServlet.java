/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atech.servlets.ac.za;

import atech.entities.ac.za.Customer;
import atech.sessions.ac.za.CustomerFacadeLocal;
import java.io.IOException;
import java.util.ArrayList;
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
public class CreateAccountServlet extends HttpServlet {

    @EJB
    private CustomerFacadeLocal customerFacade;
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        HttpSession session = request.getSession(true);
     
        String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");
        long id = Long.parseLong(request.getParameter("id"));
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String pssword = request.getParameter("password");
        
        Customer customer = createCustomer(id, name, lastname, gender, email,pssword);
       
        addCustomer(customer);
        
        updateSession(session, customer);
        
        response.sendRedirect("LogInServlet.do");
    
    }
    private Customer createCustomer(long id,String name,String lastname,String gender,String email, String password)
    {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstName(name);
        customer.setLastname(lastname);
        customer.setGender(gender);
        customer.setEmail(email);
        customer.setPassword(password);
        customer.setWishList(new ArrayList<>());
        return customer;
    }
    private void updateSession(HttpSession session,Customer customer)
    {
            session.setAttribute("customer",customer);
    }
    private void addCustomer(Customer customer)
    {
        customerFacade.create(customer);
    }

}
