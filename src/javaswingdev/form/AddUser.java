package javaswingdev.form;
import My_Forms.AddMemberForm;
import My_Forms.Quanlychungnhan;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.sql.SQLException;
import java.nio.file.Files;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.table.DefaultTableModel;
public class AddUser extends javax.swing.JPanel {
                
    
    My_Classes.User member = new My_Classes.User();

    My_Classes.Func_Class func = new My_Classes.Func_Class();

    //creat a varible to store the profile picture path
    String imagePath = null;
           
    public AddUser() {
        initComponents();
              


    }

//    public AddUser() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_TaiKhoan = new javax.swing.JLabel();
        jTextField_Fullname = new javax.swing.JTextField();
        jButton_Add_ = new javax.swing.JButton();
        jLabel_EmptyMatkhau = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jLabel_EmptyEmail_ = new javax.swing.JLabel();
        jLabel_PhoneNumber = new javax.swing.JLabel();
        jTextField_Country = new javax.swing.JTextField();
        jLabel_Country = new javax.swing.JLabel();
        jTextField_PhoneNumber = new javax.swing.JTextField();
        jLabel_EmptyCountry_ = new javax.swing.JLabel();
        jLabel_Gender = new javax.swing.JLabel();
        jComboBox_Gender = new javax.swing.JComboBox<>();
        jLabel_Profile = new javax.swing.JLabel();
        jLabel_ImagePath = new javax.swing.JLabel();
        jButton_SelectProfile = new javax.swing.JButton();
        jLabel_EmptyPhone_ = new javax.swing.JLabel();
        jTextField_TaiKhoan = new javax.swing.JTextField();
        jLabel_Fullname = new javax.swing.JLabel();
        jLabel_MatKhau = new javax.swing.JLabel();
        jLabel_EmptyTaikhoan = new javax.swing.JLabel();
        jLabel_EmptyFullname = new javax.swing.JLabel();
        jPasswordField_Matkhau = new javax.swing.JPasswordField();
        jLabel_Form_Title = new javax.swing.JLabel();

        setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(502, 783));

        jLabel_TaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_TaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_TaiKhoan.setText("Tài Khoản");

        jTextField_Fullname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_Fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FullnameActionPerformed(evt);
            }
        });

        jButton_Add_.setBackground(new java.awt.Color(0, 202, 146));
        jButton_Add_.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Add_.setForeground(new java.awt.Color(102, 102, 255));
        jButton_Add_.setText("Xác Nhận");
        jButton_Add_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ActionPerformed(evt);
            }
        });

        jLabel_EmptyMatkhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyMatkhau.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_EmptyMatkhau.setText("* Hãy nhập mật khẩu");
        jLabel_EmptyMatkhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyMatkhauMouseClicked(evt);
            }
        });

        jLabel_Email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Email.setText("Email:");

        jTextField_Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel_EmptyEmail_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyEmail_.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_EmptyEmail_.setText("* Hãy nhập Email");
        jLabel_EmptyEmail_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyEmail_MouseClicked(evt);
            }
        });

        jLabel_PhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_PhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_PhoneNumber.setText("Số Điện Thoại");

        jTextField_Country.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel_Country.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Country.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Country.setText("Que Quan:");

        jLabel_EmptyCountry_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyCountry_.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_EmptyCountry_.setText("* Hãy nhập que quan");
        jLabel_EmptyCountry_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyCountry_MouseClicked(evt);
            }
        });

        jLabel_Gender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Gender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Gender.setText("Giới Tính");

        jComboBox_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel_Profile.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Profile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Profile.setText("Ảnh đại diện");

        jLabel_ImagePath.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel_ImagePath.setForeground(new java.awt.Color(0, 0, 255));
        jLabel_ImagePath.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_ImagePath.setText("* Hãy chọn ảnh đại diện !");

        jButton_SelectProfile.setText("Chọn ảnh");
        jButton_SelectProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SelectProfileActionPerformed(evt);
            }
        });

        jLabel_EmptyPhone_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyPhone_.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_EmptyPhone_.setText("* Hãy nhập số điện thoại");
        jLabel_EmptyPhone_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyPhone_MouseClicked(evt);
            }
        });

        jTextField_TaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_TaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TaiKhoanActionPerformed(evt);
            }
        });

        jLabel_Fullname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Fullname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Fullname.setText("Họ Tên");

        jLabel_MatKhau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_MatKhau.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_MatKhau.setText("Mật Khẩu");

        jLabel_EmptyTaikhoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyTaikhoan.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_EmptyTaikhoan.setText("* Hãy nhập tài khoản:");
        jLabel_EmptyTaikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyTaikhoanMouseClicked(evt);
            }
        });

        jLabel_EmptyFullname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyFullname.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_EmptyFullname.setText("* Hãy nhập tên Thanh tra:");
        jLabel_EmptyFullname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyFullnameMouseClicked(evt);
            }
        });

        jPasswordField_Matkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_MatkhauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Add_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBox_Gender, javax.swing.GroupLayout.Alignment.LEADING, 0, 364, Short.MAX_VALUE)
                                        .addComponent(jTextField_PhoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_Fullname, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_TaiKhoan, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(275, 275, 275)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_EmptyTaikhoan)
                            .addComponent(jLabel_Fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_EmptyFullname)
                            .addComponent(jLabel_PhoneNumber)
                            .addComponent(jLabel_EmptyPhone_)
                            .addComponent(jLabel_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(422, 422, 422)
                                .addComponent(jLabel_Country)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(413, 413, 413)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_EmptyMatkhau)
                                    .addComponent(jLabel_EmptyCountry_)
                                    .addComponent(jLabel_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_EmptyEmail_)
                                    .addComponent(jLabel_Profile)
                                    .addComponent(jButton_SelectProfile)
                                    .addComponent(jLabel_ImagePath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPasswordField_Matkhau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                                        .addComponent(jTextField_Email, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_Country, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_TaiKhoan)
                    .addComponent(jLabel_MatKhau))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_Matkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_EmptyTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_EmptyMatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Fullname)
                    .addComponent(jLabel_Country))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Country, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_EmptyFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_EmptyCountry_))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel_PhoneNumber))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Email)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_EmptyPhone_)
                    .addComponent(jLabel_EmptyEmail_))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Profile)
                    .addComponent(jLabel_Gender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_SelectProfile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_ImagePath)
                .addGap(24, 24, 24)
                .addComponent(jButton_Add_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jLabel_Form_Title.setBackground(new java.awt.Color(0, 202, 146));
        jLabel_Form_Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(102, 102, 255));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("THÊM THANH TRA");
        jLabel_Form_Title.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_FullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FullnameActionPerformed

    private void jButton_Add_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_ActionPerformed
        String fullname = jTextField_Fullname.getText();
        String country = jTextField_Country.getText();
        String phone = jTextField_PhoneNumber.getText();
        String email = jTextField_Email.getText();
        String taikhoan = jTextField_TaiKhoan.getText();
        String matkhau = jPasswordField_Matkhau.getText();
        String gender = jComboBox_Gender.getSelectedItem().toString();
        int genderNumber;
        //         My_Classes.Func_Class func = new My_Classes.Func_Class();
        if("Male".equals(gender)) {
            genderNumber = 0;
        }
        else {
            genderNumber = 1;
        }

        if (fullname.isEmpty()) {
            jLabel_EmptyMatkhau.setVisible(true);

        } else if (country.isEmpty()) {
            jLabel_EmptyCountry_.setVisible(true);
        } else if (phone.isEmpty()) {
            jLabel_EmptyPhone_.setVisible(true);
        }
        else if (email.isEmpty()) {
            jLabel_EmptyEmail_.setVisible(true);
        }  else if (taikhoan.isEmpty()) {
            jLabel_EmptyTaikhoan.setVisible(true);
        } else if (matkhau.isEmpty()) {
            jLabel_EmptyMatkhau.setVisible(true);
        }else {
            byte[] img = null;

            if (imagePath != null) {

                try {
                    Path path = Paths.get(imagePath);
                    System.out.println("path add button"+path);
                    if(Files.size(path) > (1024*1024)) {
                        JOptionPane.showMessageDialog(null, "Kích cỡ ảnh không hợp lệ ! ", "Lỗi Ảnh", 0);
                        return;
                    }
                    img = Files.readAllBytes(path);
                    member.addMember(fullname, country, phone, email, genderNumber, img , taikhoan , matkhau);
                    setEmpty();
                } catch (IOException ex) {
                    Logger.getLogger(AddMemberForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(AddMemberForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Select a profile picture for this member", "no picture selected", 0);
            }
        }
    }//GEN-LAST:event_jButton_Add_ActionPerformed

    private void jLabel_EmptyMatkhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyMatkhauMouseClicked
        //hide this jlable on click
        jLabel_EmptyMatkhau.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyMatkhauMouseClicked

    private void jLabel_EmptyEmail_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyEmail_MouseClicked
        //hide this jlable on click
        jLabel_EmptyEmail_.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyEmail_MouseClicked

    private void jLabel_EmptyCountry_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyCountry_MouseClicked
        //hide this jlable on click
        jLabel_Country.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyCountry_MouseClicked

    private void jButton_SelectProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SelectProfileActionPerformed
        //select pictuer from the PC
        String path = func.selectImage();
        jLabel_ImagePath.setText(path);
        imagePath = path;
        System.out.println("path selectprofile button"+path);
    }//GEN-LAST:event_jButton_SelectProfileActionPerformed

    private void jLabel_EmptyPhone_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyPhone_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptyPhone_MouseClicked

    private void jTextField_TaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TaiKhoanActionPerformed

    private void jLabel_EmptyTaikhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyTaikhoanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptyTaikhoanMouseClicked

    private void jLabel_EmptyFullnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyFullnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptyFullnameMouseClicked

    private void jPasswordField_MatkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_MatkhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_MatkhauActionPerformed
   
      public void setEmpty() {
        jTextField_Fullname.setText("");
        jTextField_Country.setText("");
        jTextField_PhoneNumber.setText("");
        jTextField_Email.setText("");
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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMemberForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_;
    private javax.swing.JButton jButton_SelectProfile;
    private javax.swing.JComboBox<String> jComboBox_Gender;
    private javax.swing.JLabel jLabel_Country;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_EmptyCountry_;
    private javax.swing.JLabel jLabel_EmptyEmail_;
    private javax.swing.JLabel jLabel_EmptyFullname;
    private javax.swing.JLabel jLabel_EmptyMatkhau;
    private javax.swing.JLabel jLabel_EmptyPhone_;
    private javax.swing.JLabel jLabel_EmptyTaikhoan;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JLabel jLabel_Fullname;
    private javax.swing.JLabel jLabel_Gender;
    private javax.swing.JLabel jLabel_ImagePath;
    private javax.swing.JLabel jLabel_MatKhau;
    private javax.swing.JLabel jLabel_PhoneNumber;
    private javax.swing.JLabel jLabel_Profile;
    private javax.swing.JLabel jLabel_TaiKhoan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_Matkhau;
    private javax.swing.JTextField jTextField_Country;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Fullname;
    private javax.swing.JTextField jTextField_PhoneNumber;
    private javax.swing.JTextField jTextField_TaiKhoan;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
