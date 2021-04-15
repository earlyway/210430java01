package ch04;

// while 1~n까지의 숫자 출력.
public class While {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {// 조건식이 true일동안 반복 처리.
			System.out.println(i++);// 출력 후 i 증가.
		}
	}

}
//while(true){
//system.out.println(i);
//i++;
//if(i>10) break;//조건을 만족하면 반복문 종료.
