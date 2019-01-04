/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @user HOME
 */
public class Users {
    private int id;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String userType;

    Func_Class func = new Func_Class();
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    
    

    public Users(int id, String firstname, String lastname, String username, String password, String userType) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public Users() {
    }
    
    //add user
    public boolean addUser(String fname,String lname,String username,String password,String usertype) {

        String insertQuery = "INSERT INTO `users_table`( `firstName`, `lastName`, `username`, `password`, `user_type`) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, username);
            ps.setString(4, password);
            ps.setString(5, usertype);
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "User Added", "add user", 1);
            } else {
                JOptionPane.showMessageDialog(null, "User Not Added", "add user", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
    public boolean checkUsername(String username, int id){
        ResultSet rs;
        rs = func.getData("SELECT COUNT(*) FROM `users_table` WHERE `username` = '"+username+"' and `id` <> '"+id+"'");
        try {
            if(rs.next()){
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    //show user
    public ArrayList<Users> userList(){
        
        ArrayList<Users> usrList = new ArrayList<>();
        String selectQuery = "SELECT * FROM `users_table`  ";
        ResultSet rs;
        
        
        try {
            
            rs = func.getData(selectQuery);
            
            Users user;
            
            while(rs.next()){
                user = new Users(rs.getInt("id")
                                   ,rs.getString("firstName")
                                   ,rs.getString("lastName")
                                   ,rs.getString("username")
                                   ,rs.getString("password")
                                   ,rs.getString("user_type"));
                usrList.add(user);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usrList;
    }
    
    //edit user
    public boolean editUser(int _id, String fname,String lname,String username,String password,String usertype) {
           
        String editQuery = "UPDATE `users_table` SET `firstName`=?,`lastName`=?,`username`=?,`password`=?,`user_type`=? WHERE `id`=?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, username);
            ps.setString(4, password);
            ps.setString(5, usertype);
            ps.setInt(6, _id);

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "User Edited", "user edited", 1);
            } else {
                JOptionPane.showMessageDialog(null, "User Not Edited", "user edited", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
    //delete user
    public boolean deleteUser(int _id) {

        String deleteQuery = "DELETE FROM `users_table` WHERE `id`=?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(deleteQuery);
            ps.setInt(1, _id);

           if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "User Deleted", "delete user", 1);
            } else {
                JOptionPane.showMessageDialog(null, "User Not Deleted", "delete user", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
}
