package step5;

public class Person {
	protected String name;
	protected String add;
	protected String dept;
	protected int num;
		
	public void print() {
		System.out.println("num"+num);
		System.out.println("name"+name);
		System.out.println("dept"+dept);
		System.out.println("add"+add);
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	
}
