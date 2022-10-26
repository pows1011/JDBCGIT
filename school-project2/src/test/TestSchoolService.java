package test;



import serivce.SchoolService;
import vo.Employee;
import vo.Person;
import vo.Student;
import vo.Teacher;

public class TestSchoolService {
	public static void main(String[] args) {
		
		SchoolService service=new SchoolService();
		
		Student s=new Student("011", "크리스탈", "판교", "12");
		service.addPerson(s);
		
		Teacher t=new Teacher("017", "황정민", "익산", "국어");
		service.addPerson(t);
		
		Employee e=new Employee("015", "시용태", "수지", "전산부");
		service.addPerson(e);
		
		
		service.printAll();
		
		Person per=service.findPerson("017");
		
		if(per!=null) {
			System.out.println(per);
		}else {
			System.out.println("찾는 구성원이 없다");
		}
		
		
		service.delPerson("017");
		System.out.println("삭제");
		
		service.updatePerson("011",new Student("010", "보아", "종로", "영업부"));
		service.printAll();
		
	}
}
