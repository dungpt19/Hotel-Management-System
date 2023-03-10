/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import GUI.frm_QuanLyChinh;
import GUI.thongbao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class BLL_DangNhap {

    public static String TenUser, MatKhau, quyen;
     

    public static boolean KT_DangNhap(String TK, String MK) {
        if (TK.trim().equals("") || MK.trim().equals("")) {
            thongbao.thongbao("Please fill all the blank form", "Notice");
            return false;
        }
        ResultSet rs = DAO.DAO_DangNhap.LayTaiKhoanTheoMa(TK);
        try {
            if (rs.next()) {
                if (rs.getString("TenUser").matches(TK)) {
                    if (rs.getString("MatKhau").matches(MK)) {
                        System.out.println("Login Successful");
                        TenUser=rs.getString("TenUser");
                        quyen=rs.getString("MaQuyen");
                        MatKhau=rs.getString("MatKhau");
                        return true;
                    }
                    thongbao.thongbao("Wrong password/account", "Notice");
                    return false;

                }
                thongbao.thongbao("Wrong password/account", "Notice");
                return false;

            }
        } catch (SQLException ex) {

        }
        thongbao.thongbao("Wrong password/account", "Notice");
        return false;
    }
    public static boolean KT_DoiMK(String mkcu,String mkmoi,String nhaplai){
        if (!mkcu.equals(MatKhau)) {
            thongbao.thongbao("Wrong old password", "");
            return false;
        }
        if (mkmoi.length()<5) {
            thongbao.thongbao("Password must be 5 letters longer ", "");
            return false;
        }
        if (!mkmoi.equals(nhaplai)) {
            thongbao.thongbao("Please re-type password", "");
            return false;
        }
    return true;
    }
}
