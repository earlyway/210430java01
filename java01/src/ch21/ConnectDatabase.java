package ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDatabase {
	public static void main(String[] args) {
		//db연결 문자열 jdbc:mysql(db벤더)://호스트/데이터베이스
		String url=
				"jdbc:mysql://localhost/java?useSSL=false&serverTimezone=UTC";
		String id ="java";
		String password="java1234";
		Connection conn=null;//접속 java.sql.Connection
		Statement stmt=null;//sql 명령어 실행
		ResultSet rs=null;//실행 결과셋(record set)
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");
			//db에 접속
			conn=DriverManager.getConnection(url,id,password);
			System.out.println("mysql연결 성공");
			String sql="select * from books";
			stmt=conn.createStatement();//sql 실행 객체(인스턴스) 생성
			rs=stmt.executeQuery(sql);//sql실행, 레코드셋의 시작번지->rs
			System.out.println("도서코드\t도서이름");
			while(rs.next()) {//결과셋.next() 다음 레코드가 존재하면 true
				int book_id=rs.getInt("book_id");//정수형 필드를 읽어들여 
				String title=rs.getString("title");//문자열 필드
				System.out.println(book_id+"\t"+title);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {//rs->stmt->conn순으로 닫음.(오픈의 역순)
			try {
				if(rs != null)
					rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(stmt !=null)
					stmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(conn !=null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
