package ch17; //21.04.02 pm15

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableExam extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableExam frame = new TableExam();
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
	public TableExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		//표의 필드명(1차원 배열)
		String[] title= {"번호","이름","입사일자"};
		//표의 데이터(2차원 배열, 1건의 자료가 1개의 1차원배열임.)
		String[][] data= {
				{"1","kim","2010-03-10"},
				{"2","park","2011-03-10"},
				{"3","hong","2012-03-10"}
		};
		    //new JTable(데이터,필드  )
		table=new JTable(data,title);
		
		scrollPane.setViewportView(table);
		
	}

}



