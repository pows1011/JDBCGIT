package step3;

public class TestVariableScope1 {
	int i;
	
	
	void test1() {
		System.out.println(i);
	}
	
	void test2() {
		int i=1;
		System.out.println("test2��������"+i);
		System.out.println(this.i);
	}
	
	void test3(int i) {
		System.out.println("test3 ���� ����: "+i);
		this.i=i;
		System.out.println(this.i);
	}
	void test4() {
		int j=3;
	}
	
	void test5() {
		System.out.println("test5 ���� ����: "+i);
//		System.out.println(j);
		
	}
	
	void test6() {
		// ���� ������ �ʱ�ȭ���� �ʾƵ� �⺻ ���ð��� 0
		int k=0;
		// ���� ������ �ʱ�ȭ�� ������ ����� ��, 
		String a=null;
		System.out.println(k);
		System.out.println(a);
	}
}
