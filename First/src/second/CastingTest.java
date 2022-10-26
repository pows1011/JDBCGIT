package second;

public class CastingTest {

	public static void main(String[] args) {

		int a = 12, b = 13;
		float c = 0;

		c = (a + b) / 2;
		System.out.println(c);
		float f = 12.5f;
		
		a = (int) f;
		System.out.println(a);
	}

}
