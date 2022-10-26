package step8;

public class Student extends MemberVO{
	private String subject;
	public Student(int num, String name, String dept, String address,String subject) {
		super(num, name, dept, address);
		this.subject=subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return super.toString()+"subject=" + subject;
	}

	

}
