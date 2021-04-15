package ch14;

public class Student {
	private String num;
	private String name;
	private String major;
	private int year;
	private String professor;
	
	//생성자 추가:마우스 오른쪽클릭-source-generate constructor using fields.
	public Student(String num, String name, String major, int year, String professor) {
		super();
		this.num = num;
		this.name = name;
		this.major = major;
		this.year = year;
		this.professor = professor;
	}
	
	public String getNum() {
		return num;
	}
	
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", major=" + major + ", year=" + year + ", professor="
				+ professor + "]";
	}
	
}
