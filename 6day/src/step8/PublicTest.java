package step8;

public class PublicTest {

	public int x;
	private int y;

	public PublicTest(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void print() {
		setValue();
		System.out.println("x="+x+","+"y="+y);
		
	}
	//private�� �޼ҵ庸�ٴ� Ŭ������ ���������� �����ϰ� �ʱ�ȭ�� �����ڷ��ϴ°� ����.
	//�޼ҵ忡 private�� ���� main���� �ҷ��ü� ����.
	private void setValue() {
		x = 100;
		y = 100;
	}

}
