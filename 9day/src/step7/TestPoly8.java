package step7;

public class TestPoly8 {
	public static void main(String[] args) {
		
		Employee e=new Employee("kostar1","아이유","판교",200);
		Manager m=new Manager("kosta2", "홍길동", "목동", 300, "영업부");
		Engineer en=new Engineer("kosta3", "홍길자", "판교", 400, "자바", 100);
		
		HrService service=new HrService();
		Employee group[]= {e,m,en};
		service.printAll(group);
		service.printByAddress("판교", group);
		service.printAnnualSalary(e);
		service.printAnnualSalary(m);
		service.printAnnualSalary(en);
		service.printTotalCost(group);
	}
}
