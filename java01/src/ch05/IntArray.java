package ch05;

public class IntArray {
	public static void main(String[] args) {
		//자료형[] 변수; 배열의 가리키기때문에 '배열참조변수'라고 한다.
		//배열의 시작주소값을 가리킴
		int[] num= {10,20,30,40,50}; //int면 1개를 가리키지만 int[] 은 배열이므로 여러개를 가리킬수있음
		for(int i=0; i<5; i++) {
	  //for(int i=0; i<num.length; i++) ;
			  //초기식        조건식   증감식
			//배열[인덱스] 배열의 데이터 조회
			System.out.println(num[i]);
		}
//확장 for문  개별값  : 집합
		for(int n : num) {
			System.out.println(n);
		}
	}
	

}
