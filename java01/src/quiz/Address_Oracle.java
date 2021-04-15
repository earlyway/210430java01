package quiz;//21.04.09 pm18
		//OracleSQLDeveloper 와 연결해서 이클립스콘솔에 출력하기.
 		//kim	김철수	서울 마포		02-222-2222	kim@naver
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Address_Oracle {
	public static void main(String[] args) throws Exception{
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost/xe";
		String id="java";
		String password="java1234";
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			conn=DriverManager.getConnection(url,id,password);
			System.out.println("Oracle Developer 성공");
			String sql="select * from address";
			stmt=conn.createStatement();//sql 실행 객체(인스턴스) 생성
			rs=stmt.executeQuery(sql);//sql실행, 레코드셋의 시작번지->rs
			System.out.println("아이디\t이름\t주소\t\t전화\t\t이메일");
			while(rs.next()) {//결과셋.next() 다음 레코드가 존재하면 true
				String userid=rs.getString("userid");//정수형 필드를 읽어들여 
				String name=rs.getString("name");//문자열 필드
				String address=rs.getString("address");
				String tel=rs.getString("tel");
				String email=rs.getString("email");
				System.out.println(userid+"\t"+name+"\t"+address+"\t\t"+tel+"\t"+email);
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
