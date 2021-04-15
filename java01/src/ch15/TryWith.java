package ch15; //21.03.31 pm15:10

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWith {
	public static void main(String[] args) {
		//BufferedReader br=null; //버퍼(임시메모리)를 이용한 입력처리 class
//		try {
//			//텍스트파일을 읽기위한 인스턴스 생성 br=new ~
//			br=new BufferedReader(
//					new InputStreamReader(
//							new FileInputStream("c:/work/test.txt")));
//			while(true) {//무한반복
//				String str=br.readLine(); //파일에서 한 라인을 읽음
//				if(str==null) break; //내용이 없으면 반복문 종료
//				System.out.println(str);
//			}
//		} catch (Exception e) {//예외가 발생할 때 실행되는 코드
//			e.printStackTrace(); //예외 발생 시점의 스택추적 정보 출력
//			// TODO: handle exception
//		}finally {// 예외 발생 여부와 관계없이 항상 실행되는 코드
//			try {
//				if(br != null) br.close(); //br이 null이 아니면 닫기.
//			} catch (IOException e) {
//				e.printStackTrace();
//				// TODO: handle exception
//			}
//		}
		
		//try(인스턴스) ~ catch : try with문, finally절이 없어도 자동 소멸. 그래서 메모리 효율에 효과적.
		
		try(BufferedReader br=new BufferedReader(new InputStreamReader(
							new FileInputStream("c:/work/test.txt")))) {
			//텍스트파일을 읽기위한 인스턴스 생성 br=new ~
			while(true) {//무한반복
				String str=br.readLine(); //파일에서 한 라인을 읽음
				if(str==null) break; //내용이 없으면 반복문 종료
				System.out.println(str);
			}
		} catch (Exception e) {//예외가 발생할 때 실행되는 코드
			e.printStackTrace();
		}
	}
}
