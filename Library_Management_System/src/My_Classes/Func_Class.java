/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author HOME
 */
public class Func_Class {
    
    Func_Class func;
    
    public void showImage(int width, int height, byte[] imagebyte , String imgpath,JLabel label ){
        
        //get the image from source
        ImageIcon img = null;
        if(imagebyte != null){//get image using byte
            img = new ImageIcon(imagebyte);
        }
        else{//get image using path
            img = new ImageIcon(imgpath);
        }
        
        //make image fit to frame
        Image image = img.getImage().getScaledInstance(width, height,Image.SCALE_SMOOTH);
        
        //set image to the frame
        label.setIcon(new ImageIcon(image));
    }
    

    
     public void customTableHeader(JTable jtable, Color backgroundColor,Integer fontsize){
        jtable.getTableHeader().setBackground(backgroundColor);
        jtable.getTableHeader().setForeground(Color.white);
        jtable.getTableHeader().setFont(new Font("Verdana",Font.BOLD,fontsize));
        jtable.getTableHeader().setOpaque(false);
                
                
    }
     
    public ResultSet getData(String query){
        ResultSet rs = null;
        PreparedStatement ps;
        try {
            ps = DB.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            

        } catch (SQLException ex) {
            Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public String selectImage(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Profile Picture");
        
        fileChooser.setCurrentDirectory(new File ("C:\\Users\\HOME\\Desktop\\anh"));
        
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Images",".png",".jpg","jpeg");
        fileChooser.addChoosableFileFilter(extensionFilter);
        
       // byte[] image ;
        int filestate = fileChooser.showSaveDialog(null);
        String path="";
        if(filestate == JFileChooser.APPROVE_OPTION){
            path = fileChooser.getSelectedFile().getAbsolutePath();

        }
        return path;
    }
    
    //create a function to count data row
    public int countData(String tableName) throws SQLException{
        int total = 0;
        ResultSet rs;
        Statement st;
        try{
            st = DB.getConnection().createStatement();
            rs = st.executeQuery("SELECT count(*) as total FROM `"+  tableName +"`");
            if(rs.next()){
                total = rs.getInt("total");
            }
        }
        catch(SQLException ex){
             Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return total;
    }
    
    
}
