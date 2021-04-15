package ch19;//21.04.05 pm16

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStream {
	public static void main(String[] args) {
		try {
			//binary file 형식으로 저장하는 객체
			DataOutputStream dataout =
					new DataOutputStream(
							new FileOutputStream("c:/work/test.dat"));
			dataout.writeInt(123); //정수를 binary 형식으로 저장
			dataout.writeChar('A');
			dataout.writeDouble(3.5);
			dataout.close();//파일참조변수가 가리키는 리소스를 클리어시키는 코드
			System.out.println("저장되었습니다.");
			//binary file을 읽는 객체
			DataInputStream datain=
					new DataInputStream(
							new FileInputStream("c:/work/test.dat"));
			System.out.println( datain.readInt());
			System.out.println( datain.readChar());
			System.out.println(datain.readDouble());
			datain.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
