package step1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			String id,name,number,address;
			
			id=null;
			name=null;
			number=null;
			address=null;
			
			boolean boo=true;
			
			while(boo) {
				System.out.println("1.���");
				System.out.println("2.��ü ���");
				System.out.println("3.����");
				int b=sc.nextInt();
				switch(b) {
				case 1:
					System.out.println("���̵� �Է����ּ���");
					id=sc.next();
					System.out.println("�̸��� �Է����ּ���");
					name=sc.next();
					System.out.println("��ȣ�� �Է����ּ���");
					number=sc.next();
					System.out.println("�ּҸ� �Է����ּ���");
					address=sc.next();
					break;
				case 2:
					System.out.println("���̵�:"+id+","+" �̸�:"+name+","+" ��ȣ: "+number+","+"�ּ� :"+address);
					break;
				case 3:
					System.out.println("����");
					boo=false;
					break;
				
				}
				
			}
			
				
		
	}

}
