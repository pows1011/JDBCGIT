package step10;

public class TestMemberService {

	public static void main(String[] args) {
				
		
		Dao service=new DaoImpl();
		
		Dao service2=new DaoImpl2();
		
		service.connect();
		service.addPerson(new MemberVO(1,"손연재","부서","주소"));
		service.addPerson(new MemberVO(2,"김연아","컴퓨터","군포"));
		service.addPerson(new MemberVO(3,"홍명보","전산부","파주"));
		service.printAll();
		
		MemberVO vo=service.findPerson("홍명보");
		
		
		if(vo!=null)
			System.out.println(vo);
		else
			System.out.println("없는 값");
		
		
		
		
		service2.connect();
		service2.addPerson(new MemberVO(4,"홍길동","인사과","강남"));
		service2.addPerson(new MemberVO(5,"최길동","전산과","인천"));
		service2.addPerson(new MemberVO(6,"이길동","영업부","판교"));
		service2.printAll();
		
		MemberVO vo2=service2.findPerson("최길동");
		
		
		if(vo2!=null)
			System.out.println(vo2);
		else
			System.out.println("없는 값");
		
		
		
		
		
		
		
	}

}
