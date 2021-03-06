/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Forms;

import My_Classes.Func_Class;
import My_Classes.Users;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @user HOME
 */
public class ManageUsersForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageGenresForm
     */
    
    Users user = new Users();
    public ManageUsersForm() {
        initComponents();
        
        
        My_Classes.Func_Class func = new Func_Class();
        func.showImage(60,50,null ,"/My_Image/notepad-117597_960_720.png", jLabel_FormTitle);
        //the table
        jTable_Users.setSelectionBackground(Color.lightGray);
        jTable_Users.setSelectionForeground(Color.white);
        jTable_Users.setRowHeight(30);
        jTable_Users.setShowGrid(true);
        //header of table
        jTable_Users.getTableHeader().setBackground(new Color(42,187,155));
        jTable_Users.getTableHeader().setForeground(Color.white);
        jTable_Users.getTableHeader().setFont(new Font("Verdana",Font.BOLD,20));
        jTable_Users.getTableHeader().setOpaque(false);
        
        
        
        jTextField_ID.setEditable(false);
        jLabel_informError_firstName.setVisible(false);
        jLabel_informError_lastName.setVisible(false);
        jLabel_informError_password.setVisible(false);
        jLabel_informError_username.setVisible(false);
        jLabel_informError_password.setVisible(false);
        jLabel_informError_retypepassword.setVisible(false);
        
        jTable_Users.setDefaultEditor(Object.class, null);
        
        showTableWithUser();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_firstName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Users = new javax.swing.JTable();
        jLabel_informError_firstName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_lastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jLabel_informError_lastName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jPasswordField_RetypePassword = new javax.swing.JPasswordField();
        jLabel_informError_username = new javax.swing.JLabel();
        jLabel_informError_password = new javax.swing.JLabel();
        jLabel_informError_retypepassword = new javax.swing.JLabel();
        jCheckBox_Admin = new javax.swing.JCheckBox();
        jButton_Delete = new javax.swing.JButton();
        jButton_Edit = new javax.swing.JButton();
        jButton_Add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_FormTitle.setBackground(new java.awt.Color(242, 217, 132));
        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Manage User");
        jLabel_FormTitle.setOpaque(true);

        jLabel_CloseForm.setBackground(new java.awt.Color(242, 217, 132));
        jLabel_CloseForm.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_CloseForm.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_CloseForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CloseForm.setText("X");
        jLabel_CloseForm.setOpaque(true);
        jLabel_CloseForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseFormMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("Id:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("First Name:");

        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

        jTextField_firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_firstNameActionPerformed(evt);
            }
        });

        jTable_Users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_UsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Users);

        jLabel_informError_firstName.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel_informError_firstName.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_informError_firstName.setText("*enter the first name");
        jLabel_informError_firstName.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_informError_firstNameMouseMoved(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Last Name:");

        jTextField_lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_lastNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("Username:");

        jTextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsernameActionPerformed(evt);
            }
        });

        jLabel_informError_lastName.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel_informError_lastName.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_informError_lastName.setText("*enter the last name");
        jLabel_informError_lastName.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_informError_lastNameMouseMoved(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setText("Retype Password:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setText("Password:");

        jLabel_informError_username.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel_informError_username.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_informError_username.setText("*enter the username");
        jLabel_informError_username.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_informError_usernameMouseMoved(evt);
            }
        });

        jLabel_informError_password.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel_informError_password.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_informError_password.setText("*enter the password");
        jLabel_informError_password.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_informError_passwordMouseMoved(evt);
            }
        });

        jLabel_informError_retypepassword.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel_informError_retypepassword.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_informError_retypepassword.setText("*enter the retype passoword");
        jLabel_informError_retypepassword.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_informError_retypepasswordMouseMoved(evt);
            }
        });

        jCheckBox_Admin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jCheckBox_Admin.setText("Make this user become an Admin");

        jButton_Delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        jButton_Edit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Edit.setText("Edit");
        jButton_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EditActionPerformed(evt);
            }
        });

        jButton_Add.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Add.setText("Add");
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 1207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_CloseForm, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_informError_firstName)
                            .addComponent(jTextField_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel_informError_lastName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_lastName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_informError_username, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_informError_retypepassword))
                        .addComponent(jPasswordField_RetypePassword)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_informError_password)
                                .addComponent(jPasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jCheckBox_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_CloseForm, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_informError_firstName)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_informError_lastName)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_informError_username)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7)
                                .addGap(44, 44, 44))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_informError_password)
                                .addGap(11, 11, 11)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel_informError_retypepassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordField_RetypePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addComponent(jScrollPane1)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseFormMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseFormMouseClicked

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jTextField_firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_firstNameActionPerformed
        
    }//GEN-LAST:event_jTextField_firstNameActionPerformed

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
        String fname = jTextField_firstName.getText();
        String lname = jTextField_lastName.getText();
        String username = jTextField_Username.getText();
        String password1 = String.valueOf(jPasswordField_Password.getText());
        String password2 = String.valueOf(jPasswordField_RetypePassword.getText());
        String usertype = "user";
        
        if(jCheckBox_Admin.isSelected()){
            usertype = "admin";
        }
        if(fname.trim().isEmpty()){
            jLabel_informError_firstName.setVisible(true);
        }
        else if(lname.trim().isEmpty()){
             jLabel_informError_lastName.setVisible(true);
        }
        else if(username.trim().isEmpty()){
             jLabel_informError_username.setVisible(true);
        }
        else if(password1.trim().isEmpty()){
             jLabel_informError_password.setVisible(true);
        }
        else if(password2.trim().isEmpty()){
             jLabel_informError_retypepassword.setVisible(true);
        }
        else if(!password2.equals(password1)){
             JOptionPane.showMessageDialog(null, "Type your retype password again " , "password error", 0);
        }
        else if(user.checkUsername(username,0)){
             JOptionPane.showMessageDialog(null, "Try another username " , "Already exist username", 0);
        }
        else{
            
            user.addUser(fname, lname, username, password1,usertype);
            //showTableWithAuthor();
        }
    }//GEN-LAST:event_jButton_AddActionPerformed

    
    
    private void jLabel_informError_firstNameMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_informError_firstNameMouseMoved
        jLabel_informError_firstName.setVisible(false);
    }//GEN-LAST:event_jLabel_informError_firstNameMouseMoved

    private void jTable_UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_UsersMouseClicked
        //display the selected one
        int index = jTable_Users.getSelectedRow();
        //get the selected index
        String id = jTable_Users.getValueAt(index, 0).toString();
        String fname = jTable_Users.getValueAt(index, 1).toString();
        String lname = jTable_Users.getValueAt(index, 2).toString();
        String username = jTable_Users.getValueAt(index, 3).toString();
        String password = jTable_Users.getValueAt(index, 4).toString();
        String usertype = jTable_Users.getValueAt(index, 5).toString();
        
        jTextField_ID.setText(id);
        jTextField_firstName.setText(fname);
        jTextField_lastName.setText(lname);
        jTextField_Username.setText(username);
        jPasswordField_Password.setText(password);
        jPasswordField_RetypePassword.setText(password);
        if(usertype.equals("admin")){
            jCheckBox_Admin.setSelected(true);
        }
        else{
            jCheckBox_Admin.setSelected(false);
        }
    }//GEN-LAST:event_jTable_UsersMouseClicked

    private void jTextField_lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_lastNameActionPerformed

    private void jTextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsernameActionPerformed

    private void jLabel_informError_lastNameMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_informError_lastNameMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_informError_lastNameMouseMoved

    private void jButton_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditActionPerformed
        String fname = jTextField_firstName.getText();
        String lname = jTextField_lastName.getText();
        String username = jTextField_Username.getText();
        String password1 = String.valueOf(jPasswordField_Password.getText());
        String password2 = String.valueOf(jPasswordField_RetypePassword.getText());
        String usertype = "user";
        if(jCheckBox_Admin.isSelected()){
            usertype = "admin";
        }
        if(fname.isEmpty()){
            jLabel_informError_firstName.setVisible(true);
        }
        else if(lname.isEmpty()){
            jLabel_informError_lastName.setVisible(true);
        }
        else if(username.isEmpty()){
             jLabel_informError_username.setVisible(true);
        }
        else if(password1.isEmpty()){
             jLabel_informError_password.setVisible(true);
        }
        else if(!password2.equals(password1)){
             JOptionPane.showMessageDialog(null, "Type your retype password again " , "password error", 0);
        }

        else{
            try{
                
                int id = Integer.valueOf(jTextField_ID.getText());
                if(user.checkUsername(username,id)){
                    JOptionPane.showMessageDialog(null, "Try another username " , "Already exist username", 0);
                }
                else{
                    user.editUser(id, fname, lname, username, password1, usertype);
                    showTableWithUser();
                    clearTextField();
                }
                
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Invalid User ID", "No Id Selected", 0);
            }
            
        }
    }//GEN-LAST:event_jButton_EditActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        try{
            int id = Integer.valueOf(jTextField_ID.getText());
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this user?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
                user.deleteUser(id);
            }
            
            showTableWithUser();
            clearTextField();
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Invalid Genre ID - " + ex.getMessage(), "error", 0);
        }
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jLabel_informError_usernameMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_informError_usernameMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_informError_usernameMouseMoved

    private void jLabel_informError_passwordMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_informError_passwordMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_informError_passwordMouseMoved

    private void jLabel_informError_retypepasswordMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_informError_retypepasswordMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_informError_retypepasswordMouseMoved

    //show table
    public void showTableWithUser(){
        ArrayList<Users> userList  = user.userList();
        
        //column names
        String[] colNames = {"ID","F-NAME","L-NAME","U-NAME","PASS","TYPE"};
        
        //row name
        Object[][] rows = new Object[userList .size()][colNames.length]; 
        
        
        for(int i=0; i < userList.size();i++){
            rows[i][0]=userList .get(i).getId();
            rows[i][1]=userList .get(i).getFirstname();
            rows[i][2]=userList .get(i).getLastname();
            rows[i][3]=userList .get(i).getUsername();
            rows[i][4]=userList .get(i).getPassword();
            rows[i][5]=userList .get(i).getUserType();
        }
        
        DefaultTableModel model = new DefaultTableModel(rows,colNames);
        jTable_Users.setModel(model);
                
    }
    
    public void clearTextField(){
        jTextField_ID.setText("");
        jTextField_firstName.setText("");
        jTextField_lastName.setText("");
        jTextField_Username.setText("");
        jPasswordField_Password.setText("");
        jPasswordField_RetypePassword.setText("");
        jCheckBox_Admin.setSelected(false);
        
        jLabel_informError_firstName.setVisible(false);
        jLabel_informError_lastName.setVisible(false);
        jLabel_informError_password.setVisible(false);
        jLabel_informError_retypepassword.setVisible(false);
        jLabel_informError_username.setVisible(false);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUsersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Edit;
    private javax.swing.JCheckBox jCheckBox_Admin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_CloseForm;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_informError_firstName;
    private javax.swing.JLabel jLabel_informError_lastName;
    private javax.swing.JLabel jLabel_informError_password;
    private javax.swing.JLabel jLabel_informError_retypepassword;
    private javax.swing.JLabel jLabel_informError_username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JPasswordField jPasswordField_RetypePassword;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Users;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Username;
    private javax.swing.JTextField jTextField_firstName;
    private javax.swing.JTextField jTextField_lastName;
    // End of variables declaration//GEN-END:variables
}
