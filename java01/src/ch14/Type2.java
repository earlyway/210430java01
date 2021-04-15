package ch14;

public class Type2 {
	Object value;
	public Object getValue() { //get 입력 후 ctrl+space 하면 빠르게작성.
		return value;
	}
	public void setValue(Object value) { //set 입력 후 ctrl+space
		this.value = value;
	}
	public static void main(String[] args) {
		Type2 t=new Type2();
		t.setValue("45342");
		System.out.println(t.getValue());
	}
}
