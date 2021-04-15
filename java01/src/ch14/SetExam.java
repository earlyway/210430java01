package ch14; //21.03.31 pm13

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
//set 집합개념
public class SetExam {
	public static void main(String[] args) {
		//HashSet<String> hs=new HashSet<>();//hashSet 생성
		TreeSet<String> hs=new TreeSet<>(); //treeSet - 자동정렬(오름차순)
		hs.add("포도"); //hashSet에 자료 추가
		hs.add("사과");
		hs.add("배");
		hs.add("딸기");
		hs.add("사과");//중복된 자료는 저장되지 않음
		//순서대로 출력되지 않음. 집합개념이기때문(주머니 안에 마구잡이로 들어가는 공)
		//순서대로 출력하려면 list . 빨리 자료를 찾으려고하면 map.
		
		for(String str:hs) {
			System.out.println(str);
		}
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
