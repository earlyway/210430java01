package quiz;

public class Ex10 {
	static String[] product= {"tv","냉장고","세탁기","탈수기","정수기"};
	static int[] price= {50,60,30,20,80};
	static int[] amount= {3,2,1,4,5};
	static int[] money=new int[5];
	static int[] notax=new int[5];
	static int[] tax=new int[5];
	
	public static void main(String[] args) {
		calc();
		print();
	}
	
	static void calc() {
		for(int i=0; i<product.length; i++) {
			money[i]=price[i]*amount[i];
			notax[i]=(int)(money[i] / 1.1);
			tax[i]=money[i]-notax[i];
		}
	}
	static void print() {
		System.out.println("품명\t단가\t수량\t금액\t물품가액\t부가세");
		System.out.println("===============================================");
		for(int i=0; i<product.length; i++) {
			System.out.println(product[i]+"\t"+price[i]+"\t"+
			amount[i]+"\t"+money[i]+"\t"+notax[i]+"\t"+tax[i]);
		}
}
}
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		
//	static String[][] str={
//		{tv,30,2,0,0,0},
//		{potato,5,10,0,0,0},
//		{apple,4,10,0,0,0},
//		{monitor,20,2,0,0,0},
//		{phone,40,3,0,0,0}
//	};
//	for(int i=0; i>5; i++) {
//		str[i][3]=str[i][1]*str[i][2];
//		str[i][4]=str[i][3] / 1.1;
//		str[i][5]=str[i][3] - str[i][4];
//	}
//	
//
//}
//
//
//
//
//
////문제. 상품개수 5개-        변수선언 입력 계산 출력
////상품이름 단가 수량 금액(단가x수량) 부가세물품가액 부가세
//
////부가세물품가액=금액/1.1
////부가세=금액-부가세물품가액
//
////품명 단가 수량 금액 물품가액 부가세
////TV  30  2  60   54.5  5.5