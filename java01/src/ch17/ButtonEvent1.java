package ch17;//21.04.04 pm1:20

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEvent1 extends JFrame {
	private JButton button1, button2, button3,button4,button5;
	
	public ButtonEvent1() {
		setLayout(new FlowLayout());
		button1=new JButton("red");
		button2=new JButton("green");
		button3=new JButton("blue");
		button4=new JButton("white");
		button5=new JButton("yellow");
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		//이벤트 처리
		//button1에 액션이벤트 기능 추가
		button1.addActionListener(new ActionListener() {
			//버튼을 누르면 actionPerformed method가 호출됨
			@Override
			public void actionPerformed(ActionEvent e) {
				//프레임의 컨텐츠 영역의 배경색을 red로 변경.
				getContentPane().setBackground(Color.red);
				
			}
		});
		button2.addActionListener(new ActionListener() {
			//버튼을 누르면 actionPerformed method가 호출됨
			@Override
			public void actionPerformed(ActionEvent e) {
				//프레임의 컨텐츠 영역의 배경색을 red로 변경.
				getContentPane().setBackground(Color.green);
				
			}
		});
		button3.addActionListener(new ActionListener() {
			//버튼을 누르면 actionPerformed method가 호출됨
			@Override
			public void actionPerformed(ActionEvent e) {
				//프레임의 컨텐츠 영역의 배경색을 red로 변경.
				getContentPane().setBackground(Color.blue);
				
			}
		});
		button4.addActionListener(new ActionListener() {
			//버튼을 누르면 actionPerformed method가 호출됨
			@Override
			public void actionPerformed(ActionEvent e) {
				//프레임의 컨텐츠 영역의 배경색을 red로 변경.
				getContentPane().setBackground(Color.white);
				
			}
		});
		button5.addActionListener(new ActionListener() {
			//버튼을 누르면 actionPerformed method가 호출됨
			@Override
			public void actionPerformed(ActionEvent e) {
				//프레임의 컨텐츠 영역의 배경색을 red로 변경.
				getContentPane().setBackground(Color.yellow);
				
			}
		});
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ButtonEvent1();
	}
}
