package ch20;//21.04.06 pm13

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class DateClient {
	public static void main(String[] args)throws Exception {
		//서버에 접속    Socket(ip,port)
		Socket s=new Socket("localhost",9100);
		//서버에서 보내는 메시지를 읽기위한 스트림 생성
		BufferedReader input=
				new BufferedReader(new InputStreamReader(s.getInputStream()));
		//서버에서 보낸 메시지를 읽음
		String res=input.readLine();
		System.out.println(res);
		s.close();//소켓종료, 연결종료
		System.exit(0);//프로그램을 강제종료
	}
}
