package DAO;


import java.sql.*;

//class connection để
//kết nối csdl 
//thực hiện các lệnh truy vấn 
//insert update delete
//select
public class connection {
//    tạo chuỗi hết nối
    public static Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    static PreparedStatement preparedStatement(String cauTruyVan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public connection() {
        try {
		String connecurlString="jdbc:sqlserver://TINPHANELITEBOO\\SQLEXPRESS:1433;databaseName=QuanLyKhachSan;encrypt=true;trustServerCertificate=true;";
			conn=DriverManager.getConnection(connecurlString,"sa","123456");
			System.out.println("Connected Successfully");
        } catch (SQLException ex) {
            System.out.println("SQL Connection Failed");
        }

    }


    //hàm thực thi câu lệnh select
    public static ResultSet Getdata(String cauTruyVan){
        try {
            Statement stm=conn.createStatement();
            //thực thicaau truy vấn select dc truyền vào từ
            //tham số cautruyvan
            //trả về kết quả là ResultSet
            ResultSet rs=stm.executeQuery(cauTruyVan);
            return rs;//trả về resultset nếu thành công
        } catch (SQLException ex) {
            System.out.println("lỗi truy vấn");
            return null;
        }
    
    }
    // hàm thực thi 3 câu lệnh insert delete update
    public static int ExecuteTruyVan(String cauTruyVan){
        try {
            Statement stm= conn.createStatement();
            return stm.executeUpdate(cauTruyVan);
            
        } catch (SQLException ex) {
            System.out.println("lỗi thực thi truy vấn");
            return -1;
        }
    }
}
