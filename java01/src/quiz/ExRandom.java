package quiz;

import java.util.Random;
import java.util.Scanner; //21.03.30 pm17:50

public class ExRandom {
	public static void main(String[] args) {
		Random r=new Random(); //난수 생성 클래스
		int com=r.nextInt(100)+1; //1~100
		Scanner sc=new Scanner(System.in);
		int user=0;		//변수 선언, 초기값 할당
		int count=0;
		while(true) {   //true 말고 com != user 해도될듯
			System.out.println("숫자를 입력하세요:"); //입력
			user=sc.nextInt();
			count++;
			if(com==user) {
				System.out.println("정답.");
				System.out.println(count+"회만에 맞췄습니다.");
				break;
			}else if(com>user) {
				System.out.println("더 큰 수를 입력하세요.");
			}else if(com<user) {
				System.out.println("더 작은 수를 입력하세요.");
			}
		}
		
	}
}
//	
//	Random r=new Random();
//	System.out.println(r.nextInt(100)+1);
//	
//	
//	int m=0;
//	Scanner sc=new Scanner(System.in);
//	System.out.println("1~100 사이의 값을 입력하세요 : ");
//	m=sc.nextInt();
//}
//}
