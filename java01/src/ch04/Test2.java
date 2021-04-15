package ch04;
//1~n까지의 3의 배수의 합계
public class Test2 {
	public static void main(String[] args) {
		int n=100;
		int sum=0;
//		for(int i=1; i<=n; i++) {
//			if(i%3==0) {
//				sum=sum+i;
//			}
//		}
		for(int i=3; i<=n; i+=3) {
			sum=sum+i;
		}
		System.out.println("합계:"+sum);
	}

}
