package ch07;

public class PointUse {
	public static void main(String[] args) {
		//class의 인스턴스를 만들고 참조변수에 시작주소값을 전달
		Point p1=new Point(); //p메모리 1세트 올리기
		//데이터 입력
		p1.input("김", 90, 100, 80);   //참조변수.method()  .은 접근가능한 멤버조회
		//p1.setName("김"); 
		//p1.setKor(90);
		//p1.setEng(100);
		//p1.setMat(80);
		//데이터 출력
		p1.print();
		
		Point p2=new Point(); //p메모리 2세트 올리기
		p2.input("박", 80, 99, 95);
		p2.print();
	}

}
