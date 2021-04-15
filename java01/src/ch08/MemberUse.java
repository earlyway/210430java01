package ch08;

public class MemberUse {
	public static void main(String[] args) {
		Member m1 = new Member();//인스턴스를 만든 후
		m1.input("홍길동", "hong", 200000);//입력함수를 통해 값을 전달하는 1방법
		m1.setGrade();
		m1.print();
		
		System.out.println();
		
		//인스턴스를 만든 직후에 바로 값을 전달하는 2방법
		Member m2 = new Member("김사장", "kim", 1000000);
		m2.setGrade();
		m2.print();
	}
}
