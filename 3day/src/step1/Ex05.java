package step1;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1�� �� �Է�:");
		int a = sc.nextInt();
		System.out.println("2�� �� �Է�:");
		int b = sc.nextInt();
		System.out.println("3�� �� �Է�:");
		int c = sc.nextInt();

		if (a < b) {
			if (a < c) {
				System.out.println("�ּҰ� :" + a);
			} else {
				System.out.println("�ּҰ� :" + c);
			}

		} else {
			if (b < c) {
				System.out.println("�ּҰ�:" + b);
			}else {
				System.out.println("�ּҰ�:"+c);
			}
		}

		sc.close();
	}

}
