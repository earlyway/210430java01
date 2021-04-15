package ch14; //21.03.31 am10:47

import java.util.ArrayList;
 //배열 class은 똑같은 자료형만 담을 수 있지만,
 //Arraylist class는 다양한 자료형을 담을 수 있음
public class ListExam {
	public static void main(String[] args) {
		//import=Ctrl Shft O
		ArrayList<Object> list=new ArrayList<Object>();
		
		//모든 자료형을 처리할 수 있음
		list.add("하나"); //리스트에 자료 추가
		list.add(2);
		list.add(5.21);
		list.add(false);
		list.add(3,4); //add(index, value) //3번인덱스 앞에 4 value를 넣으세요
		list.remove(0);//remove(index)
		//리스트.size() 데이터의 개수
		//리스트.get(index) 데이터 조회
		System.out.println("첫번째 데이터:"+list.get(0));
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
