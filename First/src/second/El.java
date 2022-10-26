package second;

import java.util.Scanner;

public class El {

	public static void main(String[] args) {
		int a, b;
		String c;

		Scanner sc = new Scanner(System.in);
		System.out.println("a의 값입력 :");
		a = sc.nextInt();
		System.out.println("b의 값 입력 :");
		b = sc.nextInt();
		System.out.println("부호입력");
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