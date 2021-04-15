package ch11;

public class Bird implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Bird 이륙");
		// TODO Auto-generated method stub

	}

	@Override
	public void fly() {
		System.out.println("Bird 비행");
		// TODO Auto-generated method stub

	}

	@Override
	public void land() {
		System.out.println("Bird 착륙");
		// TODO Auto-generated method stub

	}

}
