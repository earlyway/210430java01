package ch15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleExam {
public static void main(String[] args) {
	int num=50;
	Scanner scan=null;
	//try절 내부에 여러개의 예외가 발생할 경우
	//Exception class는 최상위예외클래스이므로 마지막 부분에 작성해야함.
	//최상위예외클래스를 맨위로 올려서 작성하면 최상위이므로 아래의 클래스들이 무용지물이 됨+예외 문구로만 잡게됨.
	try {
		System.out.println("숫자 입력하세요:");
		scan=new Scanner(System.in);
		int value=scan.nextInt();
		System.out.println(num/value);
	} catch (ArithmeticException e) {
		System.out.println("분모에 0이 올 수 없습니다.");
		// TODO: handle exception
	} catch (InputMismatchException e) {
		System.out.println("숫자만 입력할 수 있습니다.");
		// TODO: handle exception
	}catch (Exception e) {
		System.out.println("기타 예외 발생");
		// TODO: handle exception
	}
	System.out.println("종료");
}
}
