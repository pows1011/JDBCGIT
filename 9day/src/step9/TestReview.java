package step9;

class Person {// extends Object < �ڹٿ��� �⺻������ ��ӹް�����.
	private String name;// ĸ��ȭ(���м�)
	
	
	Person(String name){ //������ �����ε�
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
		//��ü ĳ���� �θ� Ÿ��(��ĳ����)���� ����
		Person p= new Student("������","12");
		System.out.println(p.getName());
		//��ü ĳ���� �ʿ� p�� �θ� Ÿ�� ������ �ν�
		System.out.println(((Student)p).getStuId());//�ٿ�ĳ���� �ڽ�Ÿ��
		System.out.println(p);
		
		if(p instanceof Student)
			System.out.println("���� �л��̴�");
		if(p instanceof Person)
			System.out.println("���� ��� �̴�");
		if(p instanceof Object)
			System.out.println("���� ��ü�̴�");
	}

		
		
		
		
}
