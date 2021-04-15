package Test0414;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;

public class Test7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test7 frame = new Test7();
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
	public Test7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"김철수", "강철수"}));
		comboBox.setBounds(251, 0, 167, 46);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"과장", "실장"}));
		comboBox_1.setBounds(251, 48, 167, 46);
		contentPane.add(comboBox_1);
		
		textField = new JTextField();
		textField.setText("2500000");
		textField.setBounds(251, 93, 167, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("3000000");
		textField_1.setBounds(251, 139, 167, 46);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"3%", "1%"}));
		comboBox_2.setBounds(251, 186, 167, 46);
		contentPane.add(comboBox_2);
		
		textField_2 = new JTextField();
		textField_2.setText("165000");
		textField_2.setBounds(250, 233, 168, 46);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("취소");
		btnNewButton.setBounds(251, 300, 167, 46);
		contentPane.add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setText("5,335,000");
		textField_3.setBounds(251, 348, 167, 46);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("성명");
		lblNewLabel.setBounds(72, 16, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("직급");
		lblNewLabel_1.setBounds(72, 64, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("기본급");
		lblNewLabel_2.setBounds(72, 108, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("보너스");
		lblNewLabel_3.setBounds(72, 154, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("세율");
		lblNewLabel_4.setBounds(72, 202, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("세액");
		lblNewLabel_5.setBounds(72, 248, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("계산");
		btnNewButton_1.setBounds(12, 300, 227, 46);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("실수령액");
		lblNewLabel_6.setBounds(72, 363, 57, 15);
		contentPane.add(lblNewLabel_6);
	}
}
