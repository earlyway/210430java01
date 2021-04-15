package ch04;

import java.util.Scanner;

// ctrl+shift+f 코드정렬
public class If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int a = sc.nextInt();
		if (a % 2 == 0) { // a를 2로 나눈 나머지가 0이면
			System.out.println(a + "==>짝수");
		} else {
			System.out.println(a + "==>홀수");
		}
	}
}
