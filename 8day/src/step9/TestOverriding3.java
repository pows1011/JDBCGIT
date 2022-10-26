package step9;

public class TestOverriding3 {

	public static void main(String[] args) {
		
		
		Student s=new Student("아이유", "경기도", "100", "12");
		System.out.println(s.getDetails());
		
		Teacher t=new Teacher("김연아", "인천", "020", "체육");
		System.out.println(t.getDetails());
	}

}
