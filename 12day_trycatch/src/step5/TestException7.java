package step5;

public class TestException7 {
	public static void main(String[] args) {

		String str[] = { "a", "b", "c" };

		try {
			System.out.println(str[5]);
		} catch (NullPointerException ne) {
			System.out.println(2);
		} finally {
			System.out.println(3);
		}
		System.out.println(4);
	}
}
