package step6;

public class Friend {
	//데이터를 찍어내기 위한 DTO(VO)
	
	private String name;
	private int age;
	 
	public Friend(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
