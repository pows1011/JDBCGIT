package main;

import java.util.Scanner;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberMain {
	public static void main(String[] args) {
		
		MemberDAO dao=new MemberDAO();
		boolean flag=true;
		int i=0;
		Scanner sc=new Scanner(System.in);
		
		while(flag) {
			System.out.println("1.�߰� 2.�˻� 3.���� 4.���� 5.��� 6.����");
			i=sc.nextInt();
			switch(i) {
			case 1:
				System.out.println("�̸��� �Է��ϼ���");
				String name=sc.next();
				System.out.println("�ּҸ� �Է��ϼ���");
				String addr=sc.next();
				System.out.println("��ȭ��ȣ�� �Է��ϼ���");
				String tel=sc.next();
				dao.insertMember(new MemberDTO(name,addr,tel));
			
				break;
			case 2:
				System.out.println("ã������ ȸ���� �̸� �Է�");
				name=sc.next();
				dao.searchMember(name);
				break;
			case 3:
				System.out.println("�����Ϸ��� ȸ���� �̸��Է�");
				name=sc.next();
				System.out.println("������ �ּҸ� �Է��ϼ���");
				addr=sc.next();
				System.out.println("������ ��ȭ��ȣ�� �Է��ϼ���");
				tel=sc.next();
				dao.updateMember(new MemberDTO(name,addr,tel));
				
				break;
			case 4:
				System.out.println("�����Ͻ� ȸ���� �̸��� �Է�");
				name=sc.next();
				dao.deleteMember(name);
				break;
			case 5:
				dao.printMember();
				
				break;
			case 6:
				flag=false;
				break;
				default:
					flag=false;
					break;
			}
		}
	}
	
	
	
}
