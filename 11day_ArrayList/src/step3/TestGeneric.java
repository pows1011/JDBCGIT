package step3;

import java.util.ArrayList;

public class TestGeneric {
	public static void main(String[] args) {
		ArrayList<Person> list=new ArrayList<Person>();
		list.add(new Person("��ڻ�",200));
		list.add(new Person("Ȳ����",300));
		list.add(new Person("ũ����Ż",400));
		
		Person vo1=list.get(0);
		System.out.println(vo1.getName());
		
		System.out.println(list.get(1).getName());
		
		
		
		
	}
}
