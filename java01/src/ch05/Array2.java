package ch05;

public class Array2 {
	public static void main(String[] args) {
		//배열첨자가 2개==>2차원 배열
		//3행 3열
		int[][] num= {{10,20,30},{40,50,60},{70,80,90}};
		        //{10,20,30}===>1행(i[0])    10,20,30--->3열(j[0],j[1],j[2])
		System.out.println(num[2][1]);
		for(int i=0; i<3; i++) {	//0~2행
			for(int j=0; j<3; j++) {//0~2열
				//배열참조변수[행 인덱스][열 인덱스]
				System.out.println(num[i][j]);
			}
		}
	}

}

//    int[][] num=new int[3][3]; 자리 할당받고
//    num[0][0]=10; 자리 배분
//    num[0][1]=20; 자리 배분
//    num[0][2]=30;
//    num[1][0]=40;
//    num[1][1]=50;
//    ...
//    ...
//     System.out.println(num[0][2]);