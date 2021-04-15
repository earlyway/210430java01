package ch10;
//final method(overriding이 금지된 method)
//overriding : 상위클래스를 상속받아 상위클래스의 method를 재정의(치환)하는것.
class Test{
	private int num=100;
	public void print() {		//<-public과 void 사이에 final을 넣는다면
		System.out.println(num);//error 발생.
	}							//final이 붙어있다면 하위클래스에 override하면 안됨.
}


public class FinalMethod extends Test {  //class 하위클래스 extends 상위
	public void print(){ //error
	System.out.println("하위클래스의 print method");
  }
	public static void main(String[] args) {
		FinalMethod f=new FinalMethod();
		f.print();							//참조변수 f==> 상위클래스 num
									     	//				    print()
											//			하위클래스	print()
							//상위클래스의 method(print())를 가져와서 하위에서 재정의하여 표기 override
	}
}
