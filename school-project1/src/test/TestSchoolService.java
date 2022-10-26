package test;

import service.SchoolService;
import vo.Employee;
import vo.Person;
import vo.Student;
import vo.Teacher;

public class TestSchoolService {

	public static void main(String[] args) {
				 
			SchoolService service=new SchoolService();	// SchoolService의 메소드를 사용하기위해 serivce객체를 선언한다.
			//Student s=new Student("011","크리스탈","판교","12");
			//service.addPErson(s);
			
			service.addPerson(new Employee("012","이","경기도","교육부")); //addPerson에 매개변수는 Person P 뿐이지만 Person은 다른 클래스에 상속되어있고
			service.addPerson(new Student("011","박","인천","1212"));		//그 상속되어 있는 클래스들에서 super를 설정해두어 그 변수들의 값이 부모객체에 까지
			service.addPerson(new Teacher("010","김","서울", "국어"));		// 사용되고있기 떄문에 값을 넣을떄 각각의 클래스 값을 넣어준다면 그 클래스들의 변수값 까지 넣어줄수 있음.
			service.printAll();
			Person p=service.findPerson("010");					//010이라는 Tel의 값을 service클래스의 검색메소드에 매개변수로 입력시켜주고 있다면 그 주소값의 내용을 반환.

			
			
			if(p !=null)								//위의 검색값이 없다면 null을 반환하게 될것이고 그렇다면 찾을수 없는 값이 출력. 
				System.out.println(p);					// 그게 아니라면 그 주소값의 내용을 대입한 Person p변수의 값이 출력
			else 
				System.out.println("찾을수 없는 값");
				
			
			

	}

}
