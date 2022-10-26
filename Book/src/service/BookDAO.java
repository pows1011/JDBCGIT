package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import vo.BookVO;

public class BookDAO implements Dao {
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public ResultSet rs = null;
	public Scanner sc = new Scanner(System.in);
	public String sql;

	@Override
	public void con() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
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

	@Override
	public void bookInsert(BookVO b) {
		sql = "INSERT INTO book VALUES(?,?,?,?,?)";
		try {
			con();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getId());
			pstmt.setString(2, b.getAuthor());
			pstmt.setString(3, b.getTitle());
			pstmt.setString(4, b.getPublisher());
			pstmt.setInt(5, b.getPrice());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		discon();
	}

	@Override
	public BookVO bookselect(String id) {
		sql = "SELECT * FROM book WHERE id=?";
		BookVO b=null;
		try {
			con();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {								
				b=new BookVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		discon();
		return b;
	}

	@Override
	public void bookUpdate(BookVO b) {
		sql="UPDATE book SET author=?,title=?,publisher=?,price=? WHERE id=?";		
		
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, b.getAuthor());
			pstmt.setString(2, b.getTitle());
			pstmt.setString(3, b.getPublisher());
			pstmt.setInt(4, b.getPrice());			
			pstmt.setString(5, b.getId());
			pstmt.executeUpdate();
			System.out.println("수정 완료");
		}catch(Exception e) {
			System.out.println(e);
		}
		discon();
	}

	@Override
	public void bookdelete(String id) {
		sql="DELETE FROM book WHERE id=?";
		
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			System.out.println("삭제 완료");
		}catch(Exception e) {
			System.out.println();
		}
		discon();
	}

	@Override
	public ArrayList<BookVO> bookselectAll() {
		ArrayList<BookVO> vo = new ArrayList<>();
		sql = "SELECT * FROM book";
		try {
			
			con();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo.add(new BookVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		discon();
		return vo;

	}

}
