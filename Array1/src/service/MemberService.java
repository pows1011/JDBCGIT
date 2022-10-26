package service;

import java.util.ArrayList;
import java.util.DuplicateFormatFlagsException;
import java.util.Scanner;

import vo.MemberVO;

public class MemberService {

	private ArrayList<MemberVO> list = new ArrayList<>();
	private int menu = 0;
	private boolean flag = true;
	private Scanner sc = new Scanner(System.in);
	private String menuCon = "1. ȸ���߰� 2.ȸ�� �˻� 3.ȸ�� ���� 4.ȸ�� ���� 5.��ü ��� 6.������ ��� 7.����";

	public void menu(ArrayList<MemberVO> list) {
		int index = 0;
		while (flag) {
			System.out.println(menuCon);
			menu = sc.nextInt();
			
			
			switch (menu) {
			case 1:
				addMember(list);
				break;
			case 2:
				System.out.println("ã������ ȸ�� ���̵� �Է�");
				String id = sc.next();
				index=findIndex(id);
				if(index!=-1) {
					System.out.println("ã������ ���̵��� ����"+list.get(index));	
				}
				
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				printAll();
				break;
			case 6:
				break;
			case 7:
				flag = false;
				break;
			default:
				break;
			}
		}

	}

	public void printAll() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println(list.size());
		}
	}

	private int findIndex(String id) {
		int intf = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(id)) {
				intf = i;
				break;
			}
		}
		return intf;
	}

	public MemberVO addMember(ArrayList<MemberVO> list) throws DuplicateFormatFlagsException {
		MemberVO vo=null;
		System.out.println("���̵� :");
		String id = sc.next();
		System.out.println("�̸� :");
		String name = sc.next();
		System.out.println("��ȭ ��ȣ :");
		String tel = sc.next();
		System.out.println("�ּ� :");
		String add = sc.next();
		int a=findIndex(id);
		
		if(a==-1) {
			vo=new MemberVO(id,name,tel,add);
		}else {
			System.out.println("�ߺ� ID");	
		}
		
		return vo;
	}

}
