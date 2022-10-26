package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.MemberDTO;

public class MemberDAO implements MemberIn {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private ArrayList<MemberDTO> list = new ArrayList<>();
	private String sql;
	private String jdbc_driver, jdbc_url;

	public MemberDAO() {
		jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	}

	@Override
	public void con() {
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "hr", "hr");
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
	public void insertMember(MemberDTO dto) {

		sql = "INSERT INTO member1 VALUES(M_seq.nextval,?,?,?)";
		try {
			con();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setString(3, dto.getTel());
			pstmt.executeUpdate();
			list.add(new MemberDTO(dto.getNum(), dto.getName(), dto.getAddr(), dto.getTel()));
		} catch (Exception e) {
			System.out.println(e);
		}
		discon();
	}

	@Override
	public void printMember() {
		sql = "SELECT * FROM member1";
		try {
			con();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("회원번호 :"+rs.getInt(1) + " 이름:" + rs.getString(2) + " 주소:" + rs.getString(3) + "  전화번호:" + rs.getString(4));
			}

		} catch (Exception e) {
			System.out.println(e);
		}discon();
	}

	@Override
	public void updateMember(MemberDTO dto) {
		sql="UPDATE member1 SET addr=?,tel=? WHERE name=?";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getAddr());
			pstmt.setString(2, dto.getTel());
			pstmt.setString(3, dto.getName());
			pstmt.executeUpdate();
			System.out.println("수정 완료");
		}catch(Exception e) {
			System.out.println(e);
		}discon();
		
	}

	@Override
	public void deleteMember(String name) {
		sql="DELETE member1 WHERE name=?";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,name);
			pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		discon();
	}

	@Override
	public void searchMember(String name) {
		sql="SELECT * FROM member WHERE name=?";
		
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("회원번호 :"+rs.getInt(1) + " 이름:" + rs.getString(2) + " 주소:" + rs.getString(3) + "  전화번호:" + rs.getString(4));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
