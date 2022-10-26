package step6;

class Employee{
	
	private String no;

	
	Employee(String no) {
		
		this.no = no;
	}
	
	
	
}

class Manager extends Employee{

	
	private String dept;
	Manager(String no,String dept) {
					// 부모 생성자의 인자값을 입력한다
		super(no);// 매개변수 no값을 자동으로 부모객체의 no변수에 대입해줌 (employee 생성자로 들어감)
		
		this.dept=dept;	// 나의 dept변수에 대입하겠다는 것
		
	}
	
}

public class TestSuper2 {

	public static void main(String[] args) {
		Manager m=new Manager("코스타","영업부");
		
		

	}

}
