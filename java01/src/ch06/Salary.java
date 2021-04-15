package ch06;

public class Salary {
	static String[] name = { "박과장", "김과장", "이대리", "최주임", "홍실장" };
	static int[] salary = { 2800, 3000, 2500, 2000, 3500 }; // 연봉
	static int[] bonus = { 0, 0, 0, 0, 0 }; // 연봉의 30%
	static int[] total = { 0, 0, 0, 0, 0 }; // 총액(연봉+보너스)
	static int[] tax = { 0, 0, 0, 0, 0 }; // 세금(총액의 3%)
	static int[] pay = new int[5]; // 실수령액(총액-세금) { 0, 0, 0, 0, 0 }; == new int[5];
	static int pay_tot; // 실수령액 합계

	static void calc() { //계산함수(first
		for (int i = 0; i < name.length; i++) {
			bonus[i] = (int) (salary[i] * 0.3); //보너스, 정수형으로 변환
			total[i] = salary[i] + bonus[i];
			tax[i] = (int) (total[i] * 0.03);
			pay[i] = total[i] - tax[i];
			pay_tot = pay_tot + pay[i];
		}
	}

	static void print() { //출력함수(second
		System.out.println("이름\t연봉\t보너스\t총액\t세금\t실수령액");
		for (int i = 0; i < name.length; i++) {

			System.out.println(name[i] 
							+ "\t" + salary[i] 
							+ "\t" + bonus[i] 
							+ "\t" + total[i] 
							+ "\t" + tax[i] 
							+ "\t" + pay[i]);
		}
		System.out.println("실수령액 평균 : " + pay_tot / 5);
	}

	public static void main(String[] args) {
		calc(); //계산함수 호출(first
		print();//출력함수 호출(second
	}
}
