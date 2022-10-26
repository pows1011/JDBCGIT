package step4;

public class TestStatic4 {

	
	
	public static void main(String[] args) {
		
		String s1="1";
		//문자열(정수 내용인 문자열)을 정수로 변환 하는 것
		//static메서드 이므로 클래스명.메서드()로 접근 가능
		int i=Integer.parseInt(s1);
		
		String s2="8";
		int j=Integer.parseInt(s2);
		
		System.out.println(s1+s2);
		System.out.println(i+j);

	}

}
