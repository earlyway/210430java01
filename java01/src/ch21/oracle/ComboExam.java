package ch21.oracle;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ComboExam extends JFrame {

	private JPanel contentPane;
	private JComboBox combo;
	
	private EmpDAO empDao;
	private DeptDAO deptDao;
	private ArrayList<DeptDTO> deptList;
	private ArrayList<EmpDTO> empList;
	private JList list;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboExam frame = new ComboExam();
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
	public ComboExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 314, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		combo = new JComboBox();
		combo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				//새로운 값을 선택하면
				if(e.getStateChange()==ItemEvent.SELECTED) {
					//콤보박스에서 선택한 값의 인덱스
					int idx=combo.getSelectedIndex();
					//선택한 값이 없으면 -1
					if(idx!=-1) {//선택한 값이 있으면
						refreshTable(idx);//JTable 내용을 갱신
					}
				}
			}
		});
		contentPane.add(combo, BorderLayout.NORTH);
		
		list = new JList();
		contentPane.add(list, BorderLayout.CENTER);
		
		//dao 인스턴스 생성
		empDao=new EmpDAO();
		deptDao=new DeptDAO();
		//부서 리스트
		deptList=deptDao.listDept();
		//10번 부서의 사원 리스트
		empList=empDao.listEmp(10);
		//for반복문을 돌면서
		for(DeptDTO dto : deptList) {
			//콤보박스에 부서이름을 추가
			combo.addItem(dto.getDname());
		}
		//JList의 내용을 갱신.
		refreshTable(0);
	}//생성자
	
	//JList의 내용을 갱신하는 코드
	void refreshTable(int idx) {
		if(list!=null) {//JList가 null이 아니면
			list.removeAll();//JList의 기존내용들을 모두 지우고
			//리스트.get(idx)리스트의 아이템 조회
			int deptno=deptList.get(idx).getDeptno();
			empList=empDao.listEmp(deptno);//부서코드로 사원리스트 조회
//			System.out.println(idx);
//			System.out.println(deptList.get(idx));
//			System.out.println(deptno);
			//사원리스트 사이즈만큼의 스트링배열을 만들고
			String[]names=new String[empList.size()];
			for(int i=0; i<names.length; i++) {
				//스트링 배열의 내용을 채움
				names[i]=empList.get(i).getEname();
			}
			//JList에 내용을 채우기위해 리스트모델 생성
			DefaultListModel<String> model=new DefaultListModel<>();
			for(String val : names) {
				model.addElement(val);//모델에 데이터를 입력하고
			}
			list.setModel(model);//모델을 통해 JList 내용을 채움
		}
	}
}//클래스
