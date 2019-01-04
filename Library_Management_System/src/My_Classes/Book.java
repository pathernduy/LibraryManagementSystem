/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Classes;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author HOME
 */
public class Book {
    
    private Integer id;
    private String isbn;
    private String name;
    private Integer author_id;
    private Integer genre_id;
    private Integer quantity;
    private String publisher;
    private double price;
    private String date_received;
    private String description;
    private byte[] cover;
    Func_Class func =  new Func_Class();
    
    public Book() {
    }

    public Book(Integer id, String isbn, String name, Integer author_id, Integer genre_id, Integer quantity, String publisher, double price, String date_received, String description, byte[] cover) {
        this.id = id;
        this.isbn = isbn;
        this.name = name;
        this.author_id = author_id;
        this.genre_id = genre_id;
        this.quantity = quantity;
        this.publisher = publisher;
        this.price = price;
        this.date_received = date_received;
        this.description = description;
        this.cover = cover;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    
    public String getIbsn() {
        return isbn;
    }

    public void setIbsn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public Integer getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(Integer genre_id) {
        this.genre_id = genre_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate_received() {
        return date_received;
    }

    public void setDate_received(String date_received) {
        this.date_received = date_received;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getCover() {
        return cover;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }
    
    
    //add book
    public boolean addBook(String isbn, String name, Integer author_id, Integer genre_id, Integer quantity, String publisher, double price, String date_received, String description, byte[] cover) {

        String insertQuery = "INSERT INTO `books`(`isbn`, `name`, `author_id`, `genre_id`, `quantity`,`publisher`, `price`, `date_received`, `description`, `cover` )"
                            + "VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, isbn);
            ps.setString(2, name);
            ps.setInt(3, author_id);
            ps.setInt(4, genre_id);
            ps.setInt(5, quantity);
            ps.setString(6, publisher);
            ps.setDouble(7, price);
            ps.setString(8,  date_received);
            ps.setString(9, description);
            ps.setBytes(10, cover);
            
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Book Added", "book member", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Book Not Added", "book member", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
    //check if exist ibsn
    public boolean isISBNexists(String isbn) throws SQLException{
        String query = "SELECT * FROM `books` WHERE `isbn` = '" +isbn+ "'";
        
        ResultSet rs = func.getData(query);
        try{
            if(rs.next()){
                return true;
            }
            else{
                return false;
            }
        }
        catch(SQLException ex){
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    //
    public Book getBookObject(int id, String isbn){
        
        String query = "SELECT * FROM `books` WHERE   `id` = " +id+ " or `isbn` = '" +isbn +"'";
       
        
        Book book = null;
        ResultSet rs = func.getData(query);
        try{
            if(rs.next()){
                    

                book = new Book(rs.getInt(1)
                               ,rs.getString(2)
                               ,rs.getString(3)
                               ,rs.getInt(4)
                               ,rs.getInt(5)
                               ,rs.getInt(6)
                               ,rs.getString(7)
                               ,rs.getDouble(8)
                               ,rs.getString(9)
                               ,rs.getString(10)
                               ,rs.getBytes(11));
                
            }
            else{
                return book;
            }
        }
        catch(SQLException ex){
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return book;
    }
    
    //add book
    public boolean editBook(int id, String name, Integer author_id, Integer genre_id, Integer quantity, String publisher, double price, String date_received, String description, byte[] cover) {

        String updateQuery = "";
        PreparedStatement ps;
        try {
            if(cover != null){
                updateQuery = "UPDATE `books` SET `name`=?,`author_id`=?,`quantity`=?,`genre_id`=?,`publisher`=?,`price`=?,`date_received`=?,`description`=?,`cover`=? "
                    + "     WHERE `id`=?";
                ps= DB.getConnection().prepareStatement(updateQuery);
                 //ps.setString(1, isbn);
                ps.setString(1, name);
                ps.setInt(2, author_id);
                ps.setInt(3, genre_id);
                ps.setInt(4, quantity);
                ps.setString(5, publisher);
                ps.setDouble(6, price);
                ps.setString(7,  date_received);
                ps.setString(8, description);
                ps.setBytes(9, cover);
                ps.setInt(10, id);
                if (ps.executeUpdate() != 0) {
                    JOptionPane.showMessageDialog(null, "Book Edited", "edit book   ", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Book Not Edited", "edit book", 2);
                }
            }
            else{
                updateQuery = "UPDATE `books` SET `name`=?,`author_id`=?,`quantity`=?,`genre_id`=?,`publisher`=?,`price`=?,`date_received`=?,`description`=?"
                    + "     WHERE `id`=?";
                ps= DB.getConnection().prepareStatement(updateQuery);
                 //ps.setString(1, isbn);
                ps.setString(1, name);
                ps.setInt(2, author_id);
                ps.setInt(3, genre_id);
                ps.setInt(4, quantity);
                ps.setString(5, publisher);
                ps.setDouble(6, price);
                ps.setString(7,  date_received);
                ps.setString(8, description);
                //ps.setBytes(9, cover);
                ps.setInt(10, id);
                if (ps.executeUpdate() != 0) {
                    JOptionPane.showMessageDialog(null, "Book Edited", "edit book   ", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Book Not Edited", "edit book", 2);
                }
            }


        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
    //remove book
    public boolean deleteBook(int id){
        String deleteQuery = "DELETE FROM `books` WHERE id =" + id;
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(deleteQuery);
            
            
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Book Deleted", "book deleted", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Not exist the id: " +id, "book deleted", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //show book list
    public ArrayList<Book> bookList(String query){
        
        ArrayList<Book> bList = new ArrayList<>();
        String selectQuery = "Select * from `books`  ";
        ResultSet rs;
        
        
        try {
            if(query.equals("")){
                query = "Select * from `books` ";
            }
            rs = func.getData(query);
            
            Book book;
            
            while(rs.next()){
                book = new Book(rs.getInt(1)
                               ,rs.getString(2)
                               ,rs.getString(3)
                               ,rs.getInt(4)
                               ,rs.getInt(5)
                               ,rs.getInt(6)
                               ,rs.getString(7)
                               ,rs.getDouble(8)
                               ,rs.getString(9)
                               ,rs.getString(10)
                               ,rs.getBytes(11));
                bList.add(book);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bList;
    }
    
    //show 1 book
    public Book showOneBook(int id) throws SQLException {

        String selectQuery = "SELECT * FROM `books` WHERE `id` = "+id;
        
            
           
           ResultSet rs = func.getData(selectQuery);
            
           if(rs.next()){
               return new Book(rs.getInt(1)
                               ,rs.getString(2)
                               ,rs.getString(3)
                               ,rs.getInt(4)
                               ,rs.getInt(5)
                               ,rs.getInt(6)
                               ,rs.getString(7)
                               ,rs.getDouble(8)
                               ,rs.getString(9)
                               ,rs.getString(10)
                               ,rs.getBytes(11));
           }
           else{
               return null;
           }
    }
    
    //craete a function to display the latest 5 books
    public void displayBookCover(JLabel[] labels_tab){
        ResultSet rs;
        Statement st;
        try{
            st = DB.getConnection().createStatement();
            rs = st.executeQuery("SELECT `cover` FROM `books` limit 5");
            byte[] image;
            int i = 0;
            while (rs.next()){
                image = rs.getBytes("cover");
                func.showImage(labels_tab[i].getWidth(),labels_tab[i].getHeight(), image, name, labels_tab[i]);
                i++;
            }
        }
        catch(SQLException ex){
             Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setQuantityMinusOne(int id, int quantity) {
        PreparedStatement ps;
        String updateQuantityQuery;
        try{
            updateQuantityQuery = "UPDATE `books` SET `quantity`= ? WHERE `id`  = ?";
            
            ps = DB.getConnection().prepareStatement(updateQuantityQuery);
            ps.setInt(1, quantity);
            ps.setInt(2, id);
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "This book is set to lost -> The quantity - 1", "Edit Book's Quantity", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Book's Quantity Not Edited", "Edit Book's Quantity", 2);
            }
        }
        catch(SQLException ex){
            
        }
        
        
            
           
           
            
           
    
    }



    
}
