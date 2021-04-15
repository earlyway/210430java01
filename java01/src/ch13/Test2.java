package ch13; //21.03.30 pm14

public class Test2 {
	public static void main(String[] args) {
		String birth="19900101";				//19900101
		String year=birth.substring(0,4);		//01234567
		String month=birth.substring(4,6);
		String date=birth.substring(6);
		System.out.println(year+"년 "+date+"월 "+date+"일");
		
		int age=2021-Integer.parseInt(year);
		
		System.out.println("나이 : "+age+"세");
	}
}
		
		
		
		
		
		
		
		
		
		
		
		//		String birth="19900101"; //1990년 01월 01일
//		
//		
//		System.out.println(birth.substring(0,4)+"년");
//		System.out.println(birth.substring(5,6)+"월");
//		System.out.println(birth.substring(7,8)+"일");
//		
//		int age=2021-Integer.parseInt
//		
//	}
//
//}
