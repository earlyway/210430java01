package ch19;

import java.io.Serializable;
//객체직렬화를 하기위해서 Serializable 인터페이스를 구현해야함
public class MemberInfoDTO implements Serializable {
	private String juminNo;
	private String passwd;
	public String getJuminNo() { //source-getter setter
		return juminNo;
	}
	public void setJuminNo(String juminNo) {
		this.juminNo = juminNo;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override						//source-toString
	public String toString() {
		return "MemberInfoDTO [juminNo=" + juminNo + ", passwd=" + passwd + "]";
	}
	public MemberInfoDTO(String juminNo, String passwd) { //source-constructing fields
		this.juminNo = juminNo;
		this.passwd = passwd;
	}
	

}
