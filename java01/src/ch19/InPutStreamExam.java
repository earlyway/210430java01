package ch19;//21.04.05 pm12

import java.io.IOException;

public class InPutStreamExam {
	public static void main(String[] args) {
		int var=0;
		System.out.println("내용을 입력하세요:");
		try {
			var=System.in.read();
			while(var != 13) {
				System.out.println((char)var);
				var=System.in.read();
		}
	}catch(IOException e) {
		e.printStackTrace();
	}
	}

}
