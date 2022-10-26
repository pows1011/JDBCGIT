package step2;

import java.util.ArrayList;

public class TestList2 {
	public static void main(String[] args) {
		
		ArrayList list =new ArrayList();
		
		list.add(new FriendVO("����",22));
		list.add(new FriendVO("�¿�",23));
		list.add(new FriendVO("����ī",24));
		list.add(new FriendVO("����",26));
		list.add(new FriendVO("����",20));
		list.add(new FriendVO("���",22));
		list.add(new FriendVO("����",25));
		list.add(new FriendVO("ȿ��",24));
		list.add(new FriendVO("Ƽ�Ĵ�",22));
		System.out.println(list.size());
		//list�� toString()�� �������̵� �Ǿ� ������
		//FriendVO�� ���� ���밪�� ���� ���ؼ���
		//FriendVO�� toString()���� �������̵� �Ǿ�� �Ѵ�.
		System.out.println(list);
		//FriendVO�� toString()���� �������̵� �� �ش�.
		//0�� �ε����� �̸��� ���
		//list.get()�� Object������ ��ȯ�ϹǷ�
		//FriendVO�� getName()�� ȣ���ϱ� ���ؼ��� 
		//Object casting �� �ʿ��ϴ�.
		FriendVO vo1=(FriendVO)list.get(0);
		System.out.println(vo1.getName());
		
		//�ε��� 8�� ���̸� ���
		//list.get(8)
		FriendVO vo2=(FriendVO)list.get(8);
		System.out.println(vo2.getAge());
		
		System.out.println("***  list���� ����� �̸�  ***");
		for(int i=0;i<list.size();i++) {
			FriendVO vo3=(FriendVO)list.get(i);
			System.out.println(vo3.getName());
		}
		
		System.out.println("***  list���� ����� ����� 25�� �̻��� �̸��� ���***");
		for(int i=0;i<list.size();i++) {
			FriendVO vo3=(FriendVO)list.get(i);
			if(vo3.getAge()>=25) {
				System.out.println(vo3.getName());	
			}
			
		}
	}
}

