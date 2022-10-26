package step2;

public class TestMyDate {

	public static void main(String[] args) {
		
		MyDate date=new MyDate(1,2,2000);
		System.out.println(date.getDay());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		MyDate d1=new MyDate();
	
		System.out.println(d1.getDay());
		System.out.println(d1.getMonth());
		System.out.println(d1.getYear());
	}

}
