package step2;

class GrandParent{
	GrandParent(){
		System.out.println("GrandParent");
	}
}

class Parent extends GrandParent{
	Parent(){
		System.out.println("parent");
	}
}

class Child extends Parent {
	Child(){
		System.out.println("child");
	}
}

public class TestInheritance2 {

	public static void main(String[] args) {
		
		new Child();

	}

}
