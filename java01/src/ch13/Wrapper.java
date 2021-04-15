package ch13;

public class Wrapper {
	public static void main(String[] args) {
		String a="100"; //a라는 스트링에 문자열 100.
		int b=200;
		//문자열+숫자 ==>숫자가 문자열로 바뀌어 연결됨.->+가 플러스가 아니라 link가 됨.
		System.out.println(a+b);
		
		//100+200==>300으로 나오게 하려면?
		System.out.println(Integer.parseInt(a)+b);
		
		//숫자를 문자열로 바꾸는 방법
		System.out.println(Integer.toString(b));
		System.out.println(b+""); //숫자+문자열-->숫자가 문자열로 바뀌어 연결됨.
		
		a="100.5";
		System.out.println(a+b);
		System.out.println(Double.parseDouble(a)+b);
	}
}
