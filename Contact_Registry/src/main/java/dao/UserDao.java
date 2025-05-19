/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import Model.User;
import Util. DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author lucy
 */
public class UserDao {
    //SaveUser method/create
    public boolean saveUser(User user){
        boolean status = false;
        try {
            Connection conn = DBUtil.getConnection();
            String sql = "INSERT INTO users (fullname, phone, email, idnumber, dob, gender, county) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, user.getFullname());
            stmt.setString(2, user.getPhone());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getIdnumber());
            System.out.println("DOB"+user.getDob());
            stmt.setString(5, user.getDob());
            stmt.setString(6, user.getGender());
            stmt.setString(7, user.getCounty());
            
            int rows = stmt.executeUpdate();
            status = rows >0;

            stmt.close();
            conn.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return status;
    }
    //READ: get all users from database
    public List<User> getAllUsers(){
        List<User> users =new ArrayList<>();
        try {
            Connection conn = DBUtil.getConnection();
            String sql = "SELECT * FROM users";
            Statement stmt =conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setFullname(rs.getString("fullname"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                user.setIdnumber(rs.getString("idnumber"));
                user.setDob(rs.getString("dob"));
                user.setGender(rs.getString("gender"));
                user.setCounty(rs.getString("county"));
                users.add(user);
            }
            
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
    
    
    
    
    // READ: Get single user by ID
    public User getUserById(int id) {
        User user = null;
        try {
            Connection conn = DBUtil.getConnection();
            String sql = "SELECT * FROM users WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setFullname(rs.getString("fullname"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                user.setIdnumber(rs.getString("idnumber"));
                user.setDob(rs.getString("dob"));
                user.setGender(rs.getString("gender"));
                user.setCounty(rs.getString("county"));
            }
            
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    
    //UPDATE
    public boolean updateUser(User user){
        boolean status = false;
        try {
            Connection conn = DBUtil.getConnection();
            String sql = "UPDATE users SET fullname=?, phone=?, email=?, idnumber=?, dob=?, gender=?, county=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, user.getFullname());
            stmt.setString(2, user.getPhone());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getIdnumber());
            stmt.setString(5, user.getDob());
            stmt.setString(6, user.getGender());
            stmt.setString(7, user.getCounty());
            stmt.setInt(8, user.getId());
            
           int rows = stmt.executeUpdate();
           status = rows > 0;
           
           stmt.close();
           conn.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
  //DELETE
    public boolean deleteUser(int id){
        boolean status = false;
        try {
        Connection conn = DBUtil.getConnection();
        String sql = "DELETE FROM users WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            int rows = stmt.executeUpdate();
            status = rows > 0;

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}


        
    
       