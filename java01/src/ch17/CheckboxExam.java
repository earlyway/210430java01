package ch17;//21.04.02 am10

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckboxExam extends JFrame {

	private JPanel contentPane;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckboxExam frame = new CheckboxExam();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CheckboxExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JCheckBox ckJava = new JCheckBox("자바");
		ckJava.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				putResult(e);
			}
		});
		panel.add(ckJava);
		
		JCheckBox ckC = new JCheckBox("C언어");
		ckC.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				putResult(e);
			}
		});
		panel.add(ckC);
		
		JCheckBox ckAndroid = new JCheckBox("android");
		ckAndroid.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				putResult(e);
			}
		});
		panel.add(ckAndroid);
		
		JButton btnExit = new JButton("종료");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnExit, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		ta = new JTextArea();
		scrollPane.setViewportView(ta);
	}//생성자의 끝

	void putResult(ItemEvent e) {
		//e변수에 어떤 체크박스를 눌렀는지 정보가 전달됨.
		JCheckBox ck=(JCheckBox)e.getSource();
		if(e.getStateChange()==ItemEvent.SELECTED) {//체크 상태
			//append()기존텍스트에 덧붙임. getText()텍스트 읽기
			ta.append(ck.getText()+"를 신청했습니다.\n");
		}else if(e.getStateChange()==ItemEvent.DESELECTED) {//체크해제 상태
			ta.append(ck.getText()+"를 취소했습니다.\n");
		}
	}
}//클래스의 끝
