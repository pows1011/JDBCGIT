package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import exception.NotFoundNameException;
import exception.NotFoundNumException;
import exception.NotPriceException;
import exception.NotQuantityException;
import join.DBConnect;

public class DaoImpl implements Dao {
	private DBConnect db = DBConnect.getInstance();
	private Connection conn = db.getConnection();
	private PreparedStatement pstmt;
	private ResultSet rs;

	private String sql;

	@Override
	public void insert(Product p) {
		sql = "INSERT INTO product VALUES(seq_product.NEXTVAL,?,?,?,?)";

		try {
			if (p.getPrice() <= 0) {
				throw new NotPriceException("가격은 0원 이상의 값만 가능");
			}
			if (p.getQuantity() <= 0) {
				throw new NotQuantityException("등록 수량은 1개 이상의 값만 가능합니다");
			}
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getName());

			pstmt.setInt(2, p.getPrice());
			pstmt.setInt(3, p.getQuantity());
			pstmt.setString(4, p.getId());
			pstmt.executeUpdate();
			System.out.println("제품 등록 완료");

		} catch (NotQuantityException e) {
			System.out.println(e.getMessage());
		} catch (NotPriceException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public Product selectByNum(int num) {
		sql = "SELECT * FROM product WHERE num=?";
		Product p = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
			} else {
				throw new NotFoundNumException("존재하지 않는 제품 번호입니다");
			}
		} catch (NotFoundNumException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return p;
	}

	@Override
	public Product selectByName(String name) {

		sql = "SELECT * FROM product WHERE name=?";
		Product p = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
			} else {
				throw new NotFoundNameException("존재 하지않는 제품 명입니다");
			}
		} catch (NotFoundNameException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return p;
	}

	@Override
	public ArrayList<Product> selectAll() {
		ArrayList<Product> list = new ArrayList<>();
		sql = "SELECT * FROM product";
		boolean f = false;
		try {
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				while (rs.next()) {
					list.add(new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5)));
				}
			} else {
				throw new NotPriceException("제품이 존재하지 않습니다");
			}

		} catch (NotPriceException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void update(Product p) {
		sql = "UPDATE product SET name=?,price=?, quantity=? WHERE num=?";
		try {

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getName());
			pstmt.setInt(2, p.getPrice());
			pstmt.setInt(3, p.getQuantity());
			pstmt.setInt(4, p.getNum());
			int c = pstmt.executeUpdate();
			if (c <= 0) {
				throw new NotFoundNumException("존재하지 않는 제품 번호 입니다 확인해주세요.");
			} else {
				System.out.println("수정 완료");
			}

		} catch (NotFoundNumException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int num) {
		int de = 0;
		sql = "DELETE product WHERE num=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			de = pstmt.executeUpdate();
			if (de <= 0) {
				throw new NotFoundNumException("삭제하려는 제품번호는 존재하지 않습니다.");
			} else {
				System.out.println(num + "번 제품 삭제 완료");
			}

		} catch (NotFoundNumException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
