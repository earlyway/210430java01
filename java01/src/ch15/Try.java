
package ch15; //21.03.31 pm14:50

public class Try {
	public static void main(String[] args) {
		int[] num= {10,20,30,40,50};
		try {
		for(int i=0; i<=5; i++)
		System.out.println(num[i]);
		}
	 catch(Exception e) {
		System.out.println("인덱스 범위 초과 오류");
	}finally {
		System.out.println("항상 실행되는 코드");
	}
	System.out.println("종료");

	}
}
