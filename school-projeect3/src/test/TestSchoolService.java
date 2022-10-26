package test;

import service.SchoolService;
import vo.Employee;
import vo.Person;
import vo.Student;
import vo.Teacher;

public class TestSchoolService {
	public static void main(String[] args) {
		SchoolService service=new SchoolService();
		
		service.addPerson(new Student("011","크리스탈","판교","1"));
		service.addPerson(new Teacher("017","황정민","익산","2"));
		service.addPerson(new Employee("019","시용태","서울","전산부"));
		
		service.printAll();
	
		Person p=service.findPerson("017");
		if(p!=null) {
			System.out.println("검색 한 값:"+p);
		}else{
			System.out.println("잘못된 입력값");
		}
		
		
		service.deletePerson("019");
		
		service.updatePerson("011",new Teacher ("012","KIM","경기도","3"));
		
		service.printAll();
		
	}
}
