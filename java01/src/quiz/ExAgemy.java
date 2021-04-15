package quiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ExAgemy extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfBirth;
	private JButton btnResult;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExAgemy frame = new ExAgemy();
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
	public ExAgemy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 259);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("이름");
		lblName.setBounds(12, 45, 57, 15);
		contentPane.add(lblName);
		
		JLabel lblBirth = new JLabel("출생년도");
		lblBirth.setBounds(12, 96, 57, 15);
		contentPane.add(lblBirth);
		
		tfName = new JTextField();
		tfName.setBounds(91, 42, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfBirth = new JTextField();
		tfBirth.setBounds(91, 93, 116, 21);
		contentPane.add(tfBirth);
		tfBirth.setColumns(10);
		
		btnResult = new JButton("나이 계산 결과");
		btnResult.setFont(new Font("굴림", Font.PLAIN, 14));
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=tfName.getText();
				String birth=tfBirth.getText();
				
				int a=Integer.parseInt(tfBirth.getText());
				int b=Integer.parseInt(birth.substring(0,4));
				int c=2021-b;
						
				
				lblResult.setText(name+"님의 나이는 "+c+"세 입니다.");
			}
		});
		btnResult.setBounds(53, 140, 141, 25);
		contentPane.add(btnResult);
		
		lblResult = new JLabel("");
		lblResult.setFont(new Font("굴림", Font.BOLD, 15));
		lblResult.setForeground(Color.BLUE);
		lblResult.setBounds(12, 188, 244, 21);
		contentPane.add(lblResult);
		
		JLabel lblNewLabel_3 = new JLabel("예시 19931103");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(229, 96, 141, 18);
		contentPane.add(lblNewLabel_3);
	}

}
