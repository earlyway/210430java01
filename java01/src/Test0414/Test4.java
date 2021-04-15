package Test0414;

import java.net.InetAddress;

public class Test4 {
	public static void main(String[] args) {
		try {
			InetAddress[] address = InetAddress.getAllByName("naver.com");
			for (int i = 0; i < address.length; i++) {
				System.out.println(address[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
