package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		// 접속을 위한 CONNECTION 문자열 생성
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		// 사용자, 암호
		String dbuser = "hr";
		String dbpass = "hr";
		Connection conn = null;
		
		try {
			// 1.드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.connection 문자열과 사용자, 암호를 이용해서 connection 객체 생성
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			System.out.println("연결 성공!");
		} catch(ClassNotFoundException e) {
			System.err.println("JDBC 드라이버를 찾지 못했습니다.");
		} catch(SQLException e) {
			System.err.println("SQL Error"+ e.getMessage());
		} finally {
			// 3.모든 객체 닫아주기(자원해제)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
