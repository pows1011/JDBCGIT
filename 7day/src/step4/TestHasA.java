package step4;

public class TestHasA {

	public static void main(String[] args) {
		//Car�� PersonŬ������ set�޼ҵ忡 ���ԵǾ� �ֱ� ������ person���� �����������
		Person p =new Person();//�ν��Ͻ� ���� car,name
		p.setName("������");
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
