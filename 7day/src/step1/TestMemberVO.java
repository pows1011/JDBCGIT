package step1;

public class TestMemberVO {

	public static void main(String[] args) {
		
		MemberVO vo=new MemberVO("basic","a",1);
		vo.setId("java");
		System.out.println(vo.getId());
		
		vo.setPassword("absd");
		System.out.println(vo.getPassword());
		
		
		vo.setMoney(2000);
		System.out.println(vo.getMoney());
	}

}
