package board;

import java.sql.Date;

public class Article {

	private int num;
	private int pwd;
	private String writer;
	private Date w_date;
	private String content;

	public Article(int num, int pwd, String writer, Date w_date, String content) {
		super();
		this.num = num;
		this.pwd = pwd;
		this.writer = writer;
		this.w_date = w_date;
		this.content = content;
	}
	
	public Article(int num, int pwd, String writer, String content) {
		super();
		this.num = num;
		this.pwd = pwd;
		this.writer = writer;
		this.content = content;
	}

	public Article(int pwd, String writer, String content) {
		super();
		this.pwd = pwd;
		this.writer = writer;
		this.content = content;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPwd() {
		return pwd;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getW_date() {
		return w_date;
	}

	public void setW_date(Date w_date) {
		this.w_date = w_date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Article [num=" + num + ", pwd=" + pwd + ", writer=" + writer + ", w_date=" + w_date + ", content="
				+ content + "]";
	}

}
