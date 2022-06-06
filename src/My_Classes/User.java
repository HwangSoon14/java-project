package My_Classes;

import java.io.InputStream;
import java.nio.file.Files;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nguyễn Văn Khoa
 */
public class User {

    private int Id;
    private String fullName;
    private String country;
    private String phone;
    private String email;
    private String gender;
    private byte[] picture;
    private String role;
    private String taikhoan;
    private String matkhau;

    public User() {
    }

    public User(int id, String fullName, String country, String phone, String email, String gender, byte[] picture , String role) {
        this.Id = id;
        this.fullName = fullName;
        this.country = country;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.picture = picture;
        this.role = role;
    }  
    public User(int id, String fullName, String country, String phone, String email, String gender, byte[] picture , String role , String taikhoan, String matkhau) {
        this.Id = id;
        this.fullName = fullName;
        this.country = country;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.picture = picture;
        this.role = role;
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
    }   
    public User(int id) {
        this.Id = id;
    }   
    
    public String getRole() {
        return role;
    }
 public void setRole(String role) {
        this.role = role;
    }

    public String getFullname() {
        return fullName;
    }

    public void setFullname(String fullName) {
        this.fullName = fullName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }
    
    public String getMaukhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }
    
    public void addMember(String _fullName, String _country, String _phone, String _email, int _gender, byte[] _profileImg , String taikhoan, String matkhau) throws SQLException {
        String insertQuery = "INSERT INTO `user`(`TenNguoiDung`, `QueQuan`, `SoDienThoai`, `Email`, `GioiTinh`, `Profile`, `TaiKhoan`, `MatKhau`, `DiaChi`, `NgaySinh` , `NgayTaoTK` , `NgayHuyTK`, `Role`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
             Date date = new Date(); 
            ps.setString(1, _fullName);
            ps.setString(2, _country);
            ps.setString(3, _phone);
            ps.setString(4, _email);
            ps.setInt(5, _gender);
            ps.setBytes(6, _profileImg);
            ps.setString(7, taikhoan);
            ps.setString(8, matkhau);
            ps.setString(9, "");
            ps.setDate(10,  new java.sql.Date(System.currentTimeMillis()));
          ps.setDate(11,  new java.sql.Date(System.currentTimeMillis()));
          ps.setDate(12,  new java.sql.Date(3* System.currentTimeMillis()));
          ps.setString(13, "user");
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "User Đã Được Thêm", "Thêm User", 1);
            } else {
                JOptionPane.showMessageDialog(null, "User Không Được Thêm", "Thêm User", 0);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Something went wrong", 0);
            Logger.getLogger(CuaHang.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void editMember(Integer _id, String _fullName, String _email, String _phone, String _country, String _gender, byte[] _profileImg, String matkhau , String role) throws SQLException {
        String insertQuery = "UPDATE `user` SET `TenNguoiDung`= ?,`QueQuan`= ?,`SoDienThoai`= ?,`Email`= ?,`GioiTinh`= ?, `Profile` = ?, `MatKhau` = ?, `Role` = ? WHERE `ID_User` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setString(1, _fullName);
             ps.setString(2, _country);
             ps.setString(3, _phone);
            ps.setString(4, _email);
            ps.setInt(5,  1);
             ps.setBytes(6, _profileImg);
            ps.setString(7, matkhau);
            ps.setString(8, role);
            ps.setInt(9, _id);

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "User Đã Được Sửa", "Sửa Người Dùng", 1);
            } else {
                JOptionPane.showMessageDialog(null, "User Chưa Được Sửa", "Sửa Người Dùng", 0);
            }

        } catch (SQLException e) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void deleteMember(int _id) throws SQLException {
        String insertQuery = "DELETE FROM `user` WHERE `id_user` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setInt(1, _id);

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Thanh tra đã được xóa", "Xóa Thanh Tra", 1);
            } else {
//                JOptionPane.showMessageDialog(null, "No Member ID In System", "delete member", 0);
                JOptionPane.showMessageDialog(null, "Thanh tra chưa được xóa", "Xóa Thanh Tra", 1);
            }

        } catch (SQLException e) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, e);
        }
    }


      public User getMemberById(Integer _id) throws SQLException {
        Func_Class func = new Func_Class();
        String Query = "SELECT * FROM `user` WHERE `id_user` = " + _id;
        ResultSet rs = func.getData(Query);

        if (rs.next()) {
            return new User(rs.getInt(1), rs.getString(2), rs.getString(8), rs.getString(5), rs.getString(6), rs.getString(9), rs.getBytes(13), rs.getString(14), rs.getString(3), rs.getString(4));
        } else {
            return null;
        }
    }
      
     public void updateAvatarMember(int _id , InputStream ad) throws SQLException {
        String insertQuery = "UPDATE `user` SET `Profile` = ? WHERE `ID_User` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
           ps.setBinaryStream(1, ad);
           ps.setInt(2, _id);
 
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Avatar Đã Được Thêm", "Cap Nhat AVT", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Avatar Không Được Thêm", "Cap Nhat AVT", 0);
            }

        } catch (SQLException e) {
            Logger.getLogger(CuaHang.class.getName()).log(Level.SEVERE, null, e);
        }
    }
     
     
       


    public ArrayList<User> membersList(String query) {
        ArrayList<User> memLists = new ArrayList<>();   
        My_Classes.Func_Class func = new Func_Class();
      
        try {
            if (query.equals("")) {
            
                  query = "SElect * FROM `user` where `Role` = " + "'user'";
            }
            ResultSet rs = func.getData(query);
            
            User member;
            while (rs.next()) {
                member = new User(rs.getInt("ID_User"), rs.getString("TenNguoiDung"), rs.getString("QueQuan"),
                        rs.getString("SoDienThoai"), rs.getString("Email"), rs.getString("GioiTinh"), rs.getBytes("profile"),rs.getString("Role"));
                memLists.add(member);
            }
        } catch (SQLException sQLException) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, sQLException);
        }
        return memLists;
    }
    
    
}
