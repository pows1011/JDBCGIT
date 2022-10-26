package step8;

public class Staff  extends MemberVO{

	private String job;
	public Staff(int num, String name, String dept, String address,String job) {
		super(num, name, dept, address);
		this.job=job;
	}

	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return super.toString()+" job=" + job ;
	}
	
	
}
