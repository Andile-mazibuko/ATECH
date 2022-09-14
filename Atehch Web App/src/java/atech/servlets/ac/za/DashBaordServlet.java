/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atech.servlets.ac.za;

import atech.entities.ac.za.Customer;
import atech.entities.ac.za.Product;
import atech.sessions.ac.za.CustomerFacadeLocal;
import atech.sessions.ac.za.ProductFacadeLocal;
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
public class DashBaordServlet extends HttpServlet {

    @EJB
    private CustomerFacadeLocal customerFacade;

    @EJB
    private ProductFacadeLocal productFacade;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        HttpSession session = request.getSession(true);
        Customer customer = (Customer)session.getAttribute("customer");
        
       
        String path ="";
        if(customer.getType().equals("ADMIN"))
        {
            updateAdminSession(session);
            path = "adminDashboard.jsp";
        }else
        {
            updateCustomerSession(session, getAllProducts());
            path = "dashboard.jsp";
        }
        
        request.getRequestDispatcher(path).forward(request, response);
        
        
    }
    private List<Product> getAllProducts()
    {
        return productFacade.findAll();
    }
    private void updateCustomerSession(HttpSession session, List<Product>proudcts)
    {
        session.setAttribute("products", proudcts);
    }
    private Integer findAllCustomers()
    {
        return customerFacade.findAll().size()-1;
    }
    private void updateAdminSession(HttpSession session)
    {
        session.setAttribute("customersNo", findAllCustomers());
    }
}
