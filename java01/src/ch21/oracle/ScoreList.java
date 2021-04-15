package ch21.oracle;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ScoreList extends JFrame {

	private JPanel contentPane;
	private ScoreDAO dao;
	private Vector data, col;
	private JButton btnAdd;
	private JButton btnEdit;
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
		setBounds(100, 100, 436, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setBounds(12, 53, 396, 198);
		contentPane.add(scrollPane);

		dao = new ScoreDAO();// dao 인스턴스를 만들고
		col = new Vector();// JTable의 타이틀행(필드목록) 구성을 위한 벡터를 만들고
		col.add("학번");// 벡터에 데이터 추가
		col.add("이름");
		col.add("국어");
		col.add("영어");
		col.add("수학");
		col.add("총점");
		col.add("평균");
		table = new JTable();
		refreshTable();// JTable의 내용을 갱신하는 함수

		scrollPane.setViewportView(table);

		btnAdd = new JButton("추가");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//점수 추가를 위한 새로운 프레임을 생성하고
				ScoreSave form=new ScoreSave(ScoreList.this);
				//화면에 표시
				form.setVisible(true);
				//화면에 표시할 위치 지정
				form.setLocation(200,200);				
			}
		});
		btnAdd.setBounds(12, 10, 145, 41);
		contentPane.add(btnAdd);

		btnEdit = new JButton("수정/삭제");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx=table.getSelectedRow();//선택한 행의 인덱스
				if(idx==-1) {//선택한 행이 없으면 -1
					JOptionPane.showMessageDialog(ScoreList.this, "편집할 레코드를 선택하세요.");
					return;
				}
				//String.valueOf(값) 스트링으로 변환
				//테이블.getValueAt(row,col) 행과 열의 인덱스(idx)로 각각의 cell 읽기
				String student_no=String.valueOf(table.getValueAt(idx, 0));
				String name=String.valueOf(table.getValueAt(idx, 1));
				int kor=Integer.valueOf(table.getValueAt(idx, 2)+"");
				int eng=Integer.valueOf(table.getValueAt(idx, 3)+"");
				int mat=Integer.valueOf(table.getValueAt(idx, 4)+"");
				ScoreDTO dto=new ScoreDTO(student_no,name,kor,eng,mat);//dto를 만들고
				//현재 프레임의 주소와 dto를 ScoreEdit의 생성자에 전달
				ScoreEdit form=new ScoreEdit(ScoreList.this,dto);
				form.setVisible(true);//프레임을 화면에 표시함
				
				
			}
		});
		btnEdit.setBounds(169, 10, 145, 41);
		contentPane.add(btnEdit);
	}

	public void refreshTable() {
		// 테이블모델을 만들고
		DefaultTableModel model = new DefaultTableModel(dao.listScore(), col);
		// JTable의 모델 변경(화면이 갱신됨)
		table.setModel(model);

	}
}
