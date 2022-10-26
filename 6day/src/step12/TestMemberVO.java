package step12;

public class TestMemberVO {

	public static void main(String[] args) {
		
	Member vo=new Member("java","abcd");
	vo.setJob("프로그래머");
	System.out.println(vo.getId()+" "+vo.getPassword()+" "+vo.getJob());
	
	
	}

}
