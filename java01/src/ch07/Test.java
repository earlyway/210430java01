package ch07; //21.03.29 pm13

public class Test {
	
	int n;//int ?; 인스턴스 변수, property 변수, 멤버 변수-->new 해야함
	Test(int n){// 생성자 - 인스턴스가 생성될 때, 자동으로 호출되는 method
	//test 뒤에 ()있으므로 test는 method.	
		this.n=n;
		System.out.println("n:"+n);
	}
	
	public static void main(String[] args) { //static 프로그램이 시작했을때 자동으로 시작하는 
		Test t=new Test(100);
		
		t.n=10;
	}
}
