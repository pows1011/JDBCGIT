package test;

import java.util.Scanner;

import service.SchoolService;
import vo.MemberVO;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String id,name,tel,add;	//VO�� �ִ� ���� ��� �Է� �޾ƿ� String ���� 4�� ����
		boolean flag=true;
		int i=0;
		
		
		SchoolService service=new SchoolService();
		
		while(flag) {
			System.out.println("1 ���");
			System.out.println("2 �˻�");
			System.out.println("3 ��ü���");
			System.out.println("4 ����");
			i=sc.nextInt();
			switch(i) {
			case 1:
				System.out.println("���̵� �Է�");
				id=sc.next();
				System.out.println("�̸� �Է�");
				name=sc.next();
				System.out.println("��ȭ��ȣ �Է�");
				tel=sc.next();
				System.out.println("�ּ� �Է�");
				add=sc.next(); 
				service.addPerson(new MemberVO(id, name, tel, add));	// ServiceŬ������ �ִ� addPerson�޼ҵ� ���� addPerson�� ����
																		// MemberVO�� �ִ� ���������� �ֱ����� ��ü�� �ҷ���
				break;
				
			case 2:
				System.out.println("�˻��� ��ȭ��ȣ �Է�");		
				tel=sc.next();
				MemberVO m=service.findPerson(tel);		//findPerson�޼ҵ�� ��½����ִ� ����� ���� return���� ������ �����ִ� ����̱� ������
				System.out.println(m);					//�ڷ����� �ƴ� Ÿ���� ������ m�� �����Ͽ� �� m �ȿ� return���� ����
				break;
				
				
			case 3:
				service.printAll();						//serviceŬ������ printAll�޼ҵ� ����
				break;
			case 4: 
				flag=false;
				break;
				default:
					flag=false;
					break;
			}
		}
		
		

	}

}
