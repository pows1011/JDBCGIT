package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDao {

	public Connection conn = null;
	public PreparedStatement pstmt = null;

	public String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	public String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
	ResultSet rs = null;
	public String sql = null;

	private static BookDao sd = new BookDao();

	private BookDao() {
	}

	public static BookDao getDao() {
		return sd;
	}

	public boolean con() {
		// TODO Auto-generated method stub
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "hr", "hr");
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}

	public void discon() {
		// TODO Auto-generated method stub
		try {
			if (pstmt != null)
				pstmt.close();
			if (rs != null)
				rs.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void insert(BookVo p) {
		con();
		sql = "INSERT INTO book VALUES(Book_seq.nextval,?,?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getAuthor());
			pstmt.setString(2, p.getTitle());
			pstmt.setString(3, p.getPublisher());
			pstmt.setString(4, p.getContent());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			discon();
		}

	}

	public ArrayList<BookVo> getAll() {
		con();
		ArrayList<BookVo> list = new ArrayList<BookVo>();
		sql = "SELECT * FROM book";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new BookVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			discon();
		}

		return list;
	}

	public BookVo getMember(int num) {
		con();
		BookVo vo = null;
		sql = "SELECT * FROM book WHERE num=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				vo = new BookVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			discon();
		}

		return vo;
	}

	public void edit(BookVo p) {
		con();
		sql = "UPDATE book SET author=?,title=?,publisher=?,content=? WHERE num=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getAuthor());
			pstmt.setString(2, p.getTitle());
			pstmt.setString(3, p.getPublisher());
			pstmt.setString(4, p.getContent());
			pstmt.setInt(5, p.getNum());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			discon();
		}
	}

	public void delete(int num) {
		con();
		sql = "DELETE FROM book WHERE num=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			discon();
		}
	}

}
