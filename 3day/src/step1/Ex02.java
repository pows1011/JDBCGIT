package step1;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1������ �Է��ϼ���");
		int num1=sc.nextInt();
		System.out.println("2������ �Է��ϼ���");
		int num2=sc.nextInt();
	
		if(num1>num2) {
			System.out.println("ū����:"+num1);
		
		}else {
			if(num1==num2) {
				System.out.println("�μ��� ����");
			}else {
				System.out.println("�Է��Ͻ� ū���� "+num2);
			}
		}
		sc.close();
	}

}
