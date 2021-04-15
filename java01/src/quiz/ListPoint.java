package quiz;


import java.util.ArrayList;
import java.util.List;

import ch07.Point;

//arraylist면 배열 정렬로 처리
public class ListPoint {
	public static void main(String[] args) {
		List<Point> list=new ArrayList<Point>();
		Point p1=new Point();
		p1.setName("김철수");
		p1.setKor(90);
		p1.setEng(80);
		p1.setMat(85);
		
		Point p2=new Point();
		p2.setName("김항수");
		p2.setKor(50);
		p2.setEng(70);
		p2.setMat(65);
		
		Point p3=new Point();
		p3.setName("김야수");
		p3.setKor(95);
		p3.setEng(83);
		p3.setMat(89);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등급");
		for(int i=0; i<list.size(); i++) {
			Point p=list.get(i);
			System.out.println(p.getName()+"\t"+
								p.getKor()+"\t"+
								p.getEng()+"\t"+
								p.getMat()+"\t"+
								p.getTot()+"\t"+
								String.format("%.1f",p.getAvg())+"\t"+
								p.getGrade());
		}
	}
}
	
//	public static void main(String[] args) {
//		ArrayList<Point>list=new ArrayList<Point>();
//	}
//		Point m1=new Point(); //member class의 인스턴스1 생성.
//		m1.setName("김기수");
//		m1.setKor(80);
//		m1.setEng(85);
//		m1.setMat(85);
//		m1.setTot(get.kor()+get.eng()+get.mat());
//		m1.setAvg(tot / 3);
//		m1.setGrade(String get.grade());
//		
//		Point m2=new Point(); //member class의 인스턴스1 생성.
//		m2.setName("박기수");
//		m2.setKor(80);
//		m2.setEng(85);
//		m2.setMat(85);
//		m2.setTot(get.kor()+get.eng()+get.mat());
//		m2.setAvg(tot / 3);
//		m2.setGrade(String get.grade());
//		
//		list.add(m1);
//		list.add(m2);
//		
//		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등급");
//		for(int i=0; i<list.size(); i++) { //리스트.size() 리스트의 자료 개수
//			Member m=list.get(i); //i번째 자료를 꺼내어 member 참조변수에 전달.
//			System.out.println(m.getName()+"\t"+
//								m.getKor()+"\t"+
//								m.getEng()+"\t"+
//								m.getMat()+"\t"+
//								m.getTot()+"\t"+
//								m.getAvg()+"\t"+
//								m.getGra());
//		}
//}

