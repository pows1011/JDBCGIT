package step3;

public class AbstractMain {
	public static void main(String[] args) {
		GrandParent gp =new Child();
		gp.name="grand papa";
		gp.age=90;
		gp.print();		
		gp.test();
		System.out.println("--------------");
		
		
		Child c=new Child();
		c.name="Child momo";
		c.age=20;
		
		c.print();
		c.test();
		c.parentPrint();
	}
}
