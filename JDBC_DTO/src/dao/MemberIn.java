package dao;

import dto.MemberDTO;

public interface MemberIn {
	
	void insertMember(MemberDTO dto);
	void printMember();
	void con();
	void discon();
	void updateMember(MemberDTO dto);
	void deleteMember(String name);
	void searchMember(String name);
	
}
