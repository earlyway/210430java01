package ch08;

public class Member {
	
	private String name;
	private String userid;
	private int money;
	private String grade;
	
	public Member() {} //밑에 생성자가 있으니 '기본생성자'를 작성해야주어야함. 그래야 에러안뜸.
	//매개변수가 있는 생성자
	public Member(String name, String userid, int money) {
		this.name=name;
		this.userid=userid;
		this.money=money;
	}
	//입력함수
	public void input(String name, String userid, int money) {
		this.name=name;
		this.userid=userid;
		this.money=money;
	}
	public void setGrade() {
		if(money>=100000) { //금액이 10만원 이상이면
			grade="gold";
		}else {  			//아니면
			grade="silver";
		}
	}
	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+userid+"\t"+
							money+"\t"+grade);
	}

}
