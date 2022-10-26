package step1;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1번값을 입력하세요");
		int num1=sc.nextInt();
		System.out.println("2번값을 입력하세요");
		int num2=sc.nextInt();
	
		if(num1>num2) {
			System.out.println("큰수는:"+num1);
		
		}else {
			if(num1==num2) {
				System.out.println("두수는 같다");
			}else {
				System.out.println("입력하신 큰수는 "+num2);
			}
		}
		sc.close();
	}

}
