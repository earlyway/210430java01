package quiz;

public class Ex03 {
//	public static void main(String[] args) {
//		int r=10;
//				System.out.println("반지름을 입력하세요:"+r);
//	}
//	{			int r=10;
//			double pir=62.83;
//			double piz=314.16;
//			System.out.println("반지름 :"+r);
//			System.out.println("원의 둘레 :"+pir);
//			System.out.println("원의 넓이 :"+piz);
//	}
//
//}
	public static void main(String[] args) {
		double r=10.5;
		double a=Math.PI*r*r;//넓이
		double b=2*Math.PI*r;//둘레
		System.out.println("반지름:"+r);
		System.out.println("넓이:"+String.format("%.2f",a));
		System.out.println("둘레:"+String.format("%.2f",b));
		//위의 코드를 5개의 데이터를 가리키는 배열로 처리
	}
	
}