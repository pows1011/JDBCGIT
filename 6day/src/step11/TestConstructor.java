package step11;

public class TestConstructor {

	public static void main(String[] args) {
		Person p=new Person("������");
		System.out.println(p.getName());
		p.setName("����");
		System.out.println(p.getName());
		//�����ڸ� ���� �Ҵ�� set�޼ҵ带 ���� �Ҵ��� ��������� ����
		//�뵵�� �־�� ���̴� ?
		//�����ڿ��� ����� ���ڰ��� �Է����� ������ ������ ���� �� ��ü ������
		// ������ ���ڰ� �ִ� �����ڿ��� �䱸�Ѵ�.
		//�����ڴ� �ʼ���
		//set�޼ҵ�� ������ �Ǵ� ���� ������ ����.
		//�����ڸ� ���� �Ҵ� -��ü ������ �ʼ����� ���
		//set �޼ҵ带 ���� �Ҵ� - �������� ���
	}

}
