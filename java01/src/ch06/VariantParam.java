package ch06;

public class VariantParam {
	//가변사이즈 매개변수, 매개변수의 개수에 상관없이 배열로 처리됨.
	static void print(String ... n) {//가변형 매개변수
		System.out.println("=================="); //6라인 없어도 됨.
		for(int i=0; i<n.length; i++) {
			System.out.println("n["+i+"]:"+n[i]);
		}
	}
	
	public static void main(String[] args) {
		print("java","test");
		
		print("100","600","900","1000");
	}
}


//printf(출력형식, 데이터)   print fomatted
//%d 정수형식, %s 스트링형식 %f실수형식 %c 문자형식
//System.out.printf("%d %s",10,"hello");

// \n줄바꿈문자
