package step9;

class Person {// extends Object < 자바에게 기본적으로 상속받고있음.
	private String name;// 캡슐화(은닉성)
	
	
	Person(String name){ //생성자 오버로딩
		super();
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}


class Student extends Person{
	private String stuId;
		Student(String name,String stuId) {
		super(name);
		this.stuId=stuId;
	}
		public String getStuId() {
			return stuId;
		}
		public void setStuId(String stuId) {
			this.stuId = stuId;
		}
		@Override
		public String toString() {
			return "Student [stuId=" + stuId + ", getName()=" + getName() + "]";
		}

	

	
	
}	


public class TestReview {
	public static void main(String[] args) {
		//객체 캐스팅 부모 타입(업캐스팅)으로 참조
		Person p= new Student("아이유","12");
		System.out.println(p.getName());
		//객체 캐스팅 필요 p는 부모 타입 까지만 인식
		System.out.println(((Student)p).getStuId());//다운캐스팅 자식타입
		System.out.println(p);
		
		if(p instanceof Student)
			System.out.println("나는 학생이다");
		if(p instanceof Person)
			System.out.println("나는 사람 이다");
		if(p instanceof Object)
			System.out.println("나는 객체이다");
	}

		
		
		
		
}
