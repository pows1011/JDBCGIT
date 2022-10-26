package step1;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String[] name=new String[3];
		int i=0;
		boolean boo=true;
		
		while(boo) {
			System.out.println("1. 이름입력");
			System.out.println("2. 출력");
			System.out.println("3. 종료");
			int num=sc.nextInt();
			switch(num) {
			
			case 1:
				for(i=0; i<name.length;i++) {
					System.out.println("값 입력하세요:");
					name[i]=sc.next();
					
				}
				break;
			case 2:
				for( i=0; i<name.length;i++) {
					System.out.println("출력값"+i+":"+name[i]);
					
				}
				break;
			case 3:
				System.out.println("종료됩니다");
				boo=false;
				break;
				
				default:
					System.out.println("잘못 된 값");
					break;
				
			}	
			
//			for(int i=0; i<name.length;i++) {
//				if(num==3) {
//					System.out.println("종료됩니다");
//					boo=false;
//					break;
//				}else if(num==2) {
//						System.out.println("출력값"+i+":"+name[i]);
//				}else if(num==1){				
//					System.out.println("값 입력하세요:");
//					name[i]=sc.next();
//					
//				}else {
//					System.out.println("잘못된 값 입력");
//					boo=false;
//					break;
//				}
//			}
		
				
			}
			
			

		
		
	}

}
