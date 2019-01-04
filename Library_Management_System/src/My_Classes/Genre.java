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
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HOME
 */
public class Genre {

    private int id;
    private String name;
    Func_Class func = new Func_Class();

    public Genre() {
    }

    ;

    public Genre(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //add genre
    public boolean addGenre(String name) {

        String insertQuery = "INSERT INTO `book_genres` (`name`) VALUES (?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, name);

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Genre Added", "add genre", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Genre Not Added", "add genre", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    //edit genre
    public boolean editGenre(int _id, String _name) {

        String editQuery = "UPDATE `book_genres` SET `name`=? WHERE `id`=?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            ps.setString(1, _name);
            ps.setInt(2, _id);

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Genre Edited", "edit genre", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Genre Not Edited", "edit genre", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
    //delete genre
    public boolean deleteGenre(int _id) {

        String deleteQuery = "DELETE FROM `book_genres` WHERE `id`=?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(deleteQuery);
            ps.setInt(1, _id);

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Genre Deleted", "delete genre", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Genre Not Deleted", "detele genre", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
    //show genre
    public ArrayList<Genre> genreList(){
        
        ArrayList<Genre> gList = new ArrayList<>();
        
        String selectQuery = "Select * from `book_genres`  ";
        ResultSet rs;
        Func_Class func = new Func_Class();
        
        try {
            
            rs = func.getData(selectQuery);
            
            
            Genre genre;
            
            while(rs.next()){
                genre = new Genre(rs.getInt("id"),rs.getString("name"));
                gList.add(genre);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        return gList;
    }
    
    
    public HashMap<String,Integer> getGenresMap(){
        HashMap<String,Integer> map = new HashMap<>();
        
        try {
            
            ResultSet rs = func.getData("Select * from `book_genres` ");
            
            
            Genre genre;
            
            while(rs.next()){
                genre = new Genre(rs.getInt("id"),rs.getString("name"));
                map.put(genre.getName(),genre.getId());
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        return map;
    }
    
    public Genre getGenreById(Integer id){
        ResultSet rs;
        
                   
            rs = func.getData("Select * from `book_genres` where `id` = "+id);
            
            Genre genre = null ;
            
        try {
            if(rs.next()){
                genre = new Genre(rs.getInt("id")
                        ,rs.getString("name"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return genre;
    }
    
    
    
}
