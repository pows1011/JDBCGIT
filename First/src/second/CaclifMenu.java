package second;

import java.util.Scanner;

public class CaclifMenu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		boolean boo=true;
		
		
		while(boo) { // while���� true�ϰ���� �ݺ�
			
			
			// 1 ~ 6���� �����ϰԲ� ����
			System.out.println("1.���ϱ�");
			System.out.println("2.����");
			System.out.println("3.���ϱ�");
			System.out.println("4.������");
			System.out.println("5.������");
			System.out.println("6.����");
			int i=sc.nextInt();
			// scanner�Լ��� �� console�Է�
			if(i==1) { // if������ ���� ��ȣ�� ���� �� 
				System.out.println("1�� �� �Է�");
				a=sc.nextInt();
				System.out.println("2�� �� �Է�");
				b=sc.nextInt();
				System.out.println(a+"+"+b+"="+(a+b));
			}else if(i==2) {
				System.out.println("1�� �� �Է�");
				a=sc.nextInt();
				
				System.out.println("2�� �� �Է�");
				b=sc.nextInt();
				System.out.println(a+"-"+b+"="+(a-b));
			}else if(i==3) {
				System.out.println("1�� �� �Է�");
				a=sc.nextInt();
				
				System.out.println("2�� �� �Է�");
				b=sc.nextInt();
				System.out.println(a+"*"+b+"="+a*b);	
			}else if(i==4) {
				System.out.println("1�� �� �Է�");
				a=sc.nextInt();
				
				System.out.println("2�� �� �Է�");
				b=sc.nextInt();
				System.out.println(a+"/"+b+"="+(float)a/b);	
			}else if(i==5) {
				System.out.println("1�� �� �Է�");
				a=sc.nextInt();
				
				System.out.println("2�� �� �Է�");
				b=sc.nextInt();
				System.out.println(a+"%"+b+"="+a%b);	
			}else if(i==6) {
				boo=false;
				System.out.println("����");
			}else {
				System.out.println("�߸��� ��");
			}
			
		}
		sc.close();
		
		

	}

}
