package ch03;

public class Compare {
	public static void main(String[] args) {
		int a=65;
		char c= 'A';
		System.out.println(a == c); //같다
		System.out.println(a=c);    //대입
		System.out.println('A' != 65); //A와 65는 not equal
	}
}
