package ch06;

//static 정적
//dynamic 동적
//new.자료형--->동적 메모리 할당, 더이상 사용하지않으면 자동으로 제거.

public class Test {
	int a=10;
	public static void main(String[] args) {
		// 인스턴스, 객체 작업(new 활용)
		// t==객체참조변수
		Test t=new test(); //test 클래스를 메모리에 올리세요. t라는 인스턴스에 a를 불러오세요.
		System.out.println(t.a);
	}
}
