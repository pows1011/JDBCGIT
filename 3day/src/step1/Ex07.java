package step1;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i=0;
		System.out.println("1~12���� �ϳ� �Է�");
		i=sc.nextInt();
		/*
		if(i==4||i==6||i==9||i==11) {
			System.out.println("30��");
		}else if(i==2) {
			System.out.println("28��");
		}else if(i==1||i==3||i==5||i==7||i==10||i==12) {
			System.out.println("31��");
		}else{
			System.out.println("�߸��� �Է�");
		}
		sc.close();
		*/
		
		switch(i) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31��");
		break;
		
		case 2:
			System.out.println("28��");
		break;
		
		case 4: case 6: case 9: case 11:
			System.out.println("30��");
			break;
		default:
			System.out.println("�߸��� �Է�");
			break;
				
			
		}
		sc.close();

	}

}
