package step7;

import java.util.Scanner;

public class DBMain {
	public static void main(String[] args) {
		DB d = new DB();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int i = 0;

		while (flag) {
			System.out.println("1.�߰� 2.��� 3.�˻� 4.���� 5. ���� 6.����");
			i = sc.nextInt();

			switch (i) {
			case 1:
				d.MemberInsert();
				break;
			case 2:
				d.MemberPrint();
				break;
			case 3:
				System.out.println("ã������ ȸ���� ȸ�� �̸� �˻�");
				String name=sc.next();
				d.search(name);
				break;
			case 4:
				d.update();
				break;
			case 5:
				d.delete();

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
