package step8;

class Animal{
	
	public void eat() {//오버라이딩
		System.out.println("먹다");
	}
}


class Person extends Animal{
	
	public void eat() {//오버 라이딩
		System.out.println("사람이 수저로 먹다");
	}
}

class Dog extends Animal{
	
	public void eat() {//오버 라이딩
		System.out.println("개가 혀로 핥아서 먹다");
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
