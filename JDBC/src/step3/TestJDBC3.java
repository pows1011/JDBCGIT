package step3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC3 {
	public static void main(String[] args) {
		try {				
			String sql="UPDATE member SET address='수서' WHERE name='장매력'";//DB에 사용할 SQL 쿼리문
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("DRIVER OK");
													//"jdbc:oracle:thin:@127.0.0.1:1521:xe"
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr","hr");
			System.out.println("CONN OK");
			Statement stmt=con.createStatement();	// statement는 항상 conn하위에 작성 
			
			int result=stmt.executeUpdate(sql);				
			System.out.println(result);
			
		
			stmt.close();
			con.close(); 
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException se) {
			se.printStackTrace();
		}
}
}
