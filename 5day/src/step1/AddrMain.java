package step1;

import java.util.Scanner;



public class AddrMain {

	public static void main(String[] args) {
		Addr[] a=new Addr[10];
		Scanner sc =new Scanner(System.in);
		int i=0;
		boolean flag=true;
		int num=0;
		int cnt=0;
		String name,Tel,address; // ���� ������ ����� ����
								 // ������ ���ο����� �ϱ� ����
		
		while(flag) {
			System.out.println("1. �Է�");
			System.out.println("2. ���");
			System.out.println("3. ����");
			num=sc.nextInt();
			
			switch(num) {
			
			case 1 : 
				a[cnt]=new Addr();
				System.out.println("�̸�");
				a[cnt].name=sc.next();
				System.out.println("�ּ�");
				a[cnt].address=sc.next();
				System.out.println("��ȭ��ȣ");
				a[cnt].Tel=sc.next();
				
				cnt++;
				if (cnt>9) {
					System.out.println("���� �ʰ�");
					--cnt;
					System.out.println(cnt);
				}
					
				break;
				
			case 2:
					for(i=0;i<cnt;i++) {
					System.out.println(a[i].name);
					System.out.println(a[i].address);
					System.out.println(a[i].Tel);
					}
					break;
				
			case 3:
					System.out.println("����");
					flag=false;
					break;
			}
		}

	}

}
