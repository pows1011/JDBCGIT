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
			System.out.println("1.등록 2.검색 3.수정 4.삭제 5.전체 출력 6.종료");
			i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("입력할 ID값");
				id = sc.next();
				System.out.println("입력할 이름");
				name = sc.next();
				System.out.println("입력할 전화번호");
				tel = sc.next();
				System.out.println("입력할 주소");
				addr = sc.next();
				// MemberVO vo=new MemberVO(id,name,tel,addr);
				service.addMember(new MemberVO(id, name, tel, addr));

				break;
			case 2:
				System.out.println("찾으실 아이디 입력");
				id = sc.next();
				MemberVO find = service.findeMemberVO(id);
				System.out.println(find);
				break;
			case 3:
				System.out.println("변경할 ID값");
				id = sc.next();
				System.out.println("변경할 이름");
				name = sc.next();
				System.out.println("변경할 전화번호");
				tel = sc.next();
				System.out.println("변경할 주소");
				addr = sc.next();

				service.updateMemberVO(new MemberVO(id,name,tel,addr));

				break;
			case 4:
				System.out.println("삭제할 아이디 입력");
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
				System.out.println("잘못된 입력 입니다 다시 입력 하세요");
				break;
			}
		}
	}

}
