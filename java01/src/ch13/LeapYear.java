package ch13;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("연도 입력하세요.");
		//키보드로 입력한 내용을 정수로 변환하여 변수에 저장
		int year=scan.nextInt(); //키보드로 입력한 내용을 정수로 바꿔서 변수에 =
		//Calendar 클래스를 확장한 클래스
		GregorianCalendar cal=new GregorianCalendar(); //Grego~ 범위지정 후 F3 누른 후 ctrl+O 하면 많은 method가 지원됨.
		//윤년이면 true, 평년이면 false
		if(cal.isLeapYear(year)) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("평년입니다.");
		}
	}
}