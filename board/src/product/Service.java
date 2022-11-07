package product;

import java.util.ArrayList;

public interface Service {
	void addProduct(Product p);

	Product getByNum(int num);

	Product getByName(String name);

	ArrayList getAll();

	void editProduct(Product p);

	void delProduct(int num);
}
