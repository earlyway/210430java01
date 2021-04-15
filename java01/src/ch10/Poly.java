package ch10; //21.03.30

class AA{
	int a=10;
	public void print() { //상위클래스의 method 1
		System.out.println(a);
	}
}
class BB extends AA{ //BB=하위클래스 AA=상위클래스 AA를 상속받은 BB클래스
	int a=20;
	public void print() {  //override
		System.out.println(a); //상위클래스의 method가 override되어 재정의.
	}
}
public class Poly {
	public static void main(String[] args) {
		BB b=new BB();	//좌변과 우변의 자료형이 같음
		b.print();		//BB의 method가 호출됨
		AA aa=new BB(); //좌변과 우변의 자료형이 다름(좌변이 상위클래스) //상위변수=new 하위();-->>상위크래스의 참조변수로 하위클래스의 method 호출(이게 다형성)
		System.out.println(aa.a); //변수는 상위클래스의 멤버
		aa.print(); //method는 하위클래스가 호출됨
		
	} 	

}
