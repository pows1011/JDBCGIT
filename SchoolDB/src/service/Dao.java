package service;

import java.util.ArrayList;

import vo.MemberVO;

public interface Dao {
	
	
	void insert(MemberVO m);
	boolean update(MemberVO m);
	boolean delete(String name);
	MemberVO select(String name);
	ArrayList<MemberVO> selectAll();
}
