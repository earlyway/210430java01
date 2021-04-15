package ch16; //21.04.01 am9
//single thread:프로세스에서 실행되는 작업단위가 1개인 경우
//싱글스레드는 순차적으로 하나씩 실행됨. 1차선.
public class SingleThread {
	static void print() {
		//현재 실행중인 스레드(작업단위)의 이름
		System.out.println(Thread.currentThread().getName());
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		print();
		print();//print()가 병렬처리가 아니라 1개씩 순차적 실행됨을 볼수있음. single thread
	}

}
