package step4;

public class TestStatic6 {

	public static void main(String[] args) {
		
		System.out.println("Main 수행");

	}
	
	static {
		//프로그램 실행전 사전 작업이 필요 할 때 
		System.out.println("static초기화 블럭");
	}//드라이버 설치 같은 것에 사용

}
