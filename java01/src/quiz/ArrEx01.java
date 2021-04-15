package quiz;

public class ArrEx01 {
public static void main(String[] args) {
	int[] nums= {-54,98,22,63,0};
	int sum=0;
	int max=nums[0];
	int min=nums[0];
			for(int i=0; i<nums.length; i++) {
				sum += nums[i];
				if(max<nums[i]) {
					max=nums[i];
				}
				if(min>nums[i]) {
					min=nums[i];
				}
			}
	System.out.println("합계 "+sum);
	System.out.println("최소값 "+min);
	System.out.println("최대값 "+max);
	}
}
	
	//	public static void main(String[] args) {
//		int[] nums= {-54,98,22,63,0};
//		int sum= 0;
//		for(int i=0; i<nums.length; i++) {
//			sum += nums[i];
//		}
//		System.out.println(sum);
//	}
//}
