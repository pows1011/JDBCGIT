package product;

import java.util.ArrayList;

public interface Dao {
	void insert(Product p);

	Product selectByNum(int num);

	Product selectByName(String name);

	ArrayList selectAll();

	void update(Product p);

	void delete(int num);
}
