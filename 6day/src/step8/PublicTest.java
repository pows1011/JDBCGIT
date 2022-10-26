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
	//private는 메소드보다는 클래스의 전역변수에 선언하고 초기화는 생성자로하는게 좋음.
	//메소드에 private를 사용시 main에서 불러올수 없음.
	private void setValue() {
		x = 100;
		y = 100;
	}

}
