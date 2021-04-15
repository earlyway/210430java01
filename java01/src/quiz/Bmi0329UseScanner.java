package quiz;

import java.util.Scanner;

public class Bmi0329UseScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("신장 : ");
		double height=sc.nextDouble();
		System.out.println("체중 : ");
		double weight=sc.nextDouble();
		
		Bmi0329 b=new Bmi0329(height/100, weight);
		b.calc();
		b.print();
	}
}

