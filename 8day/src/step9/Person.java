package step9;

public class Person {
	
	private String name;
	private String address;
	private String tel;
	
	
	public Person(String name, String address, String tel) {
		super();
		this.name = name;
		this.address = address;
		this.tel = tel;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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
	
	public String getDetails() {
		
		return "�̸�:"+name+" ��ȭ��ȣ:"+tel+" �ּ�:"+address;
	}
	
}
