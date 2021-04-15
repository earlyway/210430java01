package quiz; //21.03.29 pm18

public class Bmi0329 {
	private double height;
	private double weight;
	private double bmi;
	private String grade;   //출력이 한글이니깐 string 쓰기. 등급이 숫자라면? double 써도됨
	public Bmi0329(double height,double weight) {
		this.height=height;
		this.weight=weight;
	}
	public void calc() {
		bmi=weight/(height*height);
		if(bmi<18.5) {
			grade="저체중";
		}else if(bmi<23) {
			grade="정상";
		}else if(bmi<25) {
			grade="과체중";
		}else {
			grade="비만";
		}
	}
	public void print() {
		System.out.println("신장\t체중\tbmi\t등급");
		System.out.println(height*100+"\t"+weight+"\t"+
						String.format("%.1f",bmi)+"\t"+grade);
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	//	private Double h=160;
//	private Double w=50.6;
//	private Double bm;
//	private Double grade;
//	
//	public void calc() {
//		bm = ;
//	public Bmi0329(double bm) {// 생성자
//		this.bm = bm;
//	}
//	public void calc(bm) {
//		if(bm>=25.0) {
//			grade="비만";
//		}else if()
//	}