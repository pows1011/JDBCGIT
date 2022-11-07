package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import join.DBConnect;

public class DaoImpl implements Dao{
	private DBConnect db = DBConnect.getInstance(); // new =실행시 생성 static = 선언과 동시에 생성
	private Connection conn = db.getConnection();
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String sql;
	
	@Override
	public void insert(Board b) {
		sql="INSERT INTO board VALUES(seq_board.NEXTVAL,?,?,?,SYSDATE,?)";		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,b.getWriter());
			pstmt.setString(2,b.getPwd());
			pstmt.setString(3,b.getTitle());
			pstmt.setString(4,b.getContent());
			pstmt.executeUpdate();
			System.out.println("생성 완료");
			pstmt.close();
		}catch(Exception e) {
			
		}
		
		
	}

	@Override
	public Board select(int num) {
		Board b=null;
		sql="SELECT * FROM board WHERE num=?";
		try {
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				b=new Board(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5),rs.getString(6));
			}
			pstmt.close();
			rs.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return b;
	}

	@Override
	public ArrayList selectAll() {
		ArrayList<Board> list=new ArrayList<>();
		sql="SELECT * FROM board ORDER BY 1 DESC";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				list.add(new Board(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5),rs.getString(6)));
			}
			
			pstmt.close();
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		
		return list;
	}

	@Override
	public void update(Board b) {
		sql="UPDATE board SET pwd=?,title=?, board_date=SYSDATE, content=? WHERE num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);			
			pstmt.setString(1, b.getPwd());
			pstmt.setString(2, b.getTitle());
			pstmt.setString(3, b.getContent());
			pstmt.setInt(4, b.getNum());
			pstmt.executeUpdate();
			System.out.println("수정 완료");
			pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int num) {
		sql="DELETE board WHERE num=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			System.out.println("삭제 완료");
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}

}
