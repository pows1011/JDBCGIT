package step7;

import java.util.Scanner;

public class ContMain {
	public static void main(String[] args) {
		Cont co=new Cont();
		
		Scanner sc=new Scanner(System.in);
		int i;
		boolean flag=true;
		
		while(flag) {
			System.out.println("1.�б� 2.���� 3.����");
			i=sc.nextInt();
			
			switch(i){
			case 1:
				co.read();
				break;
			case 2:
				co.write();
				break;
			case 3:
				flag=false;
				break;
				
			}
		}
		
	}
}
