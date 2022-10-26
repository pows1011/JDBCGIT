package step1;

import java.util.Scanner;

public class G {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("반복할 값을 입력하세요:");
		int a=sc.nextInt();
		
		for(int i=1; i<=a;i++) {
			System.out.println("Hello World");
		}

	}

}
