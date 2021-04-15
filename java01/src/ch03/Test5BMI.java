package ch03;

import java.util.Scanner;

public class Test5BMI {
//입력 : 체중w, 신장t
	//bmi 계산 : 체중(kg)/키(m)의 제곱
	//bmi값이 18.5미만이면 저체중, 18.5~22.9 정상
	//23.0~24.9 과제충, 25.0이상 비만으로 처리.
	
	
	
	//1.변수 선언
	//체중 double
	//신장 double
	//bmi double
	//결과 string
	//2.입력 처리
	//3.계산 bmi, 판정, 계산한 값을 변수에 저장.
	//4.출력
	
	
	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("몸무게 kg을 입력하세요.");
//		String w=scan.next(); //문자열 입력
//		System.out.println("당신의 몸무게는 "+w+"kg 입니다.");
//		System.out.println("신장 m을 입력하세요.");
//		String t=scan.next(); //문자열 입력
//		System.out.println("당신의 키는 "+t+"m 입니다.");
//		
//	}    1. 변수선언
		double 체중;
		double 신장;
		double bmi;
		String 결과;
		//2.입력
		Scanner sc=new Scanner(System.in);
		System.out.println("체중:");
		체중=sc.nextDouble();
		System.out.println("신장:");
		신장=sc.nextDouble()/100;
		//3.계산
		bmi=체중/(신장*신장);
		//4.출력
		System.out.println(bmi);
		
		if(bmi>=25.0) {
			System.out.println("비만");
		}else if(bmi>23.0 && bmi<=24.9) {
			System.out.println("과체중");
		}else if(bmi>18.5 && bmi<=22.9) {
			System.out.println("정상");
		}else {
		    System.out.println("저체중");
		   
	}	
}
}

                    

