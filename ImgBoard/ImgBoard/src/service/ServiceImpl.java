package service;

import java.util.ArrayList;

import model.Product;
import dao.Dao;
import dao.DaoImpl;


public class ServiceImpl implements Service {
	private Dao dao;

	public ServiceImpl() {
		this.dao = new DaoImpl();
	}
		
	public void add(Product p) {
		dao.insert(p);
		
	}

	public Product getProduct(int num) {
		
		return dao.select(num);
	}

	public void editProduct(Product p) {
		dao.update(p);
		
	}

	public void delProduct(int num) {
		dao.delete(num);
		
	}

	public int makeNum() {

		return dao.selectNum();
	}

	public ArrayList<Product> getProductAll() {
		
		return dao.selectAll();
	}

	public void editQuantity(int q, int num) {

		dao.updateQuantity(q, num);

	}

}
