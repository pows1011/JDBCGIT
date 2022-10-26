package step1;

import java.util.Scanner;

public class CacSwitchfMenu {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		int a,b;
		boolean boo=true;
		
		
		while(boo) {
			System.out.println("1.더하기");
			System.out.println("2.빼기");
			System.out.println("3.곱하기");
			System.out.println("4.나누기");
			System.out.println("5.나머지");
			System.out.println("6.종료");
			int i=sc.nextInt();
			switch(i) {
			case 1:
				System.out.println("1번 값 입력");
				a=sc.nextInt();
				System.out.println("2번 값 입력");
				b=sc.nextInt();
				System.out.println(a+"+"+b+"="+(a+b));
				break;
			case 2:
				System.out.println("1번 값 입력");
				a=sc.nextInt();
				
				System.out.println("2번 값 입력");
				b=sc.nextInt();
				System.out.println(a+"-"+b+"="+(a-b));
				break;
			case 3:
				System.out.println("1번 값 입력");
				a=sc.nextInt();
				
				System.out.println("2번 값 입력");
				b=sc.nextInt();
				System.out.println(a+"*"+b+"="+a*b);	
				break;
			case 4:
				System.out.println("1번 값 입력");
				a=sc.nextInt();
				
				System.out.println("2번 값 입력");
				b=sc.nextInt();
				System.out.println(a+"/"+b+"="+(float)a/b);	
				break;
			case 5:
				System.out.println("1번 값 입력");
				a=sc.nextInt();
				
				System.out.println("2번 값 입력");
				b=sc.nextInt();
				System.out.println(a+"%"+b+"="+a%b);	
				break;
			case 6:
				boo=false;
				System.out.println("종료");
				break;
			}
			
		}
		sc.close();
		
		
	}

}
