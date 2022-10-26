package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import vo.Employee;
import vo.MemberVO;
import vo.Professor;
import vo.Student;

public class SchoolDAO implements Dao {
	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public ResultSet rs = null;
	public String sql;
	private Scanner sc = new Scanner(System.in);
	private String school, dept, employee;

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
	public void insert(MemberVO m) {
		if (m.getType() == 1) {
			sql = "INSERT INTO schoolDB (id,name,tel,addr,type,school) VALUES(?,?,?,?,?,?)";
			System.out.println("학교 입력");
			school = sc.next();
		} else if (m.getType() == 2) {
			sql = "INSERT INTO schoolDB (id,name,tel,addr,type,dept) VALUES(?,?,?,?,?,?)";
			System.out.println("담당 과목 입력");
			dept = sc.next();
		} else {
			sql = "INSERT INTO schoolDB (id,name,tel,addr,type,employee) VALUES(?,?,?,?,?,?)";
			System.out.println("부서 입력");
			employee = sc.next();
		}
		try {
			con();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getName());
			pstmt.setString(3, m.getTel());
			pstmt.setString(4, m.getAddr());
			pstmt.setInt(5, m.getType());
			if (m.getType() == 1) {
				pstmt.setString(6, school);
			} else if (m.getType() == 2) {
				pstmt.setString(6, dept);
			} else if (m.getType() == 3) {
				pstmt.setString(6, employee);
			} else {
				System.out.println("잘못된 선택 1~3");
			}

			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		discon();

	}

	@Override
	public boolean update(MemberVO m) {
		int a = 0;
		if (m.getType() == 1) {
			sql = "UPDATE schoolDB SET tel=?,addr=?,school=? WHERE name=?";
			System.out.println("수정할 학교 입력");
			school = sc.next();
		} else if (m.getType() == 2) {
			sql = "UPDATE schoolDB SET tel=?,addr=?,dept=? WHERE name=?";
			System.out.println("수정할 과목 입력");
			dept = sc.next();
		} else {
			sql = "UPDATE schoolDB SET tel=?,addr=?,employee=? WHERE name=?";
			System.out.println("수정할 부서 입력");
			employee = sc.next();
		}

		try {
			con();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getTel());
			pstmt.setString(2, m.getAddr());
			if (m.getType() == 1) {
				pstmt.setString(3, school);
			} else if (m.getType() == 2) {
				pstmt.setString(3, dept);
			} else if (m.getType() == 3) {
				pstmt.setString(3, employee);
			} else {
				System.out.println("잘못된 선택 1~3");
			}
			pstmt.setString(4, m.getName());
			a = pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		discon();
		if (a <= 0) {
			return false;
		} else {
			return true;
		}

	}

	@Override
	public boolean delete(String name) {
		int j = 0;
		sql = "DELETE schoolDB WHERE name=?";

		try {
			con();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);

			j = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		if (j <= 0) {
			return false;
		} else {
			return true;
		}

	}

	@Override
	public MemberVO select(String name) {
		MemberVO m = null;
		sql = "SELECT * FROM schoolDB WHERE name=?";
		try {
			con();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				if (rs.getInt(5) == 1) {
					m = (new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
							rs.getString(6)));
				} else if (rs.getInt(5) == 2) {
					m = (new Professor(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
							rs.getString(7)));
				} else if (rs.getInt(5) == 3) {
					m = (new Employee(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
							rs.getString(8)));
				} else {
					System.out.println("없는 데이터입니다");
				}

			}

		} catch (Exception e) {
			System.out.println(e);
		}
		discon();
		return m;
	}

	@Override
	public ArrayList<MemberVO> selectAll() {
		ArrayList<MemberVO> list = new ArrayList<>();
		sql = "SELECT * FROM schoolDB";

		try {
			con();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				if (rs.getInt(5) == 1) {
					list.add(new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getInt(5), rs.getString(6)));
				} else if (rs.getInt(5) == 2) {
					list.add(new Professor(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getInt(5), rs.getString(7)));
				} else if (rs.getInt(5) == 3) {
					list.add(new Employee(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getInt(5), rs.getString(8)));
				} else {
					System.out.println("잘못된 입력값");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		discon();

		return list;
	}

}
