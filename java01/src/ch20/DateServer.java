package ch20;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss=new ServerSocket(9100);//서비스 제공을 위한 소켓 생성
		System.out.println("서비스 시작");
		while(true) {
			//클라이언트가 접속하면 접속을 허가하고 데이터 통신을 위한 소켓생성
			Socket socket=ss.accept();
			//소켓을 통해 클라이언트에 데이터를 보내기위한 스트림 생성, true : auto flush
			PrintWriter out=
					new PrintWriter(socket.getOutputStream(),true);
			//날짜를 스트링 형식으로 변환
			SimpleDateFormat sdf=
					new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
			String str=sdf.format(new Date());//java.util.date
			//스트림을 통해 클라이언트에 데이터를 전송.
			out.println(str);
			socket.close();//소켓 닫기, 연결종료
		}
	}
}
