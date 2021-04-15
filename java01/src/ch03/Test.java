package ch03;
//숫자를 입력하면 짝수인지 홀수인지
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int a=sc.nextInt();//정수 입력
		String b= a%2 ==0 ? "짝수" : "홀수";
		System.out.println(b);
	

if (a%2 ==0) {
	System.out.println("짝수");
}else {
	System.out.println("홀수");
}

}
}