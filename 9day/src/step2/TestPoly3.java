package step2;

class Animal{
	public void eat() {
		System.out.println("�Դ�");
	}
	
}

class Person extends Animal{
	public void eat() {
		System.out.println("����� �Ĵ翡�� ���� �Դ�");
	}
	
}
class Dog extends Animal{
	public void eat() {
		System.out.println("���� ��Ḧ �Դ�");
	}
}

class Tiger extends Animal{
	public void eat() {
		System.out.println("ȣ���̰� ������ �Դ�");
	}
}


class ZooService{
	public void pass(Animal a) {
		a.eat();
	}
}

public class TestPoly3 {
	public static void main(String[] args) {
		ZooService z=new ZooService();
		z.pass(new Person());
		z.pass(new Dog());
		z.pass(new Tiger ());
		
	}
}
