package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
	public static void main(String[] args) {
		Map<String,Object> map=new HashMap<String,Object>();//hashMap 생성
		List<Student> list=new ArrayList<Student>();//list 생성. 양변의 자료형이 다르면 좌변이 상위 class.
		//list에 Student 인스턴스 추가
		list.add(new Student("2017001","kim","국사",1,"park"));
		list.add(new Student("2016001","park","국문",2,"lee"));
		list.add(new Student("2015001","hong","영문",3,"choi"));
		
		map.put("list",list); //map에 list 저장
		//map에 저장된 list를 읽어서 참조변수에 전달
		List<Student> list2=(ArrayList<Student>)map.get("list");
		System.out.println("학번\t이름\t전공\t학년\t지도교수");
		for(Student s:list2) { //확장 for문
			System.out.println(s.getNum()+"\t"+
								s.getName()+"\t"+s.getMajor()+"\t"+
								s.getYear()+"\t"+s.getProfessor());
		}
	}
}
