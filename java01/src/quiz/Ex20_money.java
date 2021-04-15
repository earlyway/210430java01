package quiz;

import java.util.Scanner;

public class Ex20_money {
	private int inputMoney = 0; //입력 금액
	private int tenThousand = 0; //10000원
	private int fiveThousand = 0; //5000원
	private int thousand = 0;
	private int fiveHundred = 0;
	private int hundred = 0;
	private int fifty = 0;
	private int ten = 0;
	private int remain = 0; //잔액

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하세요: ");
		inputMoney = scan.nextInt(); //정수 입력

		calc(); //계산
	}

	public void calc() {
		System.out.println("금액  : " + inputMoney + "원");

		tenThousand = inputMoney / 10000; //몫
		fiveThousand = inputMoney % 10000 / 5000;
		thousand = inputMoney % 5000 / 1000;
		fiveHundred = inputMoney % 5000 % 1000 / 500;
		hundred = inputMoney % 5000 % 1000 % 500 / 100;
		fifty = inputMoney % 5000 % 1000 % 500 % 100 / 50;
		ten = inputMoney % 5000 % 1000 % 500 % 100 % 50 / 10;
		remain = inputMoney % 5000 % 1000 % 500 % 100 % 50 % 10;

		System.out.println("10000원 : " + tenThousand);
		System.out.println("5000원 : " + fiveThousand);
		System.out.println("1000원 : " + thousand);
		System.out.println("500원 : " + fiveHundred);
		System.out.println("100원 : " + hundred);
		System.out.println("50원 : " + fifty);
		System.out.println("10원 : " + ten);
		System.out.println("남은 돈 : " + remain);
	}

	public static void main(String[] args) {
		Ex20_money m = new Ex20_money();
		m.input();
	}
}
//[문제] 아래와 같이 금액을 입력받아 각 지폐와 동전이 몇 개가 있는지 출력하는 프로그램의 
//코드를 작성하시오. <처리 조건>
//1. 금액은 키보드로 입력받는다. 2. 멤버변수와 method를 적절하게 설계하여 작성한다. <결과 출력 예>
//금액을 입력하세요: 45789
//10000원 : 4
//5000원 : 1
//500원 : 1
//100원 : 2
//50원 : 1
//10원 : 3
//남은돈 : 
