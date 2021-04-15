package ch04;

public class Test4 {
	public static void main(String[] args) {
a:		 for (int i = 1; i <= 5; i++) {
			System.out.println("i:" + i);
			for (int j = 1; j <= 5; j++) {
				System.out.println("\tj:" + j);
				if (j == 3) break a;
			}
		}
		System.out.println("종료");
	}
}
