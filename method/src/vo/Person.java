package vo;

public class Person {
	private String name;
	private String age;
	private String address;
	private String tel;
	
	
	
	public Person(String name, String age, String address, String tel) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Person [이름=" + name + ", 나이=" + age + ", 주소지=" + address + ", 전화번호=" + tel + "]";
	}
	
	
	
	
}
