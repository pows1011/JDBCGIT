package model;

import java.sql.Date;

public class BoardVO {
	private int board_num;
	private String board_text;
	private String board_content;
	private String board_name;
	private Date board_date;
	private int board_count;
	public BoardVO(String board_text, String board_content, String board_name, int board_count) {
		super();
		this.board_text = board_text;
		this.board_content = board_content;
		this.board_name = board_name;
		this.board_count = board_count;
	}
	public BoardVO(String board_text, String board_content, String board_name, Date board_date, int board_count) {
		super();
		this.board_text = board_text;
		this.board_content = board_content;
		this.board_name = board_name;
		this.board_date = board_date;
		this.board_count = board_count;
	}
	public BoardVO(int board_num, String board_text, String board_content, String board_name, Date board_date,
			int board_count) {
		super();
		this.board_num = board_num;
		this.board_text = board_text;
		this.board_content = board_content;
		this.board_name = board_name;
		this.board_date = board_date;
		this.board_count = board_count;
	}
	public int getBoard_num() {
		return board_num;
	}
	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}
	public String getBoard_text() {
		return board_text;
	}
	public void setBoard_text(String board_text) {
		this.board_text = board_text;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public String getBoard_name() {
		return board_name;
	}
	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}
	public Date getBoard_date() {
		return board_date;
	}
	public void setBoard_date(Date board_date) {
		this.board_date = board_date;
	}
	public int getBoard_count() {
		return board_count;
	}
	public void setBoard_count(int board_count) {
		this.board_count = board_count;
	}
	@Override
	public String toString() {
		return "BoardVO [board_num=" + board_num + ", board_text=" + board_text + ", board_content=" + board_content
				+ ", board_name=" + board_name + ", board_date=" + board_date + ", board_count=" + board_count + "]";
	}
	
	
	
}
