package step7;

class Serivce {

	// RuntimeException �迭�� throws�� ��� ���� �ʾƵ�
	// Exception �߻��� �ڵ� throws
	public void test(String name) {
		System.out.println("�̸���" + name.length() + "�ڷ� ����");
	}
}

public class TestThrows2 {

	public static void main(String[] args) {

		Serivce s = new Serivce();

		try {
			s.test(null);
		} catch (NullPointerException ne) {
				System.out.println(ne.getMessage()); //������Exception�޽���
				ne.printStackTrace();//Exception�߻� ��� �� �޼����� �����ش�
		}
		System.out.println("���� ����");
	}
}
