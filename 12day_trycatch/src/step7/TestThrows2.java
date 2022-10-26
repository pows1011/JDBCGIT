package step7;

class Serivce {

	// RuntimeException 계열은 throws를 명시 하지 않아도
	// Exception 발생시 자동 throws
	public void test(String name) {
		System.out.println("이름이" + name.length() + "자로 구성");
	}
}

public class TestThrows2 {

	public static void main(String[] args) {

		Serivce s = new Serivce();

		try {
			s.test(null);
		} catch (NullPointerException ne) {
				System.out.println(ne.getMessage()); //간단한Exception메시지
				ne.printStackTrace();//Exception발생 경로 및 메세지를 보여준다
		}
		System.out.println("정상 수행");
	}
}
