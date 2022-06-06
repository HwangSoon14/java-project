package javaswingdev.form;

import My_Classes.User;
import My_Forms.DeleteMemberForm;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;

public class DeleteUser extends javax.swing.JPanel {
                
    
 
    My_Classes.User member = new My_Classes.User();

    //creat a varible to store the profile picture path
    String imagePath = null;
           
    public DeleteUser() {
        initComponents();
//        jLabel_Image.setBorder(panelImageBorder);

        //display image
        My_Classes.Func_Class func = new My_Classes.Func_Class();
        func.displayImage(60, 60, null, "/My_Images/icons8_delete_male_user_100px_1.png", jLabel_Form_Title);

   
       jLabel_EmptyID_.setVisible(false);


    }

//    public DeleteUser() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
      public void setEmpty() {
        jTextField_ID.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Close = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_Form_Title = new javax.swing.JLabel();
        jLabel_Close1 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jButton_Delete_ = new javax.swing.JButton();
        jLabel_MemberID = new javax.swing.JLabel();
        jLabel_EmptyID_ = new javax.swing.JLabel();

        jLabel_Close.setBackground(new java.awt.Color(255, 235, 15));
        jLabel_Close.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_Close.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Close.setText("X");
        jLabel_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Close.setOpaque(true);
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
        });

        setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Form_Title.setBackground(new java.awt.Color(255, 153, 153));
        jLabel_Form_Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(255, 255, 153));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("XÓA THANH TRA");
        jLabel_Form_Title.setOpaque(true);

        jLabel_Close1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel_Close1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_Close1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_Close1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Close1.setText("X");
        jLabel_Close1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Close1.setOpaque(true);
        jLabel_Close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Close1MouseClicked(evt);
            }
        });

        jTextField_ID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton_Delete_.setBackground(new java.awt.Color(255, 153, 153));
        jButton_Delete_.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Delete_.setForeground(new java.awt.Color(255, 255, 153));
        jButton_Delete_.setText("Xác Nhận");
        jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_ActionPerformed(evt);
            }
        });

        jLabel_MemberID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_MemberID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_MemberID.setText("NHẬP IDTT:");

        jLabel_EmptyID_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyID_.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_EmptyID_.setText("* Nhập ID thanh tra");
        jLabel_EmptyID_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyID_MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Close1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel_MemberID)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel_EmptyID_)
                        .addGap(0, 320, Short.MAX_VALUE))
                    .addComponent(jButton_Delete_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Close1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_MemberID)
                    .addComponent(jTextField_ID)
                    .addComponent(jLabel_EmptyID_))
                .addGap(88, 88, 88)
                .addComponent(jButton_Delete_)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jLabel_Close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Close1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_Close1MouseClicked

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_ActionPerformed

        try {
            Integer id = Integer.parseInt(jTextField_ID.getText());

            //creat a confirm form for sure that we want to delete User
            int confirm = JOptionPane.showConfirmDialog(null, "Bạn Có Chắc Chắn Muốn Xóa Người Dùng Này Không ?",
                "XÁC NHẬN", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                member.deleteMember(id);
                setEmpty();
                jLabel_EmptyID_.setVisible(false);
            } else if (confirm == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "HỦY", "XÓA THANH TRA", 1);
            }

        } catch (NumberFormatException | SQLException e) {
            jLabel_EmptyID_.setVisible(true);
            JOptionPane.showMessageDialog(null, "HÃY NHẬP ID HỢP LỆ", "ID KHÔNG HỢP LỆ", 3);
        }
    }//GEN-LAST:event_jButton_Delete_ActionPerformed

    private void jLabel_EmptyID_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyID_MouseClicked
        //hide this jlable on click
        jLabel_EmptyID_.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyID_MouseClicked
   
     

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
            java.util.logging.Logger.getLogger(DeleteMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteMemberForm().setVisible(true);
            }
        });
    }
     private customDefaultUI.TextField txttest ;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_Close1;
    private javax.swing.JLabel jLabel_EmptyID_;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JLabel jLabel_MemberID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_ID;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
