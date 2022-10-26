package step1;

import java.util.HashMap;

public class TestMap1 {
	public static void main(String[] args) {
		
		HashMap map =new HashMap();
		
		map.put("iu", "아이유");
		map.put("boa", "보아");
		System.out.println(map.get("iu"));
		System.out.println(map.size());
		System.out.println(map);
		
		map.put("iu", "현아");
		System.out.println(map);
		
		//Key의 존재유무를 true/false로 리
		boolean flag=map.containsKey(map);
		
		System.out.println(flag);
		
		map.remove("iu");
		
		System.out.println(map.isEmpty());
		map.clear();
		
		
	}
}