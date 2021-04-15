package ch06;
//static 정적
//dynamic 동적
//new.자료형--->동적 메모리 할당, 더이상 사용하지않으면 자동으로 제거.
public class Return {
	//정수값을 리턴하는 method
	//method이름(매개변수 parameter) method를 호출하면서 전달하는 값을 받는 변수
	static int sum(int a) {
		int result=0;
		for(int i=1; i<=a; i++) {
			result=result+i;
		}
		return result;
	}
	public static void main(String[] args) {
		int n = sum(50);
		System.out.println(n);
		n=sum(100);
		System.out.println(n);
	}

}
