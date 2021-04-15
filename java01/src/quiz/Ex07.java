package quiz; //21/03/26 15:35

public class Ex07 {
	//화씨===>섭씨 계산함수
	static double degree1(double a) {
		return (a-32)/1.8;
	}
	//섭씨===>화씨 계산 함수   (섭씨온도*1.8)+32
	static double degree2(double a) {
		return (a*1.8)+32;
	}

	
	
	
	public static void main(String[] args) {
		double a=100; //화씨 100도는
		System.out.println(degree1(a)); //섭씨~도
		
		double b=37.7;
		System.out.println(degree2(b));
	}
}
