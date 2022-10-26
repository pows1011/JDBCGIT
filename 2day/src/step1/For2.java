package step1;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a,i;
		System.out.println("°ª ÀÔ·Â :");
		a=sc.nextInt();
		
		for(i=1;i<=a;i++) {
			if(i%2==1) {
				System.out.println(i+"\t");
			}
		}
	}

}
