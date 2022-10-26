package step4;

public class Parent2Main {

	public static void main(String[] args) {
			
		GrandParent gp=new GrandParent();
		gp.name="조부";
		gp.age=80;
		gp.printGrandParentInfo();
		
		System.out.println("===============");
		
		Parent2 p=new Parent2();
		p.name="부모";
		p.age=50;
		p.job="회사원";
		p.printGrandParentInfo();
		p.printParentInfo();
		
		System.out.println("===============");
		
		Child2 c=new Child2();
		c.name="자식";
		c.age=20;
		c.job="학생";
		c.hobby="기타";
		c.printGrandParentInfo();
		c.printParentInfo();
		c.printChildInfo();

	}

}
