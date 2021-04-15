package ch20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	public static void main(String[] args) throws IOException{
		ServerSocket serverSocket=null;
		try {
			serverSocket=new ServerSocket(5555);
			System.out.println("서비스 시작");
			
		} catch (IOException e) {
			System.out.println("서비스를 시작할 수 없습니다.");
			System.exit(1);
		}
		
		Socket clientSocket=null;
		try {
			clientSocket=serverSocket.accept();
			System.out.println("접속한 클라이언트의 ip주소 :"+
						clientSocket.getInetAddress().getHostAddress());
			
		} catch (IOException e) {
			System.err.println("서버에 접속할 수 없습니다.");
			System.exit(1);
		}
		//데이터 입출력을 위한 스트림 생성
		PrintWriter writer=new PrintWriter(
					clientSocket.getOutputStream(),true);
		BufferedReader reader = new BufferedReader(
					new InputStreamReader(clientSocket.getInputStream()));
		
		String receive="";
		String send="Welcome!!";
		writer.println(send);//클라이언트에 메시지 보내기.
		Scanner sc=new Scanner(System.in);
		while (true) {
			receive = reader.readLine();//클라이언트에서 보낸 메시지를 수신.
			if(receive==null || receive.equals("quit"))
	break; //반복문 종료 조건
	System.out.println("[클라이언트]"+receive);
	System.out.println("입력하세요(종료:quit) :");
	send=sc.nextLine();//키보드로 입력받은 후(1)
	//발신
	writer.println(send); //클라이언트에게 보내기(2)
	if(send.equals("quit"))
	break; 
		}
		sc.close();
		writer.close();
		reader.close();
		clientSocket.close();
		serverSocket.close();
	}
}