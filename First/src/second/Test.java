package second;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 값을 입력:");
		a = sc.nextInt();
		System.out.println("b의 값을 입력:");
		b = sc.nextInt();

		if (a > 0) {
			System.out.println("a는 양수");
		} else if (a < 0) {
			System.out.println("a는 음수");
		} else {
			System.out.println("a는 0");
		}

	

		
	}

}
