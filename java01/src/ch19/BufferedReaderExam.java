package ch19;//21.04.05 pm12

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderExam {
	public static void main(String[] args) {
		//버퍼buffer를 이용한 입력 기능
		BufferedReader reader=new BufferedReader(
								new InputStreamReader(System.in));
		System.out.println("입력하세요 : ");
		try {
			String str=reader.readLine();//문장 전체를 한번에 읽음
			System.out.println(str);
			reader.close();//리소스 정리
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
