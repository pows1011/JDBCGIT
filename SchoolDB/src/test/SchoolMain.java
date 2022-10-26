package test;

import java.util.ArrayList;
import java.util.Scanner;

import service.ServiceImpl;
import vo.MemberVO;

public class SchoolMain {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ServiceImpl service=new ServiceImpl();
		int type=0,i=0;
		String id,name,tel,addr;
		boolean flag=true;
		ArrayList<MemberVO> list=new ArrayList<>();
		
		while(flag) {
			System.out.println("1.�߰� 2.�˻� 3. ���� 4. ���� 5. ��� 6.����");
			i=sc.nextInt();
			
			switch(i) {
			case 1:
				System.out.println("1.�л� 2. ���� 3.������");
				type=sc.nextInt();
				System.out.println("���̵� �Է�");
				id=sc.next();
				System.out.println("�̸� �Է�");
				name=sc.next();
				System.out.println("�޴���ȭ �Է�");
				tel=sc.next();
				System.out.println("�ּ� �Է�");
				addr=sc.next();
				service.addMember(new MemberVO(id, name, tel, addr, type));
				break;
			case 2:
				System.out.println("�˻��� �̸� �Է�");
				name=sc.next();
				MemberVO m=service.getMember(name);
				System.out.println(m);
				break;
			case 3:
				System.out.println("1.�л� 2.���� 3.������");
				type=sc.nextInt();
				System.out.println("���� �Ϸ��� ���� �̸� �Է�");
				name=sc.next();
				System.out.println("������ �޴���ȭ �Է�");
				tel=sc.next();
				System.out.println("������ �ּ� �Է�");
				addr=sc.next();
				boolean d=service.editMember(new MemberVO(name, tel, addr,type));
				if(d) {
					System.out.println("�����Ϸ�");
				}else {
					System.out.println("���� ����");
				}
			
				break;
			case 4:
				System.out.println("������ ���� �̸�");
				name=sc.next();
				d=service.delMember(name);
				if(d) {
					System.out.println("�����Ϸ�");
				}else {
					System.out.println("���� ����");
				}
				
				break;
			case 5:
				list=service.getMembers();				
				for(int j=0;j<list.size();j++) {
					System.out.println(list.get(j));
				}
				
				break;
			case 6:
				flag=false;
				break;
				default:
					break;
			}
		}
		
	}
}
