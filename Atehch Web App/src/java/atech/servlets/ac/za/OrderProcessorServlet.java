/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atech.servlets.ac.za;

import atech.entities.ac.za.Customer;
import atech.entities.ac.za.CustomerOrder;
import atech.entities.ac.za.Product;
import atech.sessions.ac.za.CustomerFacadeLocal;
import atech.sessions.ac.za.CustomerOrderFacadeLocal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
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
public class OrderProcessorServlet extends HttpServlet {

    @EJB
    private CustomerFacadeLocal customerFacade;

    @EJB
    private CustomerOrderFacadeLocal customerOrderFacade;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        HttpSession session = request.getSession();
        List<Product>products = (List<Product>)session.getAttribute("tobuy");
        Customer customer = (Customer)session.getAttribute("customer");
       
        
        CustomerOrder customerOrder = createCustomerOrder(products, 0);
        customerOrderFacade.create(customerOrder); 
        List<CustomerOrder>orders = customer.getOrders();
        orders.add(customerOrder);
        customer.setOrders(orders);
        
        
        customerFacade.edit(customer);
        session.setAttribute("tobuy", new ArrayList<>());
        request.getRequestDispatcher("dashboard.jsp").forward(request, response);
        
// addOrder(customer, customerOrder);
        
      //  addCustomerOrder(customerOrder,customer);
        
        
    }
    private CustomerOrder createCustomerOrder(List<Product>products,double totalcost)
    {
        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.setOrderDate(new Date());
        customerOrder.setProducts(products);
        customerOrder.setOrderCost(totalcost);
        
        return customerOrder;
    }
    private void addCustomerOrder(CustomerOrder customerOrder, Customer customer)
    {
        customerOrderFacade.create(customerOrder);
        customerFacade.edit(customer);
    }
    private Customer addOrder(Customer customer, CustomerOrder order)
    {
        customer.getOrders().add(order);
        return customer;
    }

}
