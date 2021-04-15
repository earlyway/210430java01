package ch21.oracle;//21.04.13 am11

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import ch21.DB;

public class DeptDAO {
	public ArrayList<DeptDTO> listDept(){
		ArrayList<DeptDTO> items=new ArrayList<>();//리스트 생성
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.oraConn();//oracle에 접속
			String sql=" select *from dept order by dname ";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {//레코드 1개를 읽음
				int deptno=rs.getInt("deptno");//get자료형(필드명)
				String dname=rs.getString("dname");
				String loc=rs.getString("loc");
				DeptDTO dto=new DeptDTO(deptno,dname,loc);
				items.add(dto);//리스트에 dto추가
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(pstmt!=null)pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return items;
	}
}
