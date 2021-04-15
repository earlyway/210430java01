package quiz;
//학급점수 배열
public class Ex05 {
	public static void main(String[] args) {
		int[] kor= {85,95,98,75,65}; 
		int[] mat= {90,91,92,93,94}; 
		int[] eng= {70,71,72,73,74};
		int[] tot=new int[5];
		double[] avg=new double[5];
		String[] grade=new String[5];
		for(int i=0; i<kor.length; i++) {   //반복문돌리기
			tot[i]=kor[i]+eng[i]+mat[i];
			avg[i]=tot[i]/3.0;

		if(100>=avg[i]&&avg[i]>=90) {
			grade[i]="A";
		}else if(avg[i]>=80) { //false면 다시 검사.
			grade[i]="B";
		}else if(avg[i]>=70) {
			grade[i]="C";
		}else if(avg[i]>=60) {
			grade[i]="D";
		}else {   							//그 외의 모든 경우
			grade[i]="F";
		}
		}
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		for(int i=0; i<kor.length; i++) {
		System.out.println(kor[i]+"\t"+eng[i]+"\t"+mat[i]
				+"\t"+tot[i]+"\t"+String.format("%.1f", avg[i])
				+"\t"+grade[i]);
		}

	}
}












//String name="김철수";
////int kor=80, eng=89, mat=100;
//String name;
//int kor,eng,mat;
//Scanner sc=new Scanner(System.in);//키보드 입력을 받을때 필요+import 받을것.
//System.out.println("이름:");
//name=sc.next();//문자열 입력
//System.out.println("국어:");
//kor=sc.nextInt();//정수 입력
//System.out.println("영어:");
//eng=sc.nextInt();
//System.out.println("수학:");
//mat=sc.nextInt();
//
//double tot=kor+eng+mat;
//double    avg=tot / 3.0;
//System.out.println("이름\t국어\t영어\t수학\t총점\t평균");// \t 탭
//System.out.println(name+"\t"+kor+"\t"+eng+"\t"
//		+mat+"\t"+tot+"\t"+avg);