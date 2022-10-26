package step13;

public class Calculator {

	private int x;
	private int y;

	public Calculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int add(int x, int y) {

		return x + y;
	}

	public int sub(int x, int y) {

		return x - y;
	}

	public int mul(int x, int y) {

		return x * y;
	}

	public float div(int x, int y) {

		return (float)x/y;
	}

}
