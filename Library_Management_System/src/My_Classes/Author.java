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
public class Author {
    
    private int id;
    private String firstName;
    private String lastName;
    private String fieldExpertise;
    private String about;

    public Author(int id, String firstName, String lastName, String fieldExpertise, String about) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fieldExpertise = fieldExpertise;
        this.about = about;
    }

    public Author() {
        
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

    public void setFieldExpertise(String fieldExpertise) {
        this.fieldExpertise = fieldExpertise;
    }

    public void setAbout(String about) {
        this.about = about;
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

    public String getFieldExpertise() {
        return fieldExpertise;
    }

    public String getAbout() {
        return about;
    }
    
    Func_Class func = new Func_Class();
    
    //add author
    public boolean addAuthor(String fname,String lname,String expertise,String about) {

        String insertQuery = "INSERT INTO `author` (`firstName`,`lastName`,`expertise`,`about`) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, expertise);
            ps.setString(4, about);
            
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Author Added", "add author", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Author Not Added", "add author", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
    
    
    //edit author
    public boolean editAuthor(int _id, String fname,String lname,String expertise,String about) {
           
        String editQuery = "UPDATE `author` SET `firstName`=?,`lastName`=?,`expertise`=?,`about`=? WHERE `id`=?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, expertise);
            ps.setString(4, about);
            ps.setInt(5, _id);

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Author Edited", "edit author", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Author Not Edited", "edit author", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
    //delete author
    public boolean deleteAuthor(int _id) {

        String deleteQuery = "DELETE FROM `author` WHERE `id`=?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(deleteQuery);
            ps.setInt(1, _id);

           if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Author Deleted", "delete author", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Author Not Deleted", "delete author", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
    //show author
    public ArrayList<Author> authorList(){
        
        ArrayList<Author> aList = new ArrayList<>();
        String selectQuery = "Select * from `author`  ";
        ResultSet rs;
        
        
        try {
            
            rs = func.getData(selectQuery);
            
            Author author;
            
            while(rs.next()){
                author = new Author(rs.getInt("id")
                                   ,rs.getString("firstName")
                                   ,rs.getString("lastName")
                                   ,rs.getString("expertise")
                                   ,rs.getString("about"));
                aList.add(author);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aList;
    }
    
    public Author getAuthorById(Integer id){
        ResultSet rs;         
        rs = func.getData("Select * from `author` where `id` = "+id);
        Author author = null ;
            
        try {
            if(rs.next()){
                author = new Author(rs.getInt("id")
                        ,rs.getString("firstName")
                        ,rs.getString("lastName")
                        ,rs.getString("expertise")
                        ,rs.getString("about"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return author;
    }
    
    
}
