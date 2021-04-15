package ch04;

public class Ifelse {
	public static void main(String[] args) {
		int kor = 85, mat = 90, eng = 70;
		int tot = kor + eng + mat;
		double avg = tot / 3.0;
		String grade = "";
		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else { //그외의 모든경우
			grade = "F";
		}
		// 결과 출력
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println(kor + "\t" + eng + "\t" + mat + "\t" + 
		tot + "\t" + String.format("%.1f", avg) + "\t" + grade);

	}

}
