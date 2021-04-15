package ch13;

import java.util.StringTokenizer;

public class StrToken {
	public static void main(String[] args) {
		String str = "apple/banana/grape/melon";
		//구분자로 문자열을 나누어 배열을 리턴
		String[] items = str.split("/");    //for문 이용방법1
		for (String s : items) {
			System.out.println(s);          //for문 이용방법2
//		for(int i=0; i<items.length; i++) {
//			System.out.println(items[i]);
//		}
		}
		//StringTokenizer(문자열, 토큰), 토큰-문자열의 단위
		StringTokenizer st = new StringTokenizer(str, "/");
		int cnt = st.countTokens();//토큰의 수
		System.out.println("토큰개수:" + cnt);
		while (st.hasMoreElements()) {//다음 요소가 있으면 true, 아니면 false
			System.out.println(st.nextToken());//다음 토큰을 읽음
		}
	}

}
