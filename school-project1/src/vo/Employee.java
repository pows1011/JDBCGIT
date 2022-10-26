package vo;

public class Employee extends Person{
	
	private String dept;
	
	
		public Employee(String name, String tel, String add,String dept) {
		super(name, tel, add);
		this.dept=dept;
		
	}


		public String getdept() {
			return dept;
		}


		public void setdept(String dept) {
			this.dept = dept;
		}


		@Override
		public String toString() {
			return super.toString()+"종업원의 업무=" + dept;
		}
		
		
		
}
