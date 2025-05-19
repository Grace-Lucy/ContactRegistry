/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import dao.UserDao;
import Model.User;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author lucy
 */
@WebServlet("/Edit")
public class EditUser extends HttpServlet {
    
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String idParam = request.getParameter("id");

        // Null or empty check
        if (idParam == null || idParam.trim().isEmpty()) {
            request.setAttribute("errorMessage", "Missing or invalid user ID.");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }
        
        System.out.println("id = "+ request.getParameter("id"));
        
        try {
        int id = Integer.parseInt(request.getParameter("id"));
        UserDao dao = new UserDao();
        User user = dao.getUserById(id);
        
        
        
        if (user != null) {
                request.setAttribute("user", user);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/edit.jsp");
                dispatcher.forward(request, response);
            } else {
                request.setAttribute("errorMessage", "User not found with ID: " + id);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        
        } catch (NumberFormatException e) {
            request.setAttribute("errorMessage", "Invalid user ID format.");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}
       
        
    
  
