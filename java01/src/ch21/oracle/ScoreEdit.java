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

public class ScoreEdit extends JFrame {

	private JPanel contentPane;
	private JTextField tfStudentNo;
	private JTextField tfName;
	private JTextField tfKor;
	private JTextField tfEng;
	private JTextField tfMat;
	
	private ScoreList parent;
	private ScoreDTO dto;

	/**
	 * Create the frame.
	 */
	public ScoreEdit(ScoreList parent, ScoreDTO dto) {
		this.parent=parent;
		this.dto=dto;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("학번");
		lbl1.setBounds(66, 38, 35, 15);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("이름");
		lbl2.setBounds(66, 84, 35, 15);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("국어");
		lbl3.setBounds(66, 135, 35, 15);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("영어");
		lbl4.setBounds(66, 182, 35, 15);
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel("수학");
		lbl5.setBounds(66, 235, 35, 15);
		contentPane.add(lbl5);
		
		tfStudentNo = new JTextField();
		tfStudentNo.setBounds(131, 38, 116, 21);
		contentPane.add(tfStudentNo);
		tfStudentNo.setColumns(10);
		
		tfName = new JTextField();
		tfName.setBounds(131, 84, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfKor = new JTextField();
		tfKor.setBounds(131, 135, 116, 21);
		contentPane.add(tfKor);
		tfKor.setColumns(10);
		
		tfEng = new JTextField();
		tfEng.setBounds(131, 182, 116, 21);
		contentPane.add(tfEng);
		tfEng.setColumns(10);
		
		tfMat = new JTextField();
		tfMat.setBounds(131, 235, 116, 21);
		contentPane.add(tfMat);
		tfMat.setColumns(10);
		
		JButton btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScoreDAO dao=new ScoreDAO();//dao 인스턴스를 만들고
				//텍스트필드에 입력한 값들을 변수에 저장
				String student_no=tfStudentNo.getText();
				String name=tfName.getText();
				int kor=Integer.parseInt(tfKor.getText());
				int eng=Integer.parseInt(tfEng.getText());
				int mat=Integer.parseInt(tfMat.getText());
				//레코드가 수정됨
				dao.updateScore(new ScoreDTO(student_no,name,kor,eng,mat));
				JOptionPane.showMessageDialog(ScoreEdit.this, "수정되었습니다.");
				//ScoreList 프레임의 JTable 화면 갱신
				parent.refreshTable();
				//현재 프레임을 종료함.(전체 프레임이 아닌)
				dispose();
				
			}
		});
		btnUpdate.setBounds(45, 295, 97, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int response=
						JOptionPane.showConfirmDialog(ScoreEdit.this, "삭제할까요?");
				if(response==JOptionPane.YES_OPTION) {
					String student_no=tfStudentNo.getText();
					ScoreDAO dao=new ScoreDAO();
					dao.deleteScore(student_no);
					parent.refreshTable();
					JOptionPane.showMessageDialog(ScoreEdit.this, "삭제되었습니다.");
					dispose();
				}
			}
		});
		btnDelete.setBounds(182, 295, 97, 23);
		contentPane.add(btnDelete);
		
		//dto의 내용을 텍스트필드에 표시
		tfStudentNo.setText(dto.getStudent_no());
		tfName.setText(dto.getName());
		tfKor.setText(dto.getKor()+"");
		tfEng.setText(dto.getEng()+"");
		tfMat.setText(dto.getMat()+"");
		
		
	}
}
