package quiz;

class Circle0329 {
	private double r;
	private double length;
	private double area;

	public Circle0329(double r) {// 생성자
		this.r = r;
	}

	public void calc() {
		length = 2 * Math.PI * r;
		area = Math.PI * r * r;
	}

	public void print() {
		System.out.println("반지름\t둘레\t넓이");
		System.out.println(r + "\t" +
							String.format("%.1f", length) +
						"\t" + String.format("%.1f", area));
	}
}
//public class Circle extends roll{
//private int (Math.PI);
//
//public Circle(int )
//super()
//this.
//
//}
//public int 
//return