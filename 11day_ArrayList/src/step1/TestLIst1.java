package step1;

import java.util.ArrayList;

public class TestLIst1 {
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add("������"); //������ �߰�
		list.add("����");
		list.add("������");
		
		
		System.out.println(list.size());//�������� ����. 
		System.out.println(list);       //length(���� ����)  
		System.out.println(list.get(0));
		
		list.add(1); // 1.5 ���� �̻���� �ڵ����� ��ȯ
		list.add(new Integer(1));// wrapper class
		System.out.println(list);
		
		list.remove(4);// ������ ����
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
	
}
