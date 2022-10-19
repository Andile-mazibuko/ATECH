/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atech.servlets.ac.za;

import atech.entities.ac.za.Customer;
import atech.entities.ac.za.GraphicsCard;
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
public class AddGpuServlet extends HttpServlet {

    @EJB
    private ProductFacadeLocal productFacade;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        String category = request.getParameter("category");
        String brand = request.getParameter("name");
        Double price = Double.parseDouble(request.getParameter("price"));
        GraphicsCard product = new GraphicsCard();
        Customer customer = (Customer)session.getAttribute("cutomer");
        
           
            String model = request.getParameter("model");
            String  type = request.getParameter("type");
            String vram = request.getParameter("vram");
            String cores = request.getParameter("cores");


            product.setBrand(brand);
            product.setCores(cores);
            product.setModel(model);
            product.setType(type);
            product.setVram(vram);
            product.setPrice(price);

            productFacade.create(product);
            response.sendRedirect("DashBaordServlet.do");

        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
