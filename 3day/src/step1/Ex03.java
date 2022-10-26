package step1;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("값을 입력하세요");
		int a=sc.nextInt();
		
		if(a>=0) {
			System.out.println("절대값:"+a);
		}else {
			System.out.println("절대값 아님");
		}
		sc.close();
	}
}
