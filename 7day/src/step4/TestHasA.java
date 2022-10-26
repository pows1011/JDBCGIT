package step4;

public class TestHasA {

	public static void main(String[] args) {
		//Car가 Person클래스의 set메소드에 포함되어 있기 때문에 person부터 선언해줘야함
		Person p =new Person();//인스턴스 변수 car,name
		p.setName("아이유");
		p.setCar(new Car("K5","RED"));
		
		System.out.println(p.getName());
		System.out.println(p.getCar().getModel());
		System.out.println(p.getCar().getColor());
		
		p.getCar().setModel("K7");
		p.getCar().setColor("BLUE");
		System.out.println(p.getCar().getModel());
		System.out.println(p.getCar().getColor());
		

	}

}
