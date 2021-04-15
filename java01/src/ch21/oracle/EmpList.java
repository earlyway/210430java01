package ch21.oracle;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class EmpList extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JComboBox cboDept;
	
	private Vector data,col;
	private EmpDAO empDao;
	private DeptDAO deptDao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpList frame = new EmpList();
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
	public EmpList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 342, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cboDept = new JComboBox();
		cboDept.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				//새로운 값을 선택하면
				if(e.getStateChange()==ItemEvent.SELECTED) {
							     //콤보박스.getSelectedItem() 선택한 아이템의 내용
					String dname=cboDept.getSelectedItem().toString();
					//선택한 부서의 직원리스트를 테이블에 채움
					DefaultTableModel model=new DefaultTableModel(empDao.listEmp(dname),col);
					table.setModel(model);
				}
			}
		});
		cboDept.setBounds(12, 48, 103, 40);
		contentPane.add(cboDept);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 98, 279, 264);
		contentPane.add(scrollPane);
		
		col=new Vector();
		col.add("사번");
		col.add("이름");
		col.add("직급");
		col.add("입사일자");
		col.add("급여");
		col.add("부서");
		empDao=new EmpDAO();
		//JTable의 내용을 채움
		DefaultTableModel model=new DefaultTableModel(empDao.listEmp("%"),col);
		System.out.println(empDao.listEmp("%"));
		table = new JTable(model);
		scrollPane.setViewportView(table);
		//콤보박스의 내용을 채움
		deptDao=new DeptDAO();
		ArrayList<DeptDTO> deptList=deptDao.listDept();
		cboDept.addItem("전체부서");
		for(DeptDTO dto : deptList) {
			cboDept.addItem(dto.getDname());
		}
	}
}
