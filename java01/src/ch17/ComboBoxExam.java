package ch17;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ComboBoxExam extends JFrame {

	private JPanel contentPane;
	private JTextArea ta;
	private JComboBox cboDan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBoxExam frame = new ComboBoxExam();
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
	public ComboBoxExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		cboDan = new JComboBox();
		cboDan.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				//새로운 아이템을 선택한 상태이면
				if(e.getStateChange()==ItemEvent.SELECTED) {
					ta.setText(""); //ta의 텍스트를 지우고
					//콤보박스에서 현재 선택된 내용의 인덱스에 +2 (2를 지우면 2단선택시 0단이 나오게됨..)
					int dan=cboDan.getSelectedIndex()+2;
					putResult(dan); //ta에 구구단텍스트를 출력
				}
			}
		});
		cboDan.setModel(new DefaultComboBoxModel(new String[] {"2단", "3단", "4단", "5단", "6단", "7단", "8단", "9단"}));
		contentPane.add(cboDan, BorderLayout.NORTH);
		
		ta = new JTextArea();
		contentPane.add(ta, BorderLayout.CENTER);
	}
	void putResult(int dan) {
		ta.setText("");//기존 내용을 지우고
		for(int i=1; i<=9; i++) { //구구단 내용을 출력
			ta.append(String.format("%2d x %2d = %2d\n", dan,i,dan*i));
		}
	}
}





