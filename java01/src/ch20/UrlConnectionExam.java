package ch20;//21.04.06 am11:50

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
//Uniform Resource Locator
public class UrlConnectionExam {
	public static void main(String[] args) {
		URL url=null;
		try {
			url=new URL("http://google.com");//url 인스턴스 생성
			HttpURLConnection conn=(HttpURLConnection)
					url.openConnection();//url에 접속
			
			System.out.println("연결정보:"+conn);
			if(conn != null) {//접속정보가 있으면
				conn.setConnectTimeout(10000);//타임아웃 시간 설정
				StringBuilder sb=new StringBuilder();
				if(conn.getResponseCode()==
						HttpURLConnection.HTTP_OK){//응답코드값 확인
							BufferedReader br=
									new BufferedReader(new InputStreamReader(
										conn.getInputStream(),"utf-8"));//스트림 생성
							while(true) {
								String line=br.readLine();//한 라인을 읽음
								if(line==null) break;//내용이 없으면 반복문 종료
								sb.append(line+"\r\n");//스트링 빌더에 내용 추가
							}
							br.close();//버퍼리더 클리어(끝)
						}
						conn.disconnect();//url 접속해제
						System.out.println(sb);//스트링빌더에 저장된 내용을 콘솔에 출력
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
