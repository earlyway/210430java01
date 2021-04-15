package ch04;

public class Switch {
	public static void main(String[] args) {
		int kor = 85, mat = 90, eng = 70;
		int tot = kor + eng + mat;
		double avg = tot / 3.0;
		String grade = "";
		// 해당 케이스로 이동
		switch ((int) (avg / 10)) { // 조건식(정수, 스트링)
		case 10: //avg/10이 10이면 등급A
		case 9:grade = "A";break;// break를 만나면 switch문을 벗어남.
		case 8:grade = "B";break;
		case 7:grade = "C";break;
		case 6:grade = "D";break;
		default:grade = "F"; // 나머지 모든 경우
		}
		// 결과 출력
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println(kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" 
		+ String.format("%.1f", avg) + "\t" + grade);
	}
}
