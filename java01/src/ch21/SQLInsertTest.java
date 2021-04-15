package ch21;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class SQLInsertTest {
	public static void main(String[] args) throws Exception{
		FileInputStream fis =
				new FileInputStream("c:/work/db.prop");
		Properties prop=new Properties();
		prop.load(fis);//db.prop 내용을 읽어서 key, value 구조로 변환
		String driver=prop.getProperty("driver");
		String url=prop.getProperty("url");
		String id=prop.getProperty("id");
		String password=prop.getProperty("password");
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,id,password);
			
			String title="c언어";
			String publisher="금성출판사";
			String year="2017";
			int price=45000;
			String sql="insert into books(title, publisher,year,price)"+"values (?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, title);// 29번 라인의 첫번째 ?에 대입
			pstmt.setString(2, publisher);
			pstmt.setString(3, year);
			pstmt.setInt(4, price);
			pstmt.executeUpdate();//insert query 실행
			System.out.println("추가되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
