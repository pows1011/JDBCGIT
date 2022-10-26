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
			System.out.println("1.추가 2.검색 3.수정 4.삭제 5.출력 6.종료");
			i = sc.nextInt();

			switch (i) {
			case 1:
				System.out.println("추가 할 아이디 입력");
				id = sc.next();
				System.out.println("추가할 이름 입력");
				name = sc.next();
				System.out.println("추가할 주소 입력");
				tel = sc.next();
				System.out.println("추가할 전화번호 입력");
				addr=sc.next();
				
				service.insert(new MemberVO(id,name,tel,addr));
				
				break;
			case 2:
				System.out.println("검색할 아이디 입력");
				id=sc.next();
				MemberVO a=service.search(id);
				System.out.println(a);
				break;
			case 3:
				System.out.println("수정할 아이디 입력");
				id=sc.next();
				System.out.println("바뀔 이름 입력");
				name=sc.next();
				System.out.println("바뀔 전화번호 입력");
				tel=sc.next();
				System.out.println("바뀔 주소 입력");
				addr=sc.next();
				service.update(new MemberVO(id,name,tel,addr));
				System.out.println("ddd");
				break;
			case 4:
				System.out.println("삭제할 아이디 입력");
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
