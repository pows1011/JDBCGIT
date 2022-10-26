package step4;

public class TestException6 {
	public static void main(String[] args) {
		
		String s=null;
		
		
		try {
		System.out.println(s.length());
		System.out.println(1);
		}catch (NullPointerException ne) {
			System.out.println(2);
		}finally {
			System.out.println(3);
		}
		System.out.println(4);
		
	}
}
