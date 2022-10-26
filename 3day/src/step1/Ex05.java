package step1;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1번 값 입력:");
		int a = sc.nextInt();
		System.out.println("2번 값 입력:");
		int b = sc.nextInt();
		System.out.println("3번 값 입력:");
		int c = sc.nextInt();

		if (a < b) {
			if (a < c) {
				System.out.println("최소값 :" + a);
			} else {
				System.out.println("최소값 :" + c);
			}

		} else {
			if (b < c) {
				System.out.println("최소값:" + b);
			}else {
				System.out.println("최소값:"+c);
			}
		}

		sc.close();
	}

}
