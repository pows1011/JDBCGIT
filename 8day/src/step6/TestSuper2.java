package step6;

class Employee{
	
	private String no;

	
	Employee(String no) {
		
		this.no = no;
	}
	
	
	
}

class Manager extends Employee{

	
	private String dept;
	Manager(String no,String dept) {
					// �θ� �������� ���ڰ��� �Է��Ѵ�
		super(no);// �Ű����� no���� �ڵ����� �θ�ü�� no������ �������� (employee �����ڷ� ��)
		
		this.dept=dept;	// ���� dept������ �����ϰڴٴ� ��
		
	}
	
}

public class TestSuper2 {

	public static void main(String[] args) {
		Manager m=new Manager("�ڽ�Ÿ","������");
		
		

	}

}
