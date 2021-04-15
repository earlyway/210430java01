package ch17;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class ListExam extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	//직접 타이핑으로 추가
	private DefaultListModel<String>model;
	private JScrollPane scrollPane;
	private JList list;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListExam frame = new ListExam();
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
	public ListExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		tf = new JTextField();
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//모델에 새로운 자료를 추가(addElement), getText()텍스트필드에 입력한 내용
				model.addElement(tf.getText());
				tf.setText("");
				//텍스트필드에 커서를 이동시킴, 입력포커스 설정
				tf.requestFocus();
			}
		});
		panel.add(tf);
		tf.setColumns(10);
		
		JButton btnAdd = new JButton("추가");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//모델에 새로운 자료를 추가(addEle), getText()텍스트필드에 입력한 내용
				model.addElement(tf.getText());
				//텍스트필드에 커서를 이동시킴, 입력포커스 설정
				tf.requestFocus();
			}
		});
		panel.add(btnAdd);
		
		JButton btnDel = new JButton("삭제");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JList의 선택된 아이템의 인덱스
				//아무 내용도 선택하지 않으면 -1
				int index=list.getSelectedIndex();
				if(index != -1) { //선택한 상태이면
					model.remove(index);//모델에서 제거->리스트 제거
				}else {
					//대화상자를 띄우는 코드
					//showMessageDialog(parent, message)
					//parent:대화상자를 띄울 프레임
					JOptionPane.showMessageDialog(
							ListExam.this,"삭제할 내용을 선택하세요.");
				}
			}
		});
		panel.add(btnDel);
		panel.add(btnDel);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		
		//모델을 이용하여 스트링을 JList의 아이템으로 변환하여 입력.
		//스트링->모델->리스트속 아이템
		//모델의 역할은 데이터 변환 작업
		model=new DefaultListModel<String>();
		//모델에 자료(데이터)를 추가하고
		model.addElement("서울");
		model.addElement("부산");
		model.addElement("대전");
		model.addElement("춘천");
		model.addElement("대구");
		list = new JList(model);
		scrollPane.setViewportView(list);
	}

}
