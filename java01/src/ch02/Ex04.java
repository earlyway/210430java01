package ch02;

public class Ex04 {
	public static void main(String[] args) {
		char ch='金'; //1개의 문자, 작은따옴표
		System.out.println(ch);
		System.out.println((int)ch);//정수형으로 변환
		int a=97;
		System.out.println(a);
		System.out.println((char)a);//문자형으로 변환
		//문자엔 고유한 숫자코드가 배정되어 있음
		for(int i='가' ; i<'나' ; i++) {//반복문, 0부터 255까지 1씩 증가
			System.out.println(i+"==>"+(char)i);
		}
	}

}
