package step4;

public class Parent2Main {

	public static void main(String[] args) {
			
		GrandParent gp=new GrandParent();
		gp.name="����";
		gp.age=80;
		gp.printGrandParentInfo();
		
		System.out.println("===============");
		
		Parent2 p=new Parent2();
		p.name="�θ�";
		p.age=50;
		p.job="ȸ���";
		p.printGrandParentInfo();
		p.printParentInfo();
		
		System.out.println("===============");
		
		Child2 c=new Child2();
		c.name="�ڽ�";
		c.age=20;
		c.job="�л�";
		c.hobby="��Ÿ";
		c.printGrandParentInfo();
		c.printParentInfo();
		c.printChildInfo();

	}

}
