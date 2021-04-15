package ch09;

public class VolumeUse {
	public static void main(String[] args) {
		Volume vol=new Volume(10,20,30); //volume class의 인스턴스 생성.
		System.out.println("면적: "+vol.getArea()); //상위 class의 method 호출. 상위의 getArea임.
		System.out.println("부피: "+vol.getVolume());
	}

}


