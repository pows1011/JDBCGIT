package step6;

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int i = 0;
		Product pro = new Product();

		while (flag) {
			System.out.println("1.제품 생산 2.제품 출력 3.제품 검색 4.주문 5.주문 내역 6.종료");
			i = sc.nextInt();

			switch (i) {
			case 1:
				pro.ProductInsert();
				break;
			case 2:
				pro.ProductPrint();
				break;
			case 3:
				System.out.println("찾으실 제품 번호");
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
