/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atech.servlets.ac.za;

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
public class StartSessionServlet extends HttpServlet {

    @EJB
    private ProductFacadeLocal productFacade;



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        HttpSession session = request.getSession(true); 
      
        GraphicsCard gpu = new GraphicsCard();

        gpu.setBrand("Asus");
        gpu.setPrice(44000.00);
        gpu.setModel("Nvedia RTX 3090 ti");
        gpu.setCores("1756 cuda cores");
        gpu.setVram("24GB");
        gpu.setType("GDDR6");
        
        productFacade.create(gpu);
  
     
      
        
        if(request.getParameter("username").equals("andile mazibuko") && request.getParameter("password").equals("andilemazibuko01234"))
        {
            request.getRequestDispatcher("adminDashboard.jsp").forward(request, response);
        }
  
    }
    
    
}
