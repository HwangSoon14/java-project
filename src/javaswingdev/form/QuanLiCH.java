package javaswingdev.form;
import My_Forms.Quanlychungnhan;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
public class QuanLiCH extends javax.swing.JPanel {
   
           
           My_Classes.CuaHang cuahang = new My_Classes.CuaHang();
    public QuanLiCH() {
        initComponents();
                   populateJtableWithAuthor();


    }

//    public QuanLiCH() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Form_Title = new javax.swing.JLabel();
        jLabel_ID = new javax.swing.JLabel();
        jLabel2_TenCH = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_TenCH = new javax.swing.JTextField();
        jButton_Reset_ = new javax.swing.JButton();
        jButton_Delete_ = new javax.swing.JButton();
        jButton_Edit_ = new javax.swing.JButton();
        jLabel_EmptyTenCH_ = new javax.swing.JLabel();
        jLabel_DiaChi = new javax.swing.JLabel();
        jTextField_DiaChi = new javax.swing.JTextField();
        jLabel_EmptyTenChuCH_ = new javax.swing.JLabel();
        jLabel4_TenChuCH = new javax.swing.JLabel();
        jTextField_TenChuCH = new javax.swing.JTextField();
        jLabel_Hotline = new javax.swing.JLabel();
        jTextField_Hotline = new javax.swing.JTextField();
        jLabel_SLCN = new javax.swing.JLabel();
        jTextField_SLCN = new javax.swing.JTextField();
        jLabel_EmptyDiaChi_ = new javax.swing.JLabel();
        jLabel_EmptyHotline_ = new javax.swing.JLabel();
        jLabel_EmptySLCN_ = new javax.swing.JLabel();
        jButton_Add_1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Author = new javaswingdev.swing.table.Table();

        setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Form_Title.setBackground(new java.awt.Color(102, 69, 142));
        jLabel_Form_Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("QUẢN LÝ CỬA HÀNG");
        jLabel_Form_Title.setOpaque(true);

        jLabel_ID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_ID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_ID.setText("ID:");

        jLabel2_TenCH.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2_TenCH.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2_TenCH.setText("Tên CH:");

