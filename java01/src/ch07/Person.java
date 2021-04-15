package ch07; //21.03.29 am10
//public 모든 class에서 사용가능
//protected 상속 상위클래스 하위클래스
//default 같은 패키지(디렉토리)에서 사용가능
// private : class 내부에서만 사용가능. class 외부에선 사용불가(외부에서 접근불가).

//class code 작성 => 인스턴스    붕어빵틀이 class, 찍어내는게 인스턴스
//PersonUse class의 7라인보면 인스턴스 주었음. new 클래스이름
public class Person {
	 private String name;    //변수 자료형과 이름
	 private int age;
	 double height;
	 //getter
	 public String getName() {
		 return name;
	 }
	 public int getAge() {
		 return age;
	 }
	 public void setAge(int age) {
		 if(age>=100 || age<0) {
			 System.out.println(
			"잘못된 입력입니다.");
		 }else {
		 this.age=age;
		 }
	}
	 //setter
	 public void setName(String name) {
   //리턴이 없는 void     //String 외부에서 입력
		 this.name= name;
	 }
	 
	 
}


//은행에 돈을 맡기려면 금고에 직접 가는게 아니라 atm기나 창구를 이용하듯
//method를 통해서 우회해서 변수를 채우는.

