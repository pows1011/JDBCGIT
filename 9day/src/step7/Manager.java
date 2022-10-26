package step7;

public class Manager extends Employee{
	private String dept;
	
	public Manager(String empId, String name, String address, int salary,String dept) {
		super(empId, name, address, salary);
		this.dept=dept;
		// TODO Auto-generated constructor stub
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString()+" dpet="+dept;
	}
	
}
