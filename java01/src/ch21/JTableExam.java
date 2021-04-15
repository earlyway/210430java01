package ch21;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class JTableExam extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private Vector col;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableExam frame = new JTableExam();
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
	public JTableExam() {
		//테이블의 필드명을 표시할 벡터 생성
		col=new Vector();
		//필드 추가
		col.add("학번");
		col.add("이름");
		col.add("국어");
		col.add("영어");
		col.add("수학");
		col.add("총점");
		col.add("평균");
		//dao 인스턴스 생성
		ScoreDAO dao=new ScoreDAO();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		//벡터의 내용->테이블 모델->JTable(모델이 중간역할!)
		//모델의 역할은 데이터 변환
		DefaultTableModel model=
				new DefaultTableModel(dao.listScore(),col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;//셀 편집이 안되도록 처리(iscelleditable)
			}
		};
		table = new JTable(model);
		scrollPane.setViewportView(table);
	}
}
