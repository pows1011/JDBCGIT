package board;

import java.util.ArrayList;

public class ServiceImpl implements Service{
	private Dao dao=new DaoImpl();
	
	@Override
	public void write(Board b) {
		dao.insert(b);
	}

	@Override
	public Board getArticle(int num) {
		
		return dao.select(num);
	}

	@Override
	public ArrayList getArticles() {
		
		return dao.selectAll();
	}

	@Override
	public void editArticle(Board b) {
		dao.update(b);
	}

	@Override
	public void delArticle(int num) {
		dao.delete(num);
	}
		
	
	
	
	
}
