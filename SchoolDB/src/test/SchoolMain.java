package test;

import java.util.ArrayList;
import java.util.Scanner;

import service.ServiceImpl;
import vo.MemberVO;

public class SchoolMain {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ServiceImpl service=new ServiceImpl();
		int type=0,i=0;
		String id,name,tel,addr;
		boolean flag=true;
		ArrayList<MemberVO> list=new ArrayList<>();
		
		while(flag) {
			System.out.println("1.추가 2.검색 3. 수정 4. 삭제 5. 출력 6.종료");
			i=sc.nextInt();
			
			switch(i) {
			case 1:
				System.out.println("1.학생 2. 교사 3.교직원");
				type=sc.nextInt();
				System.out.println("아이디 입력");
				id=sc.next();
				System.out.println("이름 입력");
				name=sc.next();
				System.out.println("휴대전화 입력");
				tel=sc.next();
				System.out.println("주소 입력");
				addr=sc.next();
				service.addMember(new MemberVO(id, name, tel, addr, type));
				break;
			case 2:
				System.out.println("검색할 이름 입력");
				name=sc.next();
				MemberVO m=service.getMember(name);
				System.out.println(m);
				break;
			case 3:
				System.out.println("1.학생 2.교사 3.교직원");
				type=sc.nextInt();
				System.out.println("수정 하려는 분의 이름 입력");
				name=sc.next();
				System.out.println("수정할 휴대전화 입력");
				tel=sc.next();
				System.out.println("수정할 주소 입력");
				addr=sc.next();
				boolean d=service.editMember(new MemberVO(name, tel, addr,type));
				if(d) {
					System.out.println("수정완료");
				}else {
					System.out.println("수정 실패");
				}
			
				break;
			case 4:
				System.out.println("삭제할 분의 이름");
				name=sc.next();
				d=service.delMember(name);
				if(d) {
					System.out.println("삭제완료");
				}else {
					System.out.println("삭제 실패");
				}
				
				break;
			case 5:
				list=service.getMembers();				
				for(int j=0;j<list.size();j++) {
					System.out.println(list.get(j));
				}
				
				break;
			case 6:
				flag=false;
				break;
				default:
					break;
			}
		}
		
	}
}
