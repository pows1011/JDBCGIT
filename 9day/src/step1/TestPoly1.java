package step1;
class Animal{
	
	public void Sleep() {
		System.out.println("�ڴ�");
	}
	
	public void eat() {
		System.out.println("�Դ�");
	}
}
class Person extends Animal{
	
	//�޼��� �������̵�
	public void eat() {
		System.out.println("����� �Դ�");
	}
	
	public void study() {
		System.out.println("����� �����ϴ�");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("���� �Դ�");
	}
	
	public void bark() {
		System.out.println("���� ¢��");
	}
	
}


public class TestPoly1 {

	public static void main(String[] args) {
			
		
		//�θ� Ÿ���� ������ �ڽ� ��ü�� ���� (�پ缺)
		Animal a=new Person();
		
		a.Sleep();//�θ�� ���� ����� ���� �޼��� ȣ�� ����
		a.eat();	// �޼��� �������̵� �Ǿ� �ڽ��� �޼��� ȣ��
		//a.study(); // ���� ������ �θ� Ÿ���̹Ƿ� �ν� �Ұ�.
		//�� �ڽ��� �������� ����� ���� �� �� ����.
		// ���� �ϱ� ���ؼ��� ��ü ĳ������ �ʿ��ϴ�.
		//��� ������ ���� �κп� ���ؼ��� �θ�ü������ ������ �Ұ����ϴ�.(ĳ����)
		
		Person p =(Person)a;//��ü ĳ����
		p.study();	// ���� ����
		
		Animal a2=new Dog();
		a.Sleep();//�θ�� ���� ����� ���� �޼��� ȣ�� ����
		a.eat();	// �޼��� �������̵� �Ǿ� �ڽ��� �޼��� ȣ��
	
		Dog d=(Dog)a2;
		d.bark();
		
		
	}

}
