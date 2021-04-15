package ch13;
//모든 클래스엔 Object 크래스가 포함되어 있음
public class Obj {
	
	@Override
		// TODO Auto-generated method stub
	public String toString() {
		//return super.toString();  //object에서 선언한 tostring을 호출하세요
	return "현재 클래스";
	}
	
	public static void main(String[] args) {
		Obj e1 = new Obj(); //e1이라는 객체참조변수
		System.out.println(e1.getClass());//클래스의 정보
		System.out.println(e1);//toString()이 호출됨

		System.out.println(e1.toString());//인스턴스의 해시코드
	}

}
