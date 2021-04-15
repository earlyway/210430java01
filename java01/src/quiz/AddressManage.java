package quiz;

import java.util.List;
import java.util.Scanner;


public class AddressManage {
	private AddressDAO dao;
	public AddressManage() {
		dao=new AddressDAO();
	}
	void delete() {
		Scanner scan=new Scanner(System.in);
		System.out.println("삭제할 아이디를 입력하세요.");
		String idd=scan.next();
		int result=dao.deleteAddress(idd);
		if(result==1) {
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	void insert() {
		Scanner scan=new Scanner(System.in);
		System.out.print("아이디 : ");
		String idd=scan.next();
		
		System.out.print("이름 : ");
		String nam=scan.next();
		
		System.out.print("주소 : ");
		String addr=scan.next();
		
		System.out.print("전화번호 : ");
		String tel=scan.next();
		
		System.out.print("이메일 : ");
		String email=scan.next();
		
		AddressDTO dto=new AddressDTO(idd,nam,addr,tel,email);
		dao.insertAddress(dto);
		System.out.println("저장되었습니다.");
	}
	void list() {
		List<AddressDTO> items=dao.listAddress();//method를 호출하여 리스트 리턴
		System.out.println("아이디\t이름\t주소\t\t전화번호\t이메일");
		for(AddressDTO dto : items) {//리스트에 포함된 dto들을 반복처리
			System.out.print(dto.getIdd()+"\t");
			System.out.print(dto.getNam()+"\t");
			System.out.print(dto.getAddr()+"\t");
			System.out.print(dto.getTel()+"\t");
			System.out.print(dto.getEmail()+"\n");
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		AddressManage address=new AddressManage();
		while(true) {
			System.out.println("메뉴를 선택하세요(1.목록, 2.추가, 3.삭제, 0:종료)");
			int code=scan.nextInt();//정수 입력
			switch(code) {
			case 0:
				System.out.println("종료합니다.");
				System.exit(0);//프로그램 강제종료break;
			case 1: address.list(); break;
			case 2: address.insert(); break;
			case 3: address.delete(); break;
			}
		}
	}
}
