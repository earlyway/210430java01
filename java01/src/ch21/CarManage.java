package ch21;

import java.util.List;
import java.util.Scanner;

public class CarManage {
	void delete() {
		Scanner scan=new Scanner(System.in);
		System.out.println("삭제할 차량번호를 입력하세요.");
		String license_number=scan.nextLine();
		CarDAO dao=new CarDAO();
		int result=dao.deleteCar(license_number);
		if(result==1) {
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("차량번호를 확인하세요.");
		}
	}
	void insert() {
		Scanner scan=new Scanner(System.in);
		System.out.print("차량번호 : ");
		String license_number=scan.nextLine();
		System.out.print("제조사 : ");
		String company=scan.nextLine();
		System.out.print("타입 : ");
		String type=scan.nextLine();
		System.out.print("제조년도 : ");
		int year=scan.nextInt();
		System.out.print("연비 : ");
		int efficiency=scan.nextInt();
		CarDAO dao=new CarDAO(); //dao 인스턴스 생성
		CarDTO dto=
				new CarDTO(license_number,company,type, year,efficiency);
		dao.insertCar(dto);
		System.out.println("추가되었습니다.");
	}
	void list() {
		CarDAO dao=new CarDAO();//dao 인스턴스를 만들고
		List<CarDTO> items=dao.listCar();//method를 호출하여 리스트 리턴
		System.out.println("차량번호\t연도\t제조사\t타입\t연비");
		for(CarDTO dto : items) {//리스트에 포함된 dto들을 반복처리
			System.out.print(dto.getLicense_number()+"\t");
			System.out.print(dto.getYear()+"\t");
			System.out.print(dto.getCompany()+"\t");
			System.out.print(dto.getType()+"\t");
			System.out.print(dto.getEfficiency()+"\n");
		}
	}
	public static void main(String[] args) {
		CarManage manage=new CarManage();//인스턴스를 만들고
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("작업을 선택하세요(1.목록, 2.추가, 3.삭제, 0:종료)");
			int code=scan.nextInt();//정수 입력
			switch(code) {
			case 0:
				scan.close();
				System.out.println("프로그램 종료");
				System.exit(0);//프로그램 강제종료
				break;
			case 1: manage.list(); break;
			case 2: manage.insert(); break;
			case 3: manage.delete(); break;
			}
		}
	}
}
