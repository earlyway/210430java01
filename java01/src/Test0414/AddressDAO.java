package Test0414;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AddressDAO {
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
				String userid=rs.getString("userid");//정수형 필드를 읽어들여 
				String username=rs.getString("username");
				String addr=rs.getString("addr");
				String tel=rs.getString("tel");
				String email=rs.getString("email");
				//리스트에 dto를 추가
				items.add(new AddressDTO(userid,username,addr,tel,email));
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
		return items;//리스트를 리턴함
		}
}
