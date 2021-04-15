package quiz;//21.04.02 pm17

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExCirclemy extends JFrame {

	private JPanel contentPane;
	private JTextField tfR;
	private JButton btnplus;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExCirclemy frame = new ExCirclemy();
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
	public ExCirclemy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblrr = new JLabel("반지름(cm)");
		lblrr.setBounds(12, 30, 71, 15);
		contentPane.add(lblrr);
		
		tfR = new JTextField();
		tfR.setBounds(109, 27, 116, 21);
		contentPane.add(tfR);
		tfR.setColumns(10);
		
		btnplus = new JButton("계산");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String r=tfR.getText();
				
				int a=Integer.parseInt(r);
				double b=a*2*Math.PI;
				double c=a*a*Math.PI;
				
				
				lblResult.setText("<html>반지름 : "+a+"cm"+
									"<br>원의 둘레 : "+String.format("%.3f",b)+"cm"+
									"<br>원의 넓이 : "+String.format("%.3f",c)+"제곱센티미터<>"
						);
			//lblResult, btnplus를 필드변수로 올려줘야함.
				
			}
		});
		btnplus.setBounds(54, 77, 97, 23);
		contentPane.add(btnplus);
		
		lblResult = new JLabel("");
		lblResult.setBounds(67, 124, 232, 110);
		contentPane.add(lblResult);
	}

}
