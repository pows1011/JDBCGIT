package step3;

public class TestVariableScope1 {
	int i;
	
	
	void test1() {
		System.out.println(i);
	}
	
	void test2() {
		int i=1;
		System.out.println("test2지역변수"+i);
		System.out.println(this.i);
	}
	
	void test3(int i) {
		System.out.println("test3 지역 변수: "+i);
		this.i=i;
		System.out.println(this.i);
	}
	void test4() {
		int j=3;
	}
	
	void test5() {
		System.out.println("test5 지역 변수: "+i);
//		System.out.println(j);
		
	}
	
	void test6() {
		// 전역 변수는 초기화하지 않아도 기본 셋팅값이 0
		int k=0;
		// 지역 변수는 초기화를 무조건 해줘야 함, 
		String a=null;
		System.out.println(k);
		System.out.println(a);
	}
}
