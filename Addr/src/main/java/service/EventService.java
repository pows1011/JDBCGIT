package service;

import java.util.ArrayList;

import model.AddrDAO;
import model.Member;

public class EventService {
	private AddrDAO dao;
	
	public EventService() {
		dao=AddrDAO.getDao();
	}
	public void addMember(Member m) {
		dao.addMember(m);
	}
	public ArrayList<Member> Allmember(){
		
		return dao.AllMember();
	}
	public Member getMember(int num) {
		return dao.getMember(num);
	}
	
	public void editMember(Member m) {
		dao.editMember(m);
	}
	public void delMember(int num) {
		dao.delMember(num);
	}
}
