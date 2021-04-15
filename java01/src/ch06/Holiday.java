package ch06;

import java.util.Scanner;

//휴가일수 계산 method


public class Holiday {
	//멤버변수(클래스 전체에서 사용할 수 있는 변수=member variable=property)
	static int y; //static 변수, method 바깥에서 사용되는 전역변수=멤버변수
	static void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("근속연수:");
		y=sc.nextInt();//키보드로 입력한 값을 정수로 처리
	}
	public static void main(String[] args) {
		input();
		System.out.println("휴가일수:"+holiday(y));
	}
	static int holiday(int year) {
		int day=0; //method 내부에서 쓰는 지역변수(local variable)
		if(year<=5) {
			day=10;
		}else if(year<=10) {
			day=15;
		}else {
			day=20;
		}
		return day;
	}

}

//main->input()