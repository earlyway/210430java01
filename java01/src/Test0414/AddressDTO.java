package Test0414;


public class AddressDTO {
	private String userid;
	private String username;
	private String addr;
	private String tel;
	private String email;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "AddressDTO [userid=" + userid + ", username=" + username + ", addr=" + addr + ", tel=" + tel
				+ ", email=" + email + "]";
	}
	public AddressDTO(String userid, String username, String addr, String tel, String email) {
		super();
		this.userid = userid;
		this.username = username;
		this.addr = addr;
		this.tel = tel;
		this.email = email;
	}
}
