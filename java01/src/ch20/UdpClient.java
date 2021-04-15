package ch20;//21.04.07 am10

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UdpClient {
	public static void main(String[] args) {
		try {
			InetAddress address=
					InetAddress.getByName("localhost");//ip주소 조회
			System.out.println("서버에 전송할 메시지를 입력하세요.");
			Scanner scan=new Scanner(System.in);
			String data=scan.next();
			scan.close();
			
			byte[] send=data.getBytes();//스트링을 바이트배열로 변환
			//localhost의 7777포트로 데이터를 전송
			DatagramPacket packet=
					new DatagramPacket(send, send.length, address,7777);
			DatagramSocket socket=new DatagramSocket();
			socket.send(packet);//패킷을 보냄
			socket.close();//소켓 종료
			System.out.println("전송 완료");
			
			DatagramSocket socket2=new DatagramSocket(8888);//데이터 수신용 포트. ip의 8888포트로
			byte[] data2=new byte[65508];
			DatagramPacket packet2=
					new DatagramPacket(data2, data2.length);
			socket2.receive(packet2);//패킷 수신
			socket2.close();
			String message =new String(data2);//바이트배열을 스트링으로 변환
			System.out.println("수신한 메시지 : "+message.trim());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
