package step4;


class Test{
	int i; 
	static int j;//스태틱변수
	
	static void test() {
		//static은 자신의 클래스 안이라도 객체 생성해야 됨
		//System.out.println(); static method내부 이므로
		//인스턴스 변수 i에 접근 불가; -->객체 생성이 필요
		//static은 객체 관계없이 모두 처음에 메모리에 적재
		
		System.out.println(j);
		
	}
	void test2() {
		System.out.println(j);
	}
}



public class TestStatic2 {

	public static void main(String[] args) {
		Test t=new Test();
		t.test2();
		
		

	}

}
