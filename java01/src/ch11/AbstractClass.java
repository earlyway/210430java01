package ch11;
//추상 클래스 : 추상method가 1개 이상 있는 class

public abstract class AbstractClass {
	abstract void method1(); //완성되지않은 추상method
	
	void method2() {
		System.out.println("완성된 method");
	}

}
