package service;

import java.util.ArrayList;

import vo.BookVO;

public interface Dao {
	
	void con();
	void discon();
	void bookInsert(BookVO b);
	BookVO bookselect(String id);
	void bookUpdate(BookVO b);
	void bookdelete(String id);
	ArrayList bookselectAll();	
	
	
}
