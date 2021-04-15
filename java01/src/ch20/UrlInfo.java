package ch20;

import java.net.URL;

public class UrlInfo {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://news.naver.com/main/ranking/read.nhn?mode=LSD&mid=shm&sid1=001&oid=648&aid=0000000149&rankingType=RANKING");
			System.out.println("프로토콜"+url.getProtocol());
			System.out.println("포트번호"+url.getPort());
			System.out.println("호스트"+url.getHost());
			System.out.println("파일"+url.getFile());
			System.out.println("기타정보"+url.toExternalForm());
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
