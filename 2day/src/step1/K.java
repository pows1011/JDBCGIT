package step1;

import java.util.Scanner;

public class K {

	public static void main(String[] args) {
		int i;
		int sum=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("값 입력 : ");
		int a=sc.nextInt();
		
		for(i=1;i<=a;i++) {
			sum*=i;
			System.out.println("반복"+i+":"+sum+"*"+i+"="+sum);
		}
		System.out.println("총합 : "+sum);

	}

}
