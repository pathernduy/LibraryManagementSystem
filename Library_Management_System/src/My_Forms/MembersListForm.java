/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Forms;

import My_Classes.Author;
import My_Classes.Func_Class;
import My_Classes.Genre;
import My_Classes.Member;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author HOME
 */
public class MembersListForm extends javax.swing.JFrame {

    /**
     * Creates new form MembersListForm
     */
    Member member = new Member();
    Func_Class func = new Func_Class();
    public MembersListForm() {
        initComponents();
        func.customTableHeader(jTable_Member,new Color(42,187,155) , 16);
        func.showImage(jLabel_Image.getWidth(), jLabel_Image.getHeight(), null, "/My_Image/blank-profile-picture-g38e2328bd_1280.png", jLabel_Image);
        
        showTableWithMember("");
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
        jLabel2 = new javax.swing.JLabel();
        jTextField_Value = new javax.swing.JTextField();
        jButton_SearchId = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Member = new javax.swing.JTable();
        jLabel_Image = new javax.swing.JLabel();
        jLabel_FullName = new javax.swing.JLabel();
        jLabel_Gender = new javax.swing.JLabel();
        jLabel_Phone = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        jLabel_CloseForm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_FormTitle.setBackground(new java.awt.Color(1, 152, 117));
        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Member List");
        jLabel_FormTitle.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Value to search:");

        jTextField_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ValueActionPerformed(evt);
            }
        });

        jButton_SearchId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_SearchId.setText("Search");
        jButton_SearchId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchIdActionPerformed(evt);
            }
        });

        jTable_Member.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_MemberMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Member);

        jLabel_Image.setBackground(new java.awt.Color(255, 255, 102));
        jLabel_Image.setOpaque(true);

        jLabel_FullName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel_FullName.setText("Full Name:");

        jLabel_Gender.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel_Gender.setText("Gender:");

        jLabel_Phone.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel_Phone.setText("Phone:");

        jLabel_Email.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel_Email.setText("Email:");

        jLabel_CloseForm.setBackground(new java.awt.Color(1, 152, 117));
        jLabel_CloseForm.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_CloseForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CloseForm.setText("X");
        jLabel_CloseForm.setOpaque(true);
        jLabel_CloseForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseFormMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton_SearchId, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_FullName)
                    .addComponent(jLabel_Gender)
                    .addComponent(jLabel_Phone)
                    .addComponent(jLabel_Email))
                .addGap(114, 114, 114))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 1023, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel_CloseForm, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_CloseForm, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_SearchId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel_FullName)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel_Phone)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel_Email)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Gender)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseFormMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseFormMouseClicked

    private void jTextField_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ValueActionPerformed

    }//GEN-LAST:event_jTextField_ValueActionPerformed
    
    //show table of member
    public void showTableWithMember(String query){
        ArrayList<Member> memList  = member.memberList(query);
        
        //column names
        String[] colNames = {"ID","FISTNAME","LASTNAME","PHONE","EMAIL","GENDER","PICTURE"};
        
        //row name
        Object[][] rows = new Object[memList .size()][colNames.length]; 
        
        
        for(int i=0; i < memList.size();i++){
            rows[i][0]=memList .get(i).getId();
            rows[i][1]=memList .get(i).getFirstName();
            rows[i][2]=memList .get(i).getLastName();
            rows[i][3]=memList .get(i).getPhone();
            rows[i][4]=memList .get(i).getEmail();
            rows[i][5]=memList .get(i).getGender();
            rows[i][6]=memList .get(i).getPicture();
        }
        
        DefaultTableModel model = new DefaultTableModel(rows,colNames);
        jTable_Member.setModel(model);
        
    }
    
    private void jButton_SearchIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchIdActionPerformed
        //search and display data on the jtable
        String value = jTextField_Value.getText();
        String query = "SELECT * FROM `members` WHERE `firstName` LIKE '%"+value+"%' OR `lastName` LIKE '%"+value+"%' ";
        showTableWithMember(query);
    }//GEN-LAST:event_jButton_SearchIdActionPerformed

    private void jTable_MemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_MemberMouseClicked
        Member memberSelected;
        try {
            //search id and show data
            Integer rowIndex = jTable_Member.getSelectedRow();
            Integer id = Integer.parseInt(jTable_Member.getModel().getValueAt(rowIndex, 0).toString());
            
            //select member id
            Member selectMemberId = member.showOneMember(id);
            if(selectMemberId != null){
                jLabel_FullName.setText(selectMemberId.getFirstName()+" "+selectMemberId.getLastName());
                jLabel_Phone.setText(selectMemberId.getPhone());
                jLabel_Email.setText(selectMemberId.getEmail());
                jLabel_Gender.setText(selectMemberId.getGender());

                byte[] image = selectMemberId.getPicture();

                func.showImage(160,200,image ,"", jLabel_Image);
            }
            else {
                JOptionPane.showMessageDialog(null, "There is not existed the id: "+id, "Invalid", 3);
            }
        } catch (SQLException | NumberFormatException ex) {
            //Logger.getLogger(EditMemberForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Enter a valid Member id", "Invalid", 3);
        }
    }//GEN-LAST:event_jTable_MemberMouseClicked

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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MembersListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MembersListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MembersListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MembersListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MembersListForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_SearchId;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_CloseForm;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_FullName;
    private javax.swing.JLabel jLabel_Gender;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_Phone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Member;
    private javax.swing.JTextField jTextField_Value;
    // End of variables declaration//GEN-END:variables
}