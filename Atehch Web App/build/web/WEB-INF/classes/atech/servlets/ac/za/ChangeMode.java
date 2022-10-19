/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atech.servlets.ac.za;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author andil
 */
public class ChangeMode extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        HttpSession session = request.getSession();
        String theme = (String)session.getAttribute("theme");
        
        if(theme.equals("light"))
        {
            session.setAttribute("theme","dark");
        }else
        {
            session.setAttribute("theme","light");
        }
        
        request.getRequestDispatcher("dashboard.jsp").forward(request, response);
    }

}
