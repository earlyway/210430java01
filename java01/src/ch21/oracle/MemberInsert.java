package ch21.oracle;//21.04.12 am10

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MemberInsert {
	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";//오라클 드라이버 클래스
		String url="jdbc:oracle:thin:@localhost:1521:xe";//연결문자열
		String id="java";
		String pw="java1234";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,id,pw);
			
			Scanner scan=new Scanner(System.in);
			System.out.println("아이디 : ");
			String userid=scan.next();
			System.out.println("비밀번호 : ");
			String passwd=scan.next();
			System.out.println("이름 : ");
			String name=scan.next();
			
			//String sql="insert into member(userid,passwd,name)"+
				//	"values('"+userid+"','"+passwd+"','"+name+"')";
			String  sql ="insert into member (userid,passwd,name)"+
					"values(?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, passwd);
			pstmt.setString(3, name);
			pstmt.executeUpdate();//레코드 추가
			System.out.println("레코드가 추가되었습니다.");
		}catch(Exception e) {
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
	}
}
