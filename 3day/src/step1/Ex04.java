package step1;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1������ �Է��ϼ���");
		int num1 = sc.nextInt();

		if (num1 > 90) {
			System.out.println("��");

		} else {
			if (num1 > 80) {
				System.out.println("��");
			} else {
				if (num1 > 70) {
					System.out.println("��");
				} else {
					if (num1 > 60) {
						System.out.println("��");
					} else {
						System.out.println("��");
					}
				}

				sc.close();

			}
		}
	}

}
