package ch04;

public class Continue {
	public static void main(String[] args) {
		for(int i=1; i<=12; i++) {
			if(i%5 == 0) continue;
			//5의 배수이면 출력하지않고 다음 단계를 진행.
			System.out.println(i);
		}
	}

}
