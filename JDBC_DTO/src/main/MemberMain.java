package main;

import java.util.Scanner;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberMain {
	public static void main(String[] args) {
		
		MemberDAO dao=new MemberDAO();
		boolean flag=true;
		int i=0;
		Scanner sc=new Scanner(System.in);
		
		while(flag) {
			System.out.println("1.추가 2.검색 3.수정 4.삭제 5.출력 6.종료");
			i=sc.nextInt();
			switch(i) {
			case 1:
				System.out.println("이름을 입력하세요");
				String name=sc.next();
				System.out.println("주소를 입력하세요");
				String addr=sc.next();
				System.out.println("전화번호를 입력하세요");
				String tel=sc.next();
				dao.insertMember(new MemberDTO(name,addr,tel));
			
				break;
			case 2:
				System.out.println("찾으려는 회원의 이름 입력");
				name=sc.next();
				dao.searchMember(name);
				break;
			case 3:
				System.out.println("수정하려는 회원의 이름입력");
				name=sc.next();
				System.out.println("변경할 주소를 입력하세요");
				addr=sc.next();
				System.out.println("변경할 전화번호를 입력하세요");
				tel=sc.next();
				dao.updateMember(new MemberDTO(name,addr,tel));
				
				break;
			case 4:
				System.out.println("삭제하실 회원의 이름을 입력");
				name=sc.next();
				dao.deleteMember(name);
				break;
			case 5:
				dao.printMember();
				
				break;
			case 6:
				flag=false;
				break;
				default:
					flag=false;
					break;
			}
		}
	}
	
	
	
}
