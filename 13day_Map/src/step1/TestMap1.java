package step1;

import java.util.HashMap;

public class TestMap1 {
	public static void main(String[] args) {
		
		HashMap map =new HashMap();
		
		map.put("iu", "������");
		map.put("boa", "����");
		System.out.println(map.get("iu"));
		System.out.println(map.size());
		System.out.println(map);
		
		map.put("iu", "����");
		System.out.println(map);
		
		//Key�� ���������� true/false�� ��
		boolean flag=map.containsKey(map);
		
		System.out.println(flag);
		
		map.remove("iu");
		
		System.out.println(map.isEmpty());
		map.clear();
		
		
	}
}