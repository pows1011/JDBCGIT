package step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC1 {
	public static void main(String[] args) {
		
		 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("DRIVER OK");
																	//"jdbc:oracle:thin:@127.0.0.1:1521:xe"
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			System.out.println("CONN OK");
			Statement stmt=con.createStatement();	// statement는 항상 conn하위에 작성 
			String sql="SELECT id,password,name,address FROM member";  //DB에 사용할 SQL 쿼리문
			
			ResultSet rs=stmt.executeQuery(sql);		// SQL쿼리문을 바탕으로 값을 가져옴
			
			while(rs.next()) {							// 값을 가져오기 위한 반복문
				System.out.println(rs.getString(1)+" "+rs.getString(2)+ " " + rs.getString("name")+ " " + rs.getString("address"));  
				//테이블의 1,2번 값 , 3,4번인 name,address 가져옴
			}
			rs.close();
			stmt.close();
			con.close(); 
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException se) {
			se.printStackTrace();
		}
	}
}
