package step10;

class Company{ 
	private String name;
	private String address;
	
	
	Company(String name, String address) {
		super();
		this.name = name; 
		this.address = address;
	}


	//Object class�� toString()�޼��带 �������̵� 
	//�ּҰ� ��� ��ü�� ���� ���밪�� ��ȯ�ȴ�.
	
	@Override
	public String toString() {
		return "ȸ��� :" + name + " �ּ� :" + address;
	}
	
}


public class TestObject {

	public static void main(String[] args) {
		
		Company c1=new Company("�ȷ�", "�Ǳ�");
		System.out.println(c1.toString());
		System.out.println(c1);
	}

}
