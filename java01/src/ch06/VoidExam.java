package ch06;

public class VoidExam {
	//static method : 프로그램이 시작될때 메모리에 자동으로 올라가는 method
	//void 리턴값이 없는 method에 사용(처리만 하고 끝나는).
	static void hello() {
		System.out.println("안녕하세요?");
	}
	// main : 프로그램의 시작점
	public static void main(String[] args) { //method header
		System.out.println("프로그램 시작");
		hello(); //method를 호출
		System.out.println("프로그램 종료");
	}

}
