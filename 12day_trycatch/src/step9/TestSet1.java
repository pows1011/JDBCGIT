package step9;

import java.util.HashSet;
import java.util.Set;

public class TestSet1 {
	public static void main(String[] args) {
		//�÷��� : List set ()
		//Map : 
		
		Set set=new HashSet();
		
		set.add("������");
		set.add("����");
		set.add("������");//�ߺ� ��� X
		System.out.println(set.size());
		System.out.println(set);
		set.add("��ٶ��");
		
		
		set.remove("����");
		
		System.out.println(set.size());
		System.out.println(set);
		
		System.out.println(set.contains("��ٶ��"));
		set.clear();
	}
}
