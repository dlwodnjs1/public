package sec01.swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3305/DoItSQL";
		Connection con = null;
		Statement stmt = null;
		String sql = "insert into order0729(order_id, product, quantity) values (('J4567', '샤프', 9)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //생성자
			System.out.println("드라이버 로딩!");
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("접속 성공!");
			stmt = con.createStatement();
			
			stmt.executeUpdate(sql);
			System.out.println("입력 성공!");
			
			stmt.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("접속 안됨!");
		}
	}

}
