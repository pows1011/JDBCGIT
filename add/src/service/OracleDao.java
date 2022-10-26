package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.Member;

public class OracleDao implements Dao {
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public ResultSet rs = null;
	public String sql;
	

	public void con() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
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

	@Override
	public void insert(Member m) {
		sql = "INSERT INTO addr VALUES(?,?,?)";

		try {
			con();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getTel());
			pstmt.setString(3, m.getAddress());
			pstmt.executeUpdate();
			System.out.println("아이디 생성 완료");
		} catch (SQLException e) {
			System.out.println(e);
		}
		discon();
	}

	@Override
	public boolean update(Member m) {
		sql = "UPDATE addr SET tel=?,address=? WHERE name=?";
		int num = 0;
		try {
			con();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getTel());
			pstmt.setString(2, m.getAddress());
			pstmt.setString(3, m.getName());
			num = pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);

		}
		discon();

		if (num <= 0) {
			return false;
		} else {
			return true;
		}

	}

	@Override
	public boolean delete(String name) {
		sql = "DELETE addr WHERE name=?";
		int num = 0;
		try {
			con();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			num = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}discon();
		if (num <= 0) {
			return false;
		} else {
			return true;
		}

		

	}

	@Override
	public Member select(String name) {
		sql = "SELECT * FROM addr WHERE name=?";
		Member m = null;
		try {
			con();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				m = new Member(rs.getString(1), rs.getString(2), rs.getString(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return m;
	}

	@Override
	public ArrayList<Member> selectAll() {
		
		ArrayList<Member> vo = new ArrayList<>();
		sql = "SELECT * FROM addr";
		try {
			con();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo.add(new Member(rs.getString(1), rs.getString(2), rs.getString(3)));
			}

		} catch (SQLException e) {
			System.out.println(e);
		}

		discon();
		return vo;
	}

}
