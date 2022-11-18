package service;

import model.MemberDAO;
import model.MemberVO;

public class MemberService {
	

	private MemberDAO dao;
	
	public MemberService() {
		dao=MemberDAO.getDao();
	}
	
	public void add(MemberVO vo) {
		dao.MemberAdd(vo);
	}
	public MemberVO login(String id,String password){
		
		return dao.login(id, password);
	}
	
	
}
