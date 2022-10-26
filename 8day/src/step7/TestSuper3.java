package step7;

class Animal{
	
	int age=1;
	private String card="Ä«µå";
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	
	
}

class Person extends Animal{
	
	public void info() {
		System.out.println(super.age);
		System.out.println(super.getCard());
	}
}


public class TestSuper3 {

	public static void main(String[] args) {
		Person p=new Person();
		p.info();
		

	}

}
