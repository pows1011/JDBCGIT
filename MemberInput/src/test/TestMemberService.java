package test;

import java.util.Scanner;

import service.MemberService;
import vo.MemberVO;

public class TestMemberService {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String id, name, tel, addr;

		boolean flag = true;
		int i = 0;
		MemberService service = new MemberService();

		while (flag) {
			System.out.println("1.��� 2.�˻� 3.���� 4.���� 5.��ü ��� 6.����");
			i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("�Է��� ID��");
				id = sc.next();
				System.out.println("�Է��� �̸�");
				name = sc.next();
				System.out.println("�Է��� ��ȭ��ȣ");
				tel = sc.next();
				System.out.println("�Է��� �ּ�");
				addr = sc.next();
				// MemberVO vo=new MemberVO(id,name,tel,addr);
				service.addMember(new MemberVO(id, name, tel, addr));

				break;
			case 2:
				System.out.println("ã���� ���̵� �Է�");
				id = sc.next();
				MemberVO find = service.findeMemberVO(id);
				System.out.println(find);
				break;
			case 3:
				System.out.println("������ ID��");
				id = sc.next();
				System.out.println("������ �̸�");
				name = sc.next();
				System.out.println("������ ��ȭ��ȣ");
				tel = sc.next();
				System.out.println("������ �ּ�");
				addr = sc.next();

				service.updateMemberVO(new MemberVO(id,name,tel,addr));

				break;
			case 4:
				System.out.println("������ ���̵� �Է�");
				id = sc.next();
				service.deleteMemberVO(id);
				break;
			case 5:
				service.printAll();
				break;
			case 6:
				flag = false;
				break;
			default:
				System.out.println("�߸��� �Է� �Դϴ� �ٽ� �Է� �ϼ���");
				break;
			}
		}
	}

}
