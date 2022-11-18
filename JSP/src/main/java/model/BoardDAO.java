package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BoardDAO {
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	public ResultSet rs = null;
	private String sql;

	public static BoardDAO sd = new BoardDAO();

	private BoardDAO() {

	}

	public static BoardDAO getDao() {

		return sd;
	}

	public boolean con() {

		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "hr", "hr");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}

	public void discon() {
		try {

			if (pstmt != null) {
				pstmt.close();
			}
			if (rs != null) {
				rs.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<BoardVO> AllBoard() {
		con();
		ArrayList<BoardVO> list = new ArrayList<>();
		sql = "SELECT * FROM board1";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new BoardVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5),
						rs.getInt(6), rs.getString(7)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return list;
	}

	public void addBoard(BoardVO b) {
		con();
		sql = "INSERT INTO board1 VALUES(board_no.nextval,?,?,?,SYSDATE,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, b.getBoard_text());
			pstmt.setString(2, b.getBoard_content());
			pstmt.setString(3, b.getBoard_name());
			pstmt.setInt(4, b.getBoard_count());
			pstmt.setString(5, b.getBoard_img());
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			discon();
		}
	}

	public BoardVO getBoard(int board_num) {
		BoardVO vo = null;
		con();
		sql = "SELECT * FROM board1 WHERE board_num=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board_num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				vo = new BoardVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5),
						rs.getInt(6), rs.getString(7));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			discon();
		}

		return vo;
	}
}
