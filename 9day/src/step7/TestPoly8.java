package step7;

public class TestPoly8 {
	public static void main(String[] args) {
		
		Employee e=new Employee("kostar1","������","�Ǳ�",200);
		Manager m=new Manager("kosta2", "ȫ�浿", "��", 300, "������");
		Engineer en=new Engineer("kosta3", "ȫ����", "�Ǳ�", 400, "�ڹ�", 100);
		
		HrService service=new HrService();
		Employee group[]= {e,m,en};
		service.printAll(group);
		service.printByAddress("�Ǳ�", group);
		service.printAnnualSalary(e);
		service.printAnnualSalary(m);
		service.printAnnualSalary(en);
		service.printTotalCost(group);
	}
}
