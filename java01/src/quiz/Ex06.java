package quiz;

public class Ex06 {
	public static void main(String[] args) {
		//12변수선언 입력
		double[] w= {60, 50, 42.4, 63, 68.9};
		double[] t= {151.1,167.0,163.5,174.4,176.9};
		double[] bmi=new double[5];
		String[] result=new String[5];
		for(int i=0; i<w.length; i++) {
			t[i]=t[i] / 100;
			//3계산
			bmi[i]=w[i] / (t[i]*t[i]);
			if(bmi[i]>=25.0) {
				result[i]="비만";
			}else if(bmi[i]>=23.0 && bmi[i]<25.0) {
				result[i]="과체중";
			}else if(bmi[i]>=18.5 && bmi[i]<23.0) {
				result[i]="정상";
			}else {
				result[i]="저체중";
			}
		}
		//4출력
		System.out.println("신장\t체중\tbmi\t결과");
		for(int i=0; i<w.length; i++) {
			System.out.println(t[i]*100+"\t"+w[i]+"\t"
					+String.format("%.2f", bmi[i])+"\t"+result[i]);
		}
	}

}







//변수선언 입력 계산 출력
//체중w 신장t bmi=w/(t*t) 결과r:저체중/정상/과체중/비만
