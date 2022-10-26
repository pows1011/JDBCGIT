package service;

import java.util.ArrayList;

import vo.MemberVO;

public interface Dao {
	
	void con();
	void discon();
	void memberInsert(MemberVO vo);
	MemberVO Memberselect(String id);
	void MemberUpdate(MemberVO b);
	void Memberdelete(String id);
	ArrayList MemberselectAll();	
	
	

}
