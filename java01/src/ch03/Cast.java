package ch03;

public class Cast {
	public static void main(String[] args) {
		float f=1.6F;//실수(소수점)+f 4바이트로 저장(소수점은 기본적으로 8바이트로 저장되는데 좌변의 float은 4바이트)
		System.out.println(f);
		
		f=100;//좌변은 float, 100은 정수.
		System.out.println(f);
		
		f=100.5F;
		
		int i =(int)f;//float->int로 강제형변환
		System.out.println(i);//소수점 이하는 손실됨
		
		i=300;
		byte b=(byte)i;//byte의 범위 -128~127이므로 범위를 벗어남. byte는 1바이트값임.
		System.out.println(b);
	}
}
