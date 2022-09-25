/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atech.servlets.ac.za;

import atech.entities.ac.za.Computer;
import atech.entities.ac.za.Product;
import atech.sessions.ac.za.ProductFacadeLocal;
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
        
        
            String motherboard = request.getParameter("motherboard");
            String processor = request.getParameter("processor");
            String ram = request.getParameter("ram");
            String gpu = request.getParameter("gpu");
            product = createComputer(brand, processor, price, motherboard, ram, gpu);
            addProduct(product);
            response.sendRedirect("DashBaordServlet.do");
            
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
