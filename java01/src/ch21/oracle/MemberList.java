package ch21.oracle;//21.04.12 am9

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberList {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";//오라클 드라이버 클래스
		String url="jdbc:oracle:thin:@localhost:1521:xe";//연결문자열
		String id="java";
		String pwd="java1234";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			Class.forName(driver);//드라이버 로딩(생략가능)
			conn=DriverManager.getConnection(url,id,pwd);//오라클 서버에 접속
			String sql="select *from member";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {//1개의 레코드를 읽음, 내용이 있으면 true, 없으면 false
				String userid=rs.getString("userid");//get자료형(필드명)
				String passwd=rs.getString("passwd");
				String name=rs.getString("name");
				System.out.println(userid+"\t"+passwd+"\t"+name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();//참조변수가 'rs가 가리키는 내용'이 null이 아니면 close()
			} catch (Exception e) {
				e.printStackTrace();
			}
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
	}
}
