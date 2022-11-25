package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDaoImpl implements BoardDao {
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public String jdbc_driver;
	public String jdbc_url;
	public ResultSet rs = null;
	public String sql;
	public ArrayList<Article> list = new ArrayList<>();

	public BoardDaoImpl() {
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
			System.out.println(e);
		}
	}

	@Override
	public void insert(Article a) {
		con();
		sql = "INSERT INTO board VALUES(seq_board.nextval,?,?,SYSDATE,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, a.getPwd());
			pstmt.setString(2, a.getWriter());
			pstmt.setString(3, a.getContent());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
	}

	@Override
	public Article select(int num) {
		sql = "SELECT * FROM board where num=?";
		con();
		Article a = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				a = new Article(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDate(4), rs.getString(5));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}

		return a;
	}

	@Override
	public ArrayList<Article> selectAll() {
		sql = "SELECT * FROM board ORDER BY num";
		con();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new Article(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDate(4), rs.getString(5)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}

		return list;
	}

	@Override
	public void update(Article a) {
		sql = "UPDATE board SET pwd=?,w_date=SYSDATE,content=? WHERE num=?";
		con();

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, a.getPwd());
			pstmt.setString(2, a.getContent());
			pstmt.setInt(3, a.getNum());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}

	}

	@Override
	public void delete(int num) {
		con();
		sql = "DELETE FROM board WHERE num=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}

	}

}
