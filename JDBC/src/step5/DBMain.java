package step5;

import java.util.Scanner;

public class DBMain {
	public static void main(String[] args) {
		DB d = new DB();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int i = 0;

		while (flag) {
			System.out.println("1.�߰� 2.��� 3.�˻� 4.���� 5.����  6.����");
			i=sc.nextInt();
			switch (i) {
			case 1:
				d.enroll();
				break;
			case 2:
				d.print();
				break;
			case 3:												
				d.search();				
				break;
			case 4:							
				d.update();
				break;
			case 5:				
				d.remove();
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
