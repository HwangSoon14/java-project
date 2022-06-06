package javaswingdev.form;

import My_Classes.User;
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

public class EditUser extends javax.swing.JPanel {
                
    
    My_Classes.User member = new My_Classes.User();

    My_Classes.Func_Class func = new My_Classes.Func_Class();

    //creat a varible to store the profile picture path
    String imagePath = null;
    byte[] displayImage = null;
    public EditUser() {
        initComponents();
//        jLabel_Image.setBorder(panelImageBorder);

        //display image
        My_Classes.Func_Class func = new My_Classes.Func_Class();
        func.displayImage(60, 60, null, "/My_Images/icons8_edit_user_100px.png", jLabel_Form_Title);

        //hide the jlable "empty name message"
        jLabel_EmptyFirstName_.setVisible(false);
        jLabel_EmptyLastName_.setVisible(false);
        jLabel_EmptyPhone_.setVisible(false); 


    }

//    public EditUser() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
     public void setEmpty() {
        jTextField_ID.setText("");
        jTextField_Fullname.setText("");
        jTextField_Email.setText("");
        jTextField_PhoneNumber.setText("");
        jTextField_Country.setText("");
        jComboBox_Gender.setSelectedItem("Male");
        jTextField_Taikhoan.setText("");
        jTextField_Matkhau.setText("");
        jLabel_ImagePath.setText("please choose profile picture");
        func.displayImage(238, 177, null, null, jLabel_Image);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Close = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_Form_Title = new javax.swing.JLabel();
        jLabel_Fullname = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jButton_Edit_ = new javax.swing.JButton();
        jLabel_EmptyFirstName_ = new javax.swing.JLabel();
        jLabel_Country = new javax.swing.JLabel();
        jTextField_Country = new javax.swing.JTextField();
        jLabel_EmptyPhone_ = new javax.swing.JLabel();
        jLabel_PhoneNumber = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jLabel_Email = new javax.swing.JLabel();
        jTextField_PhoneNumber = new javax.swing.JTextField();
        jLabel_EmptyLastName_ = new javax.swing.JLabel();
        jLabel_Gender = new javax.swing.JLabel();
        jComboBox_Gender = new javax.swing.JComboBox<>();
        jLabel_Profile = new javax.swing.JLabel();
        jButton_SelectProfile = new javax.swing.JButton();
        jLabel_MemberID = new javax.swing.JLabel();
        jButton_SearchID = new javax.swing.JButton();
        jTextField_Fullname = new javax.swing.JTextField();
        jLabel_Image = new javax.swing.JLabel();
        jLabel_ImagePath = new javax.swing.JLabel();
        jLabel_Matkhau = new javax.swing.JLabel();
        jTextField_Taikhoan = new javax.swing.JTextField();
        jLabel_Taikhoan = new javax.swing.JLabel();
        jTextField_Matkhau = new javax.swing.JTextField();
        jLabel_EmptyMatKhau = new javax.swing.JLabel();
        jCheckBox_SetAdmin = new javax.swing.JCheckBox();

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

        jLabel_Form_Title.setBackground(new java.awt.Color(255, 235, 15));
        jLabel_Form_Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(102, 113, 242));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("CHỈNH SỬA THANH TRA");
        jLabel_Form_Title.setOpaque(true);

        jLabel_Fullname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Fullname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Fullname.setText("Nhập Họ Tên:");

