package ch15;

public class ExceptionExam {
	public static void main(String[] args) {
		int a=10, b=0, c;
		try { //예외가 발생할 가능성이 있는 코드를 실행하다가 문제가 발생하면 멈추고
			c=a/b;// 분모에 0이 입력되서 예외가 발생함(비정상적으로 종료됨)
			System.out.println(c);
		} catch(Exception e) {//catch절에서 예외를 잡으면 실행할 코드        
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