        jTextField_ID.setEditable(false);
        jTextField_ID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField_TenCH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton_Reset_.setBackground(new java.awt.Color(153, 153, 153));
        jButton_Reset_.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton_Reset_.setText("RESET");
        jButton_Reset_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Reset_ActionPerformed(evt);
            }
        });

        jButton_Delete_.setBackground(new java.awt.Color(255, 153, 153));
        jButton_Delete_.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton_Delete_.setText("XÓA");
        jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_ActionPerformed(evt);
            }
        });

        jButton_Edit_.setBackground(new java.awt.Color(255, 255, 153));
        jButton_Edit_.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton_Edit_.setText("SỬA");
        jButton_Edit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_ActionPerformed(evt);
            }
        });

        jLabel_EmptyTenCH_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyTenCH_.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_EmptyTenCH_.setText("* Nhập Tên CH");
        jLabel_EmptyTenCH_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyTenCH_MouseClicked(evt);
            }
        });

        jLabel_DiaChi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_DiaChi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_DiaChi.setText("Địa Chỉ:");

        jTextField_DiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel_EmptyTenChuCH_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyTenChuCH_.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_EmptyTenChuCH_.setText("* Nhập tên chủ cửa hàng");
        jLabel_EmptyTenChuCH_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyTenChuCH_MouseClicked(evt);
            }
        });

        jLabel4_TenChuCH.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4_TenChuCH.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4_TenChuCH.setText("Tên Chủ CH");

        jTextField_TenChuCH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_TenChuCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TenChuCHActionPerformed(evt);
            }
        });

        jLabel_Hotline.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_Hotline.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Hotline.setText("Hotline:");

        jTextField_Hotline.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel_SLCN.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_SLCN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_SLCN.setText("SLCN :");

        jTextField_SLCN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_SLCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SLCNActionPerformed(evt);
            }
        });

        jLabel_EmptyDiaChi_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyDiaChi_.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_EmptyDiaChi_.setText("* Nhập địa chỉ");
        jLabel_EmptyDiaChi_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyDiaChi_MouseClicked(evt);
            }
        });

        jLabel_EmptyHotline_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyHotline_.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_EmptyHotline_.setText("* Nhập Hotline");
        jLabel_EmptyHotline_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyHotline_MouseClicked(evt);
            }
        });

        jLabel_EmptySLCN_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptySLCN_.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_EmptySLCN_.setText("* Nhập SL Chứng Nhận");
        jLabel_EmptySLCN_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptySLCN_MouseClicked(evt);
            }
        });

        jButton_Add_1.setBackground(new java.awt.Color(153, 255, 153));
        jButton_Add_1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton_Add_1.setText("THÊM");
        jButton_Add_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_1ActionPerformed(evt);
            }
        });

        jTable_Author.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_Author.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_AuthorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Author);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel_EmptySLCN_, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2_TenCH)
                                            .addComponent(jLabel_DiaChi)
                                            .addComponent(jLabel_SLCN))
                                        .addGap(48, 48, 48)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_EmptyDiaChi_)
                                            .addComponent(jLabel_EmptyTenCH_)
                                            .addComponent(jLabel_EmptyTenChuCH_)
                                            .addComponent(jLabel_EmptyHotline_)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jTextField_SLCN, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jTextField_Hotline, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                                    .addComponent(jTextField_TenCH, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField_TenChuCH, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField_ID, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField_DiaChi, javax.swing.GroupLayout.Alignment.LEADING)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_Hotline)
                                            .addComponent(jLabel4_TenChuCH, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jButton_Add_1)
                                                .addGap(27, 27, 27)
                                                .addComponent(jButton_Delete_)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton_Reset_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton_Edit_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 1360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_ID)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2_TenCH)
                            .addComponent(jTextField_TenCH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_EmptyTenCH_)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4_TenChuCH)
                            .addComponent(jTextField_TenChuCH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_EmptyTenChuCH_)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_DiaChi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyDiaChi_)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Hotline)
                            .addComponent(jTextField_Hotline))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel_EmptyHotline_)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_SLCN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_SLCN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_EmptySLCN_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jButton_Reset_)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Delete_)
                            .addComponent(jButton_Edit_)
                            .addComponent(jButton_Add_1))
                        .addGap(24, 24, 24))
                    .addComponent(jScrollPane2)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Reset_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Reset_ActionPerformed
        jTextField_ID.setText("");
        jTextField_TenCH.setText("");
        jTextField_TenChuCH.setText("");
        jTextField_DiaChi.setText("");
        jTextField_Hotline.setText("");
        jTextField_SLCN.setText("");
    }//GEN-LAST:event_jButton_Reset_ActionPerformed

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_ActionPerformed
        try {
            int id = Integer.parseInt(jTextField_ID.getText());
            cuahang.deleteAuthor(id);
            //refresh the jtable after we delete
            populateJtableWithAuthor();
            jTextField_ID.setText("");
            jTextField_TenCH.setText("");
            jTextField_TenChuCH.setText("");
            jTextField_DiaChi.setText("");
            jTextField_Hotline.setText("");
            jTextField_SLCN.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(QuanLiCH.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Genre ID" + e.getMessage(), "Error", 0);
        }
    }//GEN-LAST:event_jButton_Delete_ActionPerformed

    private void jButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_ActionPerformed

        String TenCH = jTextField_TenCH.getText();
        String TenChuCH = jTextField_TenChuCH.getText();
        String DiaChi = jTextField_DiaChi.getText();
        String Hotline = jTextField_Hotline.getText();
        String SLCN = jTextField_SLCN.getText();

        if (TenCH.isEmpty()) {
            jLabel_EmptyTenCH_.setVisible(true);

        } else if (TenChuCH.isEmpty()) {
            jLabel_EmptyTenChuCH_.setVisible(true);
        }
        else if (DiaChi.isEmpty()) {
            jLabel_EmptyDiaChi_.setVisible(true);
        }
        else if (Hotline.isEmpty()) {
            jLabel_EmptyHotline_.setVisible(true);
        }
        else if (SLCN.isEmpty()) {
            jLabel_EmptySLCN_.setVisible(true);
        }else {
            try {
                try {
                    int id = Integer.parseInt(jTextField_ID.getText());
                    cuahang.editAuthor(id, TenCH, TenChuCH, DiaChi, Hotline, Integer.parseInt(SLCN));
                    //refresh the jtable after we edit
                    populateJtableWithAuthor();

                } catch (SQLException ex) {
                    Logger.getLogger(QuanLiCH.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid Author ID - " + ex.getMessage(), "Error", 0);
            }
        }
    }//GEN-LAST:event_jButton_Edit_ActionPerformed

    private void jLabel_EmptyTenCH_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyTenCH_MouseClicked
        //hide this jlable on click
        jLabel_EmptyTenCH_.setVisible(false);
        jLabel_EmptyTenChuCH_.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyTenCH_MouseClicked

    private void jLabel_EmptyTenChuCH_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyTenChuCH_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptyTenChuCH_MouseClicked

    private void jTextField_TenChuCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TenChuCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TenChuCHActionPerformed

    private void jTextField_SLCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SLCNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SLCNActionPerformed

    private void jLabel_EmptyDiaChi_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyDiaChi_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptyDiaChi_MouseClicked

    private void jLabel_EmptyHotline_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyHotline_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptyHotline_MouseClicked

    private void jLabel_EmptySLCN_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptySLCN_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptySLCN_MouseClicked

    private void jButton_Add_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_1ActionPerformed
        String TenCH = jTextField_TenCH.getText();
        String TenChuCH = jTextField_TenChuCH.getText();
        String DiaChi = jTextField_DiaChi.getText();
        String Hotline = jTextField_Hotline.getText();
        String SLCN = jTextField_SLCN.getText();

        if (TenCH.isEmpty()) {
            jLabel_EmptyTenCH_.setVisible(true);

        } else if (TenChuCH.isEmpty()) {
            jLabel_EmptyTenChuCH_.setVisible(true);
        }
        else if (DiaChi.isEmpty()) {
            jLabel_EmptyDiaChi_.setVisible(true);
        }
        else if (Hotline.isEmpty()) {
            jLabel_EmptyHotline_.setVisible(true);
        }
        else if (SLCN.isEmpty()) {
            jLabel_EmptySLCN_.setVisible(true);
        }else {
            try {
                try {

                    cuahang.addAuthor( TenCH, TenChuCH, DiaChi, Hotline, Integer.parseInt(SLCN));
                    //refresh the jtable after we edit
                    populateJtableWithAuthor();

                } catch (SQLException ex) {
                    Logger.getLogger(QuanLiCH.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid Author ID - " + ex.getMessage(), "Error", 0);
            }
        }
    }//GEN-LAST:event_jButton_Add_1ActionPerformed

    private void jTable_AuthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_AuthorMouseClicked
        // TODO add your handling code here:
         int index = jTable_Author.getSelectedRow();

        //get values;
        String id = jTable_Author.getValueAt(index, 0).toString();
        String firstName = jTable_Author.getValueAt(index, 1).toString();
        String TenChuCH = jTable_Author.getValueAt(index, 2).toString();
        String DiaChi = jTable_Author.getValueAt(index, 3).toString();
        String Hotline = jTable_Author.getValueAt(index, 4).toString();

        //show data in textfield
        jTextField_ID.setText(id);
        jTextField_TenCH.setText(firstName);
        jTextField_TenChuCH.setText(TenChuCH);
        jTextField_DiaChi.setText(DiaChi);
        jTextField_Hotline.setText(Hotline);
    }//GEN-LAST:event_jTable_AuthorMouseClicked
    public void populateJtableWithAuthor() {
        ArrayList<My_Classes.CuaHang> authorsList = cuahang.authorsList();

        //jtable collums
        String[] colNames = {"ID", "TÊN CỬA HÀNG", "CHỦ SỠ HỮU", "ĐỊA CHỈ", "HOTLINE", "SLCN", "ádas", "s"};
        //jtable row
        Object[][] rows = new Object[authorsList.size()][colNames.length];

        for (int i = 0; i < authorsList.size(); i++) {
            rows[i][0] = authorsList.get(i).getId();
            rows[i][1] = authorsList.get(i).getCuaHang();
            rows[i][2] = authorsList.get(i).getTenChuCuaHang();
            rows[i][3] = authorsList.get(i).getDiaChi();
            rows[i][4] = authorsList.get(i).getHotline();
            rows[i][5] = authorsList.get(i).getSLCN();
        }

        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Author.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_1;
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JButton jButton_Edit_;
    private javax.swing.JButton jButton_Reset_;
    private javax.swing.JLabel jLabel2_TenCH;
    private javax.swing.JLabel jLabel4_TenChuCH;
    private javax.swing.JLabel jLabel_DiaChi;
    private javax.swing.JLabel jLabel_EmptyDiaChi_;
    private javax.swing.JLabel jLabel_EmptyHotline_;
    private javax.swing.JLabel jLabel_EmptySLCN_;
    private javax.swing.JLabel jLabel_EmptyTenCH_;
    private javax.swing.JLabel jLabel_EmptyTenChuCH_;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JLabel jLabel_Hotline;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_SLCN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javaswingdev.swing.table.Table jTable_Author;
    private javax.swing.JTextField jTextField_DiaChi;
    private javax.swing.JTextField jTextField_Hotline;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_SLCN;
    private javax.swing.JTextField jTextField_TenCH;
    private javax.swing.JTextField jTextField_TenChuCH;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
