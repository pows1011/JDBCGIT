package step1;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ���:");
		int a = sc.nextInt();

		if (a > 0) {
			System.out.println("�� ���� 0���� Ů�ϴ�(���)");
		} else if (a < 0) {
			System.out.println("�� ���� 0���� �۽��ϴ� (����)");
		} else {
			System.out.println("�� ���� 0�Դϴ�");
		}
		sc.close();
	}
}
