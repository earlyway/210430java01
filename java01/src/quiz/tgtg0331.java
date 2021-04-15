package quiz;

import java.util.Scanner;

public class tgtg0331 {
	public static void main(String[] args) {
		int jumsu=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("임의의 숫자를 입력하세요:");
		
		jumsu=scanner.nextInt();
		System.out.println("점수:"+jumsu);
		scanner.close();
		
		char grade;
		switch(jumsu/10) {
		
		case 10:
		case 9:
				grade='A';
		System.out.println("입력된 점수"+jumsu+"점은 "+grade+"학점입니다.");
		break;
		
		case 8:
			grade='B';
		System.out.println("입력된 점수"+jumsu+"점은 "+grade+"학점입니다.");
		break;
		
		case 7:
			grade='C';
		System.out.println("입력된 점수"+jumsu+"점은 "+grade+"학점입니다.");
		break;
		
		case 6:
			grade='D';
		System.out.println("입력된 점수"+jumsu+"점은 "+grade+"학점입니다.");
		break;
		
		case 5:
			case 4:
				case 3:
					case 2:
						case 1:
							case 0:
								grade='F';
		System.out.println("입력된 점수 "+jumsu+" 점은 "+grade+"학점입니다.");
		break;
		
		default:
			System.out.println("잘못된 점수 입력입니다");
		
			}

}
}