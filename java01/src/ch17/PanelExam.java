package ch17;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExam  extends JFrame { //JFrame 상속
	public PanelExam() { //생성자
		JPanel p=new JPanel();//여러개의 컴포넌트(화면구성 도구)를 붙일 수 있음
		p.setBackground(Color.green);//패널의 배경색상
		JButton button1=new JButton("button1");//버튼 생성
		JButton button2=new JButton("button2");
		JButton button3=new JButton("button3");
		p.add(button1);//패널에 버튼을 추가
		p.add(button2);
		p.add(button3);
		add(p);//프레임(윈도우)에 패널 추가
		
		//버튼을 클릭할때 실행할 코드를 작성
		//이벤트소스. 이벤트리스너(이벤트핸들러)
		//button1. addA~~~(new Acti~)
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//패널의 배경색상 변경
				System.out.println("click");
				p.setBackground(Color.green);
			}
		});
		
		setSize(300,300);//프레임의 가로, 세로 사이즈
		setVisible(true);//프레임을 화면에 표시함
		setDefaultCloseOperation(EXIT_ON_CLOSE);//닫기 동작. 이게 없다면 닫기긴하지만 숨김처리되므로 프로그램은 계속 실행중인것임.
		
	}
	public static void main(String[] args) {
		new PanelExam();//현재 클래스의 인스턴스를 만들고 생성자가 호출됨
	}
}
