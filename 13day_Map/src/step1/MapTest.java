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
		map.put("address","����� ���絿");
		
		
		String key="";
		System.out.println("���� Ȯ���ϰ� ���� Key�� �Է� �ϼ���");
		key=sc.next();
		
		if(map.containsKey(key)) {
			System.out.println("key "+key+"�� �� :"+map.get(key));
		}else {
			System.out.println("ã�� �� ���� Key��");
		}
		System.out.println("\n map�� ��ü Value ��� 1");
		
		Object[] values=map.values().toArray();
		
		for(i=0;i<values.length;i++) {
			System.out.println((String)values[i]);
		}
		
		System.out.println("\n map�� ��ü key ��� 2");
		
		Object[] keys=map.keySet().toArray();
		for(i=0;i<keys.length;i++) {
			System.out.println((String)keys[i]);
		}
	}
}
