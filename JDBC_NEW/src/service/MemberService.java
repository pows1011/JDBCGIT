package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import vo.MemberVO;

public class MemberService {
	ArrayList<MemberVO> list = new ArrayList<>();
	private String id;
	private String password;
	private String name;
	private String address;
	private int MenuNum = 0;
	private boolean flag = true;
	private Scanner sc = new Scanner(System.in);
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String pw = "hr";
	
	public void Driver() {
		
	}

	public void MenuBar() {

		while (flag) {
			System.out.println("1. �߰� 2.�˻� 3.���� 4.���� 5.��� 6.����");
			MenuNum = sc.nextInt();
			switch (MenuNum) {

			case 1:
				list.add(addMember());
				break;
			case 2:
				System.out.println("ã������ ���̵� �Է�");
				id = sc.next();
				findMember(id);
				break;
			case 3:
				System.out.println("���� �Ϸ��� ���̵� �Է�");
				id=sc.next();
				updateMember(id);
				
				break;
			case 4:
				System.out.println("�����Ϸ��� ���̵� �Է�");
				id = sc.next();
				removeMember(id);
				break;
			case 5:
				printAll();
				break;
			case 6:
				flag = false;
				break;
			default:
				flag = false;
				break;

			}
		}

	}

	public void updateMember(String id) {
		String sql = "UPDATE member SET password=?,name=?,address=? WHERE id=?";
		int a = findMember(id);
		if (a == -1) {
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, pw);
				pstmt = con.prepareStatement(sql);
				System.out.println("��й�ȣ �Է�");
				pstmt.setString(1, password = sc.next());
				System.out.println("�̸� �Է�");
				pstmt.setString(2, name = sc.next());
				System.out.println("�ּ� �Է�");
				pstmt.setString(3, address = sc.next());
				
				pstmt.setString(4, id);
				
				int res = pstmt.executeUpdate();
				if (res > 0) {
					System.out.println("���� �Ϸ�");
					pstmt.close();
					con.close();

				}
			} catch (SQLException e) {
				System.out.println("[SQL Error : " + e.getMessage() + " ] ");
			} catch (ClassNotFoundException e1) {
				System.out.println("[JDBC Connector Driver ���� : " + e1.getMessage() + "]");
			}
		}
	}

	public void removeMember(String id) {
		String sql = "delete member where id=?";
		int a = findMember(id);
		if (a == -1) {
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, pw);
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, id);

				int res = pstmt.executeUpdate();
				if (res > 0) {
					System.out.println("���� ����");
				}
			} catch (SQLException e) {
				System.out.println("[SQL Error : " + e.getMessage() + " ] ");
			} catch (ClassNotFoundException e1) {
				System.out.println("[JDBC Connector Driver ���� : " + e1.getMessage() + "]");
			}
		}

	}

	public void printAll() {
		String sql = "SELECT * FROM member";

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pw);
			pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("���̵� :" + rs.getString(1) + " ��й�ȣ:" + rs.getString(2) + " �̸�:"
						+ rs.getString("name") + " �ּ�:" + rs.getString("address"));
			}

		} catch (SQLException e) {
			System.out.println("[SQL Error : " + e.getMessage() + " ] ");
		} catch (ClassNotFoundException e1) {
			System.out.println("[JDBC Connector Driver ���� : " + e1.getMessage() + "]");
		}
	}
	

	

	public int findMember(String id) {
		int find = -1;
		String sql = "SELECT * FROM member WHERE id=?";
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println("�����ϴ� ���̵� or ����,��������");
				System.out.println("���̵�:"+rs.getString("id")+" �н�����:"+rs.getString("password")+" �̸�:"+rs.getString("name")+" �ּ�:"+rs.getString("address"));
				find = -1;
			} else {
				System.out.println("��� ������ ���̵�or �������� �ʴ� ���̵�");
				find = 1;
			}

		} catch (SQLException e) {
			System.out.println("[SQL Error : " + e.getMessage() + " ] ");
		} catch (ClassNotFoundException e1) {
			System.out.println("[JDBC Connector Driver ���� : " + e1.getMessage() + "]");
		}

		return find;
	}

	public MemberVO addMember() {
		String sql = "INSERT INTO member(id,password,name,address) VALUES(?,?,?,?)";
		System.out.println("������ ���̵� �Է� ");
		String nid = sc.next();
		int b = findMember(nid);

		if (b == 1) {
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, pw);
				pstmt = con.prepareStatement(sql);

				pstmt.setString(1, nid);
				System.out.println("��й�ȣ �Է�");
				pstmt.setString(2, password = sc.next());
				System.out.println("�̸� �Է�");
				pstmt.setString(3, name = sc.next());
				System.out.println("�ּ� �Է�");
				pstmt.setString(4, address = sc.next());
				int a = pstmt.executeUpdate();
				System.out.println("����� ROW: " + a);
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("[SQL Error : " + e.getMessage() + " ] ");
			} catch (ClassNotFoundException e1) {
				System.out.println("[JDBC Connector Driver ���� : " + e1.getMessage() + "]");

			}
		}

		return new MemberVO(nid, password, name, address);

	}

}
