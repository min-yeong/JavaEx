package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HRSearchEmployeesPstmt {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			
			System.out.println("검색어를 입력하세요:");
			String keyword = scanner.next();
			//정적 SQL이 아니라 파라미터를 외부에서 입력하는 경우 PreparedStatement를 사용하면 효율적이고 보안성이 좋다
			String sql = "SELECT first_name, last_name, email, phone_number, hire_date FROM employees " 
						+ "WHERE lower(first_name) LIKE ? OR lower(last_name) LIKE ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+keyword.toLowerCase()+"%"); //pstmt는 '%keyword%'를 인식하기 못하기 때문에 setString을 이용하여 따로 입력해줌
			pstmt.setString(2, "%"+keyword.toLowerCase()+"%");
			
			rs = pstmt.executeQuery();
			System.out.println("[검색결과]");
			while(rs.next()) {
				System.out.printf("%s %s : %s, %s, %s%n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)); 
				//hire_date의 경우 date타입이지만 getString값으로 받아와도 무관함(정수나 소수가 아닌이상 무관함)
			}
		} catch(ClassNotFoundException e) {
			System.err.println("Driver 로드 에러");
		} catch(SQLException e) {
			System.err.println("SQLError");
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch(Exception e) {
			}
		}
		scanner.close();
	}

}
