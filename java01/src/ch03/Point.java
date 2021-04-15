package ch03;

import java.util.Scanner;

public class Point {
	public static void main(String[] args) {
//		String name="김철수";
//		int kor=80, eng=89, mat=100;
		String name;
		int kor,eng,mat;
		Scanner sc=new Scanner(System.in);//키보드 입력을 받을때 필요+import 받을것.
		System.out.println("이름:");
		name=sc.next();//문자열 입력
		System.out.println("국어:");
		kor=sc.nextInt();//정수 입력
		System.out.println("영어:");
		eng=sc.nextInt();
		System.out.println("수학:");
		mat=sc.nextInt();
		
		double tot=kor+eng+mat;
		double    avg=tot / 3.0;
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");// \t 탭
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"
				+mat+"\t"+tot+"\t"+avg); //avg 대신 String.format("%.2f,avg)를 넣으면 평균소수점 2자리까지만 나타내줌.
	//print formatted 형식화된 출력
		// %s 스트링 형식, %d 정수형식, %f 실수형식 전체자리수.소수이하자리수
//		System.out.printf("%s\t%d\t%d\t%d\t%d\t%5.1f",
//				name,kor,eng,mat,tot,avg);
	}
}