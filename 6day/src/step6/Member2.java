package step6;

public class Member2 {
	
	String name;
	String tel;
	String address;
	
						//���� �̸��� �����ڰ� 2������ ������ �ȳ��� ( ������ �����ε� )
	public Member2() {	//�ʱ�ȭ�� �ϴ� ������
		name="no name";
		tel="no tel";
		address="no address";
		
	}

	public Member2(String name) {
		super();
		this.name = name;
		tel="no tel";
		address="no address";
	}
	
	//������ �����ε� ( �Ϲ� �޼��忡���� ������ �� )
	// ȸ������ ���������� �ַ� ��� �ʼ����� , ���û��� ����� 3���� �ش��ϴ� �ʱ�ȭ���� �۵�
	public Member2(String name, String tel, String address) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	void print() {
		System.out.println("name:"+name);		
		System.out.println("tel:"+tel);
		System.out.println("address:"+address);
		System.out.println();
	}

	
	
}
