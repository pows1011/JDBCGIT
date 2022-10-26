package step6;

public class TestException8 {
	public static void main(String[] args) {
		int i=0;
		int j=4;
		
		try {
			System.out.println(j/i);
			System.out.println(1);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(2);
		}catch(Exception e) {
			System.out.println(3);
		}finally {
			System.out.println(4);
		}
		
	}
}
