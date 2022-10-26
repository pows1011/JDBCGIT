package service;

import java.util.ArrayList;

import vo.MemberVO;

public class MemberService {

	private ArrayList<MemberVO> list = new ArrayList<>();

	
	
	public void addMember(MemberVO vo) {

		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {					
			if (vo.getId().equals(list.get(i).getId())) {	//vo�� ID���� list �迭�� ID���� �ݺ������� ��
				System.out.println("�ߺ��� ID");				
				flag = true;								// ���� ���� �ִٸ� true��ȯ, �ߺ�ID����
				break;										// �����ϱ� ���� �극��ũ��
			}
		}
		if (flag == false) {
			list.add(vo);									// Arraylist�� �߰��Լ� add�� �̿� vo�� ������ ���� ���
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
			System.out.println("���� ���� �ʽ��ϴ�");
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
			System.out.println("�������� �ʴ� ID");
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
				System.out.println("�ߺ��� ID");
				flag = true;
				break;
			}

		}
		if (flag == false) {
			list.add(vo);
		} else
			System.out.println("ID �ߺ�");

	}
*/

}
