package step6;

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int i = 0;
		Product pro = new Product();

		while (flag) {
			System.out.println("1.��ǰ ���� 2.��ǰ ��� 3.��ǰ �˻� 4.�ֹ� 5.�ֹ� ���� 6.����");
			i = sc.nextInt();

			switch (i) {
			case 1:
				pro.ProductInsert();
				break;
			case 2:
				pro.ProductPrint();
				break;
			case 3:
				System.out.println("ã���� ��ǰ ��ȣ");
				int p_id = sc.nextInt();
				pro.ProductSearch(p_id);
				break;
			case 4:
				pro.order();				
				break;
			case 5:
				pro.Print_ord();
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
