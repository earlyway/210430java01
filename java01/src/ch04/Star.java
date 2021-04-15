package ch04;

public class Star {
	public static void main(String[] args) {
		//nested loop 중첩 반복문
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
			System.out.print("*");//줄바꿈 안함
		}
		System.out.println(); //줄바꿈만
	}
	//역삼각형
		System.out.println();
	for(int i=5; i>=1; i--) {
		for(int j=1; j<=i; j++) {
			System.out.print("*");//줄바꿈 안함
		}
		System.out.println();//줄바꿈만
	}
 }
}
