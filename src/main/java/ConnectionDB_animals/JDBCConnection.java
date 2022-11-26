package ConnectionDB_animals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
public static Connection getJDBCConection() {
		
		final String url = "jdbc:mysql://localhost:3306/quanlisinhvien";
		final String user = "root";
		final String pass = "123456";
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				conn = DriverManager.getConnection(url, user, pass);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String[] args) {
		Connection con = getJDBCConection();
		if(con!=null) {
			System.out.println("thanh cong");
		} else {
			System.out.println("that bai");
		}
	}
}
