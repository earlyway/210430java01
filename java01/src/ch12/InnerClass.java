package ch12;

public class InnerClass {
	static int x=10; //static 변수
	class Inner{ //내부 클래스 : 클래스속에 클래스가 있음
		int getX() {
			return x; //내부클래스에서 외부 클래스의 멤버 사용 가능
		}
	}
	public static void main(String[] args) {
		System.out.println(x); //static이므로 인스턴스를 만들지않아도 바로 호출가능
		InnerClass e=new InnerClass();
		//내부클래스도 인스턴스를 만들어야 함
		InnerClass.Inner in=e.new Inner(); //클래스.내부클래스=클래스 인스턴스
		System.out.println(in.getX());
	}

}
