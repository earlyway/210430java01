package ch21;//21.04.08 pm14

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class EmpManage {
	private EmpDAO dao;
	public EmpManage() {
		dao=new EmpDAO();
	}
	void delete() {
		Scanner scan=new Scanner(System.in);
		System.out.println("삭제할 사원번호를 입력하세요.");
		int empno=scan.nextInt();
		int result=dao.deleteEmp(empno);
		if(result==1) {
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("존재하지 않는 사원번호입니다.");
		}
	}
	void list() {
		List<EmpDTO> items=dao.listEmp();//method를 호출하여 리스트 리턴
		System.out.println("사번\t이름\t입사일자\t\t급여");
		for(EmpDTO dto : items) {//리스트에 포함된 dto들을 반복처리
			System.out.print(dto.getEmpno()+"\t");
			System.out.print(dto.getEname()+"\t");
			System.out.print(dto.getHiredate()+"\t");
			System.out.print(dto.getSal()+"\n");
		}
	}
	void insert() {
		Scanner scan=new Scanner(System.in);
		System.out.print("사번 : ");
		int empno=scan.nextInt();
		System.out.print("이름 : ");
		String ename=scan.next();
		System.out.print("입사일자 : ");
		String hiredate=scan.next();
		System.out.print("급여 : ");
		int sal=scan.nextInt();
		EmpDTO dto=
				new EmpDTO(empno,ename,Date.valueOf(hiredate),sal);
		dao.insertEmp(dto);
		System.out.println("저장되었습니다.");
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		EmpManage emp=new EmpManage();
		while(true) {
			System.out.println("메뉴를 선택하세요(1.목록, 2.추가, 3.삭제, 0:종료)");
			int code=scan.nextInt();//정수 입력
			switch(code) {
			case 0:
				//System.out.println("종료합니다.");
				System.exit(0);//프로그램 강제종료break;
			case 1: emp.list(); break;
			case 2: emp.insert(); break;
			case 3: emp.delete(); break;
			
			}
		}
	}
}
