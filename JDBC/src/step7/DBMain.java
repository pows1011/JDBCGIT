package step7;

import java.util.Scanner;

public class DBMain {
	public static void main(String[] args) {
		DB d = new DB();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int i = 0;

		while (flag) {
			System.out.println("1.추가 2.출력 3.검색 4.수정 5. 삭제 6.종료");
			i = sc.nextInt();

			switch (i) {
			case 1:
				d.MemberInsert();
				break;
			case 2:
				d.MemberPrint();
				break;
			case 3:
				System.out.println("찾으려는 회원의 회원 이름 검색");
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
