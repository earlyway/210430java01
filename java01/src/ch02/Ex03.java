package ch02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {// new 자료형, System.in 입력장치
		Scanner scan=new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name=scan.next(); //문자열 입력
		System.out.println("당신의 이름은 "+name+"입니다.");
		System.out.println("나이를 입력하세요:");
		int age=scan.nextInt(); //정수 입력
		System.out.println("당신의 나이는 "+age+"세 입니다."); //문자열+숫자->연결
	}
}
