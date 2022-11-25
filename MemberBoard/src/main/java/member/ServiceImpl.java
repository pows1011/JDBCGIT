package member;

import java.util.ArrayList;

public class ServiceImpl implements Service {

	private Dao dao;

	public ServiceImpl() {
		dao = new DaoImpl();
	}

	@Override
	public void join(Member m) {
		dao.insert(m);

	}

	@Override
	public Member getMember(String id) {

		return dao.select(id);

	}

	@Override
	public void editMember(Member m) {
		dao.update(m);

	}

	@Override
	public void delMember(String id) {
		dao.delete(id);

	}

	@Override
	public ArrayList<Member> getMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(String id, String pwd) {

		Member m = dao.select(id);
		if (m.getPwd().equals(pwd)) {
			return true;
		}
		return false;
	}

}
