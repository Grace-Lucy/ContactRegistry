

package Controller;

import dao.UserDao;
import Model.User;
import java.io.IOException;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/listUsers")
public class ListUsers extends HttpServlet {
   
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
        
        UserDao dao = new UserDao();
        List<User> users = dao.getAllUsers();
        
        
      request.setAttribute("userList", users);
      
      request.getRequestDispatcher("/list.jsp").forward(request, response);
        
    }     
}
