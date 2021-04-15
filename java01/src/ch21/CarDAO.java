package ch21;//21.04.08 am10:50

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class CarDAO {
	public Connection dbConn() {
		Connection conn=null;
		try {
			FileInputStream fis=new FileInputStream("c:/work/db.prop");
			Properties prop=new Properties();
			prop.load(fis);//프로퍼티 파이르이 내용을 읽어서 
			String url=prop.getProperty("url");
			String id=prop.getProperty("id");
			String  password=prop.getProperty("password");
			conn=DriverManager.getConnection(url,id,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;//db 접속 정보를 리턴함
	}
	public int deleteCar(String license_number) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=dbConn();//db접속
			//delete from 테이블 where "조건절"
			String sql="delete from car where license_number=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,license_number);//?자리에 입력될 값을 지정.
			result=pstmt.executeUpdate();//레코드 삭제, 삭제된 레코드의 수가 result
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	public List<CarDTO> listCar(){
		List<CarDTO> items=new ArrayList<>(); //좌변 우변의 타입이 다르면 좌변이 상위
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=dbConn();
			String sql="select *from car";
			pstmt=conn.prepareStatement(sql);//sql명령어를 실행시키는 객체 생성.
			rs=pstmt.executeQuery();//sql을 실행!!하고 결과셋의 시작번지값을 rs에 전달.
			while(rs.next()) {//1개의 레코드를 읽음, 내용이 있으면 true, 없으면 false
				String license_number=rs.getString("license_number");
				String company=rs.getString("company");
				String type=rs.getString("type");
				int year=rs.getInt("year");
				int efficiency=rs.getInt("efficiency");
				//리스트에 dto를 추가
				CarDTO dto=
						new CarDTO(license_number,company,type,year,efficiency);
				items.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {//마지막으로 실행되는 코드
			try {
				if(rs != null) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn !=null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return items;
	}
	
	public void insertCar(CarDTO dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=dbConn();//db접속
			String sql="insert into car"
					+"(license_number,company,type,year,efficiency)"
					+"values(?,?,?,?,?)"; //?가 5개.
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,dto.getLicense_number());//1번 ?
			pstmt.setString(2,dto.getCompany());		//2번 ?
			pstmt.setString(3,dto.getType());
			pstmt.setInt(4,dto.getYear());
			pstmt.setInt(5,dto.getEfficiency());
			pstmt.executeUpdate();//레코드 추가
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt !=null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn !=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
