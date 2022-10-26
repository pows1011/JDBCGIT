package step5;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private int menu;
	boolean flag = true;
	private String menuStr = "1. 추가 2. 검색 3. 수정 4. 삭제 5. 전체출력 6. 종료"; // 반복문을 변수로 선언

	public void menuProcess(ArrayList<Member> data) {	//ArrayList객체 매개변수로 받음
		int idx = 0;

		while (flag) {								
			System.out.println(menuStr);		
			menu = sc.nextInt();			//switch문의 조건이 될 변수
			switch (menu) {
			case 1:
				data.add(InfoInput(data));
				break;
			case 2:
				idx = search(data);
				printMember(data.get(idx));
				break;
			case 3:
				editMember(data);

				break;
			case 4:
				delMember(data);
				break;
			case 5:
				for (idx = 0; idx < data.size(); idx++) {	//반복문으로 존재하는 저장공간의 모든 값들을 출력
					System.out.println(data.get(idx));		//data리스트에서 (idx)의 값에 맞는 리스트 번호의 저장공간서 값을 반환
				}
				break;
			case 6:
				flag = false;
				break;
			default:
				break;

			}
		}

	}

	public Member InfoInput(ArrayList<Member> data) { 

		System.out.println("이름 :");
		String name = sc.next();
		System.out.println("전화 번호 :");
		String tel = sc.next();
		System.out.println("주소 :");
		String address = sc.next();

		for (int i = 0; i < data.size(); i++) {
			if (name.equals(data.get(i).getName())) {
				System.out.println("name 중복");
				return null;
			} else if (tel.equals(data.get(i).getTel())) {
				System.out.println("tel 중복");
				return null;
			} else if (address.equals(data.get(i).getAddress())) {
				System.out.println("주소 중복");
				return null;
			} else {

			}
		}  
		return new Member(name, tel, address);
	}

	public int search(ArrayList<Member> data) { // 검색을 하기위한 ArrayList를 매개변수로 받아옴

		System.out.println("검색 하려는 이름 :");
		String name = sc.next();
		for (int i = 0; i < data.size(); i++) {

			if (name.equals(data.get(i).getName())) {
				return i;
			} else {
				System.out.println("찾을 수 없는 이름");
			}
		}
		return 0;
	}

	public void editMember(ArrayList<Member> data) {  //

		int idx = search(data);

		System.out.println("새 전화 번호 :");
		String tel = sc.next();
		sc.nextLine();

		System.out.println("새 주소 :");
		String address = sc.next();

		data.set(idx, new Member(data.get(idx).getName(), tel, address));

	}

	public void delMember(ArrayList<Member> data) {
		int idx = search(data);

		data.remove(idx);

	}

	public void printMember(Member m) {
		System.out.println(m);
	}

}
