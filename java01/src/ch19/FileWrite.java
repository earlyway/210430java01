package ch19;//2021.04.05 pm15

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileWrite {
	public static void main(String[] args) {
		OutputStream os = null;//1byte 단위의 출력 객체
		try {
			//파일에 1바이트 단위로 출력하는 기능
			os = new FileOutputStream("c:/work/test.txt");
			System.out.println("입력하세요 : ");
			while (true) {
				int ch = System.in.read();//1byte 읽어서

				if (ch == 13)
					break;				//엔터 문자이면 반복문을 종료. 엔터는 13문자임.
				os.write(ch);			//파일에 저장
			}
			System.out.println("저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
