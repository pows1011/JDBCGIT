package service;

import java.util.ArrayList;

import model.BoardDAO;
import model.BoardVO;

public class BoardService {
	
	private BoardDAO dao;
	
	public BoardService() {
		dao=BoardDAO.getDao();
	}
	
	public ArrayList<BoardVO> AllBoard() {
		
		return dao.AllBoard();
	}
	public void addBoard(BoardVO vo) {
		dao.addBoard(vo);
	}
	public BoardVO getBoard(int board_num) {
		
		return dao.getBoard(board_num);
	}
	
}
