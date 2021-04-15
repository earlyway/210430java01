package ch12; //21.03.30 pm12

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//frame을 상속받음
public class InnerExam extends Frame {
	public InnerExam() { // 생성자
		super("내부 클래스 테스트"); // super이므로 상위클래스의 생성자 호출
		setSize(300, 400); //화면사이즈
		setVisible(true);  //화면 표시
	}

	public static void main(String[] args) {
		// 인스턴스 생성
		InnerExam e = new InnerExam();			//add~라는 method 안에 ()parameter가 들어가네
		e.addWindowListener(new WindowAdapter() { //이건 무명클래스임. 단, new WindowAdapter 라는 무명클래스임.
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
