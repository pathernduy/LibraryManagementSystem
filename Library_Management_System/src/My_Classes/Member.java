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
 * @author HOME
 */
public class Member {
    
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String gender;
    private byte[] picture;

    public Member(int id, String firstName, String lastName, String phone, String email, String gender, byte[] picture) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.picture = picture;
    }

    public Member() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    
    
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public byte[] getPicture() {
        return picture;
    }

    //add member
    public boolean addMember(String fname,String lname,String phone,String gender, String email, byte[] picture) {

        String insertQuery = "INSERT INTO `members`(`firstName`, `lastName`, `phone`, `email`, `gender`, `picture`) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, phone);
            ps.setString(4, email);
            ps.setString(5, gender);
            ps.setBytes(6, picture);
            
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Member Added", "add member", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Member Not Added", "add member", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
    //edit member
    public boolean editMember(String fname,String lname,String phone,String gender, String email, byte[] picture) {

        String editQuery = "INSERT INTO `members`(`firstName`, `lastName`, `phone`, `email`, `gender`, `picture`) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, phone);
            ps.setString(4, email);
            ps.setString(5, gender);
            ps.setBytes(6, picture);
            
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Member Added", "add member", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Member Not Added", "add member", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
    //remove member
    public boolean removeMember(int id) {

        String removeQuery = "DELETE FROM `members` WHERE `id` ="+id;
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
           
            
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Member Deleted", "delete member", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Member Not Deleted", "delete member", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
    //show 1 member
    public Member showOneMember(int id) throws SQLException {

        String selectQuery = "SELECT * FROM `members` WHERE `id` = "+id;
        
            
            Func_Class func = new Func_Class();
            ResultSet rs = func.getData(selectQuery);
            
           if(rs.next()){
               return new Member(rs.getInt(1)
                            ,  rs.getString(2)
                       , rs.getString(3)
                       , rs.getString(4)
                       , rs.getString(5)
                       , rs.getString(6)
                       , rs.getBytes(7));
           }
           else{
               return null;
           }
    }

    //show member
    public ArrayList<Member> memberList(String query){
        
        ArrayList<Member> mList = new ArrayList<>();
        
        ResultSet rs;
        Func_Class func = new Func_Class();
        
        try {
            if(query.equals("")){
                query = "Select * from `members`";
            }
            rs = func.getData(query);
            
            Member member;
            
            while(rs.next()){
                member = new Member(rs.getInt("id")
                                   ,rs.getString("firstName")
                                   ,rs.getString("lastName")
                                    ,rs.getString("phone")
                                    ,rs.getString("email")
                                    ,rs.getString("gender")
                                   ,rs.getBytes("picture"));
                mList.add(member);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mList;
    }
}
