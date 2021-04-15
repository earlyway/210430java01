package ch14;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<String,Object> map=new HashMap<String, Object>(); //map=hashMap. 자료형이 틀리면 좌변이 상위 class.
		map.put("kim", "김탄"); //put(key,value)
		map.put("park", "박씨");
		map.put("park", "박소"); //key는 중복되지 않음
		
		Member m3=new Member();
		m3.setName("최순호");
		m3.setUserid("choi");
		m3.setPasswd("3333");
		m3.setTel("02-999-7755");
		m3.setEmail("choi@naver.com");
		map.put("choi", m3);
		
		System.out.println(map.get("kim")); //get(key)
		System.out.println(map.get("park"));
		System.out.println(map.get("choi"));
	}

}
