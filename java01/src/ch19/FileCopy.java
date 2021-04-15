package ch19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileCopy {
	public static void main(String[] args) {
		String str = "";
		BufferedReader reader = null;
		BufferedWriter writer = null;
		String file1 = "c:/work/a.txt";//원본
		String file2 = "c:/work/b.txt";//복사본

		try {
			//버퍼를 이용한 입력객체
			reader = new BufferedReader(
					new InputStreamReader(
					new FileInputStream(file1)));
			//버퍼를 이용한 출력개체
			writer = new BufferedWriter(
					new OutputStreamWriter(
					new FileOutputStream(file2)));

			while (true) {
				str = reader.readLine();//한 라인을 읽어서
				if (str == null) break; //내용이 없으면 반복문을 끝내고
									//파일에 저장할 경우 \r carriage return + \n newLine
				writer.write(str + "\r\n");//내용이 있으면 파일에 저장
			}
				System.out.println("파일 복사가 완료되었습니다.");
				reader.close();//닫기
				writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
