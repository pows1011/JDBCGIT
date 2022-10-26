package step3;

public class Child extends Parent {

	
	public String hobby;
	
	public void print() {
		System.out.println("Child");
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
	
	
	@Override
	public void test() {
		System.out.println("hobby="+hobby);
		
	}
	
	public void parentPrint() {
		super.print();
	}

}
