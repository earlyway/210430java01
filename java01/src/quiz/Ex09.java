package quiz;

import java.util.Scanner;

public class Ex09 {
	static int taxi(int km) {
		int cost=0;
		int m=km*1000;
		if(m<=2000) {//기본요금
			cost=3000;
		}else {//기본요금 초과
			int temp=m-2000;//초과 거리
			cost=3000+(int)((temp / 140.0)*150);
		}
		return cost;
	}
	public static void main(String[] args) {
		//Scanner를 이용하여 키보드로 입력
		Scanner sc=new Scanner(System.in);
		//반복문 사용. 0을 입력하면 종료
		while(true) {
			System.out.print("운행거리를 입력하세요: ");
			int km=sc.nextInt();
			if(km==0) break;
			int result=taxi(km);
			System.out.println(
					"운행거리:"+km+", 요금:"+String.format("%, d",result));
			
		}
		System.out.println("프로그램을 종료합니다.");
	}
}

//문제.운행거리 2km까지는 기본요금 3000원을 적용한다.
//    운행거리가 2km를 넘으면 140m마다 150원씩으로 계산한다.

//거리를 km, 요금을 pay라고 한다면
//2km=3000,     2km+140x=>3000+150x,
//16을 입력하면 16-2=14=>14/0.14=100=>(100*150)+3000=18000