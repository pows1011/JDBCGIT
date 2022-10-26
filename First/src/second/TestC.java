package second;

import java.util.Scanner;

public class TestC {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 값을 입력:");
		a = sc.nextInt();
		System.out.println("b의 값을 입력:");
		b = sc.nextInt();
		
	
		
		if (a > b) {
			System.out.println("최대값:" + a + "최소값:" + b);
		} else if (a==b) {
			System.out.println("두개의 값이 같다 a= " + a + " b= " + b);
		} else {
			System.out.println("최대값:" + b + "최소값:" + a);
		}

	}

}
