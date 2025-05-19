/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import dao.UserDao;
import Model.User;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author lucy
 */
@WebServlet("/update")
public class UpdateUser extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");

         // Get values from form
        int id = Integer.parseInt(request.getParameter("id"));
        String fullname = request.getParameter("fullname");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String idnumber = request.getParameter("idnumber");
        String dob = request.getParameter("dob");
        String gender = request.getParameter("gender");
        String county = request.getParameter("county");

        // Populate the user object
        User user = new User();
        user.setId(id);
        user.setFullname(fullname);
        user.setPhone(phone);
        user.setEmail(email);
        user.setIdnumber(idnumber);
        user.setDob(dob);
        user.setGender(gender);
        user.setCounty(county);

        // Update user in the database
        UserDao dao = new UserDao();
        boolean updated = dao.updateUser(user);

        // Redirect based on result
        if (updated) {
            response.sendRedirect("listUsers");
        } else {
            response.sendRedirect("error.jsp");
        }
}
}
