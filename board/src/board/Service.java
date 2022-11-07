package board;

import java.util.ArrayList;

public interface Service {
	
	void write(Board b);
	Board getArticle(int num);
	ArrayList getArticles();
	void editArticle(Board b);
	void delArticle(int num);
	
}
