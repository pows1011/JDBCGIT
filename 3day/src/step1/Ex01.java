package step1;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요:");
		int a = sc.nextInt();

		if (a > 0) {
			System.out.println("이 수는 0보다 큽니다(양수)");
		} else if (a < 0) {
			System.out.println("이 수는 0보다 작습니다 (음수)");
		} else {
			System.out.println("이 수는 0입니다");
		}
		sc.close();
	}
}
