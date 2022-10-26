package test;

import java.util.ArrayList;
import java.util.Scanner;

import service.ServiceImpl;
import vo.Member;

public class addrDBMain {
	public static void main(String[] args) {
		ServiceImpl service = new ServiceImpl();
		String name, tel, address;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		boolean flag = true;
		ArrayList<Member> list = null;

		while (flag) {
			System.out.println("1.추가 2.검색 3.수정 4.삭제 5.출력 6.종료");
			i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("이름 입력");
				name = sc.next();
				System.out.println("전화번호 입력");
				tel = sc.next();
				sc.nextLine();// 공백제거
				System.out.println("주소 입력");
				address = sc.next();
				service.addMember(new Member(name, tel, address));
				break;
			case 2:
				System.out.println("검색할 이름 입력");
				name = sc.next();

				Member m = service.getMember(name);
				
				if (m == null) {
					System.out.println("값이 없습니다");
				}else {
					System.out.println(m);
				}
				break;
			case 3:
				System.out.println("수정하려는 회원의 이름 입력");
				name = sc.next();
				System.out.println("수정할 전화번호 입력");
				tel = sc.next();
				sc.nextLine();// 공백제거
				System.out.println("수정할 주소 입력");
				address = sc.next();
				boolean f=service.editMember(new Member(name, tel, address));
				
				if(f==false) {
					System.out.println("수정 실패");
				}else {
					System.out.println("수정 완료");
				}
				
				break;
			case 4:
				System.out.println("삭제할 이름 입력");
				name=sc.next();
				f=service.delMember(name);
				if(f==false) {
					System.out.println("삭제 실패");
				}else {
					System.out.println("삭제 성공");
				}
				break;
			case 5:
				list = service.getMembers();
				for(int j=0;j<list.size();j++) {
					System.out.println(list.get(j));
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
