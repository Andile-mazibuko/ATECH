/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atech.servlets.ac.za;

import atech.entities.ac.za.Product;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author andil
 */
public class GetProductServelt extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        
       
       
       request.getRequestDispatcher("dashboard.jsp").forward(request, response);
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        List<Product>products = (List<Product>)session.getAttribute("products");
        
        String[] myArr = request.getParameter("btn-value").split(". ");
        Product selectedProd = products.get(Integer.parseInt(myArr[0]));
        
        session.setAttribute("selectedProd",selectedProd);
        
        request.getRequestDispatcher("product.jsp").forward(request, response);
        
    }


}
