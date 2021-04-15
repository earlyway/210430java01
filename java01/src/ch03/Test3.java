package ch03;

public class Test3 {
	public static void main(String[] args) {
		String name="김철수";
		int year=1990;
		int age=2021-year;
		System.out.println(name+"님의 나이는 만"+age+"세입니다");
		int result=age % 2=0 ? "비대상" : "대상";
		System.out.println(name+"님은 건강검진"+result+"입니다");
	}

}
