package quiz;

public class Taxi0329 {
	private int cost;
	private int km;

	public Taxi0329(int km) {
		this.km = km;
	}

	public void calc() {
		int m = km * 1000;
		if (m <= 2000) {
			cost = 3000;
		} else {
			int temp = m - 2000;
			cost = 3000 + (int)((temp / 140.0) * 150);
		}
	}

	public void print() {
		System.out.println("운행거리:" + km + ",요금:" + String.format("%,d", cost));
	}
}

// private double length;
//	private double fee;
//	private double total;
//	int cost=0;
//	
//	public void calc() {
//		
//	}
//
//	public void print() {
//}
