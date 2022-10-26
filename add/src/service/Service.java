package service;

import java.util.ArrayList;

import vo.Member;

public interface Service {
	
	void addMember(Member m);
	ArrayList<Member> getMembers();//전체출력
	Member getMember(String name); //검색
	boolean editMember(Member m);
	boolean delMember(String name);
		
	
}
 