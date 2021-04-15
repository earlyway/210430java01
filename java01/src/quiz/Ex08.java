package quiz;

public class Ex08 { 
	static double bmi(double w,double h) {
		return w/(h*h);
	}
	static String grade(double b) {
		String result="";  //<---=""가 없어도 작동되긴함. 단, 아래 if 문이 완벽해야만 작동됨. 오류방지를 위해 ""쓰는편.
		if(b<18.5) {
			result="저체중";
		}else if(b<23) {
			result="정상";
		}else if(b<25) {
			result="과체중";
		}else {
			result="비만";
		}
		return result;
	}
	public static void main(String[] args) {
		double weight=78;
		double height=170;
		double a=bmi(weight, height/100);
		String b=grade(a);
		System.out.println(String.format("%.2f",a));
		System.out.println(b);
	}
}







//선생님이 답 알려주기전 내가 써본 답.. 노답
//	static double bmi(double a, double b) {
//		return (a/((b/100)*(b/100)));
//		
//		if(n>=25.0) {
//			grade="비만"
//		}else if(n>=23.0) {
//			grade="과체중"
//		}else if(n>=18.5) {
//			grade="정상"
//		}else {
//			grade="저체중"
//		}
//		return grade(double bmi) {
//	}
//	
//	public static void main(String[] args) {
//		double n;
//		n= bmi(78,180);
//		System.out.println("bmi:"+n);
//	}
//}
