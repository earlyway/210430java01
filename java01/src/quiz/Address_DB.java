package quiz;//21.04.07
//HeidiSQL 데이터를 이클립스 콘솔로 출력시키기
//jang	장철수	서울 은평구		010-1111-2222	jang@naver
//seo	서철수	서울 강동구		010-4444-5555	seo@naver

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Address_DB {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost/java?useSSL=false&serverTimezone=UTC";
		String id ="java";
				String password="java1234";
				Connection conn=null;//접속 java.sql.Connection
				Statement stmt=null;//sql 명령어 실행
				ResultSet rs=null;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println("드라이버 로딩 성공");
					//db에 접속
					conn=DriverManager.getConnection(url,id,password);
					System.out.println("mysql연결 성공");
					String sql="select * from address";
					stmt=conn.createStatement();//sql 실행 객체(인스턴스) 생성
					rs=stmt.executeQuery(sql);//sql실행, 레코드셋의 시작번지->rs
					System.out.println("아이디\t이름\t주소\t\t전화\t\t이메일");
					while(rs.next()) {//결과셋.next() 다음 레코드가 존재하면 true
						String idd=rs.getString("idd");//정수형 필드를 읽어들여 
						String nam=rs.getString("nam");//문자열 필드
						String addr=rs.getString("addr");
						String tel=rs.getString("tel");
						String email=rs.getString("email");
						System.out.println(idd+"\t"+nam+"\t"+addr+"\t\t"+tel+"\t"+email);
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
