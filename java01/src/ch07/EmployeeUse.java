package ch07;

public class EmployeeUse {
	public static void main(String[] args) {
		Employee e1=new Employee(); //인스턴스 생성
		//method 호출
		e1.input("김과장","관리부","과장",300);	//입력 name part posit
		e1.calc();							//계산
		e1.print();							//출력
		System.out.println(e1); //F3 소스코드 보기
	}

}
