package ch09;

//Area class를 상속받은 class
//private, 생성자는 상속되지 않음
public class Volume extends Area {
	private int height;
	
	public Volume(int width, int length, int height){
		super(width,length); //상위class의 생성자를 호출.
		this.height=height;
	}
	public int getVolume() {
		return getArea()*height;
	}
}
