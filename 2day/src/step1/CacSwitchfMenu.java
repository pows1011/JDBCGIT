package step1;

import java.util.Scanner;

public class CacSwitchfMenu {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		int a,b;
		boolean boo=true;
		
		
		while(boo) {
			System.out.println("1.���ϱ�");
			System.out.println("2.����");
			System.out.println("3.���ϱ�");
			System.out.println("4.������");
			System.out.println("5.������");
			System.out.println("6.����");
			int i=sc.nextInt();
			switch(i) {
			case 1:
				System.out.println("1�� �� �Է�");
				a=sc.nextInt();
				System.out.println("2�� �� �Է�");
				b=sc.nextInt();
				System.out.println(a+"+"+b+"="+(a+b));
				break;
			case 2:
				System.out.println("1�� �� �Է�");
				a=sc.nextInt();
				
				System.out.println("2�� �� �Է�");
				b=sc.nextInt();
				System.out.println(a+"-"+b+"="+(a-b));
				break;
			case 3:
				System.out.println("1�� �� �Է�");
				a=sc.nextInt();
				
				System.out.println("2�� �� �Է�");
				b=sc.nextInt();
				System.out.println(a+"*"+b+"="+a*b);	
				break;
			case 4:
				System.out.println("1�� �� �Է�");
				a=sc.nextInt();
				
				System.out.println("2�� �� �Է�");
				b=sc.nextInt();
				System.out.println(a+"/"+b+"="+(float)a/b);	
				break;
			case 5:
				System.out.println("1�� �� �Է�");
				a=sc.nextInt();
				
				System.out.println("2�� �� �Է�");
				b=sc.nextInt();
				System.out.println(a+"%"+b+"="+a%b);	
				break;
			case 6:
				boo=false;
				System.out.println("����");
				break;
			}
			
		}
		sc.close();
		
		
	}

}
