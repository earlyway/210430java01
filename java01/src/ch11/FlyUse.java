package ch11;

public class FlyUse {
	public static void main(String[] args) {
		
		Bird bird=new Bird();
		bird.takeOff();
		bird.fly();
		bird.land();
	//좌변과 우변의 자료형이 다르면 좌변이 상위
		Flyer bird2=new Bird(); //Flyer가 상위, Bird가 하위 //하지만 flyer는 인터페이스타입임. 그래도 가능.!
		bird2.takeOff();
		bird2.fly();
		bird2.land();
		
		Airplane air=new Airplane();
		air.takeOff();
		air.fly();
		air.land();
		
		Flyer flyer=new Airplane(); //Flyer가 상위, Airplane이 하위
		flyer.takeOff();
		flyer.fly();
		flyer.land();
	}
}
