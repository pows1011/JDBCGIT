package service;

import java.sql.SQLException;

import model.MemberDao;
import model.MemberVO;

public class MemberService {
	private MemberDao dao;

	public MemberService() {
		dao = MemberDao.getDao();
	}
	
	public void insert(MemberVO vo) throws SQLException {
		
		dao.insertMember(vo);
	}
	public boolean isExist(String id) throws SQLException {
		
		return dao.isExist(id);
	}
	public MemberVO loginMember(String id,String password) throws SQLException {
		
		return dao.loginMember(id, password);
	}
	public MemberVO findMember(String id) throws SQLException{
		
		return dao.findMember(id);
	}
	public void updateMember(MemberVO vo) throws SQLException{
		dao.updateMember(vo);
	}
}
