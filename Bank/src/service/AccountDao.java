package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import exception.DuplicateAccountException;
import exception.InsufficientMoneyException;
import exception.InvalidBalanceException;
import exception.NotFoundAccountException;
import exception.NotFoundNameException;
import vo.AccountVO;

public class AccountDao implements Dao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = null;

	@Override
	public void con() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 로드
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"); // connection객체생성
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public void discon() {

		try {
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public void insertAccount(AccountVO vo) {

		try {
			boolean f = false;
			f = findAccountExist(vo.getAccountNumber());
			sql = "INSERT INTO bankvo VALUES(?,?,?+10000)";
			con();

			pstmt = conn.prepareStatement(sql);
			if (f == false) {
				pstmt.setString(1, vo.getAccountNumber());
			} else {
				throw new DuplicateAccountException("이미 동일한 계좌가 생성 되어 있습니다");
			}
			if (vo.getAccountName() != null) {
				pstmt.setString(2, vo.getAccountName());
			} else {
				throw new NotFoundNameException("고객명 작성이 되어있지 않습니다.");
			}

			if (vo.getBalance() <= 0) {
				throw new InsufficientMoneyException("입금액은 1원 이상만 가능합니다");
			} else {
				pstmt.setInt(3, vo.getBalance());
			}

			pstmt.executeUpdate();

		} catch (DuplicateAccountException e) {
			System.out.println(e.getMessage());
		}catch(NotFoundNameException e1) {
			System.out.println(e1.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}
		discon();

	}

	@Override
	public AccountVO findAccount(String accNum) {
		AccountVO vo = null;

		try {
			if (!findAccountExist(accNum)) {
				throw new NotFoundNameException("찾는사람이 없습니다.");
			}
		} catch (NotFoundNameException e) {
		System.out.println(e.getMessage());
		}
		try {
			sql = "SELECT * FROM bankvo WHERE accountNumber=?";
			con();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, accNum);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				vo = new AccountVO(rs.getString(1), rs.getString(2), rs.getInt(3));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		discon();
		return vo;
	}

	@Override
	public int depositMoney(String accNum, int money) {

		try {
			AccountVO vo = findAccount(accNum);
			sql = "UPDATE BankVO SET balance=? WHERE accountNumber=?";
			con();
			pstmt = conn.prepareStatement(sql);

			if (money <= 0) {
				throw new InsufficientMoneyException("입금액은 1원 이상만 가능합니다");
			} else {
				if (vo != null) {
					pstmt.setInt(1, vo.getBalance() + money);
					pstmt.setString(2, accNum);
					pstmt.executeUpdate();
				}

			}

		} catch (InsufficientMoneyException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			e.printStackTrace();
		}
		discon();

		return money;
	}

	@Override
	public int withDrawMoney(String accNum, int money) {

		AccountVO vo = findAccount(accNum);

		sql = "UPDATE BankVO SET balance=?-? WHERE accountNumber=?";
		try {
			con();
			pstmt = conn.prepareStatement(sql);

			if (money <= 0) {
				throw new InsufficientMoneyException("출금액은 1원 이상만 가능합니다");
			}
			if (vo != null && vo.getBalance() < money) {
				throw new InvalidBalanceException("잔액이 부족합니다");
			} else {
				if (vo != null) {
					pstmt.setInt(1, vo.getBalance());
					pstmt.setInt(2, money);
					pstmt.setString(3, accNum);
					pstmt.executeUpdate();
				}

			}

		} catch (InsufficientMoneyException e) {
			System.out.println(e.getMessage());
		} catch (InvalidBalanceException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		discon();

		return money;
	}

	
	@Override
	public int sumAccount(String name) {

		try {
			if (!findNameExist(name)) {
				throw new NotFoundNameException("찾는사람이 없습니다.");
			}
		} catch (NotFoundNameException e) {
			System.out.println(e.getMessage());
		}

		sql = "SELECT SUM(balance) FROM bankvo WHERE accountName=?";
		int sum = 0;
		try {
			con();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				sum = rs.getInt(1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		discon();

		return sum;
	}

	@Override
	public int avgAccount(String name) {

		try {
			if (!findNameExist(name)) {
				throw new NotFoundNameException("찾는사람이 없습니다.");
			}
		} catch (NotFoundNameException e) {
			System.out.println(e.getMessage());
		}
		sql = "SELECT AVG(balance) FROM bankvo WHERE accountName=?";
		int avg = 0;
		try {
			con();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				avg = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		discon();
		return avg;
	}

	@Override
	public int createTransfer(String sendAccount, String receiveAccount, int money) {
		return 0;
	}

	@Override
	public boolean findNameExist(String accountName) {
		sql = "SELECT accountName FROM bankvo WHERE accountName=?";
		boolean f = false;
		try {
			con();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, accountName);
			rs = pstmt.executeQuery();
			f=rs.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		discon();
		return f;
	}

	@Override
	public boolean findAccountExist(String accountNumber) {
		sql = "SELECT *FROM bankvo WHERE accountNumber=?";
		boolean f = false;
		try {
			con();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, accountNumber);
			rs = pstmt.executeQuery();
			f=rs.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		discon();
		return f;
	}

}
