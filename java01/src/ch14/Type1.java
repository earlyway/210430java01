package ch14;

public class Type1 {
	int value;
	public int getValue() { //get 입력 후 ctrl+space 하면 빠르게작성.
		return value;
	}
	public void setValue(int value) { //set 입력 후 ctrl+space
		this.value = value;
	}
	public static void main(String[] args) {
		Type1 t=new Type1();
		t.setValue(100);
		System.out.println(t.getValue());	
	}
} //자로형이 int라서 정수형 변수만 올수있고 나머진 올수 없음.
  //그래서 좀 더 큰 녀석인 object를 이용해서 다양한 자료형이 올수 있도록한 게 Type2 class
