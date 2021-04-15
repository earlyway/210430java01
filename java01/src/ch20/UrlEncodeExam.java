package ch20;

import java.net.URLEncoder;

public class UrlEncodeExam {
	public static void main(String[] args) {
		try {
			//url encoding : url에 포함된 특수문자, 한글을 변환.
			System.out.println(URLEncoder.encode("my name is kim","utf-8"));
			System.out.println(URLEncoder.encode("message=안녕하세요","utf-8"));
			System.out.println(URLEncoder.encode("my+name+is+kim","utf-8"));
			System.out.println(URLEncoder.encode("message%3D%EC%95%88%EB%85%95%ED%95%98%EC%84%B8%EC%9A%94","utf-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
