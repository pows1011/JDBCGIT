package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDao {

	public Connection conn = null;
	public PreparedStatement pstmt = null;

	public String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	public String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
	ResultSet rs = null;
	public String sql = null;

	private static MemberDao sd = new MemberDao();

	private MemberDao() {
	}

	public static MemberDao getDao() {
		return sd;
	}

	public boolean con() {
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

	public void insertMember(MemberVO vo) throws SQLException {
		sql = "INSERT INTO member VALUES(?,?,?,?)";
		con();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getAddress());
			int result = pstmt.executeUpdate();
			System.out.println(result + "개의 DB값 등록");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
	}

	public boolean isExist(String id) throws SQLException {
		boolean flag = false;
		con();
		sql = "SELECT id FROM member WHERE id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			flag = rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}

		return flag;
	}

	public MemberVO loginMember(String id, String password) throws SQLException {
		con();
		MemberVO vo = null;
		sql = "SELECT * FROM member WHERE id=? AND password=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				vo = new MemberVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return vo;
	}

	public MemberVO findMember(String id) throws SQLException {
		MemberVO vo = null;
		con();
		sql = "SELECT * FROM member WHERE id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				vo = new MemberVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return vo;
	}

	public void updateMember(MemberVO vo) throws SQLException {

		con();
		sql = "UPDATE member SET password=?,name=?,address=? WHERE id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getPassword());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getAddress());
			pstmt.setString(4, vo.getId());
			int result = pstmt.executeUpdate();
			System.out.println(result + "개의 DB값을 수정했습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}

	}
}
