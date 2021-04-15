package quiz;

import java.util.Scanner;

public class Ex20my {
	public static void main(String[] args) {
		int fee;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("금액을 입력하세요 : ");
		fee=sc.nextInt();
		sc.close();
	
	
		if(fee / 10000 > 1) {
			System.out.println("10000원 :"+ fee/10000);
		}else if(fee / 1000 >1) {
			System.out.println("1000원 :"+ fee/1000);
			
		}
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