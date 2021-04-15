package quiz;

public class Ex04 {
	public static void main(String[] args) {
		double[] r = {5,6,7,11,14};
		for(int i=0; i<5; i++) {
					
			System.out.print("반지름 "+r[i]);
			System.out.print(" 넓이 " +String.format("%.2f",r[i]*r[i]*Math.PI));
			System.out.print(" 둘레 " +String.format("%.2f",2*r[i]*Math.PI));
			System.out.println();
		}
	}
}

//	double[] r= {10,11,12,13,15.5};
//	double[] a=new double[5];
//	double[] b=new double[5];
//	for(int i=0; i<r.length; i++) {
//		a[i]=Math.PI*r[i]*r[i];
//		b[i]+2*Math.PI*r[i];
//	}
//	System.out.println("반지름/t넓이/t둘레");
//	System.out/println("=====================");
//	for(int i=0; i<r.length; i++) {
//		System.out.println(r[i]+"\t"+
//	String.format("%.2f",a[i])+"\t"+String.format("%.2f,b[i]));
//	}












//public static void main(String[] args) {
//	double r=10.5;
//	double a=Math.PI*r*r;//넓이
//	double b=2*Math.PI*r;//둘레
//	System.out.println("반지름:"+r);
//	System.out.println("넓이:"+String.format("%.2f",a));
//	System.out.println("둘레:"+String.format("%.2f",b));
//	//위의 코드를 5개의 데이터를 가리키는 배열로 처리