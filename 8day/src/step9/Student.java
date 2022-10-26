package step9;

public class Student extends Person {
	private String stuId;

	public Student(String name, String address, String tel, String stuId) {
		super(name, address, tel);
		this.stuId = stuId;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getDetails() {

		return super.getDetails() + " ÇÐ¹ø:" + stuId;
	}

}
