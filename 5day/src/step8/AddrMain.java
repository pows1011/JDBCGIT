package step8;

import java.util.Scanner;

public class AddrMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String name=null;
		String Tel=null;
		String address=null;
		int i=0,j,c;	//�ݺ��� �ϱ����� i,j�� ����  c�� �޴��� ���ð��� �����ϱ� ���ѿ뵵
		boolean flag=true;
					//while���� �ݺ� ���� ������ ���Ѥ����
		
		Addr[] a=new Addr[10];
		
		
		while(flag) {
			System.out.println("1. ���");
			System.out.println("2. �˻�");
			System.out.println("3. ��ü���");
			System.out.println("4. ����");
			System.out.println("5. ����");
			System.out.println("6. ����");
			c=sc.nextInt();
			
			switch(c) {
				
			case 1:
				a[i]=new Addr();				//Addr Ŭ���� ���� ��ü������ ���� �־��ֱ� ���� a[i]�迭�� ��ü�� ��������
				a[i].add(name, Tel, address, sc);
				i++;							//for���� ����Ұ�� ��ӹݺ��Ǳ� ������ 1�� �ϳ��ϳ��� �����͸� �޾ƿ��� ���� ī����
				System.out.println("count ��"+i);
				break;
			case 2:
				System.out.println("�˻��� �̸� �Է�");
				name=sc.next();	// �˻��� �� ����� name���� �޾ƿ�
				flag=false;	// flag�� ���� false�� �����ؼ� ���� ���ٸ� �ݺ��� �����ʰ� ����
				for(j=0;j<i;j++) {	// i�� ������ü���� ����Ҽ��ְ� ���������� ��ܿ� �����س��� ������ i���� �ʱ�ȭ�� �������� �׷������ Ƚ����ŭ �������ִ� ����
					flag=a[j].search(name); //flag�� Ŭ������ search�޼ҵ忡 �Ҵ� �����Ѵٸ� true ��ȯ 
						if(flag) { // flag�� true��� print�޼ҵ带 ��ȯ�ؼ� ���
							a[j].print();
							break;
						}
				}if(!flag) {
					System.out.println("ã�� ���� �����ϴ�.");
				}
				
				break;
			case 3:
				
				for(j=0;j<i;j++) { // �������� i ��ŭ�� �ݺ� (i�� ���̵� ������ ���̿ö� �׷��Ƿ� ���� �����ϴ� �迭�� ������ ����
					a[j].print();
				}
				break;
			case 4:
				System.out.println("������ �̸� �Է�:"); // ������ ����� �̸��� ����
				name=sc.next();
				System.out.println("��ȣ�� �Է��ϼ���");	// ������ ��ȣ ���� �Է�
				Tel=sc.next();
				System.out.println("�ּҸ� �Է��ϼ���");	// ������ �ּҰ��� �Է�
				address=sc.next();
				
				boolean f=false;			// search�� ���������� f �ǰ��� false�� ������� ��ü�� false��� �ݺ� x
				
				for(j=0;j<i;j++) {
					f=a[j].edit(name,Tel,address); //edit�޼ҵ忡 �Է��� 3���� ���� ������
					if(f) {				// ���� �޼ҵ尡 �۵��� �´ٸ� true�� ��ȯ break;
						break;
					}
					}
				
				if(f==false) {
					System.out.println("ã�� �̸��� �����ϴ�");
				}
				break;
			case 5:
				break;
			case 6:
				flag=false;
				break;
			}
		
		}
	}

}
