package second;

import java.util.Scanner;

public class El {

	public static void main(String[] args) {
		int a, b;
		String c;

		Scanner sc = new Scanner(System.in);
		System.out.println("a�� ���Է� :");
		a = sc.nextInt();
		System.out.println("b�� �� �Է� :");
		b = sc.nextInt();
		System.out.println("��ȣ�Է�");
		c = sc.next();

		if (c.equals("+")) {
			System.out.println(a + b);
		} else if (c.equals("-")) {
			System.out.println(a - b);
		} else if (c.equals("*")) {
			System.out.println(a * b);
		} else if (c.equals("/")) {
			System.out.println((float) a / b);
		} else if (c.equals("%")) {
			System.out.println(a % b);

		}

	}
}