package ch17;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEvent2 extends JFrame implements ActionListener 
		{
		private JButton button1, button2, button3, button4, button5;
		public ButtonEvent2() {
			setLayout(new FlowLayout());
			button1=new JButton("빨강색인데");
			button2=new JButton("Green");
			button3=new JButton("2번째블루는미드것");
			button4=new JButton("없을무!");
			button5=new JButton("Yellow金");
			
			add(button1);
			add(button2);
			add(button3);
			add(button4);
			add(button5);
		//버튼에 액션이벤트 기능 추가
		//this, actionlistener 를 구현한 클래스
			button1.addActionListener(this);
			button2.addActionListener(this);
			button3.addActionListener(this);
			button4.addActionListener(this);
			button5.addActionListener(this);
			
			
			setSize(450,300);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
			public static void main(String[] args) {
				new ButtonEvent2();
			}
			//↓ 버튼을 누르면 호출되는 코드
			@Override
			public void actionPerformed(ActionEvent e) {
			System.out.println(e.getSource());
			System.out.println(e.getActionCommand());
			if(e.getSource()==button1) {
				//배경색 변경
				getContentPane().setBackground(Color.red);
			}else if(e.getSource()==button2) {
				getContentPane().setBackground(Color.green);
			}else if(e.getSource()==button3) {
				getContentPane().setBackground(Color.blue);
			}else if(e.getSource()==button4) {
				getContentPane().setBackground(Color.white);
			}else if(e.getSource()==button5) {
				getContentPane().setBackground(Color.yellow);
			}
			}
}
