package ch18;//21.04.05 pm12

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel{
	@Override
	public void paint(Graphics g) {
		Graphics2D g2=(Graphics2D)g;//2d그래픽 객체
		g2.setStroke(new BasicStroke(10));//선의 두께
		g.drawLine(10,20,200,20);//선 그리기
		
		g2.setStroke(new BasicStroke(1));
		g.setColor(Color.red);//색상 설정
		g.drawRect(120, 40, 90, 55);//사각형 x,y,width,height
		g.fillRect(120, 140, 90, 55);//색상이 채워진 사각형
		g.setColor(Color.blue);
		
		g.fillRoundRect(120, 240, 90, 55, 40, 40);//라운드 처리된 사각형
		g.drawOval(0, 40, 90, 55);//타원 x,y,width,height
		g.fillOval(0, 140, 90, 55);//색상이 채워진 타원
		
		int[] x= {10,30,50,40,20};//x좌표 배열
		int[] y= {257,240,257,280,280};//y좌표 배열
		g.setColor(Color.gray);
		g.fillPolygon(x, y, x.length);//다각형 그리기
	}
}

public class Shapes extends JFrame{
	public Shapes() {
		MyPanel panel=new MyPanel();//MyPanel 인스턴스 생성
		add(panel);//프레임에 MyPanel 추가
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Shapes();
	}

}
