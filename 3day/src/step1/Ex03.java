package step1;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		int a=sc.nextInt();
		
		if(a>=0) {
			System.out.println("���밪:"+a);
		}else {
			System.out.println("���밪 �ƴ�");
		}
		sc.close();
	}
}
