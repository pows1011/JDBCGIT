package step1;

import java.util.Scanner;

public class I {

	public static void main(String[] args) {
		int i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("곱할값을 입력해주세요(2 ~ 9) : ");
		int a=sc.nextInt();
		
		if(a>=2&&a<=9) {
			
		for(i=1;i<=9;i++) {
			System.out.println(a+"*"+i+"="+a*i);
		}

	}else {
		System.out.println("값이 잘못되었습니다");
	}
		
	}

}
