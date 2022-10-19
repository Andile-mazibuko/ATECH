/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atech.servlets.ac.za;

import atech.entities.ac.za.Computer;
import atech.entities.ac.za.Customer;
import atech.entities.ac.za.Product;
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
public class AddItemServlet extends HttpServlet {

    @EJB
    private ProductFacadeLocal productFacade;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        
        HttpSession session = request.getSession();
        String category = request.getParameter("category");
        String brand = request.getParameter("name");
        Double price = Double.parseDouble(request.getParameter("price"));
        Product product;
        Customer customer = (Customer)session.getAttribute("cutomer");
        
           
            String motherboard = request.getParameter("motherboard");
            String processor = request.getParameter("processor");
            String ram = request.getParameter("ram");
            String gpu = request.getParameter("gpu");
            product = createComputer(brand, processor, price, motherboard, ram, gpu);
            addProduct(product);
            response.sendRedirect("DashBaordServlet.do");

        
    }
    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        
        HttpSession session = request.getSession();
        
        String indexItem = request.getParameter("add-item");
        String[] myArr = indexItem.split(". ");
        Integer prodIndex = Integer.parseInt(myArr[0]);
        
        List<Product>tobuy = (List<Product>)session.getAttribute("tobuy");
        List<Product>products = (List<Product>)session.getAttribute("products");
        
        Product product = products.get(prodIndex);
        if(tobuy.size()!= 0)
        {    
            for(int i = 0; i < tobuy.size(); i++)
            {
                if(product.equals(tobuy.get(i)))
                {
                    tobuy.add(product);
                    break;
                }
            }
            session.setAttribute("tobuy",tobuy);
        }else
        {
            tobuy.add(product);
            session.setAttribute("tobuy",tobuy);
        }
        
        request.getRequestDispatcher("dashboard.jsp").forward(request, response);

    }
    private Product createComputer(String brand,String processor ,double price, String motherboard, String ram, String gpu)
    {
        Computer product = new Computer();
        
        product.setBrand(brand);
        product.setPrice(price);
        product.setProcessor(processor);
        product.setGpu(gpu);
        product.setMotherboard(motherboard);
        product.setRam(ram);

        return product;
    }
    private void addProduct(Product product)
    {
        productFacade.create(product);
        
    }

}
