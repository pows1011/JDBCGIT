package board;

import java.util.ArrayList;

public interface Dao {
	
	void insert(Board b);
	Board select(int num);
	ArrayList selectAll();
	void update(Board b);
	void delete(int num);
	
	
}
