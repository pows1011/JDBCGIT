package step5;

public class PersonMain {

	public static void main(String[] args) {

		Person p = new Person();
		p.setNum(1);
		p.setName("person");
		p.setDept("dept");
		p.setAdd("add");
		p.print();

		System.out.println("=====================");

		Professor pro = new Professor();
		pro.setNum(2);
		pro.setName("교수1");
		pro.setDept("Computer");
		pro.setAdd("독산");
		pro.setSubjects(new String[] { "전산학개론", "C프로그래밍", "RTOS" });
		pro.print();
		pro.print_subj();
		System.out.println("=====================");
		
		Student s=new Student();
		s.setNum(3);
		s.setName("학생");
		s.setDept("Computer2");
		s.setAdd("경기도");
		s.setSubjects(new String[] { "자바프로그래밍", "운영체제", "컴파일러" });
		s.print();
		s.print_subj();
		System.out.println("=====================");
		
		Staff sf=new Staff();
		sf.setNum(4);
		sf.setName("교직원1");
		sf.setDept("HR");
		sf.setAdd("서울");
		sf.setJob("교육부");
		sf.print();
		sf.print_job();
		System.out.println("=====================");
		
	}

}
