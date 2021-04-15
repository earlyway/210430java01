package ch20; //21.04.06 pm15

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class GuguClient extends JFrame {

	private JPanel contentPane;
	private JTextArea taResult;
	private JComboBox cboDan;

	private Socket socket;
	private DataInputStream dis;
	private DataOutputStream dos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuguClient frame = new GuguClient();
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
	public GuguClient() {//생성자.
		try {
			//서버에 접속, ip주소와 포트번호가 필요함
			socket=new Socket("localhost",9999);
			//서버와 데이터를 주고받기위한 스트림 생성
			dis=new DataInputStream(socket.getInputStream());
			dos=new DataOutputStream(socket.getOutputStream());
		}	catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		cboDan = new JComboBox();
		//콤보박스에 아이템이벤트 추가.
		cboDan.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				//새로운 값을 선택하면
				if(e.getStateChange()==ItemEvent.SELECTED) {
					//콤보박스에서 선택한 값을 숫자로 변환
					System.out.println("콤보박스 선택...");
					int idx=cboDan.getSelectedIndex();
					int dan=Integer.parseInt(
							cboDan.getSelectedItem().toString());
					//서버에 전송
					try {
						dos.writeInt(dan);
						//서버에서 계산한 결과값을 읽어서 JTextArea에 출력
						taResult.setText(dis.readUTF());
					} catch(Exception e2) {
						e2.printStackTrace();
					}
				}
			}
		});
		cboDan.setModel(new DefaultComboBoxModel(new String[] {"2", "3", "4", "5", "6", "7", "8", "9"}));
		contentPane.add(cboDan, BorderLayout.NORTH);
		
		taResult = new JTextArea();
		contentPane.add(taResult, BorderLayout.CENTER);
	}

}
