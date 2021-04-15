package quiz;

import java.util.Scanner;

public class CircleUse0329 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하세요 :");
		double r = sc.nextDouble();
		Circle0329 c = new Circle0329(r);
		c.calc();
		c.print();
	}
}
//public static void main(String[] args) {
//Circle cir=new Circle();
//System.out.println("원의 둘레 : "+cir.getA());
//System.out.println("원의 넓이 : "+cir.getV());
//
//}
//
//}