package step3;

public class ParentMain {

	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.name="부모";
		p.age=50;
		p.setMoney(1000000);
		p.printParentInfo();
		System.out.println(p.getMoney());
		System.out.println("==============");
		
		Child c=new Child();
		c.name="자식";
		c.age=20;
		c.setHobby("기타");
		c.printParentInfo();

	}

}
