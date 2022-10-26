package step8;



public class TestMemberService {
	public static void main(String[] args) {
			
			SchoolService service=new SchoolService();
			service.addPerson(new Professor(1,"손연재","부서","주소", "과목"));
			service.addPerson(new Student(2,"김연아","컴퓨터학과","군포", "자바"));
			service.addPerson(new Staff(3,"홍명보","전산부","파주", "개발자"));
			
			service.printAll();
			MemberVO vo=service.findPerson("김연아");
			if (vo!=null)
				System.out.println(vo);
			else
				System.out.println("회원X");
					service.findUpdate("홍명보");
					service.printAll();
	}
}
