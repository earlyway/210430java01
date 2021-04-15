package ch21.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;

import ch21.DB;

public class EmpDAO {
	public Vector listEmp(String dname) {
		Vector items=new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.oraConn();
			String sql=
					"select empno, ename,job,hiredate,sal,dname"
					+" from emp e, dept d"
							+" where e.deptno=d.deptno and dname like?";
//			String sql=
//					"select empno,ename,job,hiredate,sal,dname";
//			sql+="from emp e.dept d";
//			sql+="where e.deptno=d.deptno";
//			StringBuilder sql=new StringBuilder();
//			sql.append("select empno,ename,job,hiredate,sal,dname");
//			sql.append("from emp e, dept d");
			pstmt=conn.prepareStatement(sql.toString());
			if(dname.equals("전체부서")) {
				dname="%";
			}
			pstmt.setString(1, dname);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector row=new Vector();
				row.add(rs.getInt("empno"));
				row.add(rs.getString("ename"));
				row.add(rs.getString("job"));
				row.add(rs.getDate("hiredate"));
				row.add(rs.getInt("sal"));
				row.add(rs.getString("dname"));
				items.add(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return items;
	}
	public ArrayList<EmpDTO> listEmp(int deptno){
		ArrayList<EmpDTO>list=new ArrayList<EmpDTO>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.oraConn();
			String sql=
					"select empno,ename,job,hiredate,sal,dname"
					+" from emp e, dept d"
					+" where e.deptno=d.deptno"
					+" and e.deptno=?";
			pstmt=conn.prepareStatement(sql.toString());
			pstmt.setInt(1, deptno);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO dto=new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setDname(rs.getString("dname"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
