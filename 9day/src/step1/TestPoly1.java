package step1;
class Animal{
	
	public void Sleep() {
		System.out.println("자다");
	}
	
	public void eat() {
		System.out.println("먹다");
	}
}
class Person extends Animal{
	
	//메서드 오버라이딩
	public void eat() {
		System.out.println("사람이 먹다");
	}
	
	public void study() {
		System.out.println("사람이 공부하다");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("개가 먹다");
	}
	
	public void bark() {
		System.out.println("개가 짖다");
	}
	
}


public class TestPoly1 {

	public static void main(String[] args) {
			
		
		//부모 타입의 변수에 자식 객체를 참조 (다양성)
		Animal a=new Person();
		
		a.Sleep();//부모로 부터 상속을 받은 메서드 호출 가능
		a.eat();	// 메서드 오버라이딩 되어 자신의 메서드 호출
		//a.study(); // 참조 변수가 부모 타입이므로 인식 불가.
		//즉 자신의 독자적인 멤버는 접근 할 수 없다.
		// 접근 하기 위해서는 객체 캐스팅이 필요하다.
		//상속 해주지 않은 부분에 대해서는 부모객체에서도 접근이 불가능하다.(캐스팅)
		
		Person p =(Person)a;//객체 캐스팅
		p.study();	// 접근 가능
		
		Animal a2=new Dog();
		a.Sleep();//부모로 부터 상속을 받은 메서드 호출 가능
		a.eat();	// 메서드 오버라이딩 되어 자신의 메서드 호출
	
		Dog d=(Dog)a2;
		d.bark();
		
		
	}

}
