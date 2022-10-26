package service;

import java.util.ArrayList;

import vo.MemberVO;

public interface Service {
	void addMember(MemberVO m);
	ArrayList<MemberVO> getMembers();//전체출력
	MemberVO getMember(String name); //검색
	boolean editMember(MemberVO m);
	boolean delMember(String name);
	
}
