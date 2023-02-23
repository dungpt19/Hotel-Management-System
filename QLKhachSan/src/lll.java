/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author choup
 */
public class lll {
    public static void main(String args[]){
        Connection connection=null;
		try {
		String connecurlString="jdbc:sqlserver://TINPHANELITEBOO:1433;databaseName=QuanLyKhachSan;encrypt=true;trustServerCertificate=true;";
			connection=DriverManager.getConnection(connecurlString,"sa","123456");
			System.out.println("Kết nối thành công");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
        
    }
}
