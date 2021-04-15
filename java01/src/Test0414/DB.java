package Test0414;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB {
	//mySQL 접속
	public static Connection dbConn() {
		Connection conn=null;
		try {
			FileInputStream fis=new FileInputStream("c:/work/db.prop");
			Properties prop=new Properties();
			prop.load(fis);//프로퍼티 파일의 내용을 읽어서 
			String url=prop.getProperty("url");
			String id=prop.getProperty("id");
			String  password=prop.getProperty("password");
			conn=DriverManager.getConnection(url,id,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;//db 접속 정보를 리턴함

}
}


//oracle 접속
//public static Connection oraConn() {
//	Connection conn=null;
//	try {
//		FileInputStream fis=new FileInputStream("c:/work/oracle.prop");
//		Properties prop=new Properties();
//		prop.load(fis);//프로퍼티 파일의 내용을 읽어서 
//		String url=prop.getProperty("url");
//		String id=prop.getProperty("id");
//		String  password=prop.getProperty("password");
//		conn=DriverManager.getConnection(url,id,password);
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	return conn;//db 접속 정보를 리턴함
//}
//}
