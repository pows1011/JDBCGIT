package step2;

class Animal{
	public void eat() {
		System.out.println("¸Ô´Ù");
	}
	
}

class Person extends Animal{
	public void eat() {
		System.out.println("»ç¶÷ÀÌ ½Ä´ç¿¡¼­ ¹äÀ» ¸Ô´Ù");
	}
	
}
class Dog extends Animal{
	public void eat() {
		System.out.println("°³°¡ »ç·á¸¦ ¸Ô´Ù");
	}
}

class Tiger extends Animal{
	public void eat() {
		System.out.println("È£¶ûÀÌ°¡ »ý´ßÀ» ¸Ô´Ù");
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
