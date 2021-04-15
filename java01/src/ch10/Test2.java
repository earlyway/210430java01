package ch10;

public class Test2 {
//	void print(int a) {
//		System.out.println(a);
//	}
//	void print(double a) {
//		System.out.println(a);
//	}
	void print(Object a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Test2 t=new Test2();
		t.print(10);
		t.print(10.5);
		t.print("hello");
	}

}
