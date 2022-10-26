package service;

import java.util.ArrayList;

import vo.MemberVO;

public class ServiceImpl implements Service{

	
	
	private Dao dao;
	
	public ServiceImpl() {
		dao=new SchoolDAO();
	}
	
	@Override
	public void addMember(MemberVO m) {
		dao.insert(m);
	}

	@Override
	public ArrayList<MemberVO> getMembers() {
		
		return dao.selectAll();
	}

	@Override
	public MemberVO getMember(String name) {
		
		return dao.select(name);
	}

	@Override
	public boolean editMember(MemberVO m) {
		
		return dao.update(m);
	}

	@Override
	public boolean delMember(String name) {
		
		return dao.delete(name);
	}
	
}
