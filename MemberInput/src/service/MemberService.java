package service;

import java.util.ArrayList;

import vo.MemberVO;

public class MemberService {

	private ArrayList<MemberVO> list = new ArrayList<>();

	
	
	public void addMember(MemberVO vo) {

		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {					
			if (vo.getId().equals(list.get(i).getId())) {	//vo의 ID값과 list 배열의 ID값을 반복적으로 비교
				System.out.println("중복된 ID");				
				flag = true;								// 같은 값이 있다면 true반환, 중복ID존재
				break;										// 정지하기 위한 브레이크문
			}
		}
		if (flag == false) {
			list.add(vo);									// Arraylist의 추가함수 add를 이용 vo의 값으로 정보 등록
		}
	}  
	
	
	

	public void printAll() {

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	
	

	public MemberVO findeMemberVO(String id) {
		MemberVO find = null;			
		for (int i = 0; i < list.size(); i++) {

			if (id.equals(list.get(i).getId())) {
				find = list.get(i);
				return find;
			}
		}

		return find;

	}
	
	
	

	public void deleteMemberVO(String id) {
		MemberVO delvo = findeMemberVO(id);
		if(delvo!=null) {
			list.remove(delvo);
		}else {
			System.out.println("존재 하지 않습니다");
		}
		

	}

	
	
	
	public boolean updateMemberVO(MemberVO vo) {
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			if (vo.getId().equals(list.get(i).getId())) {
				flag = true;
				list.set(i,vo);
				break;
			}
		}
		if (flag == false) {
			System.out.println("존재하지 않는 ID");
		}
		return false;
}
	
/*
public void addMember(MemberVO vo) {

		boolean flag = false;
		System.out.println(vo);
		for (int i = 0; i < list.size(); i++) {
			
			 MemberVO mem=list.get(i); 
			 System.out.println("Mem"+mem);
			 
			
				if (vo.getId().equals(mem.getId())) {
				System.out.println("중복된 ID");
				flag = true;
				break;
			}

		}
		if (flag == false) {
			list.add(vo);
		} else
			System.out.println("ID 중복");

	}
*/

}
