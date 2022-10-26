package step10;

class Company{ 
	private String name;
	private String address;
	
	
	Company(String name, String address) {
		super();
		this.name = name; 
		this.address = address;
	}


	//Object class의 toString()메서드를 오버라이딩 
	//주소값 대신 객체의 실제 내용값이 반환된다.
	
	@Override
	public String toString() {
		return "회사명 :" + name + " 주소 :" + address;
	}
	
}


public class TestObject {

	public static void main(String[] args) {
		
		Company c1=new Company("안랩", "판교");
		System.out.println(c1.toString());
		System.out.println(c1);
	}

}
