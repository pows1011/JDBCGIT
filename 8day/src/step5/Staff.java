package step5;

public class Staff extends Person{
	private String job;
	
	public void print_job() {
		System.out.println(name+"교직원의 직무는"+job);
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	
}
