package quiz;

public class Store {
	private String code;
	private String name;
	private String product;
	private int price;
	private int amount;
	private int money;
	private int fee;
	public Store(String code, String name, String product, 
			int price, int amount) {
		this.code=code;
		this.name=name;
		this.product=product;
		this.price=price;
		this.amount=amount;
		money=price*amount;//금액
		fee=(int)(money*0.001); //수수료
	
	
	}
	@Override
	public String toString() {
		return code + "\t" + name + "\t" + product + "\t" + price + "\t"
				+ amount + "\t" + money + "\t" + fee;
	}
}
//	String code;
//	String name;
//	String product;
//	int pay;
//	int num;
//	int price;
//	int tax;
//	
//	int price=pay*num;
//	int tax=price*(1/1000);
//	
//	String[] code= {"0001","0003","0004"};
//	String[] name= {"삼성전자","현대자동차","삼보컴퓨터"};
//	String[] product= {"냉장고","승용차","프린터"};
//		
//	}
//
//}
//











//상점코드 string 상점명 string 주요상품 string 단가수량금액수수료int