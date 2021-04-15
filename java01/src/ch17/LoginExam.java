package ch17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginExam extends JFrame {

	private JPanel contentPane;
	private JTextField tfid;
	private JPasswordField tfpw;
	//추가
	private Map<String,String>map;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginExam frame = new LoginExam();
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
	public LoginExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfid = new JTextField();
		tfid.setBounds(37, 42, 116, 21);
		contentPane.add(tfid);
		tfid.setColumns(10);
		
		tfpw = new JPasswordField();
		tfpw.setBounds(37, 73, 116, 21);
		contentPane.add(tfpw);
		
		map=new HashMap<>();
		map.put("kim", "1234");
		map.put("park", "2222");
		map.put("hong", "3333");
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//텍스트필드의 내용
				String id=tfid.getText();
				//패드워드 필드의 내용, 문자배열이므로 스트링으로 변환하는 과정이 필요.
				String pw=String.valueOf(tfpw.getPassword());
				//map.get(key) 아이디에 해당하는 비번 조회
				String strPwd=map.get(id);
				//비전이 null이 아니고 패스워드 필드에 입력한 값과 같으면
				if(strPwd != null && strPwd.equals(pw)) {
					//라벨의 글자색 변경
					lblResult.setForeground(Color.blue);
					//라벨의 내용 변경
					lblResult.setText(id+"님 환영합니다.");
				}else { //비번이 틀리면
					lblResult.setForeground(Color.red);
					lblResult.setBackground(Color.yellow);//배경색
					lblResult.setOpaque(true);//배경을 투명하게 설정
					lblResult.setText("로그인 실패...");
				}
			}
		});
		btnLogin.setBounds(37, 104, 97, 23);
		contentPane.add(btnLogin);
		
		lblResult = new JLabel("");
		lblResult.setBounds(37, 151, 125, 15);
		contentPane.add(lblResult);
	}
}
