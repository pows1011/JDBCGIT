package step4;

import java.util.ArrayList;

public class TestArrayList3 {
	public static void main(String[] args) {

		ArrayList<ProductVO> list = new ArrayList<ProductVO>();

		list.add(new ProductVO("������", "����", 200));
		list.add(new ProductVO("������", "�Ｚ", 300));
		list.add(new ProductVO("�ؼ���", "�Ｚ", 400));

		System.out.println("*** ����Ʈ���� �Ｚ���� ������ ��ǰ�� ��� ***");

		for (int i = 0; i < list.size(); i++) {
			ProductVO pro = list.get(i);

			if (pro.getMaker().equals("�Ｚ")) {
				System.out.println(pro.getName());
			}
		}

		System.out.println("*** ����Ʈ���� ��ü ��ǰ�� ��� ���� ***");
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			ProductVO vo = list.get(i);
			sum += vo.getPrice();

		}
		System.out.println(sum / list.size());

		
		System.out.println("*** ������ �ε����� ���ο� ��ü ���Ҵ� ***");
		list.set(0,new ProductVO("����", "SKY", 500));
		System.out.println(list);
		
		System.out.println("*** ����Ʈ�� ��ǰ�� �� ���� �����ϴ� ��ǳ ���� ***");
		
		for (int i = 0; i < list.size(); i++) {
			ProductVO vo = list.get(i);
			if(vo.getName().startsWith("��")) {
				System.out.println(vo);
			}

		}
	}
	
}
