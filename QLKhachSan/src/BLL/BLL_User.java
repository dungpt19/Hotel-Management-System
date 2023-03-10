/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import GUI.thongbao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class BLL_User {

    public static boolean KT_Them(DTO.DTO_User u, String NhapLai) {
        ResultSet rs = DAO.DAO_User.LayTatCa();
        try {
            while (rs.next()) {
                if (rs.getString("TenUser").equals(u.getTenUser())) {
                    thongbao.thongbao("Username was used", "");
                    return false;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Loi");
        }
        if (u.getTenUser().length() < 5) {
            thongbao.thongbao("Username must have more than 5 letters", "");
            return false;
        }
        if (u.getMK().length() < 5) {
            thongbao.thongbao("Password must have more than 5 letters", "");
            return false;
        }
        if (!u.getMK().matches(NhapLai)) {
            thongbao.thongbao("Confirm Password was not correct", "");
            return false;
        }
        return true;
    }

    public static boolean KT_Sua(DTO.DTO_User sua, String nhaplai) {
        if (sua.getMK().trim().equals("")) {
            thongbao.thongbao("Enter Password", "");
            return false;
        }
        if (!sua.getMK().equals(nhaplai)) {
            thongbao.thongbao("Wrong Password", "");
            return false;
        }

        return true;
    }

    public static boolean KT_Xoa(String MaNV) {
        String tenUser=null;
        ResultSet rs = DAO.DAO_User.LayTKTheoMaNV(MaNV);
        try {
            if (rs.next()) {
                tenUser=rs.getString("TenUser");//lấy tên user từ mã nhân viên
            }
        } catch (SQLException ex) {
          
        }
        ResultSet rs2=DAO.DAO_ThuePhong.LayTatCa();
        try {
            while(rs2.next()){//kiểm tra tài khoản đã thực hiện đặt phòng 
                if (rs2.getString("TenUser").equals(tenUser)) {
                    thongbao.thongbao("This account existed", "");
                    return false;
                }
            }
        } catch (SQLException ex) {
          
        }
        if (tenUser.equals(BLL.BLL_DangNhap.TenUser)) {
            thongbao.thongbao("This account is enter data", "");
            return false;
        }
        return true;
    }
}
