package ch09; //21.03.29 pm15

public class Area {
	private int width;
	private int length;
	public Area() {
	} //기본생성자. 4,5라인처럼 만든 후 ctrl+spacebar 후에 팝업창의 맨위에 것을 입력하면 기본생성자 생김.
	public Area(int width, int length) {
		this.width=width;
		this.length=length;
	}
	public int getArea() {
		return width*length;
	}

}
