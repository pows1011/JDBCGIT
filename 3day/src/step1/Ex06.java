package step1;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1�� �� �Է�:");
		int a = sc.nextInt();
		System.out.println("2�� �� �Է�:");
		int b = sc.nextInt();
		System.out.println("3�� �� �Է�:");
		int c = sc.nextInt();

		if (a < b) {
			if (b < c) {
				System.out.println("�߰��� :" + b);
			} else {
				if (a < c) {
					System.out.println("�߰��� :" + c);
				}else {
					System.out.println("�߰���:"+a);
				}
			}

		} else {
			if (a < c) {
				System.out.println("�߰���:" + a);

			} else {
				if (b < c) {
					System.out.println("�߰���:" + c);

				}else {
					System.out.println("�߰���:"+b);
				}
			}

		}
		sc.close();

	}
}
