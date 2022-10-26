package service;

import java.util.ArrayList;

import vo.BookVO;

public class BookService {
	private Dao dao;

	public BookService() {
		dao = new BookDAO();
	}

	public void insert(BookVO b) {
		dao.bookInsert(b);
	}

	public BookVO search(String id) {
		return dao.bookselect(id);
	}

	public ArrayList<BookVO> printAll() {
		return dao.bookselectAll();
	}
	/*
	public void printAll() {
		System.out.println(dao.bookselectAll());
	}*/
	public void delete(String id) {
		dao.bookdelete(id);
	}

	public void update(BookVO b) {
		dao.bookUpdate(b);
	}
}
