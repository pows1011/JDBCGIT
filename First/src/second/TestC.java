package second;

import java.util.Scanner;

public class TestC {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("a�� ���� �Է�:");
		a = sc.nextInt();
		System.out.println("b�� ���� �Է�:");
		b = sc.nextInt();
		
	
		
		if (a > b) {
			System.out.println("�ִ밪:" + a + "�ּҰ�:" + b);
		} else if (a==b) {
			System.out.println("�ΰ��� ���� ���� a= " + a + " b= " + b);
		} else {
			System.out.println("�ִ밪:" + b + "�ּҰ�:" + a);
		}

	}

}
