package step3;

public class TestException5 {
	public static void main(String[] args) {
		int i=0;
		try {
			
			System.out.println(4/i);	
		}catch (NullPointerException ne) {
			System.out.println("NULL Point");
		}finally {
			System.out.println("finally");
		}
		System.out.println("정상수행");
		
		
		
	}
	
	
	
}
