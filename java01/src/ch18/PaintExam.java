package ch18;

import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintExam extends JFrame{
	public PaintExam() {//생성자
		setDefaultCloseOperation(EXIT_ON_CLOSE);//윈도우 닫기버튼 동작설정
		setSize(300,300);//프레임의 사이즈
		setVisible(true);//프레임을 화면에 표시함
		
		
	}
	//paint method를 오버라이드
	//Graphics 그래픽 처리객체
	@Override
	public void paint(Graphics g) {
		super.paint(g);//상위클래스의 paint 호출
		//그래픽 객체를 이용하여 화면에 문자열 출력
		g.drawString("hello java",10,60);
		System.out.println("panin method 호출");
	}
	public static void main(String[] args) {//프로그램의 시작점
		new PaintExam();//인스턴스를 만들고 생성자가 자동으로 호출됨
		
	}

}
