package ch13; //21.03.30 pm13

import java.util.Scanner;

public class Test { //==와 equals 비교연산자 비교
	public static void main(String[] args) {
		String name1="kim";
		Scanner sc=new Scanner(System.in);
		System.out.println("이름 입력 :");
		String name2=sc.next();
		//연산자 == 주소 비교 -->그래서 출력값이 false.
		System.out.println(name1==name2);
		System.out.println();
		// A.equals(B) 내용 비교-->그래서 출력값이 true.
		System.out.println(name1.equals(name2));
	}

}
