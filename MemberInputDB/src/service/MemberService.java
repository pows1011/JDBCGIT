package service;

import java.util.ArrayList;

import vo.MemberVO;

public class MemberService {
		
	private Dao dao;
	
	public MemberService() {
		dao = new MemberDAO();
	}
	
	public void insert(MemberVO vo) {
		dao.memberInsert(vo);
	}
	public MemberVO search(String id) {
		return dao.Memberselect(id);
	}
	public void update(MemberVO vo) {
		dao.MemberUpdate(vo);
	}
	
	public void delete(String id) {
		dao.Memberdelete(id);
	}
	public ArrayList<MemberVO> printAll() {	
		return dao.MemberselectAll();
	}
}
