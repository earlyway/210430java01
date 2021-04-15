package quiz;
public class BmiUse0329 {
	public static void main(String[] args) {
		double weight=68.0;
		double height=179.5;
		Bmi0329 b=new Bmi0329(height/100, weight);
		b.calc();
		b.print();
	}
}

	
	
	
	
	
	
	
	//import java.util.Scanner;
//
//public class BmiUse0329 {
//	public static void main(String[] args) {
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("체중을 입력하세요. :");
//		double w=sc.nextDouble();
//		Bmi0329 c=new Bmi0329(w);
//	System.out.println();
//	c.calc();
//	c.print();
//		
////	Scanner sc=new Scanner(System.in);
////	System.out.println("신장을 입력하세요. :");
////	double h=sc.nextDouble();
////	Bmi0329 c=new Bmi0329(h);
//	}
//}
//
