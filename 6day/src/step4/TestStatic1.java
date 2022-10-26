package step4;

class Company{
	static int i=1;
	
	static void test() {
		System.out.println("static test");
	}
	
	
}


public class TestStatic1 {

	public static void main(String[] args) {
		Company.test();
		 System.out.println(Company.i);

	}

}
