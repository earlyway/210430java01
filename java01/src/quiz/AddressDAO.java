package quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ch21.DB;


public class AddressDAO {
	public int deleteAddress(String idd) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="delete from Address where idd=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,idd);
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
	public void insertAddress(AddressDTO dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="Insert into address(idd,nam,addr,tel,email)"+
						"values(?,?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,dto.getIdd());
			pstmt.setString(2,dto.getNam());
			pstmt.setString(3,dto.getAddr());
			pstmt.setString(4,dto.getTel());
			pstmt.setString(5,dto.getEmail());
			pstmt.executeUpdate();
			
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
	}
	public List<AddressDTO> listAddress(){
		List<AddressDTO>items=new ArrayList<>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="select * from address";
			pstmt=conn.prepareStatement(sql);//sql명령어를 실행시키는 객체 생성.
			rs=pstmt.executeQuery();//sql을 실행!!하고 결과셋의 시작번지값을 rs에 전달.
			while(rs.next()) {//1개의 레코드를 읽음, 내용이 있으면 true, 없으면 false
				String idd=rs.getString("idd");
				String nam=rs.getString("nam");
				String addr=rs.getString("addr");
				String tel=rs.getString("tel");
				String email=rs.getString("email");
				//리스트에 dto를 추가
				items.add(new AddressDTO(idd,nam,addr,tel,email));
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
