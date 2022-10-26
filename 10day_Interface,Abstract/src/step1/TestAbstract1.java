package step1;

//abstract method(추상 메서드)를 하나 이상 가지고 있으면

//그 클래스는 abstract class로 선언되어야 한다.
// abstract class는 직접 객체화 될 수 없다.

abstract class Parent {
	public void eat() {
		System.out.println("먹다");
	}
	// abstract method는 구현부가 없다.
	// 자식들은 반드시 abstract method를 오버라이딩 해야한다.
	// 만약 오버라이딩 하지 않으면
	// 자식 클래스가 abstract가 되야 한다. -> 객체 생성이 안됨.
	// 객체 생성을 하려면 오버라이딩 해야 한다.

	public abstract void study(); // 추상 메서드

}

class Child extends Parent {

	@Override
	public void study() {
		System.out.println("공부하다");
	}

}

public class TestAbstract1 {

	public static void main(String[] args) {

		Child c = new Child();
		c.eat();
		c.study();
		Parent p1 = new Child();
		p1.eat();
		p1.study();

	}

}
