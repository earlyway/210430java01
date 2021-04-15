package ch17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class SliderExam extends JFrame {

	private JPanel contentPane;
	private JSlider sliderR;
	private JSlider sliderG;
	private JSlider sliderB;
	//추가
	int red,green,blue; //색상코드를 저장할 변수

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SliderExam frame = new SliderExam();
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
	public SliderExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		//setbounds(x,y,width,height)
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 22, 174, 195);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("red");
		lblNewLabel.setBounds(201, 22, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("green");
		lblNewLabel_1.setBounds(201, 108, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("blue");
		lblNewLabel_2.setBounds(201, 186, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		sliderR = new JSlider();
		sliderR.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				red=sliderR.getValue();
				//new Color(r,g,b) 색상 조합
				panel.setBackground(new Color(red,green,blue));
			}
		});
		sliderR.setMaximum(255);
		sliderR.setBounds(198, 47, 200, 26);
		contentPane.add(sliderR);
		
		sliderG = new JSlider();
		sliderG.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				green=sliderG.getValue();
				panel.setBackground(new Color(red,green,blue));
			}
		});
		sliderG.setMaximum(255);
		sliderG.setBounds(198, 137, 200, 26);
		contentPane.add(sliderG);
		
		sliderB = new JSlider();
		sliderB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				blue=sliderB.getValue();
				panel.setBackground(new Color(red,green,blue));
			}
		});
		sliderB.setMaximum(255);
		sliderB.setBounds(198, 211, 200, 26);
		contentPane.add(sliderB);
	}
}
