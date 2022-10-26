package test;

import java.util.ArrayList;
import java.util.Scanner;

import service.ServiceImpl;
import vo.Member;

public class addrDBMain {
	public static void main(String[] args) {
		ServiceImpl service = new ServiceImpl();
		String name, tel, address;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		boolean flag = true;
		ArrayList<Member> list = null;

		while (flag) {
			System.out.println("1.�߰� 2.�˻� 3.���� 4.���� 5.��� 6.����");
			i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("�̸� �Է�");
				name = sc.next();
				System.out.println("��ȭ��ȣ �Է�");
				tel = sc.next();
				sc.nextLine();// ��������
				System.out.println("�ּ� �Է�");
				address = sc.next();
				service.addMember(new Member(name, tel, address));
				break;
			case 2:
				System.out.println("�˻��� �̸� �Է�");
				name = sc.next();

				Member m = service.getMember(name);
				
				if (m == null) {
					System.out.println("���� �����ϴ�");
				}else {
					System.out.println(m);
				}
				break;
			case 3:
				System.out.println("�����Ϸ��� ȸ���� �̸� �Է�");
				name = sc.next();
				System.out.println("������ ��ȭ��ȣ �Է�");
				tel = sc.next();
				sc.nextLine();// ��������
				System.out.println("������ �ּ� �Է�");
				address = sc.next();
				boolean f=service.editMember(new Member(name, tel, address));
				
				if(f==false) {
					System.out.println("���� ����");
				}else {
					System.out.println("���� �Ϸ�");
				}
				
				break;
			case 4:
				System.out.println("������ �̸� �Է�");
				name=sc.next();
				f=service.delMember(name);
				if(f==false) {
					System.out.println("���� ����");
				}else {
					System.out.println("���� ����");
				}
				break;
			case 5:
				list = service.getMembers();
				for(int j=0;j<list.size();j++) {
					System.out.println(list.get(j));
				}
				break;
			case 6:
				flag = false;
				break;
			default:
				flag = false;
				break;
			}
		}
	}
}
