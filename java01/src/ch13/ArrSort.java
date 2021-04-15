package ch13;

import java.util.Arrays;

//Sort 정렬
public class ArrSort {
	public static void main(String[] args) {
		int[] num= {50,40,70,90,120,-20};
		System.out.println("정렬 전");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
//		Arrays.sort(num);						//배열정렬A방법
		int temp=0;								//배열정렬B방법 시작
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i]>num[j]) { //더 크면(오름차순)
			  //if(num[i]<num[j]) { //더 작으면(내림차순)
					temp=num[i]; //임시변수에 백업
					num[i]=num[j]; //자리 바꿈
					num[j]=temp;
				}
			}
		}										//배열정렬B방법 끝 ()
		System.out.println("정렬 후");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}
}
