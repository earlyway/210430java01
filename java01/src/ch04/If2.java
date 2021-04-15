package ch04;

public class If2 {
	public static void main(String[] args) {
		// args 명령행 매개변수를 참조하는 변수, length 데이터 개수
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);// [인덱스]
		}
		// Integer.parseInt(스트링) 스트링(문자열)을 정수숫자로 변환
		int num = Integer.parseInt(args[0]);// 첫번째값
		if (num % 2 == 0) {// 2로 나눈 나머지가 0이면
			System.out.println(num + "==>짝수입니다.");
		} else { // 0이 아니면
			System.out.println(num + "==>홀수입니다.");
		}
	}
}
