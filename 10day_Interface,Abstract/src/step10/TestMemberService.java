package step10;

public class TestMemberService {

	public static void main(String[] args) {
				
		
		Dao service=new DaoImpl();
		
		Dao service2=new DaoImpl2();
		
		service.connect();
		service.addPerson(new MemberVO(1,"�տ���","�μ�","�ּ�"));
		service.addPerson(new MemberVO(2,"�迬��","��ǻ��","����"));
		service.addPerson(new MemberVO(3,"ȫ��","�����","����"));
		service.printAll();
		
		MemberVO vo=service.findPerson("ȫ��");
		
		
		if(vo!=null)
			System.out.println(vo);
		else
			System.out.println("���� ��");
		
		
		
		
		service2.connect();
		service2.addPerson(new MemberVO(4,"ȫ�浿","�λ��","����"));
		service2.addPerson(new MemberVO(5,"�ֱ浿","�����","��õ"));
		service2.addPerson(new MemberVO(6,"�̱浿","������","�Ǳ�"));
		service2.printAll();
		
		MemberVO vo2=service2.findPerson("�ֱ浿");
		
		
		if(vo2!=null)
			System.out.println(vo2);
		else
			System.out.println("���� ��");
		
		
		
		
		
		
		
	}

}
