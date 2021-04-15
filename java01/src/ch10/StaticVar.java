package ch10; //21.03.30 am10

public class StaticVar {
	static int a =10; //static
	int b=20;			//non-static이므로 사용하려면 인스턴스(new)만들고
	
	public static void main(String[] args) { //static method
		System.out.println(StaticVar.a);
		//System.out.println(b); 	//error발생 
		
		StaticVar e1=new StaticVar();
		System.out.println(e1.b);
		 				//(인스턴스 참조변수.멤버변수)
	}

}
