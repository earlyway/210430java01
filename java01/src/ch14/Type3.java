package ch14; //21.03.31 am10:38
//제네릭, 일반화
public class Type3<T> { //<T>  <==제네릭 일반화
	T value;	//자료형이 미정, 실행할 때 결정됨.(모든 자료형을 받을수있도록 T라는 임시자리를 만든것임)
	public T getValue() { //get Ctrl+space
		return value;
	}
	public void setValue(T value) { //set Ctrl+space
		this.value = value;
	}
	public static void main(String[] args) {
		// 클래스이름<자료형>
		Type3<String> t= new Type3<String>(); 
		t.setValue("hello");
		System.out.println(t.getValue());
		
		Type3<Integer> t2= new Type3<Integer>(); 
		t2.setValue(30);
		System.out.println(t2.getValue());
	}
}
