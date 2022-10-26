package step6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Product {

	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public ResultSet rs = null;
	public String jdbc_driver;
	public String jdbc_url;
	public Scanner sc = new Scanner(System.in);
	public String sql;

	public Product() {
		jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	}

	public void con() {
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "hr", "hr");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void discon() {
		try {
			if (rs != null) {
				rs.close();

			}
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void ProductInsert() {
		con();
		sql = "INSERT INTO product VALUES(?,?,?,?,?)";
		System.out.print("제품 번호 :");
		int p_id = sc.nextInt();
		System.out.print("제품 이름 :");
		String name = sc.next();
		System.out.print("제품 수량 :");
		int num = sc.nextInt();
		System.out.print("제조사 :");
		String co = sc.next();
		System.out.print("제품 가격 :");
		int price = sc.nextInt();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, p_id);
			pstmt.setString(2, name);
			pstmt.setInt(3, num);
			pstmt.setString(4, co);
			pstmt.setInt(5, price);
			pstmt.executeUpdate();
			discon();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void ProductPrint() {
		con();
		sql = "SELECT * FROM product ORDER BY 1 DESC";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println("제품 번호:" + rs.getInt(1));
				System.out.println("제품 이름:" + rs.getString(2));
				System.out.println("제품 수량:" + rs.getInt(3));
				System.out.println("제조사:" + rs.getString(4));
				System.out.println("제품 가격:" + rs.getInt(5));
				System.out.println("-----------------------------------");
			}
			discon();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public boolean ProductSearch(int p_id) {
		con();
		sql = "SELECT * FROM product WHERE p_id=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, p_id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				if (p_id == rs.getInt(1)) {
					System.out.println("제품 번호:" + rs.getInt(1));
					System.out.println("제품 이름:" + rs.getString(2));
					System.out.println("제품 수량:" + rs.getInt(3));
					System.out.println("제조사:" + rs.getString(4));
					System.out.println("제품 가격:" + rs.getInt(5));
					return true;
				}

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		discon();
		return false;
	}

	public void order() {

		System.out.print("상호 :");
		String cus = sc.next();
		System.out.print("제품 번호 :");
		int p_id = sc.nextInt();
		System.out.print("수량 :");
		int num = sc.nextInt();
		boolean f = ProductSearch(p_id);

		if (!f) {
			System.out.println("제품 코드 오류");
			return;
		}

		try {
			con();

			String sql1 = "SELECT num FROM product WHERE p_id=?";
			pstmt = conn.prepareStatement(sql1);
			pstmt.setInt(1, p_id);
			rs = pstmt.executeQuery();
			rs.next();
			int n = rs.getInt(1);
			if (n < num) {
				System.out.println("재고보다 수량이 많습니다.");
				return;
			} else {
				n -= num;
				System.out.println(p_id);
				System.out.println(n);
				NumUpdate(p_id, n);

			}

		} catch (Exception e) {
			System.out.println(e);
		}
		discon();

		con();
		try {
			sql = "INSERT INTO order1 VALUES(?,SYSDATE,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cus);
			pstmt.setInt(2, p_id);
			pstmt.setInt(3, num);
			pstmt.executeUpdate();
			System.out.println("주문 완료");
		} catch (Exception e) {
			System.out.println(e);
		}
		discon();

	}

	public void NumUpdate(int p_id, int num) {
		try {
			con();
			sql = "UPDATE product SET num=? WHERE p_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setInt(2, p_id);
			pstmt.executeUpdate();
			System.out.println("수량 수정완료");
		} catch (Exception e) {
			System.out.println(e);
		}
		discon();
	}

	public void Print_ord() {
		con();
		sql = "SELECT * FROM order1 ORDER BY 1 DESC";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println("상호 명:" + rs.getString(1));
				System.out.println("주문 날짜:" + rs.getDate(2));
				System.out.println("제품 번호:" + rs.getInt(3));
				System.out.println("수량 :" + rs.getInt(4));
				System.out.println("-----------------------------------");
			}
			discon();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
