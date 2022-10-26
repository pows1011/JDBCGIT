package test;

import service.SchoolService;
import vo.Employee;
import vo.Person;
import vo.Student;
import vo.Teacher;

public class TestSchoolService {
	public static void main(String[] args) {
		SchoolService service=new SchoolService();
		
		service.addPerson(new Student("011","ũ����Ż","�Ǳ�","1"));
		service.addPerson(new Teacher("017","Ȳ����","�ͻ�","2"));
		service.addPerson(new Employee("019","�ÿ���","����","�����"));
		
		service.printAll();
	
		Person p=service.findPerson("017");
		if(p!=null) {
			System.out.println("�˻� �� ��:"+p);
		}else{
			System.out.println("�߸��� �Է°�");
		}
		
		
		service.deletePerson("019");
		
		service.updatePerson("011",new Teacher ("012","KIM","��⵵","3"));
		
		service.printAll();
		
	}
}
