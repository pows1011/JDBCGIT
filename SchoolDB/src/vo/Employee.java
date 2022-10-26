package vo;

public class Employee extends MemberVO{
	private String employee;

	public Employee(String id, String name, String tel, String addr, int type, String employee) {
		super(id, name, tel, addr, type);
		this.employee = employee;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Employee [employee=" + employee + ", getId()=" + getId() + ", getName()=" + getName() + ", getTel()="
				+ getTel() + ", getAddr()=" + getAddr() + ", getType()=" + getType() + "]";
	}
	
	
	
		
	
}
