package ch06;

public class CallBy {
	//call by value
	static void test(int b) {
		System.out.println("test method 호출");
		System.out.println(b);
	}
	//call by reference
	static void test2(int[] n) {
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i]+"\t");
		}
	}
	public static void main(String[] args) {
		System.out.println("시작");
		int a=10;
		test(a); //call by value, 실제값을 전달
		int[] num= {10,20,30,40,50};
		test2(num);
		System.out.println("끝");
	}

}
