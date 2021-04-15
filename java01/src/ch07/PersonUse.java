package ch07;
//shift+좌클릭으로 두개의 class를 동시에 띄우기.person+personuse
public class PersonUse {
	public static void main(String[] args) {
		//Person class의 인스턴스를 만들고
		//참조변수 p가 인스턴스의 시작주소를 가리킴
		Person p=new Person();
		System.out.println(p);
		//p가 가리키는 주소의 name변수에 입력
		//p.name="김철수"
		p.setName("김철수");
		p.setAge(20);
		p.height=185;
		//객체참조변수 p.변수 /// .은 멤버조회
		System.out.println(
				p.getName());
		System.out.println(p.getAge());
		System.out.println(p.height);
	}
}