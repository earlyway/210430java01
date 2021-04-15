package ch17;//21.04.02 pm16:50

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

//키입력 > KeyListener > KeyEvent 키보드입력관련 이벤트 처리
public class KeyMouseExam extends JFrame implements KeyListener, MouseListener, MouseMotionListener {
	// 필드 변수
	private int x, y; // 이미지의 x,y좌표
	private int width, height;// 이미지의 가로,세로 사이즈
	private Image img;// 이미지 객체

	public KeyMouseExam() {// 생성자
		// 키 이벤트기능 추가
		addKeyListener(this);
		//마우스 리스너 기능 추가
		addMouseListener(this);
		//마우스 동작 리스너 기능 추가
		addMouseMotionListener(this);

		// 현재 클래스와 같은 패키지에 있는 이미지 로딩
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("a.jpg"));
		// 자동으로 입력 포커스를 설정할 수 있도록 변경
		setFocusable(true);
		// 입력 포커스 설정
		requestFocus();
		setSize(300, 300);// 프레임의 가로,세로 사이즈
		setVisible(true);// 프레임을 화면에 표시
		setDefaultCloseOperation(EXIT_ON_CLOSE);// 윈도우 닫기버튼 동작
	}						//생성자 끝

	// 컴포넌트를 화면에 출력하는 method
	// Graphics 그래픽 처리 개체
	@Override
	public void paint(Graphics g) {
		super.paint(g); // JFrame의 paint method를 호출
		width = img.getWidth(this); // 이미지의 가로 사이즈계산
		height = img.getHeight(this); // 이미지의 세로 사이즈계산
		System.out.println(width+","+height);
		// 이미지를 화면에 출력. drawImage(이미지,x좌표,y좌표,이미지 관찰자)
		// 이미지 관찰자 : 이미지에 대한 다양한 처리를 지원하는 객체
		g.drawImage(img, x, y, this);
	}

	public static void main(String[] args) {
		new KeyMouseExam();// 인스턴스가 생성된 후 생성자가 자동으로 호출됨.
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("keyTyped");
	}

	@Override
	public void keyPressed(KeyEvent e) {//키를 누를 때 실행되는 코드
		switch(e.getKeyCode()) {//키 코드값 확인
		case KeyEvent.VK_UP:	
			y=Math.max(0, y-5);//max(a,b) 큰값 
			break;
		case KeyEvent.VK_DOWN:
			y=Math.min(300-height, y+5); //min(a,b) 작은값
			break;			    //down 1번에 y가 5씩 증가
		case KeyEvent.VK_LEFT:
			x=Math.max(0, x-5);
			break;
		case KeyEvent.VK_RIGHT:
			x=Math.min(300-width,x+5);
			break;
		}
		repaint();	//그래픽 갱신 요청--->paint()가 다시 호출되면서 그래픽 갱신
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("keyReleased");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x=e.getX();//마우스를 클릭한 당시의 마우스의 x좌표
		y=e.getY();//       "        마우스의 y좌표
		repaint();//그래픽 갱신 요청
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		x=e.getX();//마우스를 클릭한 당시의 마우스의 x좌표
		y=e.getY();//       "        마우스의 y좌표
		repaint();//그래픽 갱신 요청
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
