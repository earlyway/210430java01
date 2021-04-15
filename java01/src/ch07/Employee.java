package ch07;

public class Employee {
	//속성(property)       ↙프로퍼티변수 멤버변수
	private String name;
	             //name의 목적지
	private String part;
	private String position;
	private int basic;
	private int bonus;
	private int total;
	private int tax;
	private int salary;
	//동작(method)
	public void input(String name, String part, String position,
			         //name의 임시거처소
			int basic) {
		this.name=name;
	  //this가 name을 임시거처소에서 목적지로 배송.
		this.part=part;
		this.position=position;
		this.basic=basic;
	}
	public void calc() {
		bonus=basic*3;
		total=basic+bonus;
		tax=(int)(total*0.033);
		salary=total-tax;
	}
	public void print() {
		System.out.println(
				"이름\t부서\t직위\t기본급\t보너스\t총액\t세액\t실수령액");
		System.out.println(name+"\t"+part+"\t"+position+"\t"+
				basic+"\t"+bonus+"\t"+total+"\t"+tax+"\t"+salary);
	}
	@Override     	//@override=어노테이션(도움말)
					//tostring 입력후 ctrl+space+ent
	public String toString() {
		// TODO Auto-generated method stub
		return name+"\t"+part+"\t"+position+"\t"+
		basic+"\t"+bonus+"\t"+total+"\t"+tax+"\t"+salary;
	}
}
