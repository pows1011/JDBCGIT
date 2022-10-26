package step1;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i=0;
		System.out.println("1~12월중 하나 입력");
		i=sc.nextInt();
		/*
		if(i==4||i==6||i==9||i==11) {
			System.out.println("30일");
		}else if(i==2) {
			System.out.println("28일");
		}else if(i==1||i==3||i==5||i==7||i==10||i==12) {
			System.out.println("31일");
		}else{
			System.out.println("잘못된 입력");
		}
		sc.close();
		*/
		
		switch(i) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31일");
		break;
		
		case 2:
			System.out.println("28일");
		break;
		
		case 4: case 6: case 9: case 11:
			System.out.println("30일");
			break;
		default:
			System.out.println("잘못된 입력");
			break;
				
			
		}
		sc.close();

	}

}
