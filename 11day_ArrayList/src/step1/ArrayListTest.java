package step1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("aaa");
		a1.add("bbb");
		a1.add(1,"ccc");
		a1.set(2,"fff");
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(i+"��° ��� :"+a1.get(i));
		}
		
		
		System.out.println("�˻��� ���� �Է��ϼ���");
		String srh=sc.next();
		int idx=0;
		if(a1.contains(srh)) { // ArrayList�ȿ� ���� ���ԵǾ� �ִ��� Ȯ��
			idx=a1.indexOf(srh);  //����Ʈ�� ����� ��ġ�� ��ȯ 
		}else {
			System.out.println("���� �������� �ʽ��ϴ�");
		}
		

		
		
		
		System.out.println("������ ���� �Է��ϼ���");
		srh=sc.next();
		idx=0;
		if(a1.contains(srh)) {
			idx=a1.indexOf(srh);
			a1.remove(idx);//����
		}else {
			System.out.println("���� �������� �ʽ��ϴ�.");
		}
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(i+"��° ��� :"+a1.get(i));
		}
		
		
		
		System.out.println("��ü ����");
		a1.removeAll(a1);
		if(a1.isEmpty()) { //
			System.out.println("����Ʈ�� ��� �ִ�.");
		}else {
			for(int i=0;i<a1.size();i++)
			{
				System.out.println(i+"��° ��� :"+a1.get(i));
			}
		}
		
			
		
		
		
	}
}
