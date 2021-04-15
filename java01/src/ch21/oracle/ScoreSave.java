package ch21.oracle;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScoreSave extends JFrame {

	private JPanel contentPane;
	private JTextField tfStudentNo;
	private JTextField tfName;
	private JTextField tfKor;
	private JTextField tfEng;
	private JTextField tfMat;
	
	private ScoreList parent;//ScoreList프레임을 가리키는 변수


	/**
	 * Create the frame.
	 */
	public ScoreSave(ScoreList parent) {
		this.parent=parent;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl5 = new JLabel("학번");
		lbl5.setBounds(34, 32, 57, 15);
		contentPane.add(lbl5);
		
		JLabel lbl1 = new JLabel("이름");
		lbl1.setBounds(34, 77, 57, 15);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("국어");
		lbl2.setBounds(34, 128, 57, 15);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("영어");
		lbl3.setBounds(34, 179, 57, 15);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("수학");
		lbl4.setBounds(34, 234, 57, 15);
		contentPane.add(lbl4);
		
		tfStudentNo = new JTextField();
		tfStudentNo.setBounds(119, 29, 116, 21);
		contentPane.add(tfStudentNo);
		tfStudentNo.setColumns(10);
		
		tfName = new JTextField();
		tfName.setBounds(119, 74, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfKor = new JTextField();
		tfKor.setBounds(119, 125, 116, 21);
		contentPane.add(tfKor);
		tfKor.setColumns(10);
		
		tfEng = new JTextField();
		tfEng.setBounds(119, 176, 116, 21);
		contentPane.add(tfEng);
		tfEng.setColumns(10);
		
		tfMat = new JTextField();
		tfMat.setBounds(119, 231, 116, 21);
		contentPane.add(tfMat);
		tfMat.setColumns(10);
		
		JButton btnSave = new JButton("저장");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScoreDAO dao=new ScoreDAO();
				String student_no=tfStudentNo.getText();
				String name=tfName.getText();
				int kor=Integer.parseInt(tfKor.getText());
				int eng=Integer.parseInt(tfEng.getText());
				int mat=Integer.parseInt(tfMat.getText());
				dao.insertScore(new ScoreDTO(student_no,name,kor,eng,mat));
				JOptionPane.showMessageDialog(ScoreSave.this, "추가되었습니다.");
				parent.refreshTable();
				dispose();
			}
		});
		btnSave.setBounds(67, 294, 129, 36);
		contentPane.add(btnSave);
	}
}