        jTextField_ID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton_Edit_.setBackground(new java.awt.Color(255, 235, 15));
        jButton_Edit_.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Edit_.setForeground(new java.awt.Color(102, 113, 242));
        jButton_Edit_.setText("Xác nhận ");
        jButton_Edit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_ActionPerformed(evt);
            }
        });

        jLabel_EmptyFirstName_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyFirstName_.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_EmptyFirstName_.setText("* Nhập Họ Tên");
        jLabel_EmptyFirstName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyFirstName_MouseClicked(evt);
            }
        });

        jLabel_Country.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Country.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Country.setText("Nhập Địa Chỉ:");

        jTextField_Country.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel_EmptyPhone_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyPhone_.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_EmptyPhone_.setText("* Nhập SDT");
        jLabel_EmptyPhone_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyPhone_MouseClicked(evt);
            }
        });

        jLabel_PhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_PhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_PhoneNumber.setText("Nhập SDT:");

        jTextField_Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel_Email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Email.setText("Nhập Email:");

        jLabel_EmptyLastName_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyLastName_.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_EmptyLastName_.setText("* Nhập email");
        jLabel_EmptyLastName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyLastName_MouseClicked(evt);
            }
        });

        jLabel_Gender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Gender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Gender.setText("Giới Tính");

        jComboBox_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel_Profile.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Profile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Profile.setText("Ảnh Đại Diện:");

        jButton_SelectProfile.setText("Chọn Ảnh");
        jButton_SelectProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SelectProfileActionPerformed(evt);
            }
        });

        jLabel_MemberID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_MemberID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_MemberID.setText("NHẬP ID THANH TRA:");

        jButton_SearchID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_SearchID.setText("Tìm Kiếm");
        jButton_SearchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchIDActionPerformed(evt);
            }
        });

        jTextField_Fullname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel_Image.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Image.setOpaque(true);

        jLabel_ImagePath.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel_ImagePath.setForeground(new java.awt.Color(0, 0, 255));
        jLabel_ImagePath.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_ImagePath.setText("Hãy chọn ảnh !");

        jLabel_Matkhau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Matkhau.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Matkhau.setText("Nhập Mật Khẩu:");

        jTextField_Taikhoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_Taikhoan.setEnabled(false);

        jLabel_Taikhoan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Taikhoan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Taikhoan.setText("Tài Khoản :");

        jTextField_Matkhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel_EmptyMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyMatKhau.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_EmptyMatKhau.setText("* Nhập mật khẩu");
        jLabel_EmptyMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyMatKhauMouseClicked(evt);
            }
        });

        jCheckBox_SetAdmin.setText("Trở thành ADMIN");
        jCheckBox_SetAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_SetAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Edit_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField_Email, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_Fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel_MemberID)
                                            .addComponent(jTextField_Fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextField_PhoneNumber))
                                    .addComponent(jLabel_Country, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Email)
                                    .addComponent(jLabel_PhoneNumber)
                                    .addComponent(jLabel_EmptyLastName_, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_EmptyPhone_, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_EmptyFirstName_)
                                    .addComponent(jComboBox_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Country, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_SearchID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextField_Matkhau, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel_ImagePath, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel_Image, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel_Matkhau, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField_Taikhoan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel_Profile)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jButton_SelectProfile))
                                                .addComponent(jLabel_Taikhoan, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(jLabel_EmptyMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCheckBox_SetAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 6, Short.MAX_VALUE))))))
                    .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_MemberID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ID)
                    .addComponent(jButton_SearchID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Fullname)
                    .addComponent(jLabel_Taikhoan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Taikhoan))
                .addGap(18, 18, 18)
                .addComponent(jLabel_EmptyFirstName_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Email)
                            .addComponent(jLabel_Matkhau))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Matkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_EmptyLastName_, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_EmptyMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_PhoneNumber))
                    .addComponent(jCheckBox_SetAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_EmptyPhone_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Country)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Country, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel_Gender)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_SelectProfile)
                            .addComponent(jLabel_Profile))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_ImagePath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Edit_)
                .addContainerGap())
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_ActionPerformed

        String id = jTextField_ID.getText();
        String fullName = jTextField_Fullname.getText();
        String email = jTextField_Email.getText();
        String phone = jTextField_PhoneNumber.getText();
        String country = jTextField_Country.getText();
        String gender = jComboBox_Gender.getSelectedItem().toString();
        String matkhau = jTextField_Matkhau.getText();
        String role = "";
        if(jCheckBox_SetAdmin.isSelected()) {
            role = "admin";
        }
        else {
                        role = "user";
        }
        if (fullName.isEmpty()) {
            jLabel_EmptyFirstName_.setVisible(true);
        } else if (email.isEmpty()) {
            jLabel_EmptyLastName_.setVisible(true);
        } else if (phone.isEmpty()) {
            jLabel_EmptyPhone_.setVisible(true);
        } 
        else if(matkhau.isEmpty()) {
                        jLabel_EmptyMatKhau.setVisible(true);
        }
        else {
            byte[] img = null;

            if (imagePath != null && displayImage == null ) {
                try {
                    Path path = Paths.get(imagePath);
                    if(Files.size(path) > (1024*1024)) {
                        JOptionPane.showMessageDialog(null, "Kích cỡ ảnh không hợp lệ ! ", "Lỗi Ảnh", 0);
                        return;
                    }
                    img = Files.readAllBytes(path);

                    int _id = Integer.parseInt(id);
                    member.editMember(_id, fullName, email, phone, country, gender, img , matkhau , role);
                    setEmpty();
                } catch (IOException ex) {
                    Logger.getLogger(EditUser.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(EditUser.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
            else if(displayImage != null) {
                try {
                                    int _id = Integer.parseInt(id);
                    member.editMember(_id, fullName, email, phone, country, gender, displayImage , matkhau , role);
                                        setEmpty();

                } catch (SQLException ex) {
                    Logger.getLogger(EditUser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Select a profile picture for this member", "no picture selected", 0);
            }
        }
    }//GEN-LAST:event_jButton_Edit_ActionPerformed

    private void jLabel_EmptyFirstName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyFirstName_MouseClicked
        //hide this jlable on click
        jLabel_EmptyFirstName_.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyFirstName_MouseClicked

    private void jLabel_EmptyPhone_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyPhone_MouseClicked
        //hide this jlable on click
        jLabel_EmptyPhone_.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyPhone_MouseClicked

    private void jLabel_EmptyLastName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyLastName_MouseClicked
        //hide this jlable on click
        jLabel_Email.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyLastName_MouseClicked

    private void jButton_SelectProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SelectProfileActionPerformed
        //select pictuer from the PC
        String path = func.selectImage();
        
        if(path != "" ) {
            jLabel_ImagePath.setText(path);
            imagePath = path;
            //display the image when we select in path
            func.displayImage(238, 177, null, path, jLabel_Image);
        }
    }//GEN-LAST:event_jButton_SelectProfileActionPerformed

    private void jButton_SearchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchIDActionPerformed
        //get member ID
        User selectedmMember;
        try {
            //search member by ID and print infor
            Integer id = Integer.parseInt(jTextField_ID.getText());

            selectedmMember = member.getMemberById(id);

            if (selectedmMember != null) {
                jTextField_ID.setText(String.valueOf(selectedmMember.getId()));
                jTextField_Fullname.setText(selectedmMember.getFullname());
                jTextField_Country.setText(selectedmMember.getCountry());
                jTextField_PhoneNumber.setText(selectedmMember.getPhone());
                jTextField_Email.setText(selectedmMember.getEmail());
                jComboBox_Gender.setSelectedItem(selectedmMember.getGender());
                jTextField_Taikhoan.setText(selectedmMember.getTaikhoan());
                jTextField_Matkhau.setText(selectedmMember.getMaukhau());
                
                if(selectedmMember.getRole() == "admin") {
                    jCheckBox_SetAdmin.setSelected(true);
                } else 
                {
                   jCheckBox_SetAdmin.setSelected(false);
                }
                //display image:
                byte[] image = selectedmMember.getPicture();
                //we will display the image using the imagebyte
                //so we will made the image path null
                
                if(image != null) {
                    displayImage = image;
                    func.displayImage(238, 177, image, "", jLabel_Image);
                }

            } else {
                JOptionPane.showMessageDialog(null, "No Member With This ID Found", "invalid id member", 2);
            }

        } catch (SQLException | NumberFormatException ex) {
            //Logger.getLogger(EditMemberForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Enter a valid Member ID", "invalid id member", 3);
        }
    }//GEN-LAST:event_jButton_SearchIDActionPerformed

    private void jLabel_EmptyMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyMatKhauMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptyMatKhauMouseClicked

    private void jCheckBox_SetAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_SetAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_SetAdminActionPerformed
   
     

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EditMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EditMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EditMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EditMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new EditMemberForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Edit_;
    private javax.swing.JButton jButton_SearchID;
    private javax.swing.JButton jButton_SelectProfile;
    private javax.swing.JCheckBox jCheckBox_SetAdmin;
    private javax.swing.JComboBox<String> jComboBox_Gender;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_Country;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_EmptyFirstName_;
    private javax.swing.JLabel jLabel_EmptyLastName_;
    private javax.swing.JLabel jLabel_EmptyMatKhau;
    private javax.swing.JLabel jLabel_EmptyPhone_;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JLabel jLabel_Fullname;
    private javax.swing.JLabel jLabel_Gender;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_ImagePath;
    private javax.swing.JLabel jLabel_Matkhau;
    private javax.swing.JLabel jLabel_MemberID;
    private javax.swing.JLabel jLabel_PhoneNumber;
    private javax.swing.JLabel jLabel_Profile;
    private javax.swing.JLabel jLabel_Taikhoan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_Country;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Fullname;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Matkhau;
    private javax.swing.JTextField jTextField_PhoneNumber;
    private javax.swing.JTextField jTextField_Taikhoan;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
