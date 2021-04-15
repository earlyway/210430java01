package ch19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamExam {
	public static void main(String[] args) {
		FileOutputStream fos=null; //파일 출력을 위한 객체
		ObjectOutputStream oos=null;//object를 출력하기 위한 객체
		//memberDTO 인스턴스를 만들고(생성자에 전달)
		MemberDTO m1
		=new MemberDTO("kim",30,"871231-1234567","1234");
		MemberDTO m2
		=new MemberDTO("park",28,"891231-1234567","2222");
		MemberDTO m3
		=new MemberDTO("hong",25,"921231-1234567","3333");
		
		try {
			//파일 출력을 위한 스트림 생성
			fos=new FileOutputStream("c:/work/object.dat");
			//object를 출력하기위한 객체생성
			oos = new ObjectOutputStream(fos);
			//메모리에 올라갔던 m1,m2,m3인스턴스의 내용이 파일로 저장됨
			oos.writeObject(m1);
			oos.writeObject(m2);
			oos.writeObject(m3);
			System.out.println("객체를 저장했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally { //예외발생 여부에 관계없이 항상 실행되는 코드
			try {
				if( fos != null) fos.close(); //null이 아니면 close.
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(oos != null) oos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			//파일의 내용을 읽기위한 객체
			fis=new FileInputStream("c:/work/object.dat");
			//파일에 저장된 내용을 메모리에 복원하기 위한 객체
			ois=new ObjectInputStream(fis);
			//object.dat 파일에 저장된 MemberDTO 인스턴스를 복원
			MemberDTO dto1 = (MemberDTO)ois.readObject();
			MemberDTO dto2 = (MemberDTO)ois.readObject();
			MemberDTO dto3 = (MemberDTO)ois.readObject();
			System.out.println(dto1);
			System.out.println(dto2);
			System.out.println(dto3);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis !=null) fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(ois != null) ois.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
