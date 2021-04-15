package ch05;

import java.util.Scanner;

//임의의 사용자로부터 숫자를 입력받아 배열에 저장하고나서 합계 계산
public class InputSum {
	public static void main(String[] args) {
		int[] num = new int[5]; // 5개의 데이터를 가지는 정수배열
		int sum = 0; // 합계를 저장할 변수

		Scanner sc = new Scanner(System.in); // 키보드 입력기능(import 필수)
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번째 숫자를 입력하세요. ");
			num[i] = sc.nextInt();// 임의의 사용자로부터 키보드로 정수 입력을 받음.
			// 0을 입력하면 종료-->break 사용
			if (num[i] == 0)
				break;
			sum = sum + num[i];
		}
		System.out.println("합계 " + sum);

	}

}
