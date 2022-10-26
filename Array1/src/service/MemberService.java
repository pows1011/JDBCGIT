package service;

import java.util.ArrayList;
import java.util.DuplicateFormatFlagsException;
import java.util.Scanner;

import vo.MemberVO;

public class MemberService {

	private ArrayList<MemberVO> list = new ArrayList<>();
	private int menu = 0;
	private boolean flag = true;
	private Scanner sc = new Scanner(System.in);
	private String menuCon = "1. 회원추가 2.회원 검색 3.회원 삭제 4.회원 수정 5.전체 출력 6.관리자 등록 7.종료";

	public void menu(ArrayList<MemberVO> list) {
		int index = 0;
		while (flag) {
			System.out.println(menuCon);
			menu = sc.nextInt();
			
			
			switch (menu) {
			case 1:
				addMember(list);
				break;
			case 2:
				System.out.println("찾으려는 회원 아이디를 입력");
				String id = sc.next();
				index=findIndex(id);
				if(index!=-1) {
					System.out.println("찾으려는 아이디의 정보"+list.get(index));	
				}
				
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				printAll();
				break;
			case 6:
				break;
			case 7:
				flag = false;
				break;
			default:
				break;
			}
		}

	}

	public void printAll() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println(list.size());
		}
	}

	private int findIndex(String id) {
		int intf = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(id)) {
				intf = i;
				break;
			}
		}
		return intf;
	}

	public MemberVO addMember(ArrayList<MemberVO> list) throws DuplicateFormatFlagsException {
		MemberVO vo=null;
		System.out.println("아이디 :");
		String id = sc.next();
		System.out.println("이름 :");
		String name = sc.next();
		System.out.println("전화 번호 :");
		String tel = sc.next();
		System.out.println("주소 :");
		String add = sc.next();
		int a=findIndex(id);
		
		if(a==-1) {
			vo=new MemberVO(id,name,tel,add);
		}else {
			System.out.println("중복 ID");	
		}
		
		return vo;
	}

}
