package quiz;

import java.util.Scanner;

public class Ex19my {
	public static void main(String[] args) {
		String numb;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("주민등록번호를 -없이 입력하세요 : ");
		numb=sc.next();
		sc.close();
		
		System.out.println(
				"나이는 "+(2021-Integer.parseInt(numb.substring(0,2))-1900)+"세 입니다");
	}
}
//[문제] 아래와 같이 주민등록번호를 분석하여 결과를 출력하는 프로그램의 코드를 작성하시오. <처리 조건>
//1. 주민등록번호는 키보드로 입력받는다. 2. substring()을 활용하여 문자열의 일부분을 가져온다. 가. substring(beginIndex, endIndex-1)
//나. substring(0,2) => 주민등록번호의 앞 2자리
//3. 국적은 성별 필드의 값이 1~4이면 내국인, 5~8이면 외국인으로 처리한다. 4. 성별은 성별 필드의 값이 홀수이면 남, 짝수이면 여로 처리한다. 5. 멤버변수와 method를 적절하게 설계하여 작성한다. <결과 출력 예>
//주민등록번호를 입력하세요: 901231-1234567
//국적 : 내국인
//나이 : 27세
//성별 : 남
