package quiz;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex25_point_file {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("c:/work/data.txt")));
		List<MyPoint> items = new ArrayList<>();
		while (true) {
			String str = br.readLine();
			if (str == null)
				break;
			String[] arr = str.split(",");
			String name = arr[0];
			int kor = Integer.parseInt(arr[1]);
			int eng = Integer.parseInt(arr[2]);
			int mat = Integer.parseInt(arr[3]);
			MyPoint p = new MyPoint(name, kor, eng, mat);
			p.setTot(p.getKor() + p.getEng() + p.getMat());
			p.setAvg(p.getTot() / 3.0);
			items.add(p);
		}
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < items.size(); i++) {
			MyPoint p = items.get(i);
			System.out.println(p.getName() + "\t" + p.getKor() + "\t" + p.getEng() + "\t" + p.getMat() + "\t" + p.getTot()
					+ "\t" + String.format("%.3f", p.getAvg()));
		}
	}
}
