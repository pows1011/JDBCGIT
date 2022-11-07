package product;

import java.util.ArrayList;

public class ServiceImpl implements Service {
	Dao dao = new DaoImpl();

	@Override
	public void addProduct(Product p) {
		dao.insert(p);
		
	}

	@Override
	public Product getByNum(int num) {
		// TODO Auto-generated method stub
		return dao.selectByNum(num);
	}

	@Override
	public Product getByName(String name) {
		// TODO Auto-generated method stub
		return dao.selectByName(name);
	}

	@Override
	public ArrayList getAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public void editProduct(Product p) {
		dao.update(p);
		
	}

	@Override
	public void delProduct(int num) {
		dao.delete(num);
		
	}
	

}
