package quiz;

public class AddressDTO {
	private String idd;
	private String nam;
	private String addr;
	private String tel;
	private String email;
	public String getIdd() {
		return idd;
	}
	public void setIdd(String idd) {
		this.idd = idd;
	}
	public String getNam() {
		return nam;
	}
	public void setNam(String nam) {
		this.nam = nam;
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
		return "AddressDTO [idd=" + idd + ", nam=" + nam + ", addr=" + addr + ", tel=" + tel + ", email=" + email + "]";
	}
	public AddressDTO(String idd, String nam, String addr, String tel, String email) {
		super();
		this.idd = idd;
		this.nam = nam;
		this.addr = addr;
		this.tel = tel;
		this.email = email;
	}

}
