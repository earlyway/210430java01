package ch17;//21.04.01 pm12:40

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderExam extends JFrame{
	public BorderExam() {
		setTitle("버튼 추가"); //프레임의 타이틀
		
		//레이아웃 변경, FlowLayout-순서대로 배치하는 방법
		//setLayout(new FlowLayout());
		//setLayout(new Borderout()); //default 레이아웃
		JButton button1=new JButton("버튼1");
		JButton button2=new JButton("버튼2");
		JButton button3=new JButton("버튼3");
		JButton button4=new JButton("버튼4");
		JButton button5=new JButton("버튼5");
		JButton button6=new JButton("버튼6");
		//add(컴포넌트,위치)-한 영역에 1개만 붙일 수 있고, 위치가 생략되면 center에 배치됨.
		add(button1,"Center"); //프레임에 버튼 6개추가
		add(button2,"North");
		add(button3,"South");
		add(button4,"East");
		
		JPanel p=new JPanel(); // 패널을 만들고
		p.add(button5); //패널에 버튼 2개를 붙이고
		p.add(button6);
		add(p,"West"); //West 영역에 패널을 붙임
		
		setSize(300,300);
		setVisible(true);//화면에 표시
		setDefaultCloseOperation(EXIT_ON_CLOSE); //x누르면 종료
		
	}
	public static void main(String[] args) {
		new BorderExam();
	}

}
