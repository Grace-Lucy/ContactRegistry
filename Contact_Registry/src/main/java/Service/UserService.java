/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;


import dao.UserDao;
import Model.User;

/**
 *
 * @author lucy
 */
public class UserService {
    private final UserDao dao = new UserDao();

    public boolean registerUser(User user) {
       return dao.saveUser(user);
    }
    
}
