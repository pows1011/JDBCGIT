package step1;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1번 값 입력:");
		int a = sc.nextInt();
		System.out.println("2번 값 입력:");
		int b = sc.nextInt();
		System.out.println("3번 값 입력:");
		int c = sc.nextInt();

		if (a < b) {
			if (b < c) {
				System.out.println("중간값 :" + b);
			} else {
				if (a < c) {
					System.out.println("중간값 :" + c);
				}else {
					System.out.println("중간값:"+a);
				}
			}

		} else {
			if (a < c) {
				System.out.println("중간값:" + a);

			} else {
				if (b < c) {
					System.out.println("중간값:" + c);

				}else {
					System.out.println("중간값:"+b);
				}
			}

		}
		sc.close();

	}
}
