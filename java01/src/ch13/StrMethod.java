package ch13; //21.03.30 pm14

public class StrMethod {
	public static void main(String[] args) {
		String str1="java";
		//a+=b	a=a+b
		str1 += " program";        //java programming
									   //0123456789~
		System.out.println(str1);
		
		//문자열의 글자수
		System.out.println(str1.length());
		
		// charAt(index) 글자의 위치
		System.out.println(str1.charAt(2));
		
		// indexOf("문자열") 문자열을 찾은 위치
		System.out.println(str1.indexOf("java"));
		System.out.println(str1.indexOf("and"));
		
		// substring(begin, end) 부분문자열
		System.out.println(str1.substring(0,4));
		
		// substring(begin) 끝까지
		System.out.println(str1.substring(5));
		
		//replace(A,B) A를 B로 바꿈
		System.out.println(str1.replace("java","자바"));	
	}
}
