package ch04;

public class For {
	public static void main(String[] args) {
		String str = null;// 가리키는 데이터가 없는 상태
		System.out.println(str);
		System.out.println(args);
		if (args.length == 0) {// 데이터 개수가 0이면
			System.out.println("명령행 매개변수를 입력하세요");
			System.exit(0);// 프로그램 강제종료
		}
		// 첫번째 매개변수(스트링문자열)를 숫자로 바꾸고
		int num = Integer.parseInt(args[0]);
		// 그 숫자만큼 반복 처리
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}

}
