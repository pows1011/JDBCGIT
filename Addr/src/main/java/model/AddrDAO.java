package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AddrDAO {
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	public ResultSet rs = null;
	private String sql;

	public static AddrDAO sd = new AddrDAO();

	private AddrDAO() {

	}

	public static AddrDAO getDao() {

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

	public void addMember(Member m) {
		con();
		sql = "INSERT INTO addr VALUES(addr_seq.nextval,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getTel());
			pstmt.setString(3, m.getAddress());
			pstmt.setInt(4, m.getPostal());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			discon();
		}
	}

	public ArrayList<Member> AllMember() {
		con();
		ArrayList<Member> list = new ArrayList<>();
		sql = "SELECT * FROM addr";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new Member(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return list;

	}

	public Member getMember(int num) {
		con();
		Member m = null;
		sql = "SELECT * FROM addr WHERE num=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				m = new Member(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			discon();
		}

		return m;

	}

	public void editMember(Member m) {
		con();
		sql = "UPDATE addr SET name=?,tel=?,address=?,postal=? WHERE num=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getTel());
			pstmt.setString(3, m.getAddress());
			pstmt.setInt(4, m.getPostal());
			pstmt.setInt(5, m.getNum());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			discon();
		}

	}

	public void delMember(int num) {
		con();
		sql = "DELETE FROM addr WHERE num=?";

		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}
