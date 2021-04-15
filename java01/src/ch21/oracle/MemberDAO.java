package ch21.oracle;//21.04.12 am10:50

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {
	public static Connection getConn() {
		String driver="oracle.jdbc.driver.OracleDriver";//오라클 드라이버 클래스
		String url="jdbc:oracle:thin:@localhost:1521:xe";//연결문자열
		String id="java";
		String pwd="java1234";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,id,pwd);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;//db접속 정보를 리턴함
	}
	public static int memeberDelete(String userid) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int rows=0;
		try {
			conn=getConn();//db 접속
			String sql="delete from member where userid=?";
			pstmt=conn.prepareStatement(sql);//sql명령어를 실행시킬 수 있는 객체생성
			pstmt.setString(1,userid);//?에 값을 입력
			rows=pstmt.executeUpdate();//레코드가 삭제되고 삭제된 행수가 rows에 저장됨
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if(conn!=null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	return rows;//삭제된 행수가 리턴됨
	}
}
