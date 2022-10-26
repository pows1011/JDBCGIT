package step5;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private int menu;
	boolean flag = true;
	private String menuStr = "1. �߰� 2. �˻� 3. ���� 4. ���� 5. ��ü��� 6. ����"; // �ݺ����� ������ ����

	public void menuProcess(ArrayList<Member> data) {	//ArrayList��ü �Ű������� ����
		int idx = 0;

		while (flag) {								
			System.out.println(menuStr);		
			menu = sc.nextInt();			//switch���� ������ �� ����
			switch (menu) {
			case 1:
				data.add(InfoInput(data));
				break;
			case 2:
				idx = search(data);
				printMember(data.get(idx));
				break;
			case 3:
				editMember(data);

				break;
			case 4:
				delMember(data);
				break;
			case 5:
				for (idx = 0; idx < data.size(); idx++) {	//�ݺ������� �����ϴ� ��������� ��� ������ ���
					System.out.println(data.get(idx));		//data����Ʈ���� (idx)�� ���� �´� ����Ʈ ��ȣ�� ��������� ���� ��ȯ
				}
				break;
			case 6:
				flag = false;
				break;
			default:
				break;

			}
		}

	}

	public Member InfoInput(ArrayList<Member> data) { 

		System.out.println("�̸� :");
		String name = sc.next();
		System.out.println("��ȭ ��ȣ :");
		String tel = sc.next();
		System.out.println("�ּ� :");
		String address = sc.next();

		for (int i = 0; i < data.size(); i++) {
			if (name.equals(data.get(i).getName())) {
				System.out.println("name �ߺ�");
				return null;
			} else if (tel.equals(data.get(i).getTel())) {
				System.out.println("tel �ߺ�");
				return null;
			} else if (address.equals(data.get(i).getAddress())) {
				System.out.println("�ּ� �ߺ�");
				return null;
			} else {

			}
		}  
		return new Member(name, tel, address);
	}

	public int search(ArrayList<Member> data) { // �˻��� �ϱ����� ArrayList�� �Ű������� �޾ƿ�

		System.out.println("�˻� �Ϸ��� �̸� :");
		String name = sc.next();
		for (int i = 0; i < data.size(); i++) {

			if (name.equals(data.get(i).getName())) {
				return i;
			} else {
				System.out.println("ã�� �� ���� �̸�");
			}
		}
		return 0;
	}

	public void editMember(ArrayList<Member> data) {  //

		int idx = search(data);

		System.out.println("�� ��ȭ ��ȣ :");
		String tel = sc.next();
		sc.nextLine();

		System.out.println("�� �ּ� :");
		String address = sc.next();

		data.set(idx, new Member(data.get(idx).getName(), tel, address));

	}

	public void delMember(ArrayList<Member> data) {
		int idx = search(data);

		data.remove(idx);

	}

	public void printMember(Member m) {
		System.out.println(m);
	}

}
