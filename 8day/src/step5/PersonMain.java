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
		pro.setName("����1");
		pro.setDept("Computer");
		pro.setAdd("����");
		pro.setSubjects(new String[] { "�����а���", "C���α׷���", "RTOS" });
		pro.print();
		pro.print_subj();
		System.out.println("=====================");
		
		Student s=new Student();
		s.setNum(3);
		s.setName("�л�");
		s.setDept("Computer2");
		s.setAdd("��⵵");
		s.setSubjects(new String[] { "�ڹ����α׷���", "�ü��", "�����Ϸ�" });
		s.print();
		s.print_subj();
		System.out.println("=====================");
		
		Staff sf=new Staff();
		sf.setNum(4);
		sf.setName("������1");
		sf.setDept("HR");
		sf.setAdd("����");
		sf.setJob("������");
		sf.print();
		sf.print_job();
		System.out.println("=====================");
		
	}

}
