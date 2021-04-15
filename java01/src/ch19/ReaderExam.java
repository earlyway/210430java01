package ch19;//21.04.05 pm12

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderExam {
	
	public static void main(String[] args) {
		int var = 0;
		// InputStreamReader : 문자단위로 읽는 클래스
		Reader input = new InputStreamReader(System.in);//좌변과 우변이 다르면 좌변이 더 상위클래스.
		System.out.println("입력하세요 : ");
		while (true) {// 무한 반복
			try {
				var = input.read();// 1개의 문자를 읽음(1바이트가 아니라)
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (var == 13)// 문자코드가 13번이면 종료
				break;
			// 문자와 문자코드 출력
			System.out.println((char) var + ":" + var);
		}
	}
}
