package step2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMap2 {
	public static void main(String[] args) {
		
	
		HashMap map=new HashMap();
		
		map.put("a",new FriendVO("�տ���","�¸�",200));
		map.put("b",new FriendVO("ũ����Ż","�뷮��",300));
		map.put("c",new FriendVO("������","�Ǳ�",400));
		
		System.out.println(map);
		
		FriendVO vo=(FriendVO)map.get("c");
	
		System.out.println(vo.getName()+""+vo.getAddress());
		System.out.println(map.get("C"));
		
		
		Set set=map.keySet();
		
		Iterator it=set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("map�� value�鸸 ���");
		Collection col=map.values();
		Iterator it2=set.iterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
	}
}
