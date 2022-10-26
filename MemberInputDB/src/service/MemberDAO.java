package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import vo.MemberVO;

public class MemberDAO implements Dao{
	
	
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public ResultSet rs = null;
	public Scanner sc = new Scanner(System.in);
	public String sql;
	

	@Override
	public void con() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
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
	public void memberInsert(MemberVO vo) {
		sql="INSERT INTO member VALUES(?,?,?,?)";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getTel());
			pstmt.setString(4, vo.getAddr());
			pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		discon();
		
	}

	@Override
	public MemberVO Memberselect(String id) {
		MemberVO vo=null;
		sql="SELECT *  FROM member WHERE id=?";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				vo=new MemberVO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			}			
		}catch(Exception e) {
			System.out.println(e);
		}
		discon();
		return vo;
	}

	@Override
	public void MemberUpdate(MemberVO b) {
		sql="UPDATE member SET name=?,tel=?,addr=? WHERE id=?";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, b.getName());
			pstmt.setString(2, b.getTel());
			pstmt.setString(3, b.getAddr());
			pstmt.setString(4, b.getId());
			pstmt.executeUpdate();
			System.out.println("수정 완료");
		}catch(Exception e) {
			System.out.println(e);
		}
		discon();
	}

	@Override
	public void Memberdelete(String id) {
		
		sql="DELETE member WHERE id=?";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			System.out.println("삭제 완료");
		}catch(Exception e) {
			System.out.println(e);
		}
		discon();
	}

	@Override
	public ArrayList<MemberVO> MemberselectAll() {
		ArrayList<MemberVO> vo=new ArrayList<>();
		
		sql="SELECT * FROM member";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				vo.add(new MemberVO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		discon();
		
		return vo;
	}
	
}
