package ch20;//21.04.07 am10

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

public class UdpServer {
	public static void main(String[] args) {
		byte[] data=new byte[65508];//바이트배열
		DatagramPacket packet=new DatagramPacket(data, data.length);//데이터 수신용 패킷
		try {
			//udp통신을 위한 포트개방
			DatagramSocket socket=new DatagramSocket(7777);
			System.out.println("서비스를 시작");
			socket.receive(packet);//클라이언트에서 보낸 데이터를 수신.
			System.out.println("클라이언트의 ip주소 : "+
							packet.getAddress().getHostAddress());
			//패킷내부의 데이터를 스트링으로 변환
			String receive= new String(packet.getData());
			System.out.println("클라이언트의 메시지 : "+receive.trim());
			
			System.out.println("응답할 메시지를 입력하세요.");
			Scanner scan=new Scanner(System.in);
			String msg=scan.next();
			//클라이언트에게 데이터 전송, 스트링.getBytes() 스트링을 바이트배열로 변환
			scan.close();
			
			packet=new DatagramPacket(msg.getBytes(),
					msg.getBytes().length,packet.getAddress(),8888);
			socket.send(packet);
			socket.close();//소켓 닫기, 통신 종료
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
