package ch21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class StatementExam {
	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost/xe";
		String id="java";
		String pwd="java1234";
		Connection conn=null;
		Statement stmt=null;// 완성된 sql명령어를 실행시킬경우 사용
		PreparedStatement pstmt=null;//? 파라미터를 사용할 수 있는 객체
		try {
			Class.forName(driver);//오라클드라이버 로딩
			conn=DriverManager.getConnection(url,id,pwd);//오라클에 접속
			stmt=conn.createStatement();//sql 실행객체를 만들고
			long start=System.currentTimeMillis();//현재 시각 저장
			for(int i=1; i<=10000; i++) {
				String str="data"+i;
				String sql="insert into test values("+i+",'"+str+"')";
				stmt.executeUpdate(sql);//레코드 추가
			}
			long end=System.currentTimeMillis();
			System.out.println("작업수행 시간 : "+(end-start));//stmt 사용시의 작업수행시간
			start=System.currentTimeMillis();
			String sql="insert into test values(?,?)";//직접 값을 적지않고 
			pstmt=conn.prepareStatement(sql);
			for(int i=10001; i<=20000; i++) {
				String str="data"+i;
				pstmt.setInt(1, i);
				pstmt.setString(2, str);
				pstmt.executeUpdate();
			}
			end=System.currentTimeMillis();
			System.out.println("작업수행시간 : "+(end-start));//pstmt 사용시의 작업수행시간
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt != null)stmt.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
