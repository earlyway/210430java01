package ch20; //21.04.06 pm15

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class guguServer implements Runnable {
	private ServerSocket serverSocket;
	private Socket socket;
	private DataInputStream dis;
	private DataOutputStream dos;
	
	public guguServer() {
		try {
			serverSocket=new ServerSocket(9999);
			System.out.println("구구단 서비스가 시작되었습니다.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		while(true) {
			try {
				socket=serverSocket.accept();
				InetAddress ip=socket.getInetAddress();
				System.out.println("클라이언트의 ip주소 :"+ip);
				dis=new DataInputStream(socket.getInputStream());
				dos=new DataOutputStream(socket.getOutputStream());
				Thread th=new Thread(this);
				th.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new guguServer();
	}
	@Override
	public void run() {
		System.out.println("현재 실행중인 스레드 이름 :"
						+Thread.currentThread().getName());
		try {
			while(true) {
				int dan=dis.readInt();//클라이언트에서 보낸 숫자값
				System.out.println("클라이언트에서 요청한 값 :"+dan);
				StringBuilder sb=new StringBuilder();
				String str="";
				for(int i=1; i<=9; i++) {
					str += dan+"x"+i+"="+dan*i+"\r\n";//스트링빌더에 결과 누적
				}
				dos.writeUTF(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
