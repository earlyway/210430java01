package ch06;
//절대값 계산 method
public class Abs {
//	public static void main(String[] args) {
//		int a=-5;
//		System.out.println("a의 값"+a);
//		System.out.println("a의 절대값:"+abs(a));
//		//java.lang 패키지에 포함된 method
//		System.out.println("a의 절대값:"+Math.abs(a));
//	}
//	static int abs(int num) {
//		return num>=0? num:-num;
//	}
//
//}

	
	
	//아래는 선생님이 한 코딩
 public static void main(String[] args) {
	int a=-5;
	System.out.println("a:"+a);
	System.out.println("절대값:"+abs(a));
	a=5;
	System.out.println("a:"+a);
	System.out.println("절대값:"+abs(a));
	
	a=-10;
	//Math 클래스에서 제공하는 절대값 계산 함수 
	System.out.println(Math.abs(a));
    }
 static int abs(int num) {
	 		//조건 ? true : false
	 return num>=0? num : -num;
 }
}