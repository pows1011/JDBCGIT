package step1;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String[] name=new String[3];
		int i=0;
		boolean boo=true;
		
		while(boo) {
			System.out.println("1. �̸��Է�");
			System.out.println("2. ���");
			System.out.println("3. ����");
			int num=sc.nextInt();
			switch(num) {
			
			case 1:
				for(i=0; i<name.length;i++) {
					System.out.println("�� �Է��ϼ���:");
					name[i]=sc.next();
					
				}
				break;
			case 2:
				for( i=0; i<name.length;i++) {
					System.out.println("��°�"+i+":"+name[i]);
					
				}
				break;
			case 3:
				System.out.println("����˴ϴ�");
				boo=false;
				break;
				
				default:
					System.out.println("�߸� �� ��");
					break;
				
			}	
			
//			for(int i=0; i<name.length;i++) {
//				if(num==3) {
//					System.out.println("����˴ϴ�");
//					boo=false;
//					break;
//				}else if(num==2) {
//						System.out.println("��°�"+i+":"+name[i]);
//				}else if(num==1){				
//					System.out.println("�� �Է��ϼ���:");
//					name[i]=sc.next();
//					
//				}else {
//					System.out.println("�߸��� �� �Է�");
//					boo=false;
//					break;
//				}
//			}
		
				
			}
			
			

		
		
	}

}
