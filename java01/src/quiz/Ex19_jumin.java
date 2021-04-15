package quiz;
//[문제] 아래와 같이 주민등록번호를 분석하여 결과를 출력하는 프로그램의 코드를 작성하시오. 
//<처리 조건>1. 주민등록번호는 키보드로 입력받는다. 2. substring()을 활용하여 문자열의 일부분을 가져온다. 가. substring(beginIndex, endIndex-1)
//나. substring(0,2) => 주민등록번호의 앞 2자리
//3. 국적은 성별 필드의 값이 1~4이면 내국인, 5~8이면 외국인으로 처리한다. 4. 성별은 성별 필드의 값이 홀수이면 남, 짝수이면 여로 처리한다. 5. 멤버변수와 method를 적절하게 설계하여 작성한다. 
//<결과 출력 예>주민등록번호를 입력하세요: 901231-1234567
//국적 : 내국인
//나이 : 27세
//성별 : 남
import java.util.Scanner;

public class Ex19_jumin {
	private String jumin;
	private int age;
	private char gender;
	private String strGender;
	private String nation;

	public Ex19_jumin() {
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요:");
		jumin = scan.nextLine();

		calc();
	}

	public void calc() {
		int base = 0;
		// 901231-1234567
		gender = jumin.charAt(7);
		switch (gender) { // 정수,문자,스트링
		case '1':
		case '2':
		case '5':
		case '6':
			base = 1900;
			break;
		case '3':
		case '4':
		case '7':
		case '8':
			base = 2000;
			break;
		}
		age = 2021 - (base + Integer.parseInt(jumin.substring(0, 2)));

		if (gender >= '1' && gender <= '4') {
			nation = "내국인";
		} else if (gender >= '5' && gender <= '8') {
			nation = "외국인";
		}

		switch (gender) {
		case '1':
		case '3':
		case '5':
		case '7':
			strGender = "남";
			break;
		case '2':
		case '4':
		case '6':
		case '8':
			strGender = "여";
			break;
		}
	}

	@Override
	public String toString() {
		String result = "국적:" + nation + "\n" + "나이:" 
				+ age + "\n" + "성별:" + strGender;
		return result;
	}

	public static void main(String[] args) {
		Ex19_jumin ex = new Ex19_jumin();
		ex.input();
		System.out.println(ex); // toString() 호출
	}
}

