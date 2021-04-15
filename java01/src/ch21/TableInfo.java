package ch21;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class TableInfo {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ResultSetMetaData meta=null;//레코드셋의 메타데이터를 조회하는 기능
									//메타데이터?? 보충설명을 해주는 데이터. 부가정보
		try {
			conn=DB.dbConn();
			String sql="select*from score";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			meta=rs.getMetaData();//메타 데이터 조회
			int cols=meta.getColumnCount();//필드 개수를 파악
			System.out.println("필드명\t자료형\tNull허용여부");
			for(int i=1; i<=cols; i++) {
				String colName=meta.getColumnName(i);//필드명
				String colType=meta.getColumnTypeName(i);//자료형
				int isNull=meta.isNullable(i);//null 허용여부
				System.out.println(colName+"\t"+colType+"\t"+isNull);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
