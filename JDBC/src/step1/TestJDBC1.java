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
			Statement stmt=con.createStatement();	// statement�� �׻� conn������ �ۼ� 
			String sql="SELECT id,password,name,address FROM member";  //DB�� ����� SQL ������
			
			ResultSet rs=stmt.executeQuery(sql);		// SQL�������� �������� ���� ������
			
			while(rs.next()) {							// ���� �������� ���� �ݺ���
				System.out.println(rs.getString(1)+" "+rs.getString(2)+ " " + rs.getString("name")+ " " + rs.getString("address"));  
				//���̺��� 1,2�� �� , 3,4���� name,address ������
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
