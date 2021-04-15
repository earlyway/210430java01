package ch19;

import java.io.Serializable;

public class MemberDTO implements Serializable {
	private String name;
	private int age;
	// transient 객체직렬화에서 제외되는 멤버
	private transient MemberInfoDTO memberInfo;
	public String getName() { //source-getter setter
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public MemberInfoDTO getMemberInfo() {
		return memberInfo;
	}
	public void setMemberInfor(MemberInfoDTO memberInfo) {
		this.memberInfo = memberInfo;
	}
	@Override							//source-generate toString
	public String toString() {
		return "MemberDTO [name=" + name + ", age=" + age + ", memberInfo=" + memberInfo + "]";
	}
	public MemberDTO(String name, int age, String jumin, String pwd) {//source-construct using fields
		super();
		this.name = name;
		this.age = age;
		this.memberInfo = new MemberInfoDTO(jumin, pwd);
	}
}
