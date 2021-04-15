package ch03;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		//단가 입력
		//수량 입력
		//금액=단가x수량
		//금액 5만원 이상이면 배송료 면제, 아니면 3000원 추가	
		Scanner s=new Scanner(System.in);
		System.out.println("단가:");
		int price=9000;
		System.out.println("수량:");
		int amount=6;
		int money=price*amount;
		int fee=money>=50000 ? 0 : 3000;
		int total=money+fee;
		System.out.println("금액:"+total);
	}
	}	
 

