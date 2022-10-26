package step9;

public class Teacher extends Person{
	private String subject;
	
	
	public Teacher(String name, String address, String tel,String subject) {
		super(name, address, tel);
		this.subject=subject;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}

	
	public String getDetails() {

		return super.getDetails() + " °ú¸ñ:" + subject;
	}
}
