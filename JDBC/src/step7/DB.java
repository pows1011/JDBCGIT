package step7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DB {
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public ResultSet rs = null;
	public String jdbc_driver;
	public String jdbc_url;
	public Scanner sc = new Scanner(System.in);
	public String sql;

	public DB() {
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
			e.printStackTrace();
		}

	}

	public void MemberInsert() {
		sql = "INSERT INTO member VALUES(Member_seq.nextval,?,?,?)";

		try {
			con();
			pstmt = conn.prepareStatement(sql);
			System.out.println("이름 입력");
			String name = sc.next();
			System.out.println("주소 입력");
			String addr = sc.next();
			System.out.println("전화번호 입력");
			String tel = sc.next();
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.setString(3, tel);
			pstmt.executeUpdate();
			System.out.println("회원 생성 완료");
			discon();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void MemberPrint() {
		sql = "SELECT * FROM member";
		try {
			con();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println("번호 : " + rs.getInt(1) + " 이름:" + rs.getString(2) + " 주소:" + rs.getString(3)
						+ " 전화번호:" + rs.getString(4));
			}

			discon();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public boolean search(String name) {
		sql = "SELECT * FROM member WHERE name=?";

		try {
			con();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("번호 : " + rs.getInt(1) + " 이름:" + rs.getString(2) + " 주소:" + rs.getString(3)
						+ " 전화번호:" + rs.getString(4));
				return true;
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		discon();
		return false;
	}

	public void update() {
		sql = "UPDATE member SET addr=?,tel=? WHERE name=?";
		System.out.println("바꾸려는 회원의 회원 이름 입력");
		String name = sc.next();
		try {
			con();
			pstmt = conn.prepareStatement(sql);

			System.out.println("바꾸실 주소 입력");
			String addr = sc.next();
			pstmt.setString(1, addr);

			System.out.println("바꾸실 전화번호 입력");
			String tel = sc.next();
			pstmt.setString(2, tel);

			pstmt.setString(3, name);

			pstmt.executeUpdate();
			System.out.println("수정 완료");
		} catch (Exception e) {
			System.out.println(e);
		}
		discon();
	}

	public void delete() {
		sql = "DELETE member WHERE name=?";

		try {
			con();
			pstmt = conn.prepareStatement(sql);
			System.out.println("삭제하려는 회원의 이름 입력");
			String name = sc.next();
			pstmt.setString(1,name);
			pstmt.executeUpdate();
			System.out.println("삭제 완료");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
