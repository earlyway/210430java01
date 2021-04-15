package Test0414;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;

public class Test5 extends JFrame {

	private JPanel contentPane;
	private JTextField tfId;
	private JPasswordField tfPw;
	private JLabel lblResult;
	private JLabel lblId;
	private JLabel lblPw;
	private Map<String,String>map;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test5 frame = new Test5();
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
	public Test5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 288, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblId = new JLabel("아이디");
		lblId.setBounds(22, 39, 57, 15);
		contentPane.add(lblId);
		
		lblPw = new JLabel("비밀번호");
		lblPw.setBounds(22, 101, 57, 15);
		contentPane.add(lblPw);
		
		tfId = new JTextField();
		tfId.setBounds(95, 36, 116, 21);
		contentPane.add(tfId);
		tfId.setColumns(10);
		
		String url=
				"jdbc:mysql://localhost/java?useSSL=false&serverTimezone=UTC";
		String id ="java";
		String password="java1234";
		Connection conn=null;//접속 java.sql.Connection
		Statement stmt=null;//sql 명령어 실행
		ResultSet rs=null;//실행 결과셋(record set)
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("드라이버 로딩 성공");
			//db에 접속
			conn=DriverManager.getConnection(url,id,password);
			//System.out.println("mysql연결 성공");
			String sql="select * from login";
			stmt=conn.createStatement();//sql 실행 객체(인스턴스) 생성
			rs=stmt.executeQuery(sql);//sql실행, 레코드셋의 시작번지->rs
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)
					rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(stmt !=null)
					stmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(conn !=null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	

		JButton btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userid=tfId.getText();
				//패드워드 필드의 내용, 문자배열이므로 스트링으로 변환하는 과정이 필요.
				String pw=String.valueOf(tfPw.getPassword());
				String pwd=userpw.getString(userid);
				//비번이 null이 아니고 패스워드 필드에 입력한 값과 같으면
				if(pwd != null && userpw.equals(pw)) {
					//라벨의 글자색 변경
					lblResult.setForeground(Color.blue);
					//라벨의 내용 변경
					lblResult.setText(userid+"님 환영합니다.");
				}else { 
					lblResult.setForeground(Color.red);
					lblResult.setBackground(Color.yellow);
					lblResult.setOpaque(true);
					lblResult.setText("아이디 또는 비밀번호가 일치하지 않습니다.");
				}
			}
		});
			
			
		btnLogin.setBounds(74, 145, 97, 23);
		contentPane.add(btnLogin);
		
		lblResult = new JLabel("");
		lblResult.setBounds(22, 201, 224, 35);
		contentPane.add(lblResult);
		
		tfPw = new JPasswordField();
		tfPw.setBounds(95, 98, 116, 18);
		contentPane.add(tfPw);
	}
}
