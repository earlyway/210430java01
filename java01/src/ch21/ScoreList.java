package ch21;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ScoreList extends JFrame {

	private ScoreDAO dao;
	private Vector<String> col;
	private DefaultTableModel model;
	private ScoreDTO dto;
	
	
	private JPanel contentPane;
	private JTextField tfStudentNo;
	private JTextField tfName;
	private JTextField tfKor;
	private JTextField tfEng;
	private JTextField tfMat;
	private JTextField tfSearch;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreList frame = new ScoreList();
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
	public ScoreList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 703);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("학번");
		lblNewLabel.setBounds(12, 31, 57, 15);
		contentPane.add(lblNewLabel);
		
		tfStudentNo = new JTextField();
		tfStudentNo.setBounds(81, 28, 116, 21);
		contentPane.add(tfStudentNo);
		tfStudentNo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setBounds(12, 62, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		tfName = new JTextField();
		tfName.setColumns(10);
		tfName.setBounds(81, 59, 116, 21);
		contentPane.add(tfName);
		
		JLabel lblNewLabel_1_1 = new JLabel("국어");
		lblNewLabel_1_1.setBounds(12, 93, 57, 15);
		contentPane.add(lblNewLabel_1_1);
		
		tfKor = new JTextField();
		tfKor.setColumns(10);
		tfKor.setBounds(81, 90, 116, 21);
		contentPane.add(tfKor);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("영어");
		lblNewLabel_1_1_1.setBounds(12, 125, 57, 15);
		contentPane.add(lblNewLabel_1_1_1);
		
		tfEng = new JTextField();
		tfEng.setColumns(10);
		tfEng.setBounds(81, 122, 116, 21);
		contentPane.add(tfEng);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("수학");
		lblNewLabel_1_1_1_1.setBounds(12, 157, 57, 15);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		tfMat = new JTextField();
		tfMat.setColumns(10);
		tfMat.setBounds(81, 154, 116, 21);
		contentPane.add(tfMat);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("이름을 입력하세요");
		lblNewLabel_1_1_1_1_1.setBounds(12, 188, 148, 15);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		tfSearch = new JTextField();
		tfSearch.setColumns(10);
		tfSearch.setBounds(125, 185, 116, 21);
		contentPane.add(tfSearch);
		
		JButton btnSave = new JButton("저장");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input(); //텍스트필드에 입력한 값들을 dto에 저장
				int result=dao.insertScore(dto); //mysql 테이블에 레코드가 추가됨
				if(result==1) { //추가된 레코드수가 1개이면
					//안내문을 출력하고
					JOptionPane.showMessageDialog(ScoreList.this, "저장되었습니다.");
					//JTable을 갱신하는 작업
					list();
					table.setModel(model); 
					//텍스트필드 초기화
					clear();
				}
			}
		});
		btnSave.setBounds(209, 27, 97, 23);
		contentPane.add(btnSave);
		
		JButton btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();//텍스트필드에 입력한 내용들을 dto에 저장
				int result=dao.updateScore(dto);//레코드 수정
				if(result==1) { //수정된 레코드 수가 1개이면
					//안내메시지를 띄우고
					JOptionPane.showMessageDialog(ScoreList.this, "수정되었습니다.");
					list();//테이블모델의 자료를 갱신하고
					table.setModel(model);//JTable 화면 갱신
					clear();//텍스트필드 입력값 클리어
					}
			}
		});
		btnUpdate.setBounds(209, 58, 97, 23);
		contentPane.add(btnUpdate);
		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String student_no=tfStudentNo.getText();
			int result=0;
			int response=JOptionPane.showConfirmDialog(ScoreList.this, "삭제하겠습니까?");
			if(response==JOptionPane.YES_OPTION) {
				result=dao.deleteScore(student_no);//레코드 삭제
			}
			if(result==1) {//삭제된 레코드수가 1개이면
				JOptionPane.showMessageDialog(ScoreList.this, "삭제되었습니다.");
				list();
				table.setModel(model);
				clear();
				}
			}
		});
		btnDelete.setBounds(209, 89, 97, 23);
		contentPane.add(btnDelete);
		
		JButton btnSearch = new JButton("찾기");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//검색 키워드
			String name=tfSearch.getText();
			model=new DefaultTableModel(dao.searchScore(name),col) {
				@Override
				public boolean isCellEditable(int row, int column) {
					return false;
					}
				};
				//JTable의 내용이 바뀜
				table.setModel(model);
			}
		});
		btnSearch.setBounds(253, 184, 97, 23);
		contentPane.add(btnSearch);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 244, 470, 383);
		contentPane.add(scrollPane);
		
		dao=new ScoreDAO();
		col=new Vector<String>();
		col.add("학번");
		col.add("이름");
		col.add("국어");
		col.add("영어");
		col.add("수학");
		col.add("총점");
		col.add("평균");
		list();
		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//클릭한 행 번호
				int idx=table.getSelectedRow();
				tfStudentNo.setEditable(false);//편집금지 설정
				//getValueAt(row,col)
				tfStudentNo.setText(table.getValueAt(idx, 0)+"");
				tfName.setText(table.getValueAt(idx, 1)+"");
				tfKor.setText(table.getValueAt(idx, 2)+"");
				tfEng.setText(table.getValueAt(idx, 3)+"");
				tfMat.setText(table.getValueAt(idx, 4)+"");
			}
		});
		
		
		
		
		scrollPane.setViewportView(table);
	}
	
	public void list() {
		//테이블 모델을 갱신
		model=new DefaultTableModel(dao.listScore(), col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
	}
	public void input() {
		String student_no=tfStudentNo.getText(); //텍스트필드에 입력한 내용
		String name=tfName.getText();
		int kor=Integer.parseInt(tfKor.getText()); //스트링을 숫자로 변환
		int eng=Integer.parseInt(tfEng.getText());
		int mat=Integer.parseInt(tfMat.getText());
		dto=new ScoreDTO(student_no, name, kor, eng, mat); //dto 생성
	}
	public void clear() {
		tfStudentNo.setText(""); //텍스트필드에 입력한 내용을 클리어시킴
		tfName.setText("");
		tfKor.setText("");
		tfEng.setText("");
		tfMat.setText("");
		tfStudentNo.requestFocus(); //입력포커스 이동
		tfStudentNo.setEditable(true); //편집 가능한 상태로 변경
	}
}




