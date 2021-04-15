package ch08;
//생성자의 역할-인스턴스의 초기화 작업
public class Calculator {
	private int left;
	private int right;
//class 이름과 같고 리턴타입이 없는 특별한 형태의 method
	Calculator(){ //  ()가 있는걸 보니 method구나. ()안에 아무것도 없으니 기본생성자 default.
		System.out.println("생성자 호출");
	}
	Calculator(int left, int right){ //  ()가 있는걸 보니 calculator는 method구나.
		System.out.println("매개변수가 있는 생성자 호출");
		this.left=left;
		this.right=right;
	}
	
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public void sum() {
		System.out.println(left+right);
	}
	
	public void avg() {
		System.out.println((left+right)/2);
	}
}
