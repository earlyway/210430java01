package ch06;

public class Overload {
	//동일한 기능의 함수(print)이고 자료형(int,double,,,)만 다를경우
	//같은 함수이름을 중복해서 사용할수 있음.
	static void print(int a) {
		System.out.println(a);
	}
	static void print(double a) {
		System.out.println(a);
	}
	static void print(String a) {
		System.out.println(a);
	}
//	static void print(Object a) {
//		System.out.println(a);
	
	//오버로딩의 기준은 매개변수(parameter)
	public static void main(String[] args) {
		print(10);
		print(100.5);
		print("hello");
	}
}
