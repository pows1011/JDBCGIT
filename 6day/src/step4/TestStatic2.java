package step4;


class Test{
	int i; 
	static int j;//����ƽ����
	
	static void test() {
		//static�� �ڽ��� Ŭ���� ���̶� ��ü �����ؾ� ��
		//System.out.println(); static method���� �̹Ƿ�
		//�ν��Ͻ� ���� i�� ���� �Ұ�; -->��ü ������ �ʿ�
		//static�� ��ü ������� ��� ó���� �޸𸮿� ����
		
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
