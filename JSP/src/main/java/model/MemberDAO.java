package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO {
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	public ResultSet rs = null;
	private String sql;

	public static MemberDAO sd = new MemberDAO();

	private MemberDAO() {

	}

	public static MemberDAO getDao() {

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

	public void MemberAdd(MemberVO vo) {
		con();
		sql = "INSERT INTO t_member VALUES(?,?,?,?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getTel());
			pstmt.setString(5, vo.getAddress());
			pstmt.setString(6, vo.getEmail());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			discon();
		}

	}

	public MemberVO login(String id, String password) {
		con();
		MemberVO vo = null;

		sql = "SELECT * FROM t_member WHERE id=? AND password=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				vo=new MemberVO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return vo;
	}
	
	public MemberVO mypage(String id) {
		con();
		MemberVO vo=null;
		
		
		
		return vo;
	}
	
	

}
