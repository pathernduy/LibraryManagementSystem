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
public class Issue_Book {
    
    private int book_id;
    private int member_id;
    private String status;
    private String issue_date;
    private String return_date;
    private String note;
    Book book = new Book();
    Func_Class func = new Func_Class();
    
    
    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Issue_Book(int book_id, int member_id, String status, String issue_date, String return_date, String note) {
        this.book_id = book_id;
        this.member_id = member_id;
        this.status = status;
        this.issue_date = issue_date;
        this.return_date = return_date;
        this.note = note;
    }

    public Issue_Book() {
    }

    
    
    
    
    
    
    public void addIssue(int book_id, int member_id, String status, String issue_date, String return_date, String note){
        String insertQuery = "INSERT INTO `issue_book`(`book_id`, `member_id`, `status`, `issue_date`, `return_date`, `note`)"
                            + "VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setInt(1, book_id);
            ps.setInt(2, member_id);
            ps.setString(3, status);
            ps.setString(4, issue_date);
            ps.setString(5, return_date);
            ps.setString(6, note);
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Issue Book Added", "issue book", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Issue Book Not Added", "book member", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public boolean checkBookAvailability(int book_id){
        boolean availability = false;
        try {
            Book selectedbook = book.showOneBook(book_id);
            int quantity = selectedbook.getQuantity();
            int countIssue = countData(book_id);
            
            if(quantity > countIssue){
                availability = true;
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return availability;
    }
    
    public int countData(int book_id){
        int total = 0;
        ResultSet rs;
        PreparedStatement ps;
        try{
            ps = DB.getConnection().prepareStatement("SELECT count(*) as total FROM `issue_book` where `book_id` = ? and `status` = 'issued'");
            ps.setInt(1, book_id);
            rs = ps.executeQuery();
            if(rs.next()){
                total = rs.getInt("total");
            }
        }
        catch(SQLException ex){
             Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return total;
    }
    
    public ArrayList<Issue_Book> issuebookList(String status) {
        
        ArrayList<Issue_Book> isbList = new ArrayList<>();
        
        String query;
        if(status.equals("") || status.equals("All")){
            query = "SELECT * FROM `issue_book` ";
        }
        else{
            query = "SELECT * FROM `issue_book` WHERE `status` = '"+status+ "'";
        }
        
        
        try {
            
            
            
            ResultSet rs = func.getData(query);
            
            Issue_Book issbook;
            
        
            while(rs.next()){
                //public Issue_Book(int book_id, int member_id, String status, String issue_date, String return_date, String note)
                issbook = new Issue_Book(rs.getInt(1)
                        ,rs.getInt(2)
                        ,rs.getString(3)
                        ,rs.getString(4)
                        ,rs.getString(5)
                        ,rs.getString(6));
                isbList.add(issbook);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        return isbList;
    }
    
    public void updateIssue(int book_id, int member_id, String status, String issue_date, String return_date, String note){
        String updateQuery = "UPDATE `issue_book` SET `status`=?,`issue_date`=?,`return_date`=?,`note`=? WHERE `book_id`= ? and `member_id`=?";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(updateQuery);
            
            ps.setString(1, status);
            ps.setString(2, issue_date);
            ps.setString(3, return_date);
            ps.setString(4, note);
            ps.setInt(5, book_id);
            ps.setInt(6, member_id);
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Status Updated", "Book Issue ", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Status Book Not Updated", "Book Issue", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     //remove book
    public boolean removeFromIssueTable(int bookid, int memberid, String issued_date){
        String deleteQuery = "DELETE FROM `issue_book` WHERE `book_id` = ? and `member_id` = ? and issue_date = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(deleteQuery);
            ps.setInt(1, bookid);
            ps.setInt(2, memberid);
            ps.setString(3, issued_date);
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Book Issued Deleted", "Issued Book Deleted", 1);
            } else {
                JOptionPane.showMessageDialog(null, "The id: " +bookid+" or the member id:"+memberid+" not exist", "Issued Book Deleted", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
