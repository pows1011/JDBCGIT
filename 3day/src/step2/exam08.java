package step2;

import java.util.Scanner;

public class exam08 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		int num=1,sum=0;
		
		
		while(num!=-999){
			System.out.println("숫자 입력: (종료하려면 -999입력)");
			num=sc.nextInt();
			
			for(int i=1; i<=num;i++) {
				sum+=i;
				System.out.print(i+"\t");
				System.out.println(sum);
				
					
			}
			
		}
		
		sc.close();
		
		

	}

}
