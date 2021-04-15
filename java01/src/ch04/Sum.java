package ch04;

//1~N까지의 합계 계산
public class Sum {
	public static void main(String[] args) {
		//int num=54;
		if(args.length == 0) {
			System.out.println("매개변수가 없습니다.");
			System.exit(0);
		}
		int num = Integer.parseInt(args[0]);
		int sum = 0;// 합계를 저장할 변수
		for (int i = 1; i <= num; i++) {
			sum = sum + i;// 합계 누적
		}
		System.out.println("1~" + num + "까지의 합계:" + sum);
	}

}
