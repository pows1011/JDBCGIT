package step1;

class animal{ //extends Object(생략 되어 있음)
	int age=1;
	public void eat() {
		System.out.println("먹다");
	}
}
class Person extends animal{ // Animal의 자식이됨

	public void study() {
		System.out.println("공부 하다");
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
