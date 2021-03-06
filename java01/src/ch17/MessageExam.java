package ch17;//21.04.05 am10

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MessageExam extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MessageExam frame = new MessageExam();
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
	public MessageExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button1 = new JButton("Message");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//메시지를 화면에 출력시키는 대화상자
				JOptionPane.showMessageDialog(MessageExam.this, "Message");
			}
		});
		contentPane.add(button1);
		
		JButton button2 = new JButton("Confirm");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//사용자의 확인을 받는 대화상자
				int result=JOptionPane.showConfirmDialog(
							MessageExam.this, "종료할까요?",
							null, JOptionPane.YES_NO_OPTION);//yes 버튼을 누르면
				if(result==JOptionPane.YES_OPTION) {
					//안내문을 출력하고
					JOptionPane.showMessageDialog(
							MessageExam.this, "프로그램을 종료합니다.");
					//프로그램 종료
					System.exit(0);
					}
			}
		});
		contentPane.add(button2);
		
		JButton button3 = new JButton("Input");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=
						JOptionPane.showInputDialog(MessageExam.this,"이름을 입력하세요");
				JOptionPane.showMessageDialog(MessageExam.this,
										name+"님 환영합니다.");
			}
		});
		contentPane.add(button3);
		
		JButton button4 = new JButton("Option");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String[] str= {"추가","수정","삭제"};
				
				JOptionPane.showOptionDialog(MessageExam.this, 
						"선택하세요", "작업선택", 
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.INFORMATION_MESSAGE,//imform.me 정보!아이콘
						null,str,str[0]);
			}
		});
		contentPane.add(button4);
	}

}
