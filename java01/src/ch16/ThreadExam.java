package ch16;

public class ThreadExam extends Thread {//Thread를 상속받은 threadexam class

		public ThreadExam(String name) {//생성자
			super(name);//상위클래스의 생성자가 호출됨. thread의 이름설정
		}
		//@override  상위클래스의 method를 상속받아서 실행
			public void run() {//멀티스레드로 실행되는 영역의 코드
				for(int i=1; i<=5; i++) {
					//현재 실행중인 스레드의 이름
				
					System.out.println(Thread.currentThread().getName()+":"+i);
					try {
						Thread.sleep(1000);//1초간 멈춤
					} catch (InterruptedException e) {
						e.printStackTrace();//에러메시지를 화면에 출력.
						
					}
				}
			}
			public static void main(String[] args) {
				ThreadExam e1=new ThreadExam("스레드1");
				ThreadExam e2=new ThreadExam("스레드2");
				ThreadExam e3=new ThreadExam("스레드3");
				
				e1.start();//start()를 하면 run method가 아닌 새로운 스레드(작업단위)를 시작요청함., 내부적인 스케줄러에 의해 실행됨.
				e2.start();
				e3.start();
			} //인스턴스가 e1,e2,e3 3개
		}

//override 상위클래스의 method를 상속받아서 실행.
		