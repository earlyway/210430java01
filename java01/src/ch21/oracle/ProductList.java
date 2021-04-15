package ch21.oracle;//21.04.12 pm5 내가 직접 푼 문제.
//oracle SQL developer에 product 테이블 생성 
//procode 상품코드 primary key
//proname상품이름
//maker제조사
//price단가
//count수량
//total 금액
//
//레코드 3개이상 입력 insert
//
//자바코드로 콘솔에 출력
//	상품코드/상품이름/제조사/단가/수량/금액
//				금액은 계산 처리(단가*수량)


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductList {
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
			String sql="select *from product";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			System.out.println("상품코드"+"\t"+"상품명"+"\t"+"제조사"+"\t"+"단가(:원)"+"\t"+"수량"+"\t"+"금액(:원)");
			while(rs.next()) {//1개의 레코드를 읽음, 내용이 있으면 true, 없으면 false                                                                   
				String procode=rs.getString("procode");//get자료형(필드명)
				String proname=rs.getString("proname");
				String maker=rs.getString("maker");
				int price=rs.getInt("price");
				int count=rs.getInt("count");
				String total=String.format("%,d",price*count);
				System.out.println(procode+"\t"+proname+"\t"+maker+"\t"+price+"\t"+count+"\t"+total);
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



