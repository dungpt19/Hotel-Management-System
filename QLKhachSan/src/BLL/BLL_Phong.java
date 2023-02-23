/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import GUI.mycombobox;
import GUI.thongbao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class BLL_Phong {
//   public static void loadData_Luong(JComboBox cbb) {
//        DefaultComboBoxModel cbbModel = (DefaultComboBoxModel) cbb.getModel();
//        cbbModel.removeAllElements();
//        
//        
//   }
    public static void Load_cbbTang(JComboBox cbb) {
        ResultSet rs=DAO.DAO_Phong.LayTang();
      DefaultComboBoxModel cbbModel = (DefaultComboBoxModel) cbb.getModel();
        try {
            while(rs.next()){
                cbbModel.addElement(rs.getString("MaTang"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Phong.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    public static void DoDuLieuBang(JTable tbl) {
        DefaultTableModel tblModel = (DefaultTableModel) tbl.getModel();
        tblModel.setRowCount(0);
        Object obj[] = new Object[6];
        ResultSet rs = DAO.DAO_Phong.LayPhong(0);
        try {
            while (rs.next()) {
                obj[0] = rs.getString("MaPhong");
                String MaLoaiPhong = rs.getString("MaLoaiPhong");
                ResultSet rsLoaiPhong = DAO.DAO_LoaiPhong.LayLoaiTheoMa(MaLoaiPhong);
                if (rsLoaiPhong.next()) {
                    obj[1] = rsLoaiPhong.getString("TenLoaiPhong");
                }
                obj[2] = rs.getInt("DienTich");
                obj[3] = rs.getString("Hinh");
                obj[4] = rs.getString("TinhTrang");
                obj[5] = rs.getString("MaTang");
                tblModel.addRow(obj);
            }
        } catch (SQLException ex) {
            System.out.println("Error");
        }
    }

    public static void loadData_LoaiPhong(JComboBox cbb) {
        DefaultComboBoxModel cbbModel = (DefaultComboBoxModel) cbb.getModel();
        cbbModel.removeAllElements();
        ResultSet rs = DAO.DAO_LoaiPhong.LayTatCa();
        try {
            while (rs.next()) {
                Object MaLoaiPhong = rs.getString("MaLoaiPhong");
                Object TenLoai = rs.getString("TenLoaiPhong");
                mycombobox mb = new mycombobox(MaLoaiPhong, TenLoai);
                cbbModel.addElement(mb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Phong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean Them(DTO.DTO_Phong P) {
        String kt2 = "[0-9]{1,99}";
        ResultSet rs = DAO.DAO_Phong.LayPhong(0);
        try {
            while (rs.next()) {
                if (rs.getString("MaPhong").matches(P.getMaPhong())) {
                    thongbao.thongbao("ID was used", "");
                    return false;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Phong.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (P.getTang().trim().equals("")) {
            thongbao.thongbao("Fill the Floor form", "");
            return false;
        }
        if (!P.getDienTich().matches(kt2)) {
            thongbao.thongbao("Wrong Scale", "");
            return false;
        }
        if (P.getDienTich().trim().equals("") || P.getMaPhong().trim().equals("")) {
            thongbao.thongbao("Please fill all the blank form", "");
            return false;
        }
        if (P.getGiuongDoi().trim().equals("")) {
            thongbao.thongbao("Enter the amount of DoubleBed", "");
            return false;
        }
        if (P.getGiuongDon().trim().equals("")) {
            thongbao.thongbao("Enter the amount of SingleBed", "");
            return false;
        }
        return true;
    }

    public static boolean KT_Xoa(String MaPhong) {
        ResultSet rs = DAO.DAO_Phong.LayTheoMa(MaPhong);
        try {
            if (rs.next()) {
                if (rs.getString("TinhTrang").equals("In Use") || rs.getString("TinhTrang").equals("Cleaning")) {
                    thongbao.thongbao("Room is currently in use", "");
                    return false;
                }
            }
        } catch (SQLException ex) {

        }
        ResultSet rs2=DAO.DAO_ThuePhong.LayTatCa();
        try {
            while(rs2.next()){
                if (rs2.getString("MaPhong").equals(MaPhong)) {
                    thongbao.thongbao("This room existed in a reciept", "");
                    return false;
                }
            }
        } catch (SQLException ex) {
           
        }
        return true;
    }

    public static boolean KT_Sua(DTO.DTO_Phong P) {
        String kt2 = "[0-9]{1,99}";
        if (!P.getDienTich().matches(kt2)) {
            thongbao.thongbao("Wrong Scale", "");
            return false;
        }
        if (P.getTang().trim().equals("")) {
            thongbao.thongbao("Enter a floor number", "");
            return false;
        }
        if (P.getDienTich().trim().equals("") || P.getMaPhong().trim().equals("")) {
            thongbao.thongbao("Please dont leave blank data", "");
            return false;
        }
        return true;
    }
}
