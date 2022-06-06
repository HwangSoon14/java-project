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
 * @author Nguyễn Văn Khoa
 */
public class CuaHang {

    private int id;
    private String TenCuaHang;
    private String TenChuCuaHang;
    private String DiaChi;
    private String Hotline;
    private String SLCN;
    
    public CuaHang() {
    }

    public CuaHang(int id, String TenCuaHang, String TenChuCuaHang, String DiaChi, String Hotline, String SLCN) {
        this.id = id;
        this.TenCuaHang = TenCuaHang;
        this.TenChuCuaHang = TenChuCuaHang;
        this.DiaChi = DiaChi;
        this.Hotline = Hotline;
        this.SLCN = SLCN;
    }
    public CuaHang(int id) {
        this.id = id;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCuaHang() {
        return TenCuaHang;
    }

    public void setCuaHang(String TenCuaHang) {
        this.TenCuaHang = TenCuaHang;
    }

    public String getTenChuCuaHang() {
        return TenChuCuaHang;
    }

    public void setTenChuCuaHang(String TenChuCuaHang) {
        this.TenChuCuaHang = TenChuCuaHang;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getHotline() {
        return Hotline;
    }

    public void setHotline(String Hotline) {
        this.Hotline = Hotline;
    }
    
    public String getSLCN () {
        return SLCN;
    }

    public void setSLCN(String SLCN) {
        this.SLCN = SLCN;
    }
    public void increaseSLCN(int IDCH) throws SQLException {
        int SLCN  = getSLCNById(IDCH);
        System.out.println("SLCN"+SLCN);
       String insertQuery = "UPDATE `cuahang` SET `SLChungNhan`= ? WHERE `ID_CH` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setInt(1, SLCN + 1);
            ps.setInt(2, IDCH);
            ps.executeUpdate();
       
        } catch (SQLException e) {
            Logger.getLogger(CuaHang.class.getName()).log(Level.SEVERE, null, e);
             JOptionPane.showMessageDialog(null, e.getMessage(), "SOMETHING WENT WRONG", 1);
        }
    }
    public void addAuthor(String _TenCuaHang, String _TenChuCuaHang, String _DiaChi, String _Hotline, int _SLCN) throws SQLException {
        String insertQuery = "INSERT INTO `cuahang`(`TenCuaHang`, `TenChuCuaHang`, `DiaChi`, `Hotline`, `SLChungNhan`) VALUES (?, ?, ?, ? ,?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setString(1, _TenCuaHang);
            ps.setString(2, _TenChuCuaHang);
            ps.setString(3, _DiaChi);
            ps.setString(4, _Hotline);
            ps.setInt(5, _SLCN);
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "CỬA HÀNG ĐÃ ĐƯỢC THÊM", "THÊM CỬA HÀNG", 1);
            } else {
                JOptionPane.showMessageDialog(null, "CỬA HÀNG CHƯA ĐƯỢC THÊM", "THÊM CỬA HÀNG", 0);
            }

        } catch (SQLException e) {
            Logger.getLogger(CuaHang.class.getName()).log(Level.SEVERE, null, e);
             JOptionPane.showMessageDialog(null, e.getMessage(), "SOMETHING WENT WRONG", 1);
        }
    }

    public void editAuthor(int _id, String _TenCuaHang, String _TenChuCuaHang, String _DiaChi, String _Hotline , int _SLCN) throws SQLException {
        String insertQuery = "UPDATE `cuahang` SET `TenCuaHang`= ?,`TenChuCuaHang`= ?,`DiaChi`= ?,`Hotline`= ?, `SLChungNhan` = ? WHERE `ID_CH` = ?";
     
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setString(1, _TenCuaHang);
            ps.setString(2, _TenChuCuaHang);
            ps.setString(3, _DiaChi);
            ps.setString(4, _Hotline);
            ps.setInt(5, _SLCN);
            ps.setInt(6, _id);

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "CỬA HÀNG ĐƯỢC CHỈNH SỬA", "SỬA CỬA HÀNG", 1);
            } else {
                JOptionPane.showMessageDialog(null, "CỬA HÀNG CHƯA ĐƯỢC CHỈNH SỬA", "SỬA CỬA HÀNG", 0);
            }

        } catch (SQLException e) {
            Logger.getLogger(CuaHang.class.getName()).log(Level.SEVERE, null, e);
             JOptionPane.showMessageDialog(null, e.getMessage(), "SOMETHING WENT WRONG", 1);
        }
    }

    public void deleteAuthor(int _id) throws SQLException {
        String insertQuery = "DELETE FROM `cuahang` WHERE `ID_CH` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setInt(1, _id);

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "CỬA HÀNG ĐÃ ĐƯỢC XÓA", "XÓA CỬA HÀNG", 1);
            } else {
                JOptionPane.showMessageDialog(null, "CỬA HÀNG CHƯA ĐƯỢC XÓA", "XÓA CỬA HÀNG", 0);
            }

        } catch (SQLException e) {
            Logger.getLogger(CuaHang.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e.getMessage(), "SOMETHING WENT WRONG", 1);
        }
    }

    public ArrayList<CuaHang> authorsList() {
        ArrayList<CuaHang> auLists = new ArrayList<>();
        
        My_Classes.Func_Class func = new Func_Class();

        try {
            ResultSet rs = func.getData("SELECT * FROM `cuahang`");

            CuaHang author;

            while (rs.next()) {
                author = new CuaHang(rs.getInt("id_ch"), rs.getString("TenCuaHang"),
                        rs.getString("TenChuCuaHang"), rs.getString("DiaChi"), rs.getString("Hotline"), rs.getString("SLChungNhan"));
                auLists.add(author);
            }

        } catch (SQLException sQLException) {
            Logger.getLogger(CuaHang.class.getName()).log(Level.SEVERE, null, sQLException);
            JOptionPane.showMessageDialog(null, sQLException.getMessage(), "SOMETHING WENT WRONG", 1);
        }

        return auLists;
    }
    public CuaHang getCuaHangById(Integer _id) throws SQLException {
        Func_Class func = new Func_Class();
        String Query = "SELECT * FROM `cuahang` WHERE `ID_CH` = " + _id;
        ResultSet rs = func.getData(Query);
        if (rs.next()) {
            return new CuaHang(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
        } else {
            return null;
        }
    }
    public int getSLCNById(Integer _id)  throws SQLException { 
    Func_Class func = new Func_Class();
        String Query = "SELECT `SLChungNhan` FROM `cuahang` WHERE `ID_CH` = " + _id;
        ResultSet rs = func.getData(Query);
        if (rs.next()) {
            return rs.getInt(1);
        } else {
            return -1;
        }
    }    
}
