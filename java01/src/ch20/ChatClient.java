package ch20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	public static void main(String[] args) throws IOException{
		Socket socket=null;//데이터 통신을 위한 소켓
		PrintWriter writer=null;
		BufferedReader reader=null;
		try {
			socket=new Socket("192.168.10.7",5555);//서버에 접속.
			writer=new PrintWriter(socket.getOutputStream(),true);
			reader=new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			
		} catch (Exception e) {
			System.err.println("서버에 접속할 수 없습니다.");
			System.exit(1);
		}
		
		String receive="";
		String send;
		Scanner sc=new Scanner(System.in);
		while(true) {
			receive=reader.readLine();//서버에서 받은 메시지
			System.out.println("[서버]"+receive);
			if(receive.equals("quit"))
				break;
			System.out.println("입력하세요(종료:quit)");
			send=sc.nextLine();
			if(send.equals("quit")) break;
			if(send !=null) {writer.println(send);//서버에 발신
			}
		}
		sc.close();
		writer.close();
		reader.close();
		socket.close();
	}
	}

