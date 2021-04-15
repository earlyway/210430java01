package ch08;

public class CalculatorUse {
	public static void main(String[] args) {
		
		Calculator c1=new Calculator(); //인스턴스가 메모리에 올라갔다.
		c1.setLeft(10);
		c1.setRight(20);
		c1.sum();
		c1.avg();
		
		Calculator c2=new Calculator(10,20);
		c2.sum();
		c2.avg();
	}

}
