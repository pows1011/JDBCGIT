package step1;

class animal{ //extends Object(���� �Ǿ� ����)
	int age=1;
	public void eat() {
		System.out.println("�Դ�");
	}
}
class Person extends animal{ // Animal�� �ڽ��̵�

	public void study() {
		System.out.println("���� �ϴ�");
	}
}

public class TestInheritance1 {

	public static void main(String[] args) {
		
		Person p=new Person();
		p.study();
		p.eat();
		System.out.println(p.age);
	}

}
