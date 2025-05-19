/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import Service.UserService;
import Model.User;

public class CreateUser extends HttpServlet {
    private final UserService userService = new UserService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fullname = request.getParameter("fullname");
        String phone= request.getParameter("phone");
        String email = request.getParameter("email");
        String idnumber = request.getParameter("idnumber");
        String dob = request.getParameter("dob");
        System.out.println("DOB"+dob);
        String gender = request.getParameter("gender");
        String county = request.getParameter("county");
        
        User user = new User();
        user.setFullname(fullname);
        user.setPhone(phone);
        user.setEmail(email);
        user.setIdnumber(idnumber);
        user.setDob(dob);
        user.setGender(gender);
        user.setCounty(county);
        
        
        System.out.println("save status: + status");
        
        boolean result = userService.registerUser(user);
        
        
        
        if (result) {
            response.sendRedirect("success.jsp");
        }else {
            response.sendRedirect("error.jsp");
        }
        
        }
}

