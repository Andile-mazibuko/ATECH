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
public class ChangePassword extends HttpServlet {

    @EJB
    private CustomerFacadeLocal customerFacade;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        HttpSession session = request.getSession();
        String email = request.getParameter("email");
        String password = request.getParameter("newPass");
        String confirmNewPass = request.getParameter("confirmNewPass");
        Long id = Long.parseLong(request.getParameter("id"));
        
        try{
            Customer customer = findCustomer(id);
            if(customer.getEmail().equals(email) && password.equals(confirmNewPass))
            {
                customer.setPassword(password);
                customerFacade.edit(customer);
                
            }
        }catch(Exception ex)
        {
            //TODO: exception operations
        }
        
        request.getRequestDispatcher("LogInPage.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        
    }
    
    private Customer findCustomer(Long id)
    {
        return customerFacade.find(id);
    }

}
