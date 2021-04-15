package quiz;

public class Ex02 {
	public static void main(String[] args) {
		//스트링배열
		String[] names= {"김철수","박희영","김영희"};
		//정수배열
		int[] years= {1990,1995,1998};
		int[] ages=new int[3];
		//계산 반복문 사용
		for(int i=0; i<names.length; i++) {
			ages[i]=2021-years[i];
		}
		
		System.out.println("이름\t연도\t나이");
		//출력 (반복문사용
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]+"\t"+years[i]+"\t"+ages[i]);
		}
	}

}
