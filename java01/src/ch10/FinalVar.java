package ch10;
// final변수-값을 수정할 수 없음(상수)
public class FinalVar {
	public static void main(String[] args) {
		final int MAX=100; //은행의 이자율, 물가상승률, 가격의 최대값 등 고정값
		//final int MAX; //초기값이 반드시 필요함.
		System.out.println(MAX);
		//MAX=150; //error 생김.
	}
}
