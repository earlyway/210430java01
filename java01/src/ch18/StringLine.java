package ch18;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Paint;

import javax.swing.JFrame;

public class StringLine extends JFrame {
	public StringLine() { //생성자
		//화면 배경색상을 화이트로 설정
		getContentPane().setBackground(new Color(255,255,255));
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void paint(Graphics g) {// paint method를 오버라이드
		super.paint(g);
		g.setColor(Color.blue);//그리기 전에 미리 색상을 설정하고
		g.drawLine(250, 50, 30, 160);//선 그리기(포인트1 x1,y1 포인트2 x2,y2)
		g.setColor(Color.red);
		g.drawString("Red String", 10, 50);//문자열 출력(문자열,x,y)
		g.setColor(Color.green);
		g.drawString("Green String", 10, 80);
		g.setColor(Color.blue);
		g.drawString("Blue String", 10, 110);
		

	}
	public static void main(String[] args) {//프로그램의 시작
		new StringLine();
	}
	
}
