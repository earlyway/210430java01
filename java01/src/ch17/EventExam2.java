package ch17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
 //EventExam2 만들때, superclss에 Frame 넣고 interfaces에 windowlistener 넣고 클래스 생성.
public class EventExam2 extends Frame implements WindowListener {
	public EventExam2() {
		
		this.addWindowListener(this);
		this.setSize(300, 300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new EventExam2();
	}

	@Override
	public void windowOpened(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0); //프로그램 강제종료

	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowIconified(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {

	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}

}
