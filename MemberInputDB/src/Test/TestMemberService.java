package Test;

import java.util.ArrayList;
import java.util.Scanner;

import service.MemberService;
import vo.MemberVO;

public class TestMemberService {
	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		String id, name, tel, addr;
		int i = 0;
		MemberService service = new MemberService();
	
		while (flag) {
			System.out.println("1.�߰� 2.�˻� 3.���� 4.���� 5.��� 6.����");
			i = sc.nextInt();

			switch (i) {
			case 1:
				System.out.println("�߰� �� ���̵� �Է�");
				id = sc.next();
				System.out.println("�߰��� �̸� �Է�");
				name = sc.next();
				System.out.println("�߰��� �ּ� �Է�");
				tel = sc.next();
				System.out.println("�߰��� ��ȭ��ȣ �Է�");
				addr=sc.next();
				
				service.insert(new MemberVO(id,name,tel,addr));
				
				break;
			case 2:
				System.out.println("�˻��� ���̵� �Է�");
				id=sc.next();
				MemberVO a=service.search(id);
				System.out.println(a);
				break;
			case 3:
				System.out.println("������ ���̵� �Է�");
				id=sc.next();
				System.out.println("�ٲ� �̸� �Է�");
				name=sc.next();
				System.out.println("�ٲ� ��ȭ��ȣ �Է�");
				tel=sc.next();
				System.out.println("�ٲ� �ּ� �Է�");
				addr=sc.next();
				service.update(new MemberVO(id,name,tel,addr));
				System.out.println("ddd");
				break;
			case 4:
				System.out.println("������ ���̵� �Է�");
				id=sc.next();
				service.delete(id);
				break;
			case 5:
				ArrayList<MemberVO>  vo=service.printAll();				
				
				for(int j=0;j<vo.size();j++) {
					System.out.println(vo.get(j));
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
