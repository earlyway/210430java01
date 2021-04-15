package ch04;

//1~n까지의 숫자 출력 do~while
public class Dowhile {
	public static void main(String[] args) {
		int i = 1;
		do {// 먼저 실행하고
			System.out.println(i);
			i++;
		} while (i <= 10); //나중에 검사
	}

}
