package step2;

public class MyDate {
	
	private int day=3;
	private int month=3;
	private int year=1999;
	
	
	//기본 생성자
	//인자 값이 없을경우 이부분이 작동함
	public MyDate() {
		super();
		
	}
	
	//생성자 오버로딩 인자값 3개가 모두 들어있을 경우 이부분이 작동
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	
	
	
	
}
