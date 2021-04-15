package ch10;

final class A{
	private int num;
	public void print() {
		System.out.println(num);
	}
}
//class B extends A { //error발생(왜냐면 final class는 상속이 안되기때문.)

//}

public class FinalClass {
	public static void main(String[] args) {
		System.out.println(Math.PI);
	}

}
