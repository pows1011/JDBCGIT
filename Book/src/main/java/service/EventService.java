package service;

import java.util.ArrayList;

import model.BookDao;
import model.BookVo;

public class EventService {
	private BookDao dao;

	public EventService() {
		dao = BookDao.getDao();
	}

	public void addBoard(BookVo b) {
		
		dao.insert(b);
	}
	
	public ArrayList<BookVo> AllBoard() {
		return dao.getAll();
	}
	public BookVo getMem(int num) {
		return dao.getMember(num);
	}
	public void editBoard(BookVo b) {
		
		dao.edit(b);
	}
	public void delBoard(int num) {
		dao.delete(num);
	}
	

}
