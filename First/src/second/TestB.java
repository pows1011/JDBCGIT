package second;

import java.util.Scanner;

public class TestB {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("a�� ���� �Է�");
		a=sc.nextInt();
		
		if (a%2==0 && a>0) {
			System.out.println("a�� ¦��");
		} else if (a==0){
			System.out.println("a�� 0");
		}else {
			System.out.println("a�� Ȧ��");
		}
		
		if(a%2==0) {
			System.out.println("a�� ¦��");
		}else {
			System.out.println("a�� Ȧ��");
		}

	}

}
