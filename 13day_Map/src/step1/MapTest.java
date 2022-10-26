package step1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i;
		Map<String,String> map=new HashMap<>();
		
		map.put("name","aaa");
		map.put("tel","111");
		map.put("address","서울시 양재동");
		
		
		String key="";
		System.out.println("값을 확인하고 싶은 Key를 입력 하세요");
		key=sc.next();
		
		if(map.containsKey(key)) {
			System.out.println("key "+key+"의 값 :"+map.get(key));
		}else {
			System.out.println("찾을 수 없는 Key값");
		}
		System.out.println("\n map의 전체 Value 출력 1");
		
		Object[] values=map.values().toArray();
		
		for(i=0;i<values.length;i++) {
			System.out.println((String)values[i]);
		}
		
		System.out.println("\n map의 전체 key 출력 2");
		
		Object[] keys=map.keySet().toArray();
		for(i=0;i<keys.length;i++) {
			System.out.println((String)keys[i]);
		}
	}
}
