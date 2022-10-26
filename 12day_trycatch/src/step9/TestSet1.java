package step9;

import java.util.HashSet;
import java.util.Set;

public class TestSet1 {
	public static void main(String[] args) {
		//컬렉션 : List set ()
		//Map : 
		
		Set set=new HashSet();
		
		set.add("아이유");
		set.add("보아");
		set.add("아이유");//중복 허용 X
		System.out.println(set.size());
		System.out.println(set);
		set.add("산다라박");
		
		
		set.remove("보아");
		
		System.out.println(set.size());
		System.out.println(set);
		
		System.out.println(set.contains("산다라박"));
		set.clear();
	}
}
