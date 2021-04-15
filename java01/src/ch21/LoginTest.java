package ch21;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.awt.event.ActionEvent;

public class LoginTest extends JFrame {

	private JPanel contentPane;
	private JPasswordField pwd;
	private JTextField userid;
	private JLabel lblResult;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginTest frame = new LoginTest();
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
	public LoginTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(38, 53, 57, 15);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(38, 105, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		pwd = new JPasswordField();
		pwd.setBounds(124, 102, 126, 21);
		contentPane.add(pwd);
		
		userid = new JTextField();
		userid.setBounds(124, 50, 126, 21);
		contentPane.add(userid);
		userid.setColumns(10);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strUserid=userid.getText();
				String strPwd=String.valueOf( pwd.getPassword() );
				
				Connection conn=null;
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				try {
					FileInputStream fis=
							new FileInputStream("c:/work/db.prop");
					Properties prop=new Properties();
					prop.load(fis);
					String url=prop.getProperty("url");
					String id=prop.getProperty("id");
					String password=prop.getProperty("password");
					conn=
							DriverManager.getConnection(url,id,password);
					String sql="select*from member where userid=? and pwd=?";
					System.out.println(sql);
					pstmt=conn.prepareStatement(sql);
					pstmt.setString(1,strUserid);
					pstmt.setString(2, strPwd);
					rs=pstmt.executeQuery();
					if(rs.next()) {
						lblResult.setText(rs.getString("name")+"님 환영합니다.");
					}else {
						lblResult.setText("아이디 또는 비밀번호가 틀립니다.");
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnLogin.setBounds(295, 101, 97, 23);
		contentPane.add(btnLogin);
		
		lblResult = new JLabel("");
		lblResult.setFont(new Font("굴림", Font.PLAIN, 15));
		lblResult.setBounds(124, 162, 248, 74);
		contentPane.add(lblResult);
	}
}
