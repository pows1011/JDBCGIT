package service;

import java.util.ArrayList;

import vo.MemberVO;

public interface Service {
	void addMember(MemberVO m);
	ArrayList<MemberVO> getMembers();//��ü���
	MemberVO getMember(String name); //�˻�
	boolean editMember(MemberVO m);
	boolean delMember(String name);
	
}
