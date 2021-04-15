package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CopyBufferedData {
	public static void main(String[] args) {
		BufferedReader reader=null;
		String file = "c:/work/input.txt";
		
		int sum = 0;		
		

		try {
			//버퍼를 이용한 입력객체
			reader = new BufferedReader(
					new InputStreamReader(
					new FileInputStream(file)));
			

			while (true) {
				String str=reader.readLine();//문장 전체를 한번에 읽음
				if (str == null) break; //내용이 없으면 반복문을 끝내고
				int num=Integer.parseInt(str); //스트링을 숫자로 변환
				sum +=num; //합산
			}
				System.out.println("합계 : "+sum);
				reader.close();//닫기
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

//main 실행하고
//buffered에서 reader 변수에 null;
//input txt 파일의 스트링을 변수선언
//
//try 
//input txt에서 가져온 문장을 변수 reader에 넣고
//문장을 읽기위한 변수=reader
//
// while
//한 문장을 읽고 반복. 
//if 문장이 없다면 스탑. while문을 끝내느것.
//
//input txt에서 가져온 스트링에 문자열을 int 로 변환해서
//
//sysout 합계로 출력.
//
//	reader 닫기.
//
//catch(try문에서 문제가 생겼을때 catch문으로 옮겨가는것.)

