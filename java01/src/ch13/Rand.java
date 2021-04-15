package ch13; //21.03.30 pm16:30

import java.util.Random;

public class Rand {
	public static void main(String[] args) {
		//자동 import : Ctrl+shft+O
		Random r=new Random();			//ramdom seed
		System.out.println(r.nextInt());	//정수 난수
		System.out.println(r.nextInt(100));	//100을 입력했으니 0~99가 나옴.
		//System.out.println(r.nextInt(100)+1);//1~100
		System.out.println(Math.random());	//0.0~1.0미만
		int num=(int)(Math.random()*100);
		System.out.println(num);
		
		String[] prize= {"1등","2등","3등","다음 기회에"};
		
		System.out.println(prize[r.nextInt(4)]);
	}
}
