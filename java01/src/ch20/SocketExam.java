package ch20;

import java.net.ServerSocket;


public class SocketExam {
	public static void main(String[] args) {
		ServerSocket socket = null;//서비스를 제공하는 소켓
		for(int i=100; i<=10000; i+=10) {
			try {
				socket=new ServerSocket(i);//서비스 제공을 위하여 i번 포트 개방
				socket.close();//소켓 종료
				
			} catch (Exception e) {
				System.out.println(i+"번 포트는 사용중입니다.");
			}
		}
	}
}
