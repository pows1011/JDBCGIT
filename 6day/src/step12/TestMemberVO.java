package step12;

public class TestMemberVO {

	public static void main(String[] args) {
		
	Member vo=new Member("java","abcd");
	vo.setJob("���α׷���");
	System.out.println(vo.getId()+" "+vo.getPassword()+" "+vo.getJob());
	
	
	}

}
