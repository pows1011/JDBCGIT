package step7;

import java.util.Scanner;

public class TestMonth {
	public static void main(String[] args) {
		MonthService m=new MonthService();		//month클래스를 불러와 m이라는 이름으로 객체를 할당 m은 monthService의 인스턴스
		Scanner sc=new Scanner(System.in);
		System.out.println("1~12월중 값을 입력하세요");
		int i;						//month 메소드의 month or monthsw의 매개변수 int i 의 입력값이 될 변수
		m.monthsw(i=sc.nextInt());  //메소드의 month or monthsw의 매개변수에 스캐너 함수로 값을 넣어줌
		
		System.out.println();
	}
	
}
