package step8;

class Animal{
	
	public void eat() {//�������̵�
		System.out.println("�Դ�");
	}
}


class Person extends Animal{
	
	public void eat() {//���� ���̵�
		System.out.println("����� ������ �Դ�");
	}
}

class Dog extends Animal{
	
	public void eat() {//���� ���̵�
		System.out.println("���� ���� �ӾƼ� �Դ�");
	}
}



public class TestOverriding1 {
	public static void main(String[] args) {
		
		Person p=new Person();
		p.eat();
		
		Dog d=new Dog();
		d.eat();
	}
}
