package ch21.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SubjectList {
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
			String sql="select * from subject";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			System.out.println("코드"+"\t"+"이름"+"\t"+"순서"+"\t"+"점수");
			while(rs.next()) {//1개의 레코드를 읽음, 내용이 있으면 true, 없으면 false                                                                   
				String subject_code=rs.getString("subject_code");//get자료형(필드명)
				String subject_name=rs.getString("subject_name");
				int profno=rs.getInt("profno");
				int point=rs.getInt("point");
				System.out.println( subject_code + "\t" + subject_name + "\t" + profno + "\t"+point );
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


