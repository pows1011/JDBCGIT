package step5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DB {

	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public String jdbc_driver;
	public String jdbc_url;
	public ResultSet rs = null;
	public Scanner sc=new Scanner(System.in);

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

	public void enroll() {
		con();
		String sql = "INSERT INTO A VALUES(A_seq.nextval,?)";
		Scanner sc = new Scanner(System.in);
		System.out.println("이메일 :");
		String email = sc.next();

		try {

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			int a = pstmt.executeUpdate();
			System.out.println("변경된 ROW: " + a);

			discon();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void print() {
		con();
		String sql="SELECT * FROM A";
		try {

			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
			

			discon();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public boolean search() {
		con();		
		String sql="SELECT * FROM A WHERE num=?";
		System.out.println("찾을 번호");
		int num=sc.nextInt();
		try {

			pstmt = conn.prepareStatement(sql);		
			pstmt.setInt(1,num);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2));
				return true;
			}					
		} catch (Exception e) {
			System.out.println(e);
		}
		discon();	
		return false;
	}
	
	public void update( ) {
		con();
		System.out.println("수정할 번호");
		int num=sc.nextInt();
		System.out.println("바뀔 이메일");
		String email=sc.next();
		String sql="UPDATE A SET email=? WHERE num=?";		
		try {			
			pstmt = conn.prepareStatement(sql);			
			pstmt.setString(1,email);
			pstmt.setInt(2, num);
			pstmt.executeUpdate();			
			discon();	
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
	
	public void remove() {
		con();
		System.out.println(" 삭제할 번호");
		int num=sc.nextInt();
		String sql="DELETE A WHERE num=?";
		try {			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();			
			discon();	
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}