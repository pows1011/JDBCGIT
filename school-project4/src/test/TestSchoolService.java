package test;

import exception.DuplicateTelException;
import exception.PersonNotFoundException;
import service.SchoolService;
import service.SchoolService2;
import vo.Employee;
import vo.Person;
import vo.Student;
import vo.Teacher;

public class TestSchoolService {
	public static void main(String[] args) {
		//SchoolService service= new SchoolService();
		SchoolService2 service = new SchoolService2();

		try {
			service.addPerson(new Student("011", "아이유", "종로", "12"));
			System.out.println("ADD OK");
		} catch (DuplicateTelException de) {
			System.out.println(de.getMessage());
		}

		try {
			service.addPerson(new Teacher("013", "아이", "독산", "13"));
			System.out.println("ADD OK");
		} catch (DuplicateTelException de) {
			System.out.println(de.getMessage());
		}

		try {
			service.addPerson(new Employee("012", "아이아이", "판교", "14"));
			System.out.println("ADD OK");
		} catch (DuplicateTelException de) {
			System.out.println(de.getMessage());
		}

		service.printAll();

		try {
			Person find = service.findPerson("012");
			System.out.println(find);
		} catch (PersonNotFoundException pe) {
			System.out.println(pe.getMessage());
		}

		try {
			service.delPerson("013");
			System.out.println("삭제완료");
			service.printAll();
		} catch (PersonNotFoundException pe) {
			System.out.println(pe.getMessage());
		}

		try {
			service.editPerson("011", new Student("017", "유", "서울", "10"));
			System.out.println("수정 완료");
			service.printAll();
		} catch (PersonNotFoundException pe) {
			System.out.println(pe.getMessage());
		}

	}
}
