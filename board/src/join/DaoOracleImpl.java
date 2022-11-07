package join;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoOracleImpl implements Dao {

	private DBConnect db = DBConnect.getInstance(); // new =실행시 생성 static = 선언과 동시에 생성
	private Connection conn = db.getConnection();
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String sql;

	@Override
	public int insertMember(Member m) {
		sql = "INSERT INTO member2 VALUES(?,?,?,?)";
		int line = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPwd());
			pstmt.setString(3, m.getName());
			pstmt.setString(4, m.getEmail());
			line = pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return line;
	}

	@Override
	public int updateMember(Member m) {
			
		
		int line = 0;
		sql = "UPDATE member2 SET pwd=?,email=? WHERE id=?";
		
		
		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, m.getPwd());
			pstmt.setString(2, m.getEmail());
			pstmt.setString(3, m.getId());
			line = pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return line;
	}

	@Override
	public int removeMember(String id) {
		sql = "DELETE member2 WHERE id=?";
		int line = 0;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			line = pstmt.executeUpdate();
			pstmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return line;
	}

	@Override
	public boolean login(String id, String pwd) {
		boolean f = false;
		
		sql = "SELECT * FROM member2 WHERE id=? AND pwd=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			f = rs.next();
			pstmt.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return f;
	}

	@Override
	public Member MemberInfo(String id) {
		sql = "SELECT * FROM member2 WHERE id=?";
		Member m = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				m = new Member(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
			pstmt.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return m;
	}

}
