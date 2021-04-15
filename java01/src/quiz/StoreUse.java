package quiz;//21.03.31 pm18

import java.util.ArrayList;
import java.util.List;

public class StoreUse {
	public static void main(String[] args) {
		List<Store> list=new ArrayList<Store>();
		Store s1=new Store("001","삼성전자","냉장고",450000,2);
		Store s2=new Store("003","현대","차",900000,5);
		Store s3=new Store("004","삼보","프린터",450000,15);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println("코드\t상점명\t주요상품\t단가\t수량\t금액\t수수료");
		for(int i=0; i<list.size(); i++) {
			Store s=list.get(i);
			System.out.println(s);//toString()을 호출해줌.
		}
		
	}

}
