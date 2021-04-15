package ch21;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class ScoreDAO {
	public int deleteScore(String student_no) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="delete from score where student_no=?";//?자리에 10라인의 student_no이 들어옴.
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,student_no);
			result=pstmt.executeUpdate();
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
	
	
	
	
	public int updateScore(ScoreDTO dto) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql=
					"update score set name=?,kor=?,eng=?,mat=?,tot=?,avg=?"+"where student_no=?";
				   //update 테이블  set 값1,값2,,,,;
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, dto.getName());
		pstmt.setInt(2, dto.getKor());
		pstmt.setInt(3, dto.getEng());
		pstmt.setInt(4, dto.getMat());
		pstmt.setInt(5, dto.getTot());
		pstmt.setDouble(6, dto.getAvg());
		pstmt.setString(7, dto.getStudent_no());
		result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	
	
	public int insertScore(ScoreDTO dto) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql=
					"insert into score values(?,?,?,?,?,?,?)";
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, dto.getStudent_no());
		pstmt.setString(2, dto.getName());
		pstmt.setInt(3, dto.getKor());
		pstmt.setInt(4, dto.getEng());
		pstmt.setInt(5, dto.getMat());
		pstmt.setInt(6, dto.getTot());
		pstmt.setDouble(7, dto.getAvg());
		result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
		
	
	
	public Vector listScore() {
		Vector items=new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();//db접속
			String sql="select * from score";//sql명령어
			pstmt=conn.prepareStatement(sql);//sql명령어를 실행시키는 객체를 생성
			rs=pstmt.executeQuery();//sql명령어를 실행시키고 결과셋의 시작번지값을 리턴.
			
			while(rs.next()) {//1개의 레코드를 읽음
				Vector row=new Vector();//1개의 레코드를 저장할 벡터 생성. 벡터>arrayList
				row.add(rs.getString("student_no"));//벡터에 필드를 추가.
				row.add(rs.getString("name"));
				row.add(rs.getInt("kor"));
				row.add(rs.getInt("eng"));
				row.add(rs.getInt("mat"));
				row.add(rs.getInt("tot"));
				row.add(rs.getDouble("avg"));
				items.add(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
	
	
	
	
	
	public Vector searchScore(String name) {//이름으로 찾기.
		Vector items=new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();//db접속
			String sql="select * from score where name like ?";//sql명령어
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "%"+name+"%");//%name%=키워드가 포함된 값을 찾기.
			rs=pstmt.executeQuery();//sql명령어를 실행시키고 결과셋의 시작번지값을 리턴.
			
			while(rs.next()) {//1개의 레코드를 읽음
				Vector row=new Vector();//1개의 레코드를 저장할 벡터 생성. 벡터>arrayList
				row.add(rs.getString("student_no"));//벡터에 필드를 추가.
				row.add(rs.getString("name"));
				row.add(rs.getInt("kor"));
				row.add(rs.getInt("eng"));
				row.add(rs.getInt("mat"));
				row.add(rs.getInt("tot"));
				row.add(rs.getDouble("avg"));
				items.add(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
}
	
	

