package ch13;

public class Str {
	public static void main(String[] args) {
		//String str=new String("Java");
		String str="Java";
		System.out.println(str);
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println("변경후 : "+str);
		//스트링의 원본은 바뀌지않음
		str=str.toLowerCase(); //새로운 문자열이 만들어짐
		System.out.println(str);
		
		str="";//빈 문자열
		str=null;// 가리키는 내용이 없을때
		System.out.println(str);
		
		char ch='\0'; //null character
		System.out.println((int)ch);
		ch=' '; //space
		System.out.println((int)ch);
	}

}
