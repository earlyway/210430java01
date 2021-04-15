package ch05;
//배열에 데이터를 내가 고정.

public class StringArray {
	public static void main(String[] args) {
		//스트링 배열
		String[] str={"Java","JSP","Android","Html5"}; //메모리에 4개의 데이터가..
//		String[] str=new String[4];
//		str[0]="Java";
//		str[1]="jsp";
//		str[2]="android";
//		str[3]="html";
		// 배열참조변수.length ==>데이터의 개수
		// 배열참조변수[인덱스]
		System.out.println("데이터의 개수 "+str.length);
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		// 확장 for문 개별값 : 집합(배열)
		for(String ss : str) {
			System.out.println(ss);
		}
	}

}
