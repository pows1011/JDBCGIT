package second;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("a�� ���� �Է�:");
		a = sc.nextInt();
		System.out.println("b�� ���� �Է�:");
		b = sc.nextInt();

		if (a > 0) {
			System.out.println("a�� ���");
		} else if (a < 0) {
			System.out.println("a�� ����");
		} else {
			System.out.println("a�� 0");
		}

	

		
	}

}
