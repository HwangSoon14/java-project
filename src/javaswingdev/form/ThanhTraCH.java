package javaswingdev.form;
import My_Classes.User;
import My_Forms.AuthorListForm;
import My_Forms.MembersListForm;
import My_Forms.MembersListForm_Choose;
import java.awt.Color;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class ThanhTraCH extends javax.swing.JPanel {
                
    
     My_Classes.User member = new My_Classes.User();
    My_Classes.Func_Class func = new My_Classes.Func_Class();

    
    public ThanhTraCH() {
        initComponents();
        Border JlaBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);

        //add a default image
    }

public static void displayIdCuaHang(int id , String name) {
        jLabel_ID_CuaHang.setText(String.valueOf(id));
        jTextField_CuaHang.setText(name);
    }
    
    //display member in the jtextfield_member by id and fullname
    public static void displayMemberData(int id, String fullName) {
        jLabel_ID_ThanhTra.setText(String.valueOf(id));
        jTextField_ThanhTra.setText(fullName);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Form_Title = new javax.swing.JLabel();
        jLabel_IDCuaHang = new javax.swing.JLabel();
        jTextField_CuaHang = new javax.swing.JTextField();
        jLabel_IDThanhTra = new javax.swing.JLabel();
        jLabel_DateThanhTra = new javax.swing.JLabel();
        jLabel_MoTa = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField_Book_Mota = new javax.swing.JTextField();
        jButton_LapKeHoach = new javax.swing.JButton();
        jDateChooser_DateRecived = new com.toedter.calendar.JDateChooser();
        jButton_Select_CuaHang = new javax.swing.JButton();
        jLabel_ID_CuaHang = new javax.swing.JLabel();
        jLabel_ID_ThanhTra = new javax.swing.JLabel();
        jButton_Clear = new javax.swing.JButton();
        jButton_Select_ThanhTra = new javax.swing.JButton();
        jTextField_ThanhTra = new javax.swing.JTextField();

        setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Form_Title.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_Form_Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(255, 255, 153));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("LẬP KẾ HOẠCH THANH TRA");
        jLabel_Form_Title.setOpaque(true);

        jLabel_IDCuaHang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_IDCuaHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_IDCuaHang.setText("IDCH");

        jTextField_CuaHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_CuaHang.setEnabled(false);
        jTextField_CuaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CuaHangActionPerformed(evt);
            }
        });

        jLabel_IDThanhTra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_IDThanhTra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_IDThanhTra.setText("IDTT");

        jLabel_DateThanhTra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_DateThanhTra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_DateThanhTra.setText("Ngày Thanh Tra");

        jLabel_MoTa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_MoTa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_MoTa.setText("Mô tả chi tiết :");

        jTextField_Book_Mota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_Book_Mota.setActionCommand("<Not Set>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField_Book_Mota, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField_Book_Mota, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton_LapKeHoach.setBackground(new java.awt.Color(102, 102, 102));
        jButton_LapKeHoach.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_LapKeHoach.setForeground(new java.awt.Color(255, 255, 153));
        jButton_LapKeHoach.setText("LẬP KẾ HOẠCH");
        jButton_LapKeHoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LapKeHoachActionPerformed(evt);
            }
        });

        jButton_Select_CuaHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Select_CuaHang.setText("Chọn Cửa Hàng");
        jButton_Select_CuaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Select_CuaHangActionPerformed(evt);
            }
        });

        jLabel_ID_CuaHang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_ID_CuaHang.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_ID_CuaHang.setText("ID");

        jLabel_ID_ThanhTra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_ID_ThanhTra.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_ID_ThanhTra.setText("ID");

        jButton_Clear.setBackground(new java.awt.Color(102, 102, 102));
        jButton_Clear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Clear.setForeground(new java.awt.Color(255, 255, 153));
        jButton_Clear.setText("CLEAR");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        jButton_Select_ThanhTra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Select_ThanhTra.setText("Chọn Thanh Tra");
        jButton_Select_ThanhTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Select_ThanhTraActionPerformed(evt);
            }
        });

        jTextField_ThanhTra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_ThanhTra.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jButton_LapKeHoach, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_IDCuaHang)
                                    .addComponent(jLabel_IDThanhTra, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_CuaHang, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(jTextField_ThanhTra))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel_ID_ThanhTra, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton_Select_ThanhTra))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel_ID_CuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_Select_CuaHang))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_DateThanhTra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(jDateChooser_DateRecived, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_MoTa)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_MoTa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel_IDCuaHang))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_CuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_ID_CuaHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jButton_Select_CuaHang)))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_IDThanhTra)
                            .addComponent(jTextField_ThanhTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_ID_ThanhTra)
                            .addComponent(jButton_Select_ThanhTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser_DateRecived, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_DateThanhTra))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Clear)
                            .addComponent(jButton_LapKeHoach))
                        .addGap(48, 48, 48))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LapKeHoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LapKeHoachActionPerformed

        //        try {
            //            //add a new Book
            //
            //
            //
            //            if (!verif()) {
                //                JOptionPane.showMessageDialog(null, "One Or More Fields Is Empty", "empty data", 2);
                //            }  else {
                //                try {
                    //
                    //
                    //                    String desciption = jTextField_Book_Description.getText();
                    //
                    //                    Integer author_id = Integer.parseInt(jLabel_ID_Author.getText());   //get the id author
                    //                    Integer member_id = Integer.parseInt(jLabel_ID_member.getText());     //get the id genre
                    //
                    //
                    //                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    //                    String received_Date = dateFormat.format(jDateChooser_DateRecived.getDate());
                    //
                    //
                    //
                    ////                    book.addBook(ibsn, name, author_id, member_id, quanlity, publisher, price, received_Date, desciption, img);
                    //                } catch (IOException ex) {
                    //                    JOptionPane.showMessageDialog(null, "Make Sure To Add A ImageCover", "No cover image found", 2);
                    //                } catch (NumberFormatException ex) {
                    //                    JOptionPane.showMessageDialog(null, "You Enterred Wrong Data In A Number Field", "Wrong data number", 2);
                    //                } catch (NullPointerException ex) {
                    //                    JOptionPane.showMessageDialog(null, "You Need To Select A Date", "Select date", 2);
                    //                }
                //            }
            //            //get the image bytes
            //
            //            //we will add a new column id and we will make it the primary key
            //        } catch (SQLException ex) {
            //            Logger.getLogger(AddBookForm.class.getName()).log(Level.SEVERE, null, ex);
            //        }
    }//GEN-LAST:event_jButton_LapKeHoachActionPerformed
    
    
    
    private void jButton_Select_CuaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Select_CuaHangActionPerformed
        //show a form
        //the form will have a jtable populated with author
        //the user can select the author from the table and it will displayed in the jtextfield

        AuthorListForm authorListForm = new AuthorListForm();
        authorListForm.setVisible(true);

    }//GEN-LAST:event_jButton_Select_CuaHangActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed

        jTextField_CuaHang.setText("");
        jDateChooser_DateRecived.setDateFormatString("askjdhajs");
        jTextField_Book_Mota.setText("");
        jTextField_ThanhTra.setText("");    
       

    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jButton_Select_ThanhTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Select_ThanhTraActionPerformed
        // TODO add your handling code here:
        MembersListForm_Choose membersListForm_Choose = new MembersListForm_Choose();
        membersListForm_Choose.setVisible(true);
    }//GEN-LAST:event_jButton_Select_ThanhTraActionPerformed

    private void jTextField_CuaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CuaHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CuaHangActionPerformed
   
    

    
  
    
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
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_LapKeHoach;
    private javax.swing.JButton jButton_Select_CuaHang;
    private javax.swing.JButton jButton_Select_ThanhTra;
    private com.toedter.calendar.JDateChooser jDateChooser_DateRecived;
    private javax.swing.JLabel jLabel_DateThanhTra;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JLabel jLabel_IDCuaHang;
    private javax.swing.JLabel jLabel_IDThanhTra;
    private static javax.swing.JLabel jLabel_ID_CuaHang;
    private static javax.swing.JLabel jLabel_ID_ThanhTra;
    private javax.swing.JLabel jLabel_MoTa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_Book_Mota;
    private static javax.swing.JTextField jTextField_CuaHang;
    private static javax.swing.JTextField jTextField_ThanhTra;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
