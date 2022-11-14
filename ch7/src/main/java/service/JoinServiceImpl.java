 package service;

import dao.JoinDAO;
import dao.JoinDaoImpl;
import model.Member;

public class JoinServiceImpl implements JoinService{
	private JoinDAO dao = new JoinDaoImpl();

	public JoinServiceImpl() {
		dao=new JoinDaoImpl();
	}

	@Override
	public void join(Member m) {
		dao.insert(m);
	}
	

}
