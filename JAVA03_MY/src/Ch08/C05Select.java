package Ch08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C05Select {

	public static void main(String[] args) {
		// DB CONN DATA
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/opendatadb";
		// 				DBMS 종류 // DBMS 위치:접속포트/접속하려는 DB명
		
		// JDBC 참조변수
		Connection conn = null; 			// DBMS의 특정 DB와 연결되는 객체
		PreparedStatement pstmt = null;		// SQL Query 전송용 객체
		ResultSet rs = null;				// Select 결과물 담을 객체
		
		// 연결작업 - Driver 로딩
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Succcess...");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB CONNECTED...");
			// sql query 객체 생성 - query 준비 : conn.prepareStatement("SQL문");
			pstmt = conn.prepareStatement("SELECT * FROM tbl_a"); 
			
			rs = pstmt.executeQuery(); // 표의 형태로 보여주는게 rs
			
			if(rs!=null) {
				while(rs.next()) { // 커서가 다음행으로 넘어가는 작업
					System.out.print(rs.getInt("no")+" . "); // no컬럼(int)에 커서를 가져오는 작업
					System.out.println(rs.getString("name")); // name 컬럼(varchar)
				} 
			}
			
		}catch(ClassNotFoundException e1) {
			System.out.println("클래스 부재 예외발생!");
		}catch(SQLException e2) {
			System.out.println("SQL 예외발생!");
			e2.printStackTrace(); 
		}finally { // 역순으로 자원 제거
			try {rs.close();} catch (SQLException e) {e.printStackTrace();} 
			try {pstmt.close();} catch (SQLException e) {e.printStackTrace();} 
			try {conn.close();} catch (SQLException e) {e.printStackTrace();} 
		}
		
		
		
	}

}
