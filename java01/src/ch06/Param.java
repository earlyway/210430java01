package ch06;

public class Param {
	static int plus(int a, int b) {
		return a+b;
	}
	static int minus(int a, int b) {
		return a-b;
	}
	static int multi(int a, int b) {
		return a*b;
	}
	static int divide(int a, int b) {
		return a/b;
	}
	public static void main(String[] args) {
		int n;
		n= plus(12,22);
		System.out.println("plus:"+n);
		n= minus(32,22);
		System.out.println("minus:"+n);
		n= multi(12,22);
		System.out.println("곱하기:"+n);
		n= divide(40,4);
		System.out.println("나누기:"+n);
	}
}

//main이 제일 먼저 시작.