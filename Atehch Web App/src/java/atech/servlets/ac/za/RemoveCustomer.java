/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atech.servlets.ac.za;

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
 * @author Andile
 */
public class RemoveCustomer extends HttpServlet {

    @EJB
    private CustomerFacadeLocal customerFacade;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        HttpSession session = request.getSession();
        long id = Long.parseLong(request.getParameter("remove"));
        
        customerFacade.remove(customerFacade.find(id));
        
        session.setAttribute("customers",customerFacade.findAll());
        
        request.getRequestDispatcher("adminListUsers.jsp").forward(request, response);
        
        

    }

}
