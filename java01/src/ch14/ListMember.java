package ch14; //21.03.31 am11:20
 //실무에서 많이 쓰는 스타일의 코딩임.
import java.util.ArrayList;

public class ListMember {
	public static void main(String[] args) {
		ArrayList<Member>list=new ArrayList<Member>(); //member자료형을 저장하는 리스트
		
		Member m1=new Member(); //member class의 인스턴스1 생성.
		m1.setName("김기수");
		m1.setUserid("kim");
		m1.setPasswd("1234");
		m1.setTel("02-999-8888");
		m1.setEmail("kim@naver.com");
		
		Member m2=new Member(); //인스턴스2
		m2.setName("홍길동");
		m2.setUserid("hong");
		m2.setPasswd("2222");
		m2.setTel("02-999-5555");
		m2.setEmail("hong@naver.com");
		
		Member m3=new Member();//인스턴스3
		m3.setName("최순호");
		m3.setUserid("choi");
		m3.setPasswd("3333");
		m3.setTel("02-999-7755");
		m3.setEmail("choi@naver.com");
		list.add(m1); //리스트에 member 인스턴스 추가.
		list.add(m2);
		list.add(m3);
		
		System.out.println("이름\t아이디\t비번\t전화\t\t이메일");
		for(int i=0; i<list.size(); i++) { //리스트.size() 리스트의 자료 개수
			Member m=list.get(i); //i번째 자료를 꺼내어 member 참조변수에 전달.
			System.out.println(m.getName()+"\t"+
								m.getUserid()+"\t"+
								m.getPasswd()+"\t"+
								m.getTel()+"\t"+
								m.getEmail());
		}
	}
}
