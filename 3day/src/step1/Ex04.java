package step1;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1번값을 입력하세요");
		int num1 = sc.nextInt();

		if (num1 > 90) {
			System.out.println("수");

		} else {
			if (num1 > 80) {
				System.out.println("우");
			} else {
				if (num1 > 70) {
					System.out.println("미");
				} else {
					if (num1 > 60) {
						System.out.println("양");
					} else {
						System.out.println("가");
					}
				}

				sc.close();

			}
		}
	}

}
