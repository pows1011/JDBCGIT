package step10;

import java.util.ArrayList;
import java.util.Iterator;

public class Testlterator {
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add("�¿�");
		list.add("����");
		list.add("����ī");
		list.add("Ƽ�Ĵ�");
		list.add("����");
		list.add("���");
		list.add("����");
		list.add("����");
		list.add("ȿ��");
		
		//Collection(������ ����)�� ��ҵ��� �����ϱ� ���� ǥ���� �����ϴ� �������̽�
		
		Iterator it=list.iterator();
		
		//���� ��Ұ� �ִ��� true false
		//��Ұ� ���� �Ҷ����� ���� �Ѵ�.
		//hasNext()�����Ͱ� �ִ� ���� true�� ��ȯ
		//�÷��ǿ� ����� �������� ���� ��ŭ�� �ݺ��Ѵ�.
		while(it.hasNext()) { // ��������ȿ� ���� �ִٸ� �������γѾ�鼭 ��� �ݺ�
			System.out.println(it.next()); // �ȿ� �ִ� ���� ������ش�.
		}

	}
}
